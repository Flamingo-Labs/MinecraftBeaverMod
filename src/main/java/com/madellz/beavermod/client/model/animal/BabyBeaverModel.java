package com.madellz.beavermod.client.model.animal;

import com.madellz.beavermod.common.entity.animal.Beaver;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import javax.annotation.Nonnull;

/**
 * BabyBeaverModel represents the 3D model of a baby beaver entity in Minecraft.
 * It defines the structure, parts, and animations.
 */
public class BabyBeaverModel extends HierarchicalModel<Beaver>
{
    private final ModelPart beaver;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart front_left_leg;
    private final ModelPart front_right_leg;
    private final ModelPart back_right_leg;
    private final ModelPart back_left_leg;

    /**
     * Constructor that initializes model parts from the provided root model.
     *
     * @param root The root ModelPart containing all subparts.
     */
    public BabyBeaverModel(ModelPart root)
    {
        this.beaver = root.getChild("beaver");
        this.body = this.beaver.getChild("body");
        this.head = this.body.getChild("head");
        this.front_left_leg = this.body.getChild("front_left_leg");
        this.front_right_leg = this.body.getChild("front_right_leg");
        this.back_right_leg = this.body.getChild("back_right_leg");
        this.back_left_leg = this.body.getChild("back_left_leg");
    }

    /**
     * Creates and defines the structure of the baby beaver model.
     *
     * @return LayerDefinition containing the model structure.
     */
    public static LayerDefinition createBodyLayer()
    {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition beaver = partdefinition.addOrReplaceChild("beaver", CubeListBuilder.create(),
                PartPose.offset(0.0F, 24.0F, 3.0F));

        PartDefinition body = beaver.addOrReplaceChild("body",
                CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -8.0F, 6.0F, 4.0F, 8.0F,
                        new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-3.0F, -5.0F, -4.0F, 6.0F, 1.0F, 4.0F,
                        new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-2.0F, -4.5F, -6.0F, 4.0F, 1.0F, 2.0F,
                        new CubeDeformation(0.0F)).texOffs(20, 27).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F,
                        new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

        PartDefinition tail_r1 = body.addOrReplaceChild("tail_r1",
                CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 6.0F,
                        new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head",
                CubeListBuilder.create().texOffs(20, 12).addBox(-3.0F, -3.25F, -1.5F, 5.0F, 4.0F, 3.0F,
                        new CubeDeformation(0.0F)).texOffs(28, 7).addBox(-1.5F, -0.75F, -2.0F, 2.0F, 1.0F, 1.0F,
                        new CubeDeformation(0.0F)).texOffs(8, 27).addBox(-1.5F, 0.25F, -1.5F, 2.0F, 1.0F, 0.0F,
                        new CubeDeformation(0.001F)), PartPose.offset(0.5F, -0.25F, -9.5F));

        PartDefinition right_ear_r1 = head.addOrReplaceChild("right_ear_r1",
                CubeListBuilder.create().texOffs(8, 28).addBox(-1.0F, -0.9F, -1.0F, 1.0F, 1.0F, 0.0F,
                        new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -2.85F, 1.1F, 0.0F, 0.6109F, 0.0F));

        PartDefinition left_ear_r1 = head.addOrReplaceChild("left_ear_r1",
                CubeListBuilder.create().texOffs(28, 9).addBox(-1.1F, -0.9F, -0.3F, 1.0F, 1.0F, 0.0F,
                        new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.35F, -2.85F, 1.25F, 0.0F, -0.6109F, 0.0F));

        PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg",
                CubeListBuilder.create().texOffs(26, 27).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F,
                        new CubeDeformation(0.0F)).texOffs(28, 3).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F,
                        new CubeDeformation(0.0F)), PartPose.offset(2.0F, 2.0F, -7.0F));

        PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg",
                CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F,
                        new CubeDeformation(0.0F)).texOffs(28, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F,
                        new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 2.0F, -7.0F));

        PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg",
                CubeListBuilder.create().texOffs(12, 24).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F,
                        new CubeDeformation(0.001F)).texOffs(20, 23).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F,
                        new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, -2.0F));

        PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg",
                CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F,
                        new CubeDeformation(0.001F)).texOffs(20, 19).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F,
                        new CubeDeformation(0.0F)), PartPose.offset(2.0F, 2.0F, -2.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    /**
     * Sets up animations for the baby beaver entity, defining how it moves.
     *
     * @param pEntity          The beaver entity instance.
     * @param pLimbSwing       The swing progress of the entity's limbs.
     * @param pLimbSwingAmount The intensity of the limb swing.
     * @param pAgeInTicks      The entity's age in ticks, used for time-based animations.
     * @param pNetHeadYaw      The horizontal rotation of the entity's head.
     * @param pHeadPitch       The vertical rotation of the entity's head.
     *                         <p>
     *                                                 TODO: #10 Implement Beaver Animations
     */
    @Override
    public void setupAnim(@Nonnull Beaver pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks,
            float pNetHeadYaw, float pHeadPitch)
    {

    }

    /**
     * Renders the baby beaver model to the screen using the provided rendering parameters.
     *
     * @param poseStack      The transformation stack for positioning and scaling.
     * @param vertexConsumer The vertex consumer for rendering the model.
     * @param packedLight    The lighting value for rendering.
     * @param packedOverlay  The overlay texture for rendering.
     * @param red            The red color multiplier.
     * @param green          The green color multiplier.
     * @param blue           The blue color multiplier.
     * @param alpha          The transparency level.
     */
    @Override
    public void renderToBuffer(@Nonnull PoseStack poseStack, @Nonnull VertexConsumer vertexConsumer, int packedLight,
            int packedOverlay, float red, float green, float blue, float alpha)
    {
        beaver.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    /**
     * Retrieves the root model part of the baby beaver model.
     *
     * @return The root {@link ModelPart} representing the entire beaver model.
     */
    @Override
    @Nonnull
    public ModelPart root()
    {
        return beaver;
    }
}