package dev.lyze.ledmap.json.auto;

import dev.lyze.ledmap.json.types.TodoObject;

public class AutoRule {
    private boolean active;
    private boolean collapsed;

    private String name;
    private int uid;

    @Deprecated
    private TodoObject[] rules; // todo dynamic
}
