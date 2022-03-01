package uzdaviniai;

public class UzdavinysNr7 {
    double price = 100.5;
    int count = 0;
    public static void main(String[] args) {
        UzdavinysNr7 uzdavinysNr7 = new UzdavinysNr7();
        printPrice(uzdavinysNr7.price);
        System.out.println("pries " + uzdavinysNr7.count);
        uzdavinysNr7.increaseCount();
        System.out.println("po " + uzdavinysNr7.count);
        uzdavinysNr7.increaseCustomCount(10);
        System.out.println("po custom increase " + uzdavinysNr7.count);
        UzdavinysNr7NaujaClass.printName("Arturas");
        UzdavinysNr7NaujaClass uzdavinysNr7NaujaClass = new UzdavinysNr7NaujaClass();
        uzdavinysNr7NaujaClass.printAge(20);

    }
    public static void printPrice(double price) {
        System.out.println(price);
    }
    public void increaseCount() {
        count++;
    }
    public void increaseCustomCount(int countIncrease) {
        //count = count + countIncrease;
        count += countIncrease;
    }
}