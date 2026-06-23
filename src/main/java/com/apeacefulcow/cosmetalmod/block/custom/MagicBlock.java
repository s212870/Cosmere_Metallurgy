package com.apeacefulcow.cosmetalmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MagicBlock extends Block {
    public MagicBlock(Properties properties) {
        super(properties);
    }
    // Override the useWithoutItem method to define custom behavior when the block is used without an item
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                                Player player, BlockHitResult hitResult) {
        level.playSound(null, pos, SoundEvents.ANVIL_USE,
                        SoundSource.BLOCKS, 1.0f, 1.0f);
        
        return super.useWithoutItem(state, level, pos, player, hitResult);
    }
}
