package dev.piteam.project_industrialize.worldgen;

import dev.piteam.project_industrialize.main.ProjectIndustrialize;
import dev.piteam.project_industrialize.worldgen.ore.ModConfiguredFeatures;
import dev.piteam.project_industrialize.worldgen.ore.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap)
                .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap),
                Set.of(ProjectIndustrialize.MOD_ID));

    }
}
