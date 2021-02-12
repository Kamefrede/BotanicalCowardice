package xyz.kamefrede.botanicalcowardice;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BotanicalCowardice.MODID)
public class BotanicalCowardice {
    public static final String MODID = "botanicalcowardice";
    public static final Logger LOGGER = LogManager.getLogger(MODID);


    public BotanicalCowardice() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event){
        LOGGER.info("Cowardly no more.");
    }

}
