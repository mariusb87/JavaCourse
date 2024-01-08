public class ExercitiiMetode {
    public static void main(String[] args) {
        System.out.println("Ex1: Invers: "+ invers(-35));
        System.out.println("Ex2: Maxim: "+ maxim(24,56));
        System.out.println("Ex3: Media aritmetica a 3 numere: "+ medie(24,56,6));
        System.out.println("Ex4: Lungime cuvant: "+ lungimeCuvant("Marius"));
        System.out.println("Ex5: Concatenare: "+ concatenare("Marius"," Budugan"));
        System.out.println("Ex6:");
        invers("Vacanta");

        System.out.println(metodaEx6("Vacanta"));


    }

    // Ex1: Scrieti o metoda care primeste un numar intreg si returneaza
    // inversul lui (ex. Inversul lui “4” e “-4”, inversul lui “-35” e “35”)
    static int invers(int numar){
        return 0-numar;
    }

    //Ex2: Scrieti o metoda care primeste doua numere intregi si returneaza maximul dintre ele
    static int maxim(int numar1, int numar2){
        if (numar1>numar2){
            return numar1;
        }else{
            return numar2;
        }
    }

    //Ex3: Scrieți o metoda care primeste 3 numere intregi si returneaza media lor
    // aritmetica (cu tot cu virgula)

    static double medie(double numar1, double numar2, double numar3){
        return (numar1+numar2+numar3)/3;
    }

    //Ex4: Scrieti o metoda care primeste un String si returneaza lungimea lui
    static int lungimeCuvant(String cuvant){
        return cuvant.length();
    }

    // Ex5: Scrieti o metoda care primeste doua Stringuri si le concateneaza
    static String concatenare(String cuvant1, String cuvant2){
        return cuvant1+cuvant2;
    }
    //Ex6: (Optional) Scrieti o metoda care primeste un String si returneaza
    // inversul lui (Ex. “abcd”->”dcba”)

    static void invers (String cuvant){
        for (int i=cuvant.length()-1; i>=0; i--){
            System.out.print(cuvant.charAt(i));
        }
    }

    // Ex6 varianta 2

    private static String metodaEx6(String cuvant){
        String cuvantInversat = "";
        int lungime = cuvant.length();

        for (int i=lungime-1; i>=0; i--){
            cuvantInversat = cuvantInversat + cuvant.charAt(i);
        }
        return  cuvantInversat;
    }

}
