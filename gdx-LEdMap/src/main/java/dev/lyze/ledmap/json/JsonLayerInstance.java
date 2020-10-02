package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.auto.JsonAutoTiles;
import dev.lyze.ledmap.json.grids.JsonGrid;
import dev.lyze.ledmap.json.grids.JsonIntGrid;

public class JsonLayerInstance {
    private int __cHei;
    private int __cWid;
    private int __gridSize;

    private String __identifier;

    private String __type;

    private JsonAutoTiles[] autoTiles; // only for auto tile layers

    private JsonEntityInstance[] entityInstances; // only for entity tile layers

    private JsonGrid[] gridTiles; // only for tile layers

    private JsonIntGrid[] intGrid; // only for intgrid layers

    private int layerDefUid;
    private int levelId;

    private int pxOffsetX;
    private int pxOffsetY;

    private int seed;
}
