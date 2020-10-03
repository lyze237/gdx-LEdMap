package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.json.JsonEnumType;
import lombok.Getter;

@Getter
public class LEdEnumType {
    private final JsonEnumType json;

    public LEdEnumType(JsonEnumType json) {
        this.json = json;

        parse();
    }

    private void parse() {
    }
}
