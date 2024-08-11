package net.ewaldion.buddyassist.datagen;

import net.ewaldion.buddyassist.block.ModBlocks;
import net.ewaldion.buddyassist.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> REMAINS_SMELT = List.of(ModBlocks.MONSTER_BLOCK,
            ModBlocks.DOG_REMAINS);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, REMAINS_SMELT, RecipeCategory.MISC, ModItems.REMAINS,
                0.7f, 360, "remains");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REMAINS, RecipeCategory.DECORATIONS,
                ModBlocks.DOG_REMAINS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MONSTER_BLOCK, 2)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.DOG_REMAINS)
                .criterion(hasItem(ModBlocks.DOG_REMAINS), conditionsFromItem(ModBlocks.DOG_REMAINS))
                .criterion(hasItem(ModBlocks.MONSTER_BLOCK), conditionsFromItem(ModBlocks.MONSTER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MONSTER_BLOCK)));

    }
}
