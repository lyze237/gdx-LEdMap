package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.json.JsonLayerDefinition;
import lombok.Getter;

import java.util.Arrays;

@Getter
public class LEdIntGridLayerDefinition extends LEdLayerDefinition {
    protected LEdIntGridLayerValue[] intGridValues;

    public LEdIntGridLayerDefinition(JsonLayerDefinition json) {
        super(json);
    }

    @Override
    protected void parseInternal() {
        intGridValues = Arrays.stream(getJson().intGridValues).map(LEdIntGridLayerValue::new).toArray(LEdIntGridLayerValue[]::new);
    }
}
