package xyz.iwolfking.woldsvaults.mixins.vaulthunters.fixes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import iskallia.vault.block.render.MonolithRenderer;
import iskallia.vault.core.vault.modifier.spi.VaultModifier;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = MonolithRenderer.class, remap = false)
public class MixinMonolithRenderer {

<<<<<<< HEAD
    /**
     * @author iwolfking
     * @reason Yes this is terrible, no I don't care, hides emojis from monolith text rendering
     */
    @Overwrite
    public void render(MonolithTileEntity tileEntity, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int combinedLight, int combinedOverlayIn) {
        RenderSystem.enableDepthTest();
        matrixStack.pushPose();
        float scale = 0.02F;
        matrixStack.translate(0.5, 2.5, 0.5);
        matrixStack.scale(scale, scale, scale);
        matrixStack.mulPose(Minecraft.getInstance().getEntityRenderDispatcher().cameraOrientation());
        matrixStack.mulPose(Vector3f.ZP.rotationDegrees(180.0F));
        matrixStack.translate(-65.0, -11.0, 0.0);
        RendererContext context = new RendererContext(matrixStack, partialTicks, MultiBufferSource.immediate(Tesselator.getInstance().getBuilder()), this.font);
        MonolithBlock.State state =  tileEntity.getBlockState().getValue(MonolithBlock.STATE);
        List<Component> lines = new ArrayList<>();
        List<Component> description = new ArrayList<>();
        List<VaultModifierStack> stack = new ArrayList<>();
        if (tileEntity.isOverStacking() && state == MonolithBlock.State.EXTINGUISHED) {
            lines.add((new TextComponent("Pillage for Loot")).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
        }

        tileEntity.getModifiers().forEach((id, count) -> {
            VaultModifierRegistry.getOpt(id).ifPresent((modifier) -> {
                String modifierName = modifier.getChatDisplayNameComponent(count).getString();
                modifierName = modifierName.replaceAll(":.*: *", "");
                Style style = Style.EMPTY.withColor(modifier.getDisplayTextColor());
                lines.add(new TextComponent(modifierName).withStyle(style));
                description.add((new TextComponent(modifier.getDisplayDescriptionFormatted(count))).withStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
                stack.add(VaultModifierStack.of(modifier, count));
            });
        });
        Collections.reverse(lines);
        Collections.reverse(stack);

        for (Component line: description) {
            MutableComponent shadow = (new TextComponent("")).append(line.getString()).withStyle(Style.EMPTY.withColor(ChatFormatting.BLACK));
            context.renderText(shadow, 66.0F, 68.0F, true, true);
            context.renderText(line, 65.0F, 67.0F, true, true);
            context.translate(0.0, -11.0, 0.0);
        }


        for (Component line: lines) {
            MutableComponent shadow = (new TextComponent("")).append(line.getString()).withStyle(Style.EMPTY.withColor(ChatFormatting.BLACK));
            context.renderText(shadow, 66.0F, 66.0F, true, true);
            context.renderText(line, 65.0F, 65.0F, true, true);
            context.translate(0.0, -11.0, 0.0);
        }

        Minecraft minecraft = Minecraft.getInstance();
        double xTranslation = stack.size() > 1 ? 82.5 + (stack.size() * 5) : 82.5;
        matrixStack.translate(xTranslation, 73.0, 0.0);
        matrixStack.pushPose();
        int right = minecraft.getWindow().getGuiScaledWidth();
        int bottom = minecraft.getWindow().getGuiScaledHeight();
        matrixStack.translate(-right, -bottom, 0.0);
        ModifiersRenderer.renderVaultModifiersWithDepth(stack, matrixStack, false);
        matrixStack.popPose();
        matrixStack.popPose();
=======
    @WrapOperation(method = "lambda$render$0", at = @At(value = "INVOKE", target = "Liskallia/vault/core/vault/modifier/spi/VaultModifier;getChatDisplayNameComponent(I)Lnet/minecraft/network/chat/Component;"))
    private static Component removeEmoji(VaultModifier<?> modifier, int modifierStackSize, Operation<Component> original){
        String modifierName = original.call(modifier, modifierStackSize).getString();
        modifierName = modifierName.replaceAll(":.*: *", "");
        Style style = Style.EMPTY.withColor(modifier.getDisplayTextColor());
        return new TextComponent(modifierName).withStyle(style);
>>>>>>> upstream/master
    }
}
