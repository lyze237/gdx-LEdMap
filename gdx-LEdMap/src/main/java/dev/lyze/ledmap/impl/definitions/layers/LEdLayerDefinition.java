package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.json.JsonLayerDefinition;
import lombok.Getter;

@Getter
public abstract class LEdLayerDefinition {
    private final JsonLayerDefinition json;

    protected int uid;
    protected String identifier;

    protected LEdLayerDefinitionType type;

    protected int gridSize;
    protected float displayOpacity;

    public LEdLayerDefinition(JsonLayerDefinition json) {
        this.json = json;

        parse();
    }

    private void parse() {
        this.type = LEdLayerDefinitionType.valueOf(json.type);
        this.identifier = json.identifier;
        this.uid = json.uid;

        this.gridSize = json.gridSize;
        this.displayOpacity = json.displayOpacity;

        // todo values
        parseInternal();
    }

    protected abstract void parseInternal();
}
