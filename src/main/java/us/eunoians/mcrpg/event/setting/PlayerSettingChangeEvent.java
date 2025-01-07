package us.eunoians.mcrpg.event.setting;

import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import us.eunoians.mcrpg.entity.player.McRPGPlayer;
import us.eunoians.mcrpg.event.entity.player.McRPGPlayerEvent;
import us.eunoians.mcrpg.setting.PlayerSetting;

import java.util.Optional;

/**
 * This event is called whenever a {@link McRPGPlayer} changes their {@link PlayerSetting}.
 * <p>
 * The old setting may be null if this is the first time the setting is being set for the player's session.
 */
public class PlayerSettingChangeEvent extends McRPGPlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    private final PlayerSetting oldSetting;
    private final PlayerSetting newSetting;

    public PlayerSettingChangeEvent(@NotNull McRPGPlayer mcRPGPlayer, @Nullable PlayerSetting oldSetting, @NotNull PlayerSetting newSetting) {
        super(mcRPGPlayer);
        this.oldSetting = oldSetting;
        this.newSetting = newSetting;
    }

    /**
     * Gets an {@link Optional} containing the previous {@link PlayerSetting} for the given player.
     *
     * @return An {@link Optional} containing the previous {@link PlayerSetting} for the given player, or empty if there was
     * no previous setting (this is the first time that this was set for the player).
     */
    @NotNull
    public Optional<PlayerSetting> getOldSetting() {
        return Optional.ofNullable(oldSetting);
    }

    /**
     * Gets the new {@link PlayerSetting} that is being set for the given player.
     *
     * @return The new {@link PlayerSetting} that is being set for the given player.
     */
    @NotNull
    public PlayerSetting getNewSetting() {
        return newSetting;
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
