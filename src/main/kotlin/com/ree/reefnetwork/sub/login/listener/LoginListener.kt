package com.ree.reefnetwork.sub.login.listener

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerPreLoginEvent

class LoginListener : Listener {

    @EventHandler
    fun onPreLogin(ev: PlayerPreLoginEvent) {
        val p = ev.player
        val n = p.name


    }
}