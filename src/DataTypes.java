public class DataTypes {

    public static void main(String[] args) {

        // tipuri de date primitive
        boolean myBoolean = true;
        char myChar = 'a';
        byte myByte = 34; // si -128 si +128
        short myShort = 32767; // -32768 si +32767
        int myInt = 365453;
        long myLong = 1870502124422L; // se pune sufixul 'L' la final
        float myFloat = 234.5F + 434.6F; // se pune sufixul 'F'
        double myDouble = 234.56655; // are precizie mai mare >7 zecimale

        //casting implicit de la typ mai mic la typ mai mare
        int x=5;
        double y=x;
        System.out.println(x+y);

        // casting explicit de la mare la mic
        double z= 5.5;
        int w = (int)z;
        System.out.println(w);



        //---------------------
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        // exercitii Automation 3 - 20.09.2023

        // exercitiul 1
        byte  myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";

        // exercitiul 2a - implicit casting
        byte variabila1 = 7;
        int variabila2 = variabila1;
        System.out.println(variabila2);
        // exercitiul 2b - explicit casting
        float variabila3 = 23.55f;
        int variabila4 = (int) variabila3;
        System.out.println(variabila4);

        // Exercitii optionale

        // exercitiul 1
        float var1 = 123.56F;
        float var2 = 1425.89F;
        System.out.println(var1 +" + "+ var2+" = "+ (var1+var2));
        System.out.println(var1+" * "+ var2+" = "+ var1*var2);

        // exercitiul 2
        String myFavouriteMovie = "Lord of the Rings";
        System.out.println("My favourite movie is \""+ myFavouriteMovie+ "\"");


    }
}
