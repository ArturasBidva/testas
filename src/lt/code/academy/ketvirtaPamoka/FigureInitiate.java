package lt.code.academy.ketvirtaPamoka;

public class FigureInitiate {
    public static void main(String[] args) {
        Figure figure = new Figure();
        figure.setName("Circle");
        figure.setHeight(555.2);
        figure.setWidth(200.12);
        System.out.println(figure);
        figure.setName("Kvadratas");
        figure.setHeight(200.2);
        figure.setWidth(120);
        System.out.println(figure);
    }
}
