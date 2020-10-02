package dev.lyze.ledmap.json.auto;

public class JsonAutoCell {
    private int __cx;
    private int __cy;
    private int coordId;
    private int flips; // 2 bit integer, bit 0 = x flip, bit 1 = y flip
    private JsonAutoTile[] tiles;
}
