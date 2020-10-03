package dev.lyze.ledmap;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;
import dev.lyze.ledmap.impl.LEdFile;
import dev.lyze.ledmap.json.JsonLEdFile;
import lombok.var;

public class LEdMap {
    private final FileHandle fileHandle;
    private LEdFile lEdFile;

    public LEdMap(FileHandle fileHandle) {
        this.fileHandle = fileHandle;

        var json = new Json();
        json.setIgnoreDeprecated(true); // fixme temporary workaround to ignore those fields, transient keyword doesn't work

        init(json.fromJson(JsonLEdFile.class, fileHandle));
    }

    private void init(JsonLEdFile json) {
        this.lEdFile = new LEdFile(json, fileHandle.parent());
    }
}
