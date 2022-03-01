package lt.code.academy.ketvirtaPamoka;

public class StringExample {
    static String nullString;
    public static void main(String[] args) {

        String example = "Arturas";

        char chartAt = example.charAt(2);
        System.out.println(chartAt);


        System.out.println(nullString);

        System.out.println("");

        String textBlock = """
                <div>
                    Tekstas
                </div>
                """;
        System.out.println(textBlock);

        String replace = "Arturas";
        System.out.println(replace.replace("A", "B"));
        System.out.println(replace.length());

        String pavizdys = "Arturas Bidva";
        //Istraukia 3 raide
        System.out.println(pavizdys.charAt(2));
        //Parodo kiek raidziu yra Stringe.
        System.out.println(pavizdys.length());
        System.out.println(pavizdys.substring(2,9));

        String s = "Mano vardas Arturas";
        //Istraukia teksta nuo 12 Simbolio iki galo ir atspauzdina.
        System.out.println(s.substring(12));
        //Istraukia teksta nuo 0 iki 4 ir atspauzdina.
        System.out.println(s.substring(0,4));
        //Suranda v raide ir paraso index skaiciu.
        System.out.println(s.indexOf("v"));
        //Suranda paskutine raide.
        System.out.println(s.lastIndexOf("s"));


        System.out.println();


    }
}
