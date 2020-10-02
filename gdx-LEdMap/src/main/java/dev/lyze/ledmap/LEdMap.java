package dev.lyze.ledmap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;
import dev.lyze.ledmap.json.JsonLEdFile;

public class LEdMap {
    public LEdMap(FileHandle fileHandle) {
        Json json = new Json();
        json.setIgnoreDeprecated(true); // fixme temporary workaround to ignore those fields, transient keyword doesn't work

        JsonLEdFile file = json.fromJson(JsonLEdFile.class, fileHandle);
        init(file);
    }

    public LEdMap(JsonLEdFile file) {
        init(file);
    }

    private void init(JsonLEdFile file) {
        Gdx.app.log("MAP", "Yay it works");
    }
}
