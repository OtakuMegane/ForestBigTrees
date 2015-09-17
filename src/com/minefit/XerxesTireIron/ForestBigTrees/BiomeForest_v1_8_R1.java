package com.minefit.XerxesTireIron.ForestBigTrees;

import java.util.Random;

import org.bukkit.craftbukkit.v1_8_R1.CraftWorld;

import net.minecraft.server.v1_8_R1.BiomeBase;
import net.minecraft.server.v1_8_R1.BiomeForest;
import net.minecraft.server.v1_8_R1.BiomeTemperature;
import net.minecraft.server.v1_8_R1.WorldGenTreeAbstract;

public class BiomeForest_v1_8_R1 extends BiomeForest
{
    private int aG;
    private WorldGenBigTree_v1_8_R1 bigTree;
    private ForestBigTrees plugin;
    private CraftWorld world;
    private int bigTreeRandom;

    public BiomeForest_v1_8_R1(int i, int j, ForestBigTrees instance, CraftWorld world)
    {
        super(i, j);
        plugin = instance;
        this.world = world;
        bigTree = new WorldGenBigTree_v1_8_R1(false, plugin.getConfig().getBoolean("worlds." + world.getName() + ".big-tree-fix", false));
        bigTreeRandom = plugin.getConfig().getInt("worlds." + world.getName() + ".big-tree-percentage");
        aG = j;
    }

    @Override
    public WorldGenTreeAbstract a(Random random)
    {
        if(aG == 3 && random.nextInt(3) > 0)
        {
            return aF;
        }

        if(aG == 2 || random.nextInt(5) == 0)
        {
            return aE;
        }

        if(random.nextInt(100) < bigTreeRandom)
        {
            return bigTree;
        }

        return aA;
    }

    @Override
    protected BiomeBase d(int i)
    {
        if(id == BiomeBase.FOREST.id)
        {
            BiomeForest_v1_8_R1 biomeforest = new BiomeForest_v1_8_R1(i, 1, plugin, world);
            biomeforest.a(new BiomeTemperature(an, ao + 0.2F));
            biomeforest.a("Flower Forest");
            biomeforest.a(0x6a7425, true);
            biomeforest.a(0x7da225);
            return biomeforest;
        }
        else
        {
            return super.d(i);
        }
    }
}