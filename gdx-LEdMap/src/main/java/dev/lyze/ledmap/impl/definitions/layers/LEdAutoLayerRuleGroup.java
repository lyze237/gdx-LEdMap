package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.impl.definitions.LEdTileset;
import dev.lyze.ledmap.json.auto.JsonAutoLayerRuleGroup;
import lombok.Getter;

import java.util.Arrays;

@Getter
public class LEdAutoLayerRuleGroup {
    private final JsonAutoLayerRuleGroup json;
    private final LEdTileset tileset;

    private int uid;
    private String name;

    private boolean active;
    private boolean collapsed;

    private LEdAutoLayerRule[] rules;

    public LEdAutoLayerRuleGroup(JsonAutoLayerRuleGroup json, LEdTileset tileset) {
        this.json = json;
        this.tileset = tileset;

        parse();
    }

    private void parse() {
        this.uid = json.uid;
        this.name = json.name;
        this.active = json.active;
        this.collapsed = json.collapsed;

        rules = Arrays.stream(json.rules).map(r -> new LEdAutoLayerRule(r, tileset)).toArray(LEdAutoLayerRule[]::new);
    }
}
