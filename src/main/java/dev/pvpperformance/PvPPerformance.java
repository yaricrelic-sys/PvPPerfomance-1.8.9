
package dev.pvpperformance;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = PvPPerformance.MOD_ID,
    name = PvPPerformance.MOD_NAME,
    version = PvPPerformance.VERSION,
    acceptedMinecraftVersions = "[1.8.9]"
)
public final class PvPPerformance {
    public static final String MOD_ID = "pvpperformance";
    public static final String MOD_NAME = "PvP Performance";
    public static final String VERSION = "0.1.0";

    private static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info("{} {} loaded. No optimizations enabled yet.",
                MOD_NAME, VERSION);
    }
}
