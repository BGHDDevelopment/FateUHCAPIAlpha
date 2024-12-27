/*
 * Copyright (c) 2015-2024. BGHDDevelopment LLC.
 * Contact: ceo@bghddevelopment.com
 * Terms: https://bghddevelopment.com/tos
 * Discord: https://bghddevelopment.com/discord
 */

package net.fateuhc.plugin.player;

import net.fateuhc.plugin.api.states.PlayerState;
import net.fateuhc.plugin.player.data.ProfileData;
import net.fateuhc.plugin.utilties.uhc.timers.api.Cooldown;
import org.bukkit.Effect;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

/**
 * The profile of a FateUHC player.
 */
public class Profile {

    /**
     * Get the profile data.
     *
     * @return {@link ProfileData}
     */
    public ProfileData getData() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the UUID of the profile owner.
     *
     * @return {@link UUID}
     */
    public UUID getUUID() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player state of the player.
     *
     * @return {@link PlayerState}
     */
    public PlayerState getPlayerState() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Cooldown of the queue toggle.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getQueueToggleCooldown() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Cooldown for HelpOP.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getHelpCooldown() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Cooldown for Reporting.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getReportCooldown() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Thank cooldown.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getThankCooldown() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Game Back Cooldown.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getGameBackCooldown() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the cooldown for No Clean Invincibility.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getNoCleanInvincibility() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the Cooldown for Do Not Disturb Invincibility.
     *
     * @return {@link Cooldown}
     */
    public Cooldown getDNDInvincibility() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the rod trail effect.
     *
     * @return {@link Effect}
     */
    public Effect getRodTrail() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Set the rod trail effect.
     *
     * @param effect The new effect.
     */
    public void setRodTrail(Effect effect) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the arrow trail effect.
     *
     * @return {@link Effect}
     */
    public Effect getArrowTrail() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Set the arrow trail effect.
     *
     * @param effect {@link Effect}
     */
    public void setArrowTrail(Effect effect) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player playing the game?
     *
     * @return {@link Boolean}
     */
    public boolean isPlaying() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player in team chat?
     *
     * @return {@link Boolean}
     */
    public boolean isTeamChat() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player disqualified?
     *
     * @return {@link Boolean}
     */
    public boolean isDisqualified() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Set if the player is disqualified.
     *
     * @param disqualified {@link Boolean} of if they want to be disqualified.
     */
    public void setDisqualified(boolean disqualified) {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Has the player logger died?
     *
     * @return {@link Boolean}
     */
    public boolean isLoggerDied() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player frozen?
     *
     * @return {@link Boolean}
     */
    public boolean isFrozen() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Has the player been death kicked?
     *
     * @return {@link Boolean}
     */
    public boolean isDeathKicked() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player in spectator chat?
     *
     * @return {@link Boolean}
     */
    public boolean isSpectatorChat() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player vanished?
     *
     * @return {@link Boolean}
     */
    public boolean isVanished() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player in moles chat?
     *
     * @return {@link Boolean}
     */
    public boolean isMolesChat() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Is the player awaiting seed input?
     *
     * @return {@link Boolean}
     */
    public boolean isAwaitingSeedInput() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's current kills.
     *
     * @return {@link Integer}
     */
    public int getCurrentKills() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the amount diamonds the player has mined.
     *
     * @return {@link Integer}
     */
    public int getDiamondsMined() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the amount of gold the player has mined.
     *
     * @return {@link Integer}
     */
    public int getGoldMined() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the amount of iron the player has mined.
     *
     * @return {@link Integer}
     */
    public int getIronMined() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's name.
     *
     * @return {@link Integer}
     */
    public String getPlayerName() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the relog time thats left.
     *
     * @return {@link Integer}
     */
    public String getReloggTimeLeft() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

    /**
     * Get the player's kill history.
     *
     * @return {@link Integer}
     */
    public List<String> getHistoryKills() {
        throw new IllegalPluginAccessException("FateUHCAPI is not registered!");
    }

}
