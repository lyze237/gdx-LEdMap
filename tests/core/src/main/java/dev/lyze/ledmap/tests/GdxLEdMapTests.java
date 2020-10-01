package dev.lyze.ledmap.tests;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import dev.lyze.ledmap.LEdMap;

import java.util.Arrays;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class GdxLEdMapTests extends ApplicationAdapter {
    private static final String[] files = new String[] {
            "Entities.json",
            "AutoLayers_1_basic.json",
            "AutoLayers_2_stamps.json",
            "AutoLayers_3_advanced.json",
            "Typical_2D_platformer_example.json",
    };

    @Override
    public void create() {
        Arrays.stream(files).forEach(f -> new LEdMap(Gdx.files.internal(f)));
    }
}