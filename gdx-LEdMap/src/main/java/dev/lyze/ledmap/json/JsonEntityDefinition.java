package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.OptionalInt;
import dev.lyze.ledmap.json.types.TodoObject;

public class JsonEntityDefinition {
    public String identifier;
    public int uid;

    public int width;
    public int height;

    public String color;
    public String renderMode;

    public OptionalInt tilesetId;
    public OptionalInt tileId;

    public String tileRenderMode;

    public int maxPerLevel;

    public String limitBehavior;

    public float pivotX;
    public float pivotY;

    @Deprecated
    public TodoObject[] fieldDefs; // TODO dynamic
}
