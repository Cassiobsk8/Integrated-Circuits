package moe.nightfall.vic.integratedcircuits.api;

import net.minecraft.world.World;
import codechicken.lib.vec.BlockCoord;

public interface ISocketProvider
{
	public ISocket getSocketAt(World world, BlockCoord pos, int side);
}
