package dev.lyze.ledmap.json.auto;

public class JsonAutoCell {
    public int __cx;
    public int __cy;
    public int coordId;
    public int flips; // 2 bit integer, bit 0 = x flip, bit 1 = y flip
    public JsonAutoTile[] tiles;
}
