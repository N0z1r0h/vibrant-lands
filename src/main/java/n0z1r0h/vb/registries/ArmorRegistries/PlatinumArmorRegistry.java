package n0z1r0h.vb.registries.ArmorRegistries;

import n0z1r0h.vb.VibrantLands;
import n0z1r0h.vb.registries.TagRegistry;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class PlatinumArmorRegistry {

    public static final RegistryKey<EquipmentAsset> PLAT_ARMOR_MAT_KEY =
            RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(VibrantLands.MOD_ID, "platinum"));
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            35,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 6,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 3
            ),
            17,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f,
            0.05f,
            TagRegistry.REPAIRS_PLATINUM_ARMOR,
            PLAT_ARMOR_MAT_KEY
    );

    public static void init() {}
}
