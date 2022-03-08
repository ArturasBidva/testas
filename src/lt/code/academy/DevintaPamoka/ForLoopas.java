package lt.code.academy.DevintaPamoka;

public class ForLoopas {
    private static final String TREE= "*";

    public static void main(String[] args) {
    ForLoopas forLoopas = new ForLoopas();
    forLoopas.eglute();
    }
    void eglute() {
        String tree=TREE;
        for(int i = 1; i< 10; i++){
         tree += TREE;
            System.out.println(tree);
        }
    }

}
