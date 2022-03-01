package uzdaviniai;

public class UzdavinysNr2 {
    public static void main(String[] args) {
        UzdavinysNr2 uzdavinysNr2 = new UzdavinysNr2();
        uzdavinysNr2.spausdink("Arturas " ,"Bidva " ,"Java " , 40);

    }
    static void spausdink(String a, String b, String c, int e) {
        System.out.println("As, " + a + b + "tikrai ismoksiu programuoti " + c + "kalba per " + e + " savaites");
    }
}
