package com.pleahmacaka.harrye.commands

import com.pleahmacaka.harrye.interfaces.PlayerCommand
import org.bukkit.command.Command
import org.bukkit.command.CommandSender

object RandomTeleport : PlayerCommand {

    override val name = "rrtp"

    private var lastUsed: Long = 0

    override fun command(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?) {
        lastUsed = System.currentTimeMillis()
        sender?.sendMessage("RPT used! $lastUsed")
    }

}

