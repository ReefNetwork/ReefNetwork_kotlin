package com.ree.reefnetwork.listener

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent

class EventListener : Listener {

    @EventHandler
    fun onJoin(ev: PlayerJoinEvent) {
        val p = ev.player
        val n = p.name

        ev.setJoinMessage("hellow$n")
        p.sendTitle("Welcome  to", "ReefNetwork β")
    }
}