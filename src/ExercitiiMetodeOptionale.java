public class ExercitiiMetodeOptionale {
    public static void main(String[] args) {

        ninge();
        System.out.println(isPar(7));

        anotimp("aprilie");
        anotimp("august");
        anotimp("octombrie");
        anotimp("ianuarie");
        anotimp("asfg");

        System.out.println(maxim(2,6));
        System.out.println(maxim(4,1));
        System.out.println(maxim(1,1));

        System.out.println(maxim(1,7,4,6));
        System.out.println(maxim(1,6,4,6));

        mijlocCuvant("casca");
        mijlocCuvant("castel");

        System.out.println(numarCaractere("casca"));
        System.out.println(numarCaractere("castel"));

        System.out.println(sumaCifre(256));
        System.out.println(sumaCifre(123456789));


        System.out.println(metodaEx5Optionale(-5,6,8,7));

        System.out.println(metodaEx6Optionale("castel"));
        System.out.println(metodaEx6Optionale("casa"));

        System.out.println(sumaCifre(873));




    }

    //Exercitiul 1:
    //Scrieti o metoda care nu primeste nimic si afiseaza textul “In sfarsit ninge!”.
    //Apelati metida in main().
    static void ninge(){
        System.out.println("In sfarsit ninge");
    }

    //Exercitiul 2:
    //Scrieti o metoda care primeste un numar si returneaza un rezultat de tip boolean. Daca
    //numarul e par returneaza true, altfel returneaza false.
    //Afisati rezultatul returnat de metoda in main().

    static boolean isPar(int numar){
        if (numar%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    //Exercitiul 3:
    //Scrieti o metoda care primeste o luna calendaristica si returneaza anotimpul din care face
    //parte.
    //Pentru martie, aprilie, mai -> primavara
    //Pentru iunie, iulie, august -> vara
    //Pentru septembrie, octombrie, noiembie -> toamna
    //Pentru decembrie, ianuarie, februarie -> iarna
    //Pentru orice altceva inafara de luna calendaristica -> unknown
    //Testati metoda in main cu date de test din toate clasele de echivalenta (ECP )

    static void anotimp(String luna){
        if (luna.equals("martie") || luna.equals("aprilie") || luna.equals("mai")){
            System.out.println("primavara");
        }else if (luna.equals("iunie") || luna.equals("iulie") || luna.equals("august")){
            System.out.println("vara");
        }else if (luna.equals("septembrie") || luna.equals("octombrie") || luna.equals("noiembie")){
            System.out.println("toamna");
        }else if (luna.equals("decembrie") || luna.equals("ianuarie") || luna.equals("februarie")){
            System.out.println("iarna");
        }else {
            System.out.println("unknown");
        }

    }

    //Exercitiul 4:
    //Scrieti o metoda care primeste doua numere si il returneaza pe cel mai mare din ele. In cazul
    //in care sunt egale, returnati oricare din ele.
    //Testati metoda.

    static int maxim(int numar1, int numar2){
        if (numar1>numar2) return numar1;
        else if (numar1<numar2) return numar2;
        else return numar1;
    }

    //Exercitiul 5:
    //Scrieti o metoda care primeste 4 numere si il returneaza pe cel mai mare din ele. In cazul in
    //care doua sau mai multe sunt egale, returnati oricare din ele.
    //Testati metoda.
    static int maxim(int numar1, int numar2, int numar3, int numar4){
        int numere[] = {numar1, numar2, numar3, numar4};
        int nrmaxim = 0;
        for (int i=0; i<4; i++){
            if (numere[i]>nrmaxim){
                nrmaxim = numere[i];
            }
        }
        return nrmaxim;
    }

    //ex 5, Varianta 2

    private static int metodaEx5Optionale(int a, int b, int c, int d){
        int max= a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        if (d>max){
            max=d;
        }
    return max;

    }

    //Exercitiul 6:
    //Scrieti o metoda care primeste un cuvant si returneaza caracterul/caracterele din mijloc.
    //Daca are numar impar de litere, returnati litera din mijloc (casca -> s).
    //Daca are numar par de litere, returnati cele doua litere din mijloc (castel -> st).
    //Testati metoda

    static void mijlocCuvant(String cuvant){
        if (cuvant.length()%2==0){
            System.out.print(cuvant.charAt((int)cuvant.length()/2-1));
            System.out.println(cuvant.charAt((int)cuvant.length()/2));
        }else{
            System.out.println(cuvant.charAt((int)cuvant.length()/2));
        }

    }

    //Ex6 varianta 2;

    private static String metodaEx6Optionale(String cuvant) {
        String LitereleDinMijloc = "";
        int lungimeaCuvantului = cuvant.length();
        if (cuvant.length()%2 ==0){
            int pozitieLitera1= lungimeaCuvantului/2-1;
            int pozitieLitera2= lungimeaCuvantului/2;
            LitereleDinMijloc = LitereleDinMijloc + cuvant.charAt(pozitieLitera1) + cuvant.charAt(pozitieLitera2);
        }else {
            LitereleDinMijloc = LitereleDinMijloc +cuvant.charAt(lungimeaCuvantului/2);
        }


    return LitereleDinMijloc;
    }

    //Exercitiul 7:
    //Scrieti o metoda care primeste un String si returneaza numarul de caractere din Stringul
    //respectiv.
    //Testati metoda.

    static int numarCaractere(String cuvant){
        return cuvant.length();
    }

    //Exercitiul 8:
    //Scrieti o metoda care primeste un numar si returneaza suma cifrelor lui. Testati metoda.

    static int sumaCifre(int numar){
        int suma = 0;
        while (numar>0){
            suma = suma +numar%10;
            numar = numar/10;
        }
        return suma;
    }
}