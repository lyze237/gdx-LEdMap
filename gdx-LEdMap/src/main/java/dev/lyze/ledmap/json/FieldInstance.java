package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.Anything;
import dev.lyze.ledmap.json.types.TodoObject;

public class FieldInstance {
    private String __identifier;

    private String __type;
    private Anything __value; // TODO can be anything

    private String defUid;

    @Deprecated
    private TodoObject[] realEditorValues; // TODO meh?
}
