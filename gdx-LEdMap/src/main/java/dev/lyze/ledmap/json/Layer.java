package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.auto.AutoIntGrid;
import dev.lyze.ledmap.json.auto.AutoRule;
import dev.lyze.ledmap.json.optional.OptionalInt;

public class Layer {
    private String type;
    private AutoRule[] autoRuleGroups; // only relevant for auto layers

    private OptionalInt autoSourceLayerDefUid;
    private OptionalInt autoTilesetDefUid;

    private float displayOpacity;
    private int gridSize;

    private String identifier;

    private AutoIntGrid[] intGridValues;

    private float tilePivotX;
    private float tilePivotY;

    private OptionalInt tilesetDefUid;
    private int uid;
}
