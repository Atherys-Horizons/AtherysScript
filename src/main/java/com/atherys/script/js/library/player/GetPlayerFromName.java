package com.atherys.script.js.library.player;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;

import java.util.function.Function;

public class GetPlayerFromName implements Function<String, Player> {
    @Override
    public Player apply(String playerName) {
        return Sponge.getServer().getPlayer(playerName).orElse(null);
    }
}
