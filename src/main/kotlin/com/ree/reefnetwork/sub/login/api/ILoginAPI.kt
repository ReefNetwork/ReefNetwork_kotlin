package com.ree.reefnetwork.sub.login.api

interface ILoginAPI {

    fun addBanId(xuid: String) : Boolean

    fun deleteBanId(xuid: String) : Boolean

    fun connectBanIdByIp(xuid: String, ip : String) : Boolean

    fun isBanByXuid(xuid : String) : Boolean

    fun isBanByIp(ip : String) : Boolean
}