package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.IgnoreObject;

public class JsonEntityInstance {
    public int __cx;
    public int __cy;

    public String __identifier;

    public int defUid;

    public JsonFieldInstance[] fieldInstances;
    public IgnoreObject[] realEditorValues; // only for editor, ignore

    public int x;
    public int y;
}
