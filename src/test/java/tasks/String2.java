package tasks;

class ClassTest {
}

public class String2 {
    //static String[][] String = {{"String"}};  //ошибка компиляции, так как в этом случае все  ссылки на этот String, а у него нет такого преобразования

    static {
        System.out.println(String2.class);
    }

    public static void main(java.lang.String[] args) {
        System.out.println(String2.class);

        //class tasks.String2    //static
        //class tasks.String2

        System.out.println(java.lang.String.class);
        //class java.lang.String
    }
}
