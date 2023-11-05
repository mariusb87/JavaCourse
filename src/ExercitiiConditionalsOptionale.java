public class ExercitiiConditionalsOptionale {
    public static void main(String[] args) {
        // Ex1: Declarati o variabila de tip int, cu numele “temperature” si
        // dati-i o valoare la alegere.
        //Daca valoarea ei este mai mica decat 18, afisati “prea frig”.
        // Daca valoarea este intre 18 si 22, afisati “ok”.
        //Daca valoarea este peste 22, afisati “prea cald”.

        int temperature = 23;
        if (temperature < 18) {
            System.out.println("prea frig");
        } else if (temperature >= 18 && temperature <= 22) {
            System.out.println("ok");
        } else{
            System.out.println("prea cald");
        }

        // Ex2: Se dau doua variabile:
        //char gender (gen) – initializati cu o valoare la alegere (posibile valori „m‟ sau „f‟)
        //boolean married (casatorit/a) - initializati cu o valoare la alegere
        //Scrieti un program folosind instructiuni conditionale, astfel incat
        // pentru gen „m‟, sa afiseze “Domnul”, indiferent daca persoana e casatorita sau nu
        // pentru gen „f‟ sa afiseze “Domnisoara”, daca nu e casatorita sau “Doamna”, daca e
        //casatorita
        char gender = 'f';
        boolean married = true;
        if (gender == 'm'){
            System.out.println("Domnul");
        } else if (gender == 'f' && !married) {
            System.out.println("Domnisoara");
        } else if (gender == 'f' && married) {
            System.out.println("Doamna");
        }

        // Ex3: Declarati si initializati doua variabile de tip int.
        //Screiti un program care sa afiseze variabila cu valoare mai mare dintre cele doua: “[x] este
        //mai mare decat [y]”, unde x si y sunt valorile variabilelor.
        //Daca cele doua sunt egale, programul trebuie sa afiseze “sunt egale”.
        int a = 18;
        int b = 15;
        if (a>b){
            System.out.println(a+" este mai mare decat "+b);
        } else if (b>a) {
            System.out.println(b+" este mai mare decat "+a);

        }else{
            System.out.println("sunt egale");
        }

        // Ex4: Declarati o a treia variabila.
        //Screiti un program care sa afiseze variabila cu valoare mai mare dintre cele 3.
        int c = 8;
        if (a>b && a>c){
            System.out.println("'a' este variabila cu valoarea cea mai mare");
        } else if (b>a && b>c) {
            System.out.println("'b' este variabila cu valoarea cea mai mare");
        } else if (c>a && c>b) {
            System.out.println("'c' este variabila cu valoarea cea mai mare");
        }else{
            System.out.println("sunt egale");
        }

        // Ex5: Declarati o variabila de tip char cu numele letter si dati-i o valoare la alegere.
        //Daca valoarea este consoana, afisati “[letter] este consoana”, daca este vocala, afisati “[letter]
        //este vocala”, unde letter e valoarea variabilei.
        char letter = 'u';
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " este o vocala");
            }else {
            System.out.println(letter + " este o consoana");
        }

    }
}
