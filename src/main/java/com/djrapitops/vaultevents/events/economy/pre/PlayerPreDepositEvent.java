package com.djrapitops.vaultevents.events.economy.pre;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Optional;

/**
 * Event that is fired when Economy#depositPlayer(OfflinePlayer, double) is called.
 */
public class PlayerPreDepositEvent extends Event {

    private final OfflinePlayer player;
    private final String world;
    private double amount;

    public PlayerPreDepositEvent(OfflinePlayer player, double amount) {
        this(player, amount, null);
    }

    public PlayerPreDepositEvent(OfflinePlayer player, double amount, String world) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
        this.amount = amount;
        this.world = world;
    }

    public OfflinePlayer getOfflinePlayer() {
        return player;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Optional<String> getWorldName() {
        return Optional.ofNullable(world);
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}