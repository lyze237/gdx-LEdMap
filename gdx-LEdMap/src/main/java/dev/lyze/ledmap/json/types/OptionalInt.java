package dev.lyze.ledmap.json.types;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

public class OptionalInt implements Json.Serializable {
    public boolean hasValue;
    public int value;

    @Override
    public void write(Json json) {
        if (hasValue)
            json.writeValue(value);
        else
            json.writeValue(null);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        if (jsonData.isNull())
            return;

        hasValue = true;
        value = jsonData.asInt();
    }
}
