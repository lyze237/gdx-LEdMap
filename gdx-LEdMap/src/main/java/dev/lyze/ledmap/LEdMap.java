package dev.lyze.ledmap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;
import dev.lyze.ledmap.json.LEdFile;

public class LEdMap {
    public LEdMap(FileHandle fileHandle) {
        Json json = new Json();
        json.setIgnoreDeprecated(true); // fixme temporary workaround to ignore those fields, transient keyword doesn't work

        LEdFile file = json.fromJson(LEdFile.class, fileHandle);
        init(file);
    }

    public LEdMap(LEdFile file) {
        init(file);
    }

    private void init(LEdFile file) {
    }
}
