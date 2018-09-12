package com.atherys.script.js.library.item;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetItemStackEnchants implements BiFunction<ItemStack, Enchantment[], Boolean> {

    SetItemStackEnchants() {}

    @Override
    public Boolean apply(ItemStack itemStack, Enchantment... enchantments) {
        return itemStack.offer(Keys.ITEM_ENCHANTMENTS, Arrays.asList(enchantments)).isSuccessful();
    }

}
