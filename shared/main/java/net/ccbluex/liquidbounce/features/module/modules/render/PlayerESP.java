package net.ccbluex.liquidbounce.features.module.modules.render;

import net.ccbluex.liquidbounce.event.EventTarget;
import net.ccbluex.liquidbounce.event.UpdateEvent;
import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;
import net.minecraft.entity.player.EntityPlayer;

@ModuleInfo(name = "PlayerESP", description = ".", category = ModuleCategory.RENDER)
public class PlayerESP extends Module {

    EntityPlayer entityPlayer;

    @EventTarget
    public void onUpdate(UpdateEvent event) {
        entityPlayer.setGlowing(true);
    }
}
