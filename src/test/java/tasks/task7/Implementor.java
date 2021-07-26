package tasks.task7;

public class Implementor {

    private static final int value1 = 1;
    private static int value2 = 1;
    private int value3 = 1;

    public static void main(String[] args) {
        Implementor.value2 = 4;
        final Implementor implementor = new Implementor();
        int value = implementor.value2;
        System.out.println("value = " + value); //value = 4
        implementor.value2 = 3;
        System.out.println("implementor.value2 = " + implementor.value2);   //value = 3
        System.out.println(Implementor.value1 + Implementor.value2 + implementor.value3 + value);   //9
    }


}
