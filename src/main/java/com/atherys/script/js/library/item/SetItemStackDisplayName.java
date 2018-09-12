package com.atherys.script.js.library.item;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetItemStackDisplayName implements BiFunction<ItemStack, Text, Boolean> {

    SetItemStackDisplayName() {}

    @Override
    public Boolean apply(ItemStack itemStack, Text text) {
        return itemStack.offer(Keys.DISPLAY_NAME, text).isSuccessful();
    }
}
