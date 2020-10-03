package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.auto.JsonAutoTiles;
import dev.lyze.ledmap.json.grids.JsonGrid;
import dev.lyze.ledmap.json.grids.JsonIntGrid;

public class JsonLayerInstance {
    public int __cHei;
    public int __cWid;
    public int __gridSize;

    public String __identifier;

    public String __type;

    public JsonAutoTiles[] autoTiles; // only for auto tile layers

    public JsonEntityInstance[] entityInstances; // only for entity tile layers

    public JsonGrid[] gridTiles; // only for tile layers

    public JsonIntGrid[] intGrid; // only for intgrid layers

    public int layerDefUid;
    public int levelId;

    public int pxOffsetX;
    public int pxOffsetY;

    public int seed;
}
