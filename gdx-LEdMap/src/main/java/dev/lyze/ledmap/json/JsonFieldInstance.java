package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.Anything;
import dev.lyze.ledmap.json.types.IgnoreObject;
import dev.lyze.ledmap.json.types.TodoObject;

public class JsonFieldInstance {
    private String __identifier;

    private String __type;
    private Anything __value;

    private String defUid;

    private IgnoreObject[] realEditorValues; // only for editor, ignore
}
