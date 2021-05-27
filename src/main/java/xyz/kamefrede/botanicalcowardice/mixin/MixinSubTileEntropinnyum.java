package xyz.kamefrede.botanicalcowardice.mixin;

import net.minecraft.entity.Entity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.botania.common.block.subtile.generating.SubTileEntropinnyum;

@Mixin(SubTileEntropinnyum.class)
public class MixinSubTileEntropinnyum {

	/**
	 * @author Kamefrede
	 */
	@Overwrite
	private static boolean isUnethical(Entity e){
		return false;
	}
}
