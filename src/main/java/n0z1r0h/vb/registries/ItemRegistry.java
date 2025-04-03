package n0z1r0h.vb.registries;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ItemRegistry {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VibrantLands.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(key));
        Registry.register(Registries.ITEM, key, item);
        return item;
    }
}
