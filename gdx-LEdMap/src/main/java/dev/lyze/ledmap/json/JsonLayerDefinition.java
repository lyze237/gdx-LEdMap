package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.auto.JsonAutoIntGrid;
import dev.lyze.ledmap.json.auto.JsonAutoRule;
import dev.lyze.ledmap.json.types.OptionalInt;

public class JsonLayerDefinition {
    private String type;
    private JsonAutoRule[] autoRuleGroups; // only relevant for auto layers

    private OptionalInt autoSourceLayerDefUid;
    private OptionalInt autoTilesetDefUid;

    private float displayOpacity;
    private int gridSize;

    private String identifier;

    private JsonAutoIntGrid[] intGridValues;

    private float tilePivotX;
    private float tilePivotY;

    private OptionalInt tilesetDefUid;
    private int uid;
}
