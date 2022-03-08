package lt.code.academy.enumm;

public class MatavimoVienetukai {
    public static void main(String[] args) {
        float atstumas = 5.0f;
        float atstumasMM = atstumas / MatavimoVienetai.MILIMETRAS.getNumber();
        float atstumasM = atstumas / MatavimoVienetai.METRAS.getNumber();
        float atstumaskm = atstumas / MatavimoVienetai.KILOMETRAS.getNumber();





        System.out.printf("%s %s\n", atstumasMM, MatavimoVienetai.MILIMETRAS.getName());
        System.out.printf("%s %s\n", atstumasM, MatavimoVienetai.METRAS.getName());
        System.out.printf("%s %s\n", atstumaskm, MatavimoVienetai.KILOMETRAS.getName());
    }
}
