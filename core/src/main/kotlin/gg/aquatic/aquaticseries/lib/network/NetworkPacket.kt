package gg.aquatic.aquaticseries.lib.network

import kotlinx.serialization.Serializable

@Serializable
abstract class NetworkPacket {

    abstract val channel: String

}