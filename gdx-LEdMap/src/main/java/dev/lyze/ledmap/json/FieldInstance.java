package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.Anything;

public class FieldInstance {
    private String __identifier;

    private String __type;
    private Anything __value; // TODO can be anything

    private String defUid;

    @Deprecated
    private Object[] realEditorValues; // TODO meh?
}
