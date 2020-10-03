package dev.lyze.ledmap.json.types;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OptionalInt implements Json.Serializable {
    public boolean hasValue;
    public int value;

    public OptionalInt(int value) {
        this.hasValue = true;
        this.value = value;
    }

    public OptionalInt(OptionalInt optionalInt) {
        this.hasValue = optionalInt.hasValue;
        this.value = optionalInt.value;
    }

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
