package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.impl.definitions.LEdTileset;
import dev.lyze.ledmap.json.JsonLayerDefinition;

import java.util.List;

public class LEdLayerDefinitionFactory {
    public static LEdLayerDefinition create(JsonLayerDefinition json, LEdTileset[] tilesets, List<LEdLayerDefinition> layersWithoutAutoSource) {
        LEdLayerDefinitionType lEdLayerDefinitionType = LEdLayerDefinitionType.valueOf(json.type);

        switch (lEdLayerDefinitionType) {
            case AutoLayer:
                return new LEdAutoLayerDefinition(json, tilesets);
            case Tiles:
                return new LEdTilesLayerDefinition(json, tilesets);
            case Entities:
                return new LEdEntitiesLayerDefinition(json);
            case IntGrid:
                // int grid gets converted to an auto layer if you select a tileset in the editor, therefore instead of doing everything twice we convert the layer to an auto layer
                if (json.autoSourceLayerDefUid.hasValue)
                    return new LEdAutoLayerDefinition(json, tilesets, layersWithoutAutoSource);
                return new LEdIntGridLayerDefinition(json);
            default:
                throw new IllegalArgumentException("LEd layer definition isn't implemented yet " + lEdLayerDefinitionType);
        }
    }
}
