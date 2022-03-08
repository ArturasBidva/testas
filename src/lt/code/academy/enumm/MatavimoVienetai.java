package lt.code.academy.enumm;

public enum MatavimoVienetai {
    MILIMETRAS("MM", 0.001f),
    METRAS("M", 1.0F),
    KILOMETRAS("KM", 1000.0F);

    private final String name;
    private final float number;

    MatavimoVienetai(String name, float number) {
        this.name = name;
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public String getName() {
        return name;

    }
    }
