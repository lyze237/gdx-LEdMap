package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.json.JsonEnumValues;
import dev.lyze.ledmap.json.types.OptionalInt;
import lombok.Getter;

@Getter
public class LEdEnumValue {
    private final JsonEnumValues json;

    private String id;
    private OptionalInt tileId;

    public LEdEnumValue(JsonEnumValues json) {
        this.json = json;

        parse();
    }

    private void parse() {
        this.id = json.id;
        this.tileId = new OptionalInt(json.tileId);
    }
}
