package n0z1r0h.vb.registries;

import n0z1r0h.vb.VibrantLands;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class JukeBoxSongRegistry {
    private static RegistryKey<JukeboxSong> of(String namer) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(VibrantLands.MOD_ID, namer));
    }

    public static final RegistryKey<JukeboxSong> JB_KEY = of("wet_hands_jb");

    public static void init() {}
}
