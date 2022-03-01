package lt.code.academy.ketvirtaPamoka;

public class Figure {
    private String name;
    private double height;
    private double width;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
