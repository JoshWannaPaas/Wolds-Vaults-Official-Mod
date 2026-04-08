package xyz.iwolfking.woldsvaults.client.init;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import org.lwjgl.glfw.GLFW;
import xyz.iwolfking.woldsvaults.WoldsVaults;

public class ModKeybinds {
    public static KeyMapping isFeatherFixed;
    public static KeyMapping openWoldsVaultsConfig;
<<<<<<< HEAD:src/main/java/xyz/iwolfking/woldsvaults/init/client/ModKeybinds.java
=======
    public static KeyMapping toggleBetterCombat;
    public static KeyMapping openInventoryHUD;
>>>>>>> upstream/master:src/main/java/xyz/iwolfking/woldsvaults/client/init/ModKeybinds.java

    public static void registerKeyBinds() {
        isFeatherFixed = registerKeyMapping("is_feather_fixed", -1);
        openWoldsVaultsConfig = registerKeyMapping("open_wolds_vaults_config", GLFW.GLFW_KEY_DELETE);
<<<<<<< HEAD:src/main/java/xyz/iwolfking/woldsvaults/init/client/ModKeybinds.java
=======
        toggleBetterCombat = registerKeyMapping("toggle_better_combat", GLFW.GLFW_KEY_PERIOD);
        openInventoryHUD = registerKeyMapping("open_inventory_hud", GLFW.GLFW_KEY_O);
>>>>>>> upstream/master:src/main/java/xyz/iwolfking/woldsvaults/client/init/ModKeybinds.java
    }

    private static KeyMapping registerKeyMapping(String name, int keyCode) {
        KeyMapping key = new KeyMapping("key." + WoldsVaults.MOD_ID + "." + name, keyCode, "key.category." + WoldsVaults.MOD_ID);
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}
