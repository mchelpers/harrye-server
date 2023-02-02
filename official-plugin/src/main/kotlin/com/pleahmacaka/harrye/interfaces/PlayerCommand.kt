package com.pleahmacaka.harrye.interfaces

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

interface PlayerCommand : CommandExecutor {

    val name: String

    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        if (sender !is Player) return false
//        sender.sendMessage(args?.get(0))

        command(sender, command, label, args)

        return true
    }

    fun command(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    )

    fun help(name: String): String {
        return """
            <<===============^ $name ^===============>>
            /$name help - 이 도움말을 표시합니다.
            /$name config - 명령에 대한 설정을 변경합니다. 
            <<=======================================>>
        """.trimIndent()
    }

}



