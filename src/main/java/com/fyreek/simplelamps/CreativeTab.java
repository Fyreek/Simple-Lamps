package com.fyreek.simplelamps;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Fyreek on 26.10.2016.
 */
public class CreativeTab extends CreativeTabs {

    public CreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.GLOWSTONE_DUST);
    }
}
