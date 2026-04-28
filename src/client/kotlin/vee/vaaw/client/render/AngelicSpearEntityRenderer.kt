package vee.vaaw.client.render

import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.client.render.entity.TridentEntityRenderer
import net.minecraft.util.Identifier

class AngelicSpearEntityRenderer(
    context: EntityRendererFactory.Context
) : TridentEntityRenderer(context) {

    override fun getTexture(entity: net.minecraft.entity.projectile.TridentEntity) =
        Identifier("vaaw", "textures/entity/angelic_spear.png")
}