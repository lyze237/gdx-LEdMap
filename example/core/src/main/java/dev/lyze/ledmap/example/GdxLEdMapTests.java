package dev.lyze.ledmap.example;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import dev.lyze.ledmap.LEdMap;

import java.util.Arrays;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class GdxLEdMapTests extends ApplicationAdapter {
    private static final String[] files = new String[] {
            "Entities.json",
            "AutoLayers_1_basic.json",
            "AutoLayers_2_stamps.json",
            "AutoLayers_3_advanced.json",
            "",
    };

    @Override
    public void create() {
        LEdMap lEdMap = new LEdMap(Gdx.files.internal("Typical_2D_platformer_example.json"));
    }
}