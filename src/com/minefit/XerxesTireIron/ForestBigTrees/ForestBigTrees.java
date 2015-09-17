package com.minefit.XerxesTireIron.ForestBigTrees;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ForestBigTrees extends JavaPlugin implements Listener
{
    YamlConfiguration config = new YamlConfiguration();
    static int bigTreeRandom;
    static boolean bigTreeFix;
    private String name;
    private String version;
    private Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable()
    {
        this.saveDefaultConfig();
        config = (YamlConfiguration) this.getConfig();
        this.getServer().getPluginManager().registerEvents(this, this);
        name = getServer().getClass().getPackage().getName();
        version = name.substring(name.lastIndexOf('.') + 1);

        if(!version.equals("v1_7_R1") && !version.equals("v1_7_R2") && !version.equals("v1_7_R3") && !version.equals("v1_7_R4")
                && !version.equals("v1_8_R1") && !version.equals("v1_8_R2") && !version.equals("v1_8_R3"))
        {
            logger.info("[" + this.getName() + "] This version of Minecraft is not supported. Disabling plugin.");
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable()
    {
        logger.info("[" + this.getName() + "] " + this.getName() + " disabled!");
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onWorldInit(WorldInitEvent event)
    {
        World world = event.getWorld();

        if(this.getConfig().getBoolean("worlds." + world.getName() + ".enabled", false))
        {
            new AddBigTrees(this, world);
        }
    }
}