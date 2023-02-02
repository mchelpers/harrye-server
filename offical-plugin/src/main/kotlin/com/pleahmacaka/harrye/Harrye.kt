package com.pleahmacaka.harrye

import com.pleahmacaka.harrye.commands.ConfigHandler
import com.pleahmacaka.harrye.commands.RandomTeleport
import org.bukkit.plugin.java.JavaPlugin

class Harrye : JavaPlugin() {

    override fun onEnable() {
        logger.info("Harrye Official Plugin has been enabled!")

        registerCommands()
    }

    private fun registerCommands() {
        this.getCommand(RandomTeleport.name).executor = RandomTeleport
        this.getCommand(ConfigHandler.name).executor = ConfigHandler
    }

}