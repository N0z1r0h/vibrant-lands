package n0z1r0h.vb.registries;

import n0z1r0h.vb.VibrantLands;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundRegistry {
    public static SoundEvent register(String name) {
        Identifier id = Identifier.of(VibrantLands.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static final SoundEvent JB_DISC_SE = register("wet_hands_jb");

    public static void init() {}
}
