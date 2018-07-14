package com.atherys.script.js.library.item;

import org.spongepowered.api.item.inventory.ItemStack;

import java.util.function.BiFunction;

public class CompareItemStacks implements BiFunction<ItemStack, ItemStack, Boolean> {

    @Override
    public Boolean apply(ItemStack first, ItemStack second) {
        return first.equalTo(second);
    }

}
