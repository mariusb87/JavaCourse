public class JavaMethods {
    //main
    public static void main(String[] args) {
        printHello();
        printHello();
        weLearn();
        helloName("Cristina");
        helloName("Lavinia");
        getSum(2,3);
        getSum(10,5);
        getProduct(2,3);
        getSum(2,3,5);
        getSum(2.3,5.6);
        helloNameAge("Cristina",19);
        printFriends("Cristina","Ioana");

        getSumWithReturn(5,6); // calculeaza dar nu afiseaza rezultatul
        System.out.println(getSumWithReturn(7,8));

        System.out.println(getProductWithReturn(7,8));

        System.out.println(areMere("Ana"));
        System.out.println(areMere("Marius"));

        invers("Marius");

    }

    private static void printHello(){
        System.out.println("Hello World");
    }

    private static void weLearn(){
        System.out.println("We learn about Methods");
    }

    private static void helloName(String name){
        System.out.println("Hello "+name);
    }

    private static void helloNameAge(String name, int age){
        System.out.println(name+" is "+age+" years old");
    }

    /*scrieti o metoda care primeste doi parametri de tip String - name1 si name2
    si afiseaza "name1 si name2 are friends"
     */
    private static void printFriends(String name1, String name2){
        System.out.println(name1+" and "+name2+" are friends");
    }

    private static void getSum(int x, int y){
        System.out.println(x+y);
    }

    private static void getSum(double x, double y){
        System.out.println(x+y);
    }

    private static void getSum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    private static void getProduct(int x, int y){
        System.out.println(x*y);
    }

    static int getSumWithReturn(int x, int y){
        int sum = x+y;
        return sum;
    }

    public static int getProductWithReturn(int x, int y){
        return x*y;
    }

    private static String areMere(String nume){
        return nume+" are mere";
    }

    // exercitiul 8

    static void invers (String cuvant){
        for (int i=cuvant.length()-1; i>=0; i--){
            System.out.print(cuvant.charAt(i));
        }
    }

    

}