package dev.lyze.ledmap.tests;

import com.badlogic.gdx.ApplicationAdapter;
import dev.lyze.ledmap.LEdMap;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class GdxLEdMapTests extends ApplicationAdapter {
    @Override
    public void create() {
        new LEdMap();
    }
}