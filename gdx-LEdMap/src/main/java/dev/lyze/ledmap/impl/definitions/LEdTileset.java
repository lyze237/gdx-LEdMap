package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.json.JsonTileset;
import lombok.Getter;

@Getter
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
}
