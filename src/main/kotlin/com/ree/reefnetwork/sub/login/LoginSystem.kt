package com.ree.reefnetwork.sub.login

import cn.nukkit.Server
import com.ree.reefnetwork.ReefNetworkPlugin
import com.ree.reefnetwork.sub.login.listener.LoginListener
import com.ree.reefnetwork.sub.rank.db.RankDb

class LoginSystem(main: ReefNetworkPlugin) {

    companion object {
        const val GOOD: String = "LoginSystem §a>>§r "
        const val BAD: String = "LoginSystem §6>>§r "
        const val ERROR: String = "LoginSystem §c>>§r "
    }

    private var db: RankDb = RankDb("test")

    init {
        Server.getInstance().pluginManager.registerEvents(LoginListener(), main)
        db = RankDb(main.dataFolder.path)
        main.logger.info(GOOD + "loaded")
    }
}