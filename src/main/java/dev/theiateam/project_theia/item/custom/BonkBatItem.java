package dev.theiateam.project_theia.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class BonkBatItem extends Item {
    public BonkBatItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Level level = target.level();
        if (!level.isClientSide) {
//            target.hurt(DamageSource.playerAttack, 6f);
            target.playSound(SoundEvents.ANVIL_BREAK, 1f, 1f);
        }

        stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
        return true;
    }

//    @Override
//    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
//        interactionTarget.playSound(SoundEvents.ANVIL_LAND, 1f, 1f);
//        stack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
//        return super.interactLivingEntity(stack, player, interactionTarget, usedHand);
//    }
}
