package xyz.iwolfking.woldsvaults.integration.vaultfilters;

import net.joseph.vaultfilters.attributes.abstracts.IntAttribute;
import net.minecraft.world.item.ItemStack;
import xyz.iwolfking.woldsvaults.items.LayoutModificationItem;

public class EtchedLayoutValueAttribute extends IntAttribute {
    public EtchedLayoutValueAttribute(Integer value) {
        super(value);
    }

    @Override
    public Integer getValue(ItemStack itemStack) {
        if(itemStack.getItem() instanceof LayoutModificationItem) {
            if(itemStack.getOrCreateTag().contains("value")) {
               return itemStack.getOrCreateTag().getInt("value");
            }
        }
        return 0;
    }

    @Override
    public String getTranslationKey() {
        return "etched_layout_value";
    }
}
