package com.ree.reefnetwork.sub.rank

import cn.nukkit.Server
import com.ree.reefnetwork.ReefNetworkPlugin
import com.ree.reefnetwork.sub.rank.listener.RankListener

class RankSystem (main: ReefNetworkPlugin) {
    companion object {
        const val GOOD: String = "LoginSystem §a>>§r "
        const val BAD: String = "LoginSystem §6>>§r "
        const val ERROR: String = "LoginSystem §c>>§r "
    }

    init {
        Server.getInstance().pluginManager.registerEvents(RankListener(), main)
        main.logger.info(GOOD + "loaded")
    }
}