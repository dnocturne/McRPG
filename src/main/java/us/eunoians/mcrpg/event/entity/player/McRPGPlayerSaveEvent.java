package us.eunoians.mcrpg.event.entity.player;

import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import us.eunoians.mcrpg.entity.player.McRPGPlayer;

public class McRPGPlayerSaveEvent extends McRPGPlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    public McRPGPlayerSaveEvent(McRPGPlayer mcRPGPlayer) {
        super(mcRPGPlayer);
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
