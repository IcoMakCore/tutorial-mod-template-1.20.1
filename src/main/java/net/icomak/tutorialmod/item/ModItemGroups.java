package net.icomak.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.icomak.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "sapphire"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.RAW_SAPPHIRE);


                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }

}
