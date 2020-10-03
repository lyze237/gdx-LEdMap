package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.json.JsonEnumType;
import dev.lyze.ledmap.json.types.OptionalInt;
import lombok.Getter;

import java.util.Arrays;

@Getter
public class LEdEnumType {
    private final JsonEnumType json;
    private final LEdTileset[] tilesets;

    private String identifier;

    private int uid;

    private OptionalInt iconTilesetUid;
    private LEdTileset iconTileset;

    private LEdEnumValue[] values;

    public LEdEnumType(JsonEnumType json, LEdTileset[] tilesets) {
        this.json = json;
        this.tilesets = tilesets;

        parse();
    }

    private void parse() {
        this.identifier = json.identifier;
        this.uid = json.uid;

        this.values = Arrays.stream(json.values).map(LEdEnumValue::new).toArray(LEdEnumValue[]::new);

        this.iconTilesetUid = new OptionalInt(json.iconTilesetUid);
        if (json.iconTilesetUid.hasValue) {
            this.iconTileset = Arrays.stream(tilesets).filter(t -> t.getUid() == json.iconTilesetUid.value).findFirst().get();
        }
    }
}
