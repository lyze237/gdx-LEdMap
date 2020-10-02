package dev.lyze.ledmap.json;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import dev.lyze.ledmap.LEdMap;
import dev.lyze.ledmap.LibgdxUnitTest;
import org.junit.jupiter.api.Test;

public class LoadFilesTest extends LibgdxUnitTest {

    @Test
    public void testEntitiesFile() {
        parseFile(Gdx.files.internal("Entities.json"));
    }

    @Test
    public void testAutoLayers1Basic() {
        parseFile(Gdx.files.internal("AutoLayers_1_basic.json"));
    }

    @Test
    public void testAutoLayers2Stamps() {
        parseFile(Gdx.files.internal("AutoLayers_2_stamps.json"));
    }
    @Test

    public void testAutoLayers3Advanced() {
        parseFile(Gdx.files.internal("AutoLayers_3_advanced.json"));
    }

    public LEdMap parseFile(FileHandle file) {
        Gdx.app.log("test", file.file().getAbsolutePath());
        return new LEdMap(file);
    }
}
