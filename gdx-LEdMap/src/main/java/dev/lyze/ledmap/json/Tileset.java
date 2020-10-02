package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.TodoObject;

public class Tileset {
    private String identifier;

    private int padding;

    private int pxHei;
    private int pxWid;

    private String relPath;

    private int spacing;

    private int tileGridSize;
    private int uid;

    @Deprecated
    private TodoObject[] savedSelections; // TODO meh?
}
