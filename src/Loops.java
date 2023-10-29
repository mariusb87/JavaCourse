public class Loops {
    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i=5; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("------------");
        System.out.println("afisare numere de la 0 la 10 din 2 in 2");
        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        // FOR EACH (enhanced for)
        System.out.println("------------");
        String cars[] = {"BMW", "Mazda", "Opel", "Toyota"};
        for (String car: cars){
            System.out.println(car);
        }

        // WHILE
        System.out.println("------------");
        int i=0;
        while (i<7){
            System.out.println(i);
            i++;
        }

        // DO WHILE
        System.out.println("------------");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j<5);

        // BREAK si continue
        System.out.println("------------");
        for (int k=0; k<10; k++){
            if (k==4){continue;}
            System.out.println(k);
            if (k==7){break;}
        }

        // while cu continue
        System.out.println("------------");
        int k=0;
        while (k<10){
            k++;
            if(k==4){continue;}
            System.out.println(k);
        }

    }
}
