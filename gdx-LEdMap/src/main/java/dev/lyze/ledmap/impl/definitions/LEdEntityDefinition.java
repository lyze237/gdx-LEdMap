package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.json.JsonEntityDefinition;
import lombok.Getter;

@Getter
public class LEdEntityDefinition {
    private final JsonEntityDefinition json;

    public LEdEntityDefinition(JsonEntityDefinition json) {
        this.json = json;

        parse();
    }

    private void parse() {
    }
}
