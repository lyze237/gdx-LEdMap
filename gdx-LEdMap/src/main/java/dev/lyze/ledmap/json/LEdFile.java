package dev.lyze.ledmap.json;

public class LEdFile {
    public Header __header__;

    private String bgColor;

    private String name;
    private int defaultGridSize;

    private float defaultPivotX;
    private float defaultPivotY;

    private Definitions defs;

    private String jsonVersion;

    private Level[] levels;

    private int nextUid;

    private boolean minifyJson;
}
