package xyz.kamefrede.botanicalcowardice.mixin;

import net.minecraft.entity.Entity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MixinSubTileEntropinnyum.class)
public class MixinSubTileEntropinnyum {

	/**
	 * @author Kamefrede
	 */
	@Overwrite
	private static boolean isUnethical(Entity e){
		return false;
	}
}
