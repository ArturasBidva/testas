package lt.code.academy.enumm;

import java.util.Arrays;

public enum Days {
    PIRMADIENIS("Pirmadienis", 1),
    ANTRADIENIS("Antradienis", 2),
    TRECIADIENIS("Treciadienis", 3);

    private final String name;
    private final int number;

    Days(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static Days getDayByNumber(int number){
        return Arrays.stream(Days.values())
                .filter(c -> c.getNumber() == number)
                .findFirst()
                .orElse(null);

    }
}
