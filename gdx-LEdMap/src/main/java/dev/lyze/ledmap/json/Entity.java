package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.optional.OptionalInt;

public class Entity {
    private String identifier;
    private int uid;

    private int width;
    private int height;

    private String color;
    private String renderMode;

    private OptionalInt tilesetId;
    private OptionalInt tileId;

    private String tileRenderMode;

    private int maxPerLevel;

    private String limitBehavior;

    private float pivotX;
    private float pivotY;

    @Deprecated
    private Object[] fieldDefs; // TODO dynamic
}
