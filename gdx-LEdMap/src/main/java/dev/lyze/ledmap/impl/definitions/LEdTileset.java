package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.json.JsonTileset;

public class LEdTileset {
    private final JsonTileset json;

    private String identifier;
    private int uid;
    private String relPath;
    private int pxWidth, pxHeight;
    private int tileGridSize;
    private int spacing;
    private int padding;

    public LEdTileset(JsonTileset json) {
        this.json = json;

        parse();
    }

    private void parse() {
        this.identifier = json.identifier;
        this.uid = json.uid;
        this.relPath = json.relPath; // TODO Convert to FileHandler
        this.pxWidth = json.pxWid;
        this.pxHeight = json.pxHei;
        this.tileGridSize = json.tileGridSize;
        this.spacing = json.spacing;
        this.padding = json.padding;
    }

    public String getRelPath() {
        return relPath;
    }

    public JsonTileset getJson() {
        return json;
    }

    public int getTileGridSize() {
        return tileGridSize;
    }

    public int getSpacing() {
        return spacing;
    }

    public int getPxWidth() {
        return pxWidth;
    }

    public int getPxHeight() {
        return pxHeight;
    }

    public int getPadding() {
        return padding;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getUid() {
        return uid;
    }
}
