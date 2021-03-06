package com.atherys.script.library.damage;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

/**
 * @jsfunc
 */
public class SetDamageSourceCreative implements ScriptFunction<DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder call(DamageSource.DamageSourceBuilder damageSourceBuilder) {
        return damageSourceBuilder.creative();
    }
}
