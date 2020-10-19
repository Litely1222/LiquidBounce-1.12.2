package net.ccbluex.liquidbounce.features.module.modules.movement;

import net.ccbluex.liquidbounce.event.EventTarget;
import net.ccbluex.liquidbounce.event.UpdateEvent;
import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;

@ModuleInfo(name = "NoPush", description = "Disables push out of blocks.", category = ModuleCategory.MOVEMENT)
public class NoPush extends Module {

    public static boolean noPush;

    @EventTarget
    public void onUpdate(final UpdateEvent event) {
        noPush = true;

        super.onUpdate();
    }
}
