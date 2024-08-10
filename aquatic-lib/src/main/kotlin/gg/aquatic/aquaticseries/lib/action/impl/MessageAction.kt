package gg.aquatic.aquaticseries.lib.action.impl

import org.bukkit.entity.Player
import gg.aquatic.aquaticseries.lib.action.AbstractAction
import gg.aquatic.aquaticseries.lib.toAquatic
import gg.aquatic.aquaticseries.lib.util.placeholder.Placeholders

class MessageAction: AbstractAction() {

    override fun run(player: Player, args: Map<String, Any>, placeholders: Placeholders) {
        placeholders.replace(args["message"]!!.toString()).toAquatic().send(player)
    }

    override fun readArguments(string: String): Map<String, Any> {
        return mutableMapOf("message" to string)
    }

}