package com.pleahmacaka.harrye.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player

object ConfigHandler : CommandExecutor, TabCompleter {

    const val name = "config"

    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        if (sender !is Player) return true

        when (args?.get(0)) {
            "reload" -> {
                sender.sendMessage("Config reloaded!")
            }

            "save" -> {
                sender.sendMessage("Config saved!")
            }

            else -> {
                sender.sendMessage("${command?.name} <rtp | admin> help}}")
            }
        }

        return true
    }

    override fun onTabComplete(
        sender: CommandSender?,
        command: Command?,
        alias: String?,
        args: Array<out String>?
    ): MutableList<String> {
        return mutableListOf("reload", "save")
    }
}