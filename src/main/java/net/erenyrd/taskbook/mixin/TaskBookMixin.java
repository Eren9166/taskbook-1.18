package net.erenyrd.taskbook.mixin;

import net.erenyrd.taskbook.TaskBook;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TaskBookMixin {
	@Inject(at = @At("HEAD"), method = "init()V",remap = false)
	private void init(CallbackInfo info) {
		TaskBook.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
