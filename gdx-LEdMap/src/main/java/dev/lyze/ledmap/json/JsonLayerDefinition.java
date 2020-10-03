package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.auto.JsonAutoIntGrid;
import dev.lyze.ledmap.json.auto.JsonAutoLayerRuleGroup;
import dev.lyze.ledmap.json.types.OptionalInt;

public class JsonLayerDefinition {
    public String type;
    public JsonAutoLayerRuleGroup[] autoRuleGroups; // only relevant for auto layers

    public OptionalInt autoSourceLayerDefUid;
    public OptionalInt autoTilesetDefUid;

    public float displayOpacity;
    public int gridSize;

    public String identifier;

    public JsonAutoIntGrid[] intGridValues;

    public float tilePivotX;
    public float tilePivotY;

    public OptionalInt tilesetDefUid;
    public int uid;
}
