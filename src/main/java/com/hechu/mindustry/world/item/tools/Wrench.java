package com.hechu.mindustry.world.item.tools;

import com.hechu.mindustry.MindustryConstants;
import com.hechu.mindustry.world.level.block.Equipment.PowerNodeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import snownee.kiwi.item.ModItem;
import snownee.kiwi.util.NBTHelper;

/**
 * @author luobochuanqi
 */
public class Wrench extends ModItem {
    public static final String NAME = "wrench";
    private static final String NBT_KEY = "PowerNodeData";

    public Wrench(Properties builder) {
        super(builder);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        BlockPos clickedPos = pContext.getClickedPos();
        BlockEntity blockEntity = pContext.getLevel().getBlockEntity(clickedPos);
        ItemStack itemStack = pContext.getItemInHand();
        NBTHelper tag = NBTHelper.of(itemStack).get() == null ? NBTHelper.create() : NBTHelper.of(itemStack);
        if (!pContext.getLevel().isClientSide() && blockEntity instanceof PowerNodeBlockEntity powerNodeBlockEntity2) {
            // 判断当前 nbt 是否已经存储了一个节点的坐标
            if (tag.get().contains(NBT_KEY)) {
                // powerNodeBlockEntity1 连接 powerNodeBlockEntity2
                PowerNodeBlockEntity powerNodeBlockEntity1 = (PowerNodeBlockEntity) pContext.getLevel().getBlockEntity(tag.getPos(NBT_KEY));
                if (powerNodeBlockEntity1 != powerNodeBlockEntity2) {
                    // 如果点击的节点是已经被连接的，那么就取消连接
                    if (powerNodeBlockEntity1.getConnectedNodes().contains(powerNodeBlockEntity2)
                            && powerNodeBlockEntity2.getPassivelyConnectedNodes().contains(powerNodeBlockEntity1)) {
                        powerNodeBlockEntity1.removeConnectedNode(powerNodeBlockEntity2);
                        powerNodeBlockEntity2.removePassivelyConnectedNode(powerNodeBlockEntity1);
                    } else {
                        powerNodeBlockEntity2.connectFromOtherNode(powerNodeBlockEntity1);
                        powerNodeBlockEntity1.connectToOtherNode(powerNodeBlockEntity2);
                        tag.remove(NBT_KEY);
                    }
                } else {
                    // 否则就可以判断点击的节点是已经存储的节点本身
                    pContext.getPlayer().sendSystemMessage(Component.translatable(MindustryConstants.CHAT_WARN + "linkSelf"));
                    return InteractionResult.PASS;
                }
            } else {
                tag.setPos(NBT_KEY, clickedPos);
            }
            itemStack.setTag(tag.get());
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        Tag tag = pPlayer.getItemInHand(pUsedHand).getTag();
        if (tag != null) {
            MindustryConstants.logger.debug("yes: " + tag.toString());
        } else {
            MindustryConstants.logger.debug("no tag");
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}