package dev.lyze.ledmap.example;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import dev.lyze.ledmap.LEdMap;

public class GdxLEdMapTests extends ApplicationAdapter {
    @Override
    public void create() {
        LEdMap lEdMap = new LEdMap(Gdx.files.internal("Typical_2D_platformer_example.json"));
        System.out.println("HI");
    }
}