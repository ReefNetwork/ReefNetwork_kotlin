package com.ree.reefnetwork.sub.rank.listener

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.player.Player

class RankListener: Listener {

    @EventHandler
    fun onJoin(ev: PlayerJoinEvent) {
        val p: Player = ev.player
        val n: String = p.name

        
    }
}