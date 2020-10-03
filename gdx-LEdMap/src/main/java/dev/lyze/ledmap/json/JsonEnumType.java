package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.OptionalInt;

public class JsonEnumType {
    public String identifier;
    public int uid;
    public JsonEnumValues[] values;
    public OptionalInt iconTilesetUid;
    public String externalRelPath;
    public String externalFileChecksum;
}
