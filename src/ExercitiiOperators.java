public class ExercitiiOperators {
    public static void main(String[] args) {
        // ex1
        System.out.println(10*6);

        // ex2
        System.out.println(10/5);

        // ex3
        int x = 10;
        ++x;
        System.out.println(x);

        // ex4
        int x1 = 10;
        x1 = 5;
        System.out.println(x1);

        // ex5
        int a = 3;
        int b = 5;
        int c = a + b;
        if (c >= 10) {
            System.out.println("suma este mai mare decat 10");
        }else{
            System.out.println("suma este mai mica decat 10");
        }

        // ex 6
        if ((c%2) == 0){
            System.out.println("suma este numar par");
        }

    }
}
