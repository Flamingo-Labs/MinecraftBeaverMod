package com.madellz.beavermod.common.entity.animal;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;

/**
 * The Beaver class represents a beaver entity in the game.
 * It extends the {@link Animal} class and implements behavior specific to the beaver mob.
 */
public class Beaver extends Animal
{
    /**
     * Creates a new Beaver entity with the given entity type and level.
     *
     * @param pEntityType The type of the entity (e.g., the specific entity type for Beaver).
     * @param pLevel      The level (world) where the beaver will exist.
     */
    public Beaver(EntityType<? extends Beaver> pEntityType, Level pLevel)
    {
        super(pEntityType, pLevel);
    }

    /**
     * Determines whether a specific item stack is considered food for the beaver.
     *
     * @param pStack The item stack being checked.
     * @return False since beavers do not eat any item by default.
     * <p>
     * TODO: Implement food behavior for the beaver (e.g., specify items that beavers will eat). Add ticekt once created
     */
    @Override
    public boolean isFood(@Nonnull ItemStack pStack)
    {
        return false;
    }

    /**
     * Creates and returns the set of attributes for the beaver.
     *
     * @return A builder for the entity's attributes.
     *
     * TODO: Implement beaver specific attributes. Add ticket once created
     */
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.FOLLOW_RANGE, 24D);
    }

    /**
     * Gets the offspring of this beaver and the other given parent.
     * In this case, beavers do not currently breed, so this method returns null.
     *
     * @param pLevel       The level (world) where the offspring would be created.
     * @param pOtherParent The other parent for the breeding process.
     * @return Null, as beavers do not currently have offspring in this implementation.
     * <p>
     * TODO: Implement breeding. Add ticket once created.
     */
    @Override
    public @Nullable AgeableMob getBreedOffspring(@Nonnull ServerLevel pLevel, @Nonnull AgeableMob pOtherParent)
    {
        return null;
    }
}
