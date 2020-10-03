package dev.lyze.ledmap.json;

public class JsonLEdFile {
    public JsonHeader __header__;

    public String bgColor;

    public String name;
    public int defaultGridSize;

    public float defaultPivotX;
    public float defaultPivotY;

    public JsonDefinitions defs;

    public String jsonVersion;

    public JsonLevel[] levels;

    public int nextUid;

    public boolean minifyJson;
}
