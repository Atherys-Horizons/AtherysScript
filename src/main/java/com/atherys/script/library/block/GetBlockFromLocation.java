package com.atherys.script.library.block;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

;

/**
 * @jsfunc
 */
public class GetBlockFromLocation implements ScriptFunction<Location<World>, BlockState> {

    /**
     * Used to get the `BlockState` present at the specified location.
     *
     * @ex var location = locationOf( getWorldFromName("world"), 100, 50, 100 );
     * @ex var block = getBlockFromLocation(location);
     *
     * @param worldLocation The location to get the block from.
     * @return A `BlockState` representing the block at the location.
     */
    @Override
    public BlockState call(Location<World> worldLocation) {
        return worldLocation.getBlock();
    }
}
