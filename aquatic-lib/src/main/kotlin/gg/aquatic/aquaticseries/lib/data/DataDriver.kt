package gg.aquatic.aquaticseries.lib.data

import java.sql.PreparedStatement
import java.sql.ResultSet

interface DataDriver {
    fun executeQuery(sql: String, preparedStatement: PreparedStatement.() -> Unit): ResultSet
    fun execute(sql: String, preparedStatement: PreparedStatement.() -> Unit): Boolean
    fun preparedStatement(sql: String, preparedStatement: PreparedStatement.() -> Unit)
}