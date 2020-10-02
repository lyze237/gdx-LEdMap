package dev.lyze.ledmap.json;

public class JsonLEdFile {
    public JsonHeader __header__;

    private String bgColor;

    private String name;
    private int defaultGridSize;

    private float defaultPivotX;
    private float defaultPivotY;

    private JsonDefinitions defs;

    private String jsonVersion;

    private JsonLevel[] levels;

    private int nextUid;

    private boolean minifyJson;
}
