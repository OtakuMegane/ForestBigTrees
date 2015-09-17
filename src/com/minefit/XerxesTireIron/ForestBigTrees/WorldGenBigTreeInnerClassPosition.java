package com.minefit.XerxesTireIron.ForestBigTrees;

import net.minecraft.server.v1_8_R1.BlockPosition;

class WorldGenBigTreeInnerClassPosition extends BlockPosition {

    private final int b;

    public WorldGenBigTreeInnerClassPosition(BlockPosition blockposition, int i) {
        super(blockposition.getX(), blockposition.getY(), blockposition.getZ());
        this.b = i;
    }

    public int q() {
        return this.b;
    }
}
