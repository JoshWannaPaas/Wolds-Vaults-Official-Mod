<<<<<<< HEAD:src/main/java/xyz/iwolfking/woldsvaults/api/helper/GameruleHelper.java
package xyz.iwolfking.woldsvaults.api.helper;
=======
package xyz.iwolfking.woldsvaults.api.util;
>>>>>>> upstream/master:src/main/java/xyz/iwolfking/woldsvaults/api/util/GameruleHelper.java

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import xyz.iwolfking.woldsvaults.init.ModGameRules;
import xyz.iwolfking.woldsvaults.init.ModNetwork;
import xyz.iwolfking.woldsvaults.network.message.ClientboundSyncGamerulesMessage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameruleHelper {
    public static boolean isEnabled(GameRules.Key<GameRules.BooleanValue> gamerule, Level level) {
        return level.getGameRules().getBoolean(gamerule);
    }

    public static void syncGameRules(Level level, List<ServerPlayer> players) {
        Map<String, Boolean> gameruleMap = new HashMap<>();
        gameruleMap.put("enableVaultDolls", GameruleHelper.isEnabled(ModGameRules.ENABLE_VAULT_DOLLS, level));
        gameruleMap.put("enablePlacingVaultDolls", GameruleHelper.isEnabled(ModGameRules.ENABLE_PLACING_VAULT_DOLLS, level));
        gameruleMap.put("vaultAllowMentoring", GameruleHelper.isEnabled(iskallia.vault.init.ModGameRules.ALLOW_MENTOR_BREW, level));
        gameruleMap.put("vaultAllowKnowledgeBrew", GameruleHelper.isEnabled(iskallia.vault.init.ModGameRules.ALLOW_KNOWLEDGE_BREW, level));
<<<<<<< HEAD:src/main/java/xyz/iwolfking/woldsvaults/api/helper/GameruleHelper.java
=======
        gameruleMap.put("enableVaults", GameruleHelper.isEnabled(ModGameRules.ENABLE_VAULTS, level));
        gameruleMap.put("enableSkillAltars", GameruleHelper.isEnabled(ModGameRules.ENABLE_SKILL_ALTARS, level));
        gameruleMap.put("enableModifierWorkbench", GameruleHelper.isEnabled(ModGameRules.ENABLE_MODIFIER_WORKBENCH, level));
>>>>>>> upstream/master:src/main/java/xyz/iwolfking/woldsvaults/api/util/GameruleHelper.java
        if(players != null && !players.isEmpty()) {
            players.forEach(serverPlayer -> {
                ModNetwork.sendToClient(new ClientboundSyncGamerulesMessage(gameruleMap), serverPlayer);
            });
        }
    }

    public static void syncGameRules(List<ServerPlayer> players) {
        if(players != null && !players.isEmpty()) {
            syncGameRules(players.get(0).getLevel(), players);
        }
    }

    public static void syncGameRules(ServerPlayer player) {
        syncGameRules(player.getLevel(), List.of(player));
    }
}
