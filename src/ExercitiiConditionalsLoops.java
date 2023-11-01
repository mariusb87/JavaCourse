public class ExercitiiConditionalsLoops {
    public static void main(String[] args) {

        // ex1: Scrieți un program care să afișeze toate
        // numerele întregi de la 0 până la 10 (inclusiv).
        System.out.println("--- Exercitiul 1 ---");
        for (int i=0; i<=10; i++){
            System.out.print(i+" ");
        }

        // ex2: Scrieți un program care să afișeze numerele
        // întregi de la 20 până la 10 (inclusiv) în ordine descrescătoare.
        System.out.println("--- Exercitiul 2 ---");
        for (int i=20; i>=10; i--){
            System.out.print(i+" ");
        }

        // Ex3: Scrieți un program care să afișeze toate numerele
        // pare pozitive până la 100 (inclusiv)
        System.out.println("--- Exercitiul 3 ---");
        int i=0;
        while (i<=100){
            System.out.print(i+" ");
            i+=2;
        }

        // Ex4: Se dă un șir cu următoarele elemente: măr, căpsune, pere, banane.
        // Scrieți un program care să afișeze pentru fiecare fruct:
        // “Îmi place să mananc [numeFruct]”, unde numeFruct reprezintă fiecare
        // fruct din șir.
        System.out.println("--- Exercitiul 4 ---");
        String fructe[]={"mar", "capsune", "pere", "banane"};
        for (String fruct : fructe){
            System.out.println("Imi place sa mananc "+ fruct);
        }

        // Ex4: Scrieți un program care să afișeze numele lunii în funcție
        // de un număr întreg de la 1-12. Ex: 1 -> Ianuarie, 2-> Februarie,
        // 3-> Martie, etc.
        System.out.println("--- Exercitiul 5 ---");

        int luna = 2;

        switch (luna){
            case 1: System.out.println("Ianuarie");break;
            case 2: System.out.println("Februarie");break;
            case 3: System.out.println("Martie");break;
            case 4: System.out.println("Aprilie");break;
            case 5: System.out.println("Mai");break;
            case 6: System.out.println("Iunie");break;
            case 7: System.out.println("Iulie");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("Septembrie");break;
            case 10: System.out.println("Octombrie");break;
            case 11: System.out.println("Noiembrie");break;
            case 12: System.out.println("Decembrie");break;
            default: System.out.println("Lunile trebuie sa fie intre 1 si 12");

        }

    }
}
