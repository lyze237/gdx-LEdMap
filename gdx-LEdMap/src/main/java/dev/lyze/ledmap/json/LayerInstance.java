package dev.lyze.ledmap.json;

import dev.lyze.ledmap.json.auto.AutoTiles;
import dev.lyze.ledmap.json.grids.Grid;
import dev.lyze.ledmap.json.grids.IntGrid;

public class LayerInstance {
    private int __cHei;
    private int __cWid;
    private int __gridSize;

    private String __identifier;

    private String __type;

    private AutoTiles[] autoTiles; // only for auto tile layers

    private EntityInstance[] entityInstances; // only for entity tile layers

    private Grid[] gridTiles; // only for tile layers

    private IntGrid[] intGrid; // only for intgrid layers

    private int layerDefUid;
    private int levelId;

    private int pxOffsetX;
    private int pxOffsetY;

    private int seed;
}
