package com.minefit.XerxesTireIron.ForestBigTrees;

import java.util.Random;

import org.bukkit.craftbukkit.v1_8_R2.CraftWorld;

import net.minecraft.server.v1_8_R2.BiomeBase;
import net.minecraft.server.v1_8_R2.BiomeForest;
import net.minecraft.server.v1_8_R2.WorldGenTreeAbstract;

public class BiomeForest_v1_8_R2 extends BiomeForest
{
    private int aG;
    private WorldGenBigTree_v1_8_R2 bigTree;
    private ForestBigTrees plugin;
    private CraftWorld world;
    private int bigTreeRandom;

    public BiomeForest_v1_8_R2(int i, int j, ForestBigTrees instance, CraftWorld world)
    {
        super(i, j);
        plugin = instance;
        this.world = world;
        bigTree = new WorldGenBigTree_v1_8_R2(false, plugin.getConfig().getBoolean("worlds." + world.getName() + ".big-tree-fix"));
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
            BiomeForest_v1_8_R2 biomeforest = new BiomeForest_v1_8_R2(i, 1, plugin, world);
            biomeforest.a(new net.minecraft.server.v1_8_R2.BiomeBase.BiomeTemperature(an, ao + 0.2F));
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