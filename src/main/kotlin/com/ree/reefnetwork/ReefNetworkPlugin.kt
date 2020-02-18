package com.ree.reefnetwork

import cn.nukkit.event.Listener
import cn.nukkit.plugin.PluginBase
import cn.nukkit.utils.TextFormat
import com.ree.reefnetwork.listener.EventListener
import com.ree.reefnetwork.sub.login.LoginSystem

class ReefNetworkPlugin : PluginBase(), Listener {

    override fun onLoad() {
        super.onLoad()
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(EventListener(), this)
        this.loadSubSystem()
        logger.info(TextFormat.GREEN.toString() + "Reef" + TextFormat.YELLOW + "Network" + TextFormat.LIGHT_PURPLE + "Enable")
        super.onEnable()
    }

    override fun onDisable() {
        super.onDisable()
    }

    private fun loadSubSystem():Unit {
        LoginSystem(this)
    }
}