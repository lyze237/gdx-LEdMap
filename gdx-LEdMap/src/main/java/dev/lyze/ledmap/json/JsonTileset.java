package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.TodoObject;

public class JsonTileset {
    public String identifier;

    public int padding;

    public int pxHei;
    public int pxWid;

    public String relPath;

    public int spacing;

    public int tileGridSize;
    public int uid;

    @Deprecated
    public TodoObject[] savedSelections; // TODO meh?
}
