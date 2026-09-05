# FateUHC-API

Compile-time **stub jar** for third-party plugins that integrate with FateUHC.

The classes in this jar share fully-qualified names with the real classes
inside the FateUHC plugin. At runtime the plugin supplies the real
implementations; the stubs exist only so your plugin can compile. Every stub
method throws `IllegalPluginAccessException("FateUHCAPI is not registered!")`
if it ever actually runs — that is the "FateUHC is not installed" guard.
(Interfaces and trivial enum accessors are the only exceptions; they carry no
logic to guard.)

## Usage

Maven:

```xml
<dependency>
    <groupId>me.activated</groupId>
    <artifactId>FateUHC-API</artifactId>
    <version>0.4-ALPHA</version>
    <scope>provided</scope> <!-- REQUIRED — never compile/shade scope -->
</dependency>
```

Gradle:

```groovy
compileOnly 'me.activated:FateUHC-API:0.4-ALPHA' // never implementation/shadow
```

Entry point:

```java
import net.fateuhc.plugin.api.FateUHCAPI;

FateUHCAPI api = FateUHCAPI.INSTANCE; // non-null once FateUHC is enabled
```

Add `depend: [FateUHC]` (or `softdepend`) to your `plugin.yml` so FateUHC
enables first.

## NEVER shade this jar

If you shade FateUHC-API into your plugin jar, your plugin's classloader will
use the shaded stubs instead of the real classes from FateUHC, and every API
call will throw `IllegalPluginAccessException` even with FateUHC installed.

The stubs detect this: if a stub class loads while FateUHC is present, a
SEVERE `[FateUHC-API]` message is logged naming the offending class (see
`StubGuard`). The jar manifest carries the same warning
(`FateUHC-API-Warning` attribute).

## Known caveats

- Some API signatures expose XSeries types (e.g. `XMaterial`). The plugin
  relocates its shaded XSeries to `com.bghddevelopment.xseries` at build time,
  so those specific members differ at runtime from what the stub advertises.
  Avoid API members with XSeries parameter/return types until this is resolved
  by the interface-based API rework.
- Stub drift against the plugin is checked in CI
  (`scripts/check_api_drift.py`); classes listed in
  `scripts/api-drift-allowlist.txt` are known-drifted and pending resync.
