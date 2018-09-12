package com.atherys.script.js.library.item;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetItemStackDisplayName implements Function<ItemStack, Text> {
    @Override
    public Text apply(ItemStack itemStack) {
        return itemStack.get(Keys.DISPLAY_NAME).orElse(null);
    }
}
