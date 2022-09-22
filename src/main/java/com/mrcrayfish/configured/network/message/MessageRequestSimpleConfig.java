package com.mrcrayfish.configured.network.message;

import com.mrcrayfish.configured.Reference;
import com.mrcrayfish.configured.network.play.ServerPlayHandler;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;

/**
 * Author: MrCrayfish
 */
public class MessageRequestSimpleConfig
{
    public static final ResourceLocation ID = new ResourceLocation(Reference.MOD_ID, "request_simple_config");

    public static FriendlyByteBuf create(ResourceLocation id)
    {
        FriendlyByteBuf buf = PacketByteBufs.create();
        buf.writeResourceLocation(id);
        return buf;
    }
}