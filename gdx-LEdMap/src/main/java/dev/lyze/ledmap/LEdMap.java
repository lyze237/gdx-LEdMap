package dev.lyze.ledmap;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;
import dev.lyze.ledmap.impl.LEdFile;
import dev.lyze.ledmap.json.JsonLEdFile;
import lombok.var;

public class LEdMap {
    private LEdFile lEdFile;

    public LEdMap(FileHandle fileHandle) {
        var json = new Json();
        json.setIgnoreDeprecated(true); // fixme temporary workaround to ignore those fields, transient keyword doesn't work

        var file = json.fromJson(JsonLEdFile.class, fileHandle);
        init(file);
    }

    public LEdMap(JsonLEdFile file) {
        init(file);
    }

    private void init(JsonLEdFile file) {
        this.lEdFile = new LEdFile(file);
    }
}
