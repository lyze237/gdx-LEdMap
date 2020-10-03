package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.types.Anything;
import dev.lyze.ledmap.json.types.IgnoreObject;
import dev.lyze.ledmap.json.types.TodoObject;

public class JsonFieldInstance {
    public String __identifier;

    public String __type;
    public Anything __value;

    public String defUid;

    public IgnoreObject[] realEditorValues; // only for editor, ignore
}
