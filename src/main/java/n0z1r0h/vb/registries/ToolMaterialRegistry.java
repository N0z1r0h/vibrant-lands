package n0z1r0h.vb.registries;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class ToolMaterialRegistry {
    public static final ToolMaterial PLATINUM_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1775,
            8.5F,
            3.5F,
            16,
            ItemTags.DIAMOND_TOOL_MATERIALS
    );
}
