package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.json.JsonLayerDefinition;

public class LEdEntitiesLayerDefinition extends LEdLayerDefinition {
    public LEdEntitiesLayerDefinition(JsonLayerDefinition json) {
        super(json);
    }

    @Override
    protected void parseInternal() {
        // intGridValues gets filled with a default "identifier = null" and "color = #00000" entry, but that's useless
    }
}
