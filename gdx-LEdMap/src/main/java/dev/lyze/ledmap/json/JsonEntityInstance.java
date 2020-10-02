package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.IgnoreObject;

public class JsonEntityInstance {
    private int __cx;
    private int __cy;

    private String __identifier;

    private int defUid;

    private JsonFieldInstance[] fieldInstances;
    private IgnoreObject[] realEditorValues; // only for editor, ignore

    private int x;
    private int y;
}
