package dev.lyze.ledmap.impl.definitions;

import dev.lyze.ledmap.impl.definitions.layers.LEdLayerDefinition;
import dev.lyze.ledmap.impl.definitions.layers.LEdLayerDefinitionFactory;
import dev.lyze.ledmap.json.JsonDefinitions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LEdDefinitions {
    private final JsonDefinitions json;

    private LEdEntityDefinition[] entities;
    private LEdEnumType[] enums;
    private LEdLayerDefinition[] layers;
    private LEdTileset[] tilesets;

    public LEdDefinitions(JsonDefinitions json) {
        this.json = json;

        parse();
    }

    private void parse() {
        tilesets = Arrays.stream(json.tilesets).map(LEdTileset::new).toArray(LEdTileset[]::new);
        entities = Arrays.stream(json.entities).map(LEdEntityDefinition::new).toArray(LEdEntityDefinition[]::new);
        enums = Stream.concat(Arrays.stream(json.enums), Arrays.stream(json.externalEnums)).map(LEdEnumType::new).toArray(LEdEnumType[]::new);

        List<LEdLayerDefinition> allLayers = Arrays.stream(json.layers)
                .filter(l -> !l.autoSourceLayerDefUid.hasValue)
                .map(l -> LEdLayerDefinitionFactory.create(l, tilesets, null))
                .collect(Collectors.toList()); // without auto source

        Arrays.stream(json.layers)
                .filter(l -> !l.autoSourceLayerDefUid.hasValue)
                .map(l -> LEdLayerDefinitionFactory.create(l, tilesets, allLayers))
                .forEach(allLayers::add); // add auto source layers

        layers = allLayers.toArray(new LEdLayerDefinition[0]);
    }

    public LEdTileset[] getTilesets() {
        return tilesets;
    }

    public LEdLayerDefinition[] getLayers() {
        return layers;
    }

    public LEdEnumType[] getEnums() {
        return enums;
    }

    public LEdEntityDefinition[] getEntities() {
        return entities;
    }
}
