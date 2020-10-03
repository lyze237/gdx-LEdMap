package dev.lyze.ledmap.impl.definitions;

import com.badlogic.gdx.files.FileHandle;
import dev.lyze.ledmap.json.JsonTileset;
import lombok.Getter;

@Getter
public class LEdTileset {
    private final JsonTileset json;
    private final FileHandle folder;

    private String identifier;
    private int uid;
    private String relativeFilePath;
    private FileHandle file;
    private int pxWidth, pxHeight;
    private int tileGridSize;
    private int spacing;
    private int padding;

    public LEdTileset(JsonTileset json, FileHandle folder) {
        this.json = json;
        this.folder = folder;

        parse();
    }

    private void parse() {
        this.identifier = json.identifier;
        this.uid = json.uid;
        this.relativeFilePath = json.relPath;
        this.pxWidth = json.pxWid;
        this.pxHeight = json.pxHei;
        this.tileGridSize = json.tileGridSize;
        this.spacing = json.spacing;
        this.padding = json.padding;
        this.file = folder.child(this.relativeFilePath);
        if (!this.file.exists())
            throw new IllegalArgumentException("File " + this.file.path() + " doesn't exist.");
    }
}
