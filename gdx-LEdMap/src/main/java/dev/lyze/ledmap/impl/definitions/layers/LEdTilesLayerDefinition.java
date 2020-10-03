package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.impl.definitions.LEdTileset;
import dev.lyze.ledmap.json.JsonLayerDefinition;

public class LEdTilesLayerDefinition extends LEdLayerDefinition {
    private final LEdTileset[] tilesets;

    private int tilesetDefUId;
    private LEdTileset tilesetDef;

    public LEdTilesLayerDefinition(JsonLayerDefinition json, LEdTileset[] tilesets) {
        super(json);

        this.tilesets = tilesets;
    }

    @Override
    protected void parseInternal() {
        tilesetDef = tilesets[tilesetDefUId = getJson().tilesetDefUid.value];
    }
}
