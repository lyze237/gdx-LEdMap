package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.impl.definitions.LEdTileset;
import dev.lyze.ledmap.json.auto.JsonAutoLayerRule;
import lombok.Getter;

@Getter
public class LEdAutoLayerRule {
    private final JsonAutoLayerRule json;

    private final LEdTileset tileset;

    private int uid;

    private boolean active;

    private int size;

    private int[] tileIds;

    private float chance;

    private int[] pattern;

    private boolean flipX, flipY;

    private int xModulo, yModulo;

    private String checker;
    private String tileMode;

    private float pivotX, pivotY;

    private boolean perlinActive;
    private long perlinSeed;
    private float perlinScale;
    private int perlinOctaves;

    public LEdAutoLayerRule(JsonAutoLayerRule json, LEdTileset tileset) {
        this.json = json;
        this.tileset = tileset;

        parse();
    }

    private void parse() {
        this.uid = json.uid;
        this.active = json.active;
        this.size = json.size;
        this.tileIds = json.tileIds;
        this.chance = json.chance;
        this.pattern = json.pattern;
        this.flipX = json.flipX;
        this.flipY = json.flipY;

        this.xModulo = json.xModulo;
        this.yModulo = json.yModulo;

        this.checker = json.checker;
        this.tileMode = json.tileMode;

        this.pivotX = json.pivotX;
        this.pivotY = json.pivotY;

        this.perlinActive = json.perlinActive;
        this.perlinScale = json.perlinSeed;

        this.perlinScale = json.perlinScale;
        this.perlinOctaves = json.perlinOctaves;
    }
}
