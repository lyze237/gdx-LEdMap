package dev.lyze.ledmap.impl;

import com.badlogic.gdx.graphics.Color;
import dev.lyze.ledmap.impl.definitions.LEdDefinitions;
import dev.lyze.ledmap.json.JsonLEdFile;
import dev.lyze.ledmap.json.JsonLevel;

public class LEdFile {
    private final JsonLEdFile json;

    private Color bgColor;
    private String name;

    private int defaultGridSize;

    public float defaultPivotX, defaultPivotY;

    public LEdDefinitions defs;

    public JsonLevel[] levels;

    public LEdFile(JsonLEdFile json) {
        this.json = json;

        parse();
    }

    private void parse() {
        this.bgColor = Color.valueOf(json.bgColor);
        this.name = json.name;

        this.defaultGridSize = json.defaultGridSize;

        this.defaultPivotX = json.defaultPivotX;
        this.defaultPivotY = json.defaultPivotY;

        this.defs = new LEdDefinitions(json.defs);
    }

    public String getName() {
        return name;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public int getDefaultGridSize() {
        return defaultGridSize;
    }

    public float getDefaultPivotY() {
        return defaultPivotY;
    }

    public float getDefaultPivotX() {
        return defaultPivotX;
    }
}
