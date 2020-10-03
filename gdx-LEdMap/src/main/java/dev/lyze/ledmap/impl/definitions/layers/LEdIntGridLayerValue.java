package dev.lyze.ledmap.impl.definitions.layers;

import com.badlogic.gdx.graphics.Color;
import dev.lyze.ledmap.json.auto.JsonAutoIntGrid;
import lombok.Getter;

@Getter
public class LEdIntGridLayerValue {
    private final JsonAutoIntGrid json;

    private Color color;
    private String identifier;

    public LEdIntGridLayerValue(JsonAutoIntGrid json) {
        this.json = json;

        parse();
    }

    private void parse() {
        this.color = Color.valueOf(json.color);
        this.identifier = json.identifier;
    }
}
