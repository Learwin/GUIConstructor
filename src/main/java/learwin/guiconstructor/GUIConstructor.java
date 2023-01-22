package learwin.guiconstructor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("guiconstructor")
public class GUIConstructor
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static int TEST = 0;

    public GUIConstructor() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from the library's preinit");
    }

    public static void printTheThing() {
        LOGGER.info("I'm the library and I was asked to print the thing!");
    }
}
