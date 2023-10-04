public class MyString {
    public static void main(String[] args) {

        // tipuri de date non-primitive

        String myString= "This is a text";
        int lungime = myString.length();

        System.out.println("Lungimea textului este: "+lungime);

        String myName = "Marius Budugan";
        String faraSpatii = myName.replace(" ","");
        String faraSpatii2 = myName.trim();
        System.out.println("Lungimea numelui \""+myName+"\" este: \n"+faraSpatii.length());
        // backslash \ escape character

        System.out.println(myName.charAt(4));

        // exercitii Automation 3 - 20.09.2023
        // exercitiul 3 - Strings
        String tara = "Papua Noua Guinee";
        int lungimeTara = tara.length();
        System.out.println(lungimeTara);

        //Exercitii optionale (continuare de la Data Types)
        // exercitiul 3
        String myFavouriteMovie = "Lord of the Rings";
        System.out.println("My favourite movie is \""+ myFavouriteMovie.toUpperCase()+ "\"");

        System.out.println("My favourite movie is \""+ myFavouriteMovie.toLowerCase()+ "\"");

        // exercitiul 4
        System.out.println("My favourite movie length is "+ myFavouriteMovie.length());

    }
}
