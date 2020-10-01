package dev.lyze.ledmap.json.types;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

import java.util.ArrayList;

public class Anything implements Json.Serializable {
    private Object value;

    @Override
    public void write(Json json) {

    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        if (jsonData.isArray()) {
            if (jsonData.isEmpty()) {
                value = new Object[0];
                return;
            }

            JsonValue child = jsonData.child;
            if (child.isNull())
                throw new IllegalArgumentException("Arrays first child is null for value: " + jsonData.name + " -> " + child.name); // TODO adjust so we don't need a first child

            else if (child.isString())
                value = jsonData.asStringArray();
            else if (child.isBoolean())
                value = jsonData.asBooleanArray();
            else if (child.isDouble())
                value = jsonData.asDoubleArray();
            else if (child.isLong())
                value = jsonData.asLongArray();
            else if (child.isObject()) {
                ArrayList<Point> points = new ArrayList<>();
                JsonValue next = child;
                do {
                    points.add(new Point(next.get("cx").asInt(), next.get("cy").asInt()));
                    next = next.next;
                } while (next != null);
                value = points.toArray();
            }
            else
                throw new IllegalArgumentException("Arrays first child has unknown type for value: " + jsonData.name + " -> " + child.name);

            return;
        }

        if (jsonData.isNull())
            value = null;
        else if (jsonData.isString())
            value = jsonData.asString();
        else if (jsonData.isBoolean())
            value = jsonData.asBoolean();
        else if (jsonData.isDouble())
            value = jsonData.asDouble();
        else if (jsonData.isLong())
            value = jsonData.asLong();
        else if (jsonData.isObject())
            value = new Point(jsonData.getChild("cx").asInt(), jsonData.getChild("cy").asInt());
        else
            throw new IllegalArgumentException("unknown type for value: " + jsonData.name);
    }
}
