package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.TodoObject;

public class EntityInstance {
    private int __cx;
    private int __cy;

    private String __identifier;

    private int defUid;

    private FieldInstance[] fieldInstances;
    @Deprecated
    private TodoObject[] realEditorValues; // TODO meh?

    private int x;
    private int y;
}
