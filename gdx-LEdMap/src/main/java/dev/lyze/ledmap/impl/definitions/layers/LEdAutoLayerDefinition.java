package dev.lyze.ledmap.impl.definitions.layers;

import dev.lyze.ledmap.impl.definitions.LEdTileset;
import dev.lyze.ledmap.json.JsonLayerDefinition;

import java.util.Arrays;
import java.util.List;

public class LEdAutoLayerDefinition extends LEdIntGridLayerDefinition {
    private final LEdTileset[] tilesets;
    private List<LEdLayerDefinition> layersWithoutAutoSource;

    private int autoTilesetDefUid;
    private LEdTileset autoTilesetDef;

    private int autoSourceLayerDefUid;
    private LEdLayerDefinition autoSourceLayerDef;

    private LEdAutoLayerRuleGroup[] autoLayerRuleGroups;

    public LEdAutoLayerDefinition(JsonLayerDefinition json, LEdTileset[] tilesets) {
        super(json);

        this.tilesets = tilesets;
    }

    public LEdAutoLayerDefinition(JsonLayerDefinition json, LEdTileset[] tilesets, List<LEdLayerDefinition> layersWithoutAutoSource) {
        this(json, tilesets);

        this.layersWithoutAutoSource = layersWithoutAutoSource;
    }

    @Override
    protected void parseInternal() {
        super.parseInternal();

        autoTilesetDef = tilesets[autoTilesetDefUid = getJson().autoTilesetDefUid.value];
        if (layersWithoutAutoSource != null)
            autoSourceLayerDef = layersWithoutAutoSource.stream().filter(l -> l.uid == getJson().autoSourceLayerDefUid.value).findFirst().get();

        autoLayerRuleGroups = Arrays.stream(getJson().autoRuleGroups).map(l -> new LEdAutoLayerRuleGroup(l, autoTilesetDef)).toArray(LEdAutoLayerRuleGroup[]::new);
    }

    public LEdAutoLayerRuleGroup[] getAutoLayerRuleGroups() {
        return autoLayerRuleGroups;
    }

    public LEdLayerDefinition getAutoSourceLayerDef() {
        return autoSourceLayerDef;
    }

    public int getAutoSourceLayerDefUid() {
        return autoSourceLayerDefUid;
    }

    public LEdTileset getAutoTilesetDef() {
        return autoTilesetDef;
    }

    public int getAutoTilesetDefUid() {
        return autoTilesetDefUid;
    }
}
