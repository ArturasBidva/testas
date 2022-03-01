package uzdaviniai;

public class GeoLocation {
private double lat;
private double lon;
private int numLocations = 0;
    public GeoLocation() {
        this.lat = Math.random() * 90 + -90;
        this.lon = Math.random() * 90 + -90;
        double latApvalinimas = Math.round(this.lat*1000000.0)/1000000.0;
        double lonApvalinimas = Math.round(this.lon*1000000.0)/1000000.0;
        this.lat = latApvalinimas;
        this.lon = lonApvalinimas;
        numLocations++;
    }


}

