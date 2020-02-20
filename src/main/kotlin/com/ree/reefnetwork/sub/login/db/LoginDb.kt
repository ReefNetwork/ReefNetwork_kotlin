package com.ree.reefnetwork.sub.login.db

import java.lang.ClassNotFoundException
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Statement

class LoginDb(private val pass: String) {

    private lateinit var connection: Connection
    private lateinit var statement: Statement

    init {
        connect()
    }

    private fun connect () {
        try {
            Class.forName("org.sqlite.JDBC")
            connection = DriverManager.getConnection("jdbc:sqlite.${pass}")
            statement = connection.createStatement()

        } catch (ex: ClassNotFoundException) {
            ex.printStackTrace()
        } catch (ex: SQLException) {
            ex.printStackTrace()
        }
    }

    private fun close() {
        try {
            connection.close()
            statement.close()
        } catch (ex: NullPointerException) {
            ex.printStackTrace()
        } catch (ex: SQLException) {
            ex.printStackTrace()
        }
    }
}