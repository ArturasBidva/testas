package lt.code.academy.first;

import lt.code.academy.second.StaticMethodsInAnotherClass;
import lt.code.academy.second.Testas;

public class AntraPamoka {
    public static void main(String[] args) {
        float a = 10;
        float b = 7;
        a++;
        b--;
        float rez = a * b / 5;
       double rezultatas = (double) rez;
       Testas testas = new Testas();
        System.out.println(testas.ilgis);
        System.out.println(rezultatas);
        //static metodas kitoje klaseje
        double speed = StaticMethodsInAnotherClass.getSpeed();
        System.out.println(speed);


    }
    public void firstMethod() {
        System.out.println(StaticMethodsInAnotherClass.getSpeed());
    }
}
