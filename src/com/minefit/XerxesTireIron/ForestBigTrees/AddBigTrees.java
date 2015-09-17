package com.minefit.XerxesTireIron.ForestBigTrees;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Logger;

import org.bukkit.World;

public class AddBigTrees
{
    private ForestBigTrees plugin;
    private Logger logger = Logger.getLogger("Minecraft");
    World world;

    public AddBigTrees(ForestBigTrees instance, World world)
    {
        plugin = instance;
        this.world = world;
        String name;
        String version;
        name = plugin.getServer().getClass().getPackage().getName();
        version = name.substring(name.lastIndexOf('.') + 1);

        try
        {
            if(version.equals("v1_7_R1"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_7_R1(4, 0, plugin, (org.bukkit.craftbukkit.v1_7_R1.CraftWorld) this.world), net.minecraft.server.v1_7_R1.BiomeBase.class,
                        net.minecraft.server.v1_7_R1.BiomeTemperature.class, new net.minecraft.server.v1_7_R1.BiomeTemperature(0.1F, 0.2F));
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_7_R1(18, 0, plugin, (org.bukkit.craftbukkit.v1_7_R1.CraftWorld) this.world), net.minecraft.server.v1_7_R1.BiomeBase.class,
                        net.minecraft.server.v1_7_R1.BiomeTemperature.class, new net.minecraft.server.v1_7_R1.BiomeTemperature(0.45F, 0.3F));
            }
            else if(version.equals("v1_7_R2"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_7_R2(4, 0, plugin, (org.bukkit.craftbukkit.v1_7_R2.CraftWorld) this.world), net.minecraft.server.v1_7_R2.BiomeBase.class,
                        net.minecraft.server.v1_7_R2.BiomeTemperature.class, new net.minecraft.server.v1_7_R2.BiomeTemperature(0.2F, 0.2F));
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_7_R2(18, 0, plugin, (org.bukkit.craftbukkit.v1_7_R2.CraftWorld) this.world), net.minecraft.server.v1_7_R2.BiomeBase.class,
                        net.minecraft.server.v1_7_R2.BiomeTemperature.class, new net.minecraft.server.v1_7_R2.BiomeTemperature(0.45F, 0.3F));
            }
            else if(version.equals("v1_7_R3"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_7_R3(4, 0, plugin, (org.bukkit.craftbukkit.v1_7_R3.CraftWorld) this.world), net.minecraft.server.v1_7_R3.BiomeBase.class,
                        net.minecraft.server.v1_7_R3.BiomeTemperature.class, new net.minecraft.server.v1_7_R3.BiomeTemperature(0.2F, 0.2F));
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_7_R3(18, 0, plugin, (org.bukkit.craftbukkit.v1_7_R3.CraftWorld) this.world), net.minecraft.server.v1_7_R3.BiomeBase.class,
                        net.minecraft.server.v1_7_R3.BiomeTemperature.class, new net.minecraft.server.v1_7_R3.BiomeTemperature(0.45F, 0.3F));
            }
            else if(version.equals("v1_7_R4"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_7_R4(4, 0, plugin, (org.bukkit.craftbukkit.v1_7_R4.CraftWorld) this.world), net.minecraft.server.v1_7_R4.BiomeBase.class,
                        net.minecraft.server.v1_7_R4.BiomeTemperature.class, new net.minecraft.server.v1_7_R4.BiomeTemperature(0.2F, 0.2F));
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_7_R4(18, 0, plugin, (org.bukkit.craftbukkit.v1_7_R4.CraftWorld) this.world), net.minecraft.server.v1_7_R4.BiomeBase.class,
                        net.minecraft.server.v1_7_R4.BiomeTemperature.class, new net.minecraft.server.v1_7_R4.BiomeTemperature(0.45F, 0.3F));
            }
            else if(version.equals("v1_8_R1"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_8_R1(4, 0, plugin, (org.bukkit.craftbukkit.v1_8_R1.CraftWorld) this.world), net.minecraft.server.v1_8_R1.BiomeBase.class,
                        net.minecraft.server.v1_8_R1.BiomeTemperature.class, null);
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_8_R1(18, 0, plugin, (org.bukkit.craftbukkit.v1_8_R1.CraftWorld) this.world), net.minecraft.server.v1_8_R1.BiomeBase.class,
                        net.minecraft.server.v1_8_R1.BiomeTemperature.class, new net.minecraft.server.v1_8_R1.BiomeTemperature(0.45F, 0.3F));
            }
            else if(version.equals("v1_8_R2"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_8_R2(4, 0, plugin, (org.bukkit.craftbukkit.v1_8_R2.CraftWorld) this.world), net.minecraft.server.v1_8_R2.BiomeBase.class,
                        net.minecraft.server.v1_8_R2.BiomeBase.BiomeTemperature.class, null);
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_8_R2(18, 0, plugin, (org.bukkit.craftbukkit.v1_8_R2.CraftWorld) this.world), net.minecraft.server.v1_8_R2.BiomeBase.class,
                        net.minecraft.server.v1_8_R2.BiomeBase.BiomeTemperature.class, new net.minecraft.server.v1_8_R2.BiomeBase.BiomeTemperature(0.45F, 0.3F));
            }
            else if(version.equals("v1_8_R3"))
            {
                biomeRegister("Forest", "FOREST", 353825, new BiomeForest_v1_8_R3(4, 0, plugin, (org.bukkit.craftbukkit.v1_8_R3.CraftWorld) this.world), net.minecraft.server.v1_8_R3.BiomeBase.class,
                        net.minecraft.server.v1_8_R3.BiomeBase.BiomeTemperature.class, null);
                biomeRegister("ForestHills", "FOREST_HILLS", 2250012, new BiomeForest_v1_8_R3(18, 0, plugin, (org.bukkit.craftbukkit.v1_8_R3.CraftWorld) this.world), net.minecraft.server.v1_8_R3.BiomeBase.class,
                        net.minecraft.server.v1_8_R3.BiomeBase.BiomeTemperature.class, new net.minecraft.server.v1_8_R3.BiomeBase.BiomeTemperature(0.45F, 0.3F));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return;
        }

        logger.info("[" + plugin.getName() + "] The world '" + world.getName() + "' will have big trees in the forests!");
    }

    public void biomeRegister(String biomeName, String biomeEnum, int seed, Object instance, Class<?> biomeBase, Class<?> tempClass, Object instance2)
    {
        try
        {
            Method biomeSeed = biomeBase.getDeclaredMethod("b", int.class);
            biomeSeed.setAccessible(true);
            biomeSeed.invoke(instance, seed);
            Method biomeNamer = biomeBase.getDeclaredMethod("a", String.class);
            biomeNamer.setAccessible(true);
            biomeNamer.invoke(instance, biomeName);

            if(biomeEnum == "FOREST_HILLS")
            {
                Method biomeHeight = biomeBase.getDeclaredMethod("a", tempClass);
                biomeHeight.setAccessible(true);
                biomeHeight.invoke(instance, instance2);
            }

            setFinalStatic(biomeBase.getDeclaredField(biomeEnum), instance);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void setFinalStatic(Field field, Object obj) throws Exception
    {
        field.setAccessible(true);

        Field mf = Field.class.getDeclaredField("modifiers");
        mf.setAccessible(true);
        mf.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, obj);
    }
}
