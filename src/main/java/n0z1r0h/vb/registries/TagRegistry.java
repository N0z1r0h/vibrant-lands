package n0z1r0h.vb.registries;

import n0z1r0h.vb.VibrantLands;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagRegistry {
    private static TagKey<Block> ofBlock(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(VibrantLands.MOD_ID, id));
    }

    private static TagKey<Item> ofItem(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(VibrantLands.MOD_ID, id));
    }

    public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = ofBlock("incorrect_for_platinum_tool");
    public static final TagKey<Item> PLATINUM_TOOL_MATERIALS = ofItem("platinum_tool_materials");
}
