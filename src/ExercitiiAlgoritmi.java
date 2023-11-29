public class ExercitiiAlgoritmi {
    public static void main(String[] args) {
        // Ex1: Declarați un șir de numere întregi (ex. 1, -25, 34, -2, 67, 5)
        int numere[] = {1, -25, 34, -2, 67, 5};

        // Ex2: Scrieți un program care să afișeze doar vecinii numerelor din șir
        // (ex. în loc de 1 afișați 0 și 2; în loc de -25 afișați -26 și -24; etc)
        for (int i=0; i<numere.length; i++ ){
            System.out.println((numere[i]-1)+" "+(numere[i]+1));
        }
        // Ex3: Scrieți un program care să afișeze numerele negative din șir
        for (int i=0; i<numere.length; i++ ){
            if (numere[i]<0){
                System.out.println(numere[i]);
            }
        }

        //Ex 4: Declarați un șir de țări cu 8 elemente (ex. Anglia, România,
        // Albania, Franța, Elveția, China, SUA, Australia)
        String tari[]={"Anglia", "Romania","Albania","Franta","Elvetia","China","SUA","Australia, Afganistan"};

        //Ex5: Scrieți un program care să afișeze inițiala fiecărei țări
        for (String tara : tari){
            System.out.println(tara.charAt(0));
            System.out.println(tara.length());
        }

        //Ex6: Scrieți un program care să afișeze numai țările care încep cu litera “A”
        for (String tara : tari){
            //if (tara.charAt(0) == 'A'){
            if (tara.indexOf("A")==0){
                System.out.println(tara);
            }
        }

        // Ex7: Scrieți un program care să afișeze numărul de litere pentru fiecare țara
        for (String tara : tari){
            System.out.println(tara+", nr. litere: "+tara.length());
        }

        // Ex8: Scrieți un program care să afișeze țara cu cel mai lung nume
        int maxLength = 0;
        String taraMaxLength = "A";
        for (int i=0; i< tari.length; i++){
            if (tari[i].length() > maxLength) {
                maxLength = tari[i].length();
                taraMaxLength = tari[i];
            } else if (tari[i].length() == maxLength) {
                taraMaxLength = taraMaxLength + ", "+ tari[i];
            }
        }
        System.out.println("Tara cu cel mai lung nume este: "+ taraMaxLength);

        // Ex8: Scrieți un program care să afișeze țara cu cel mai scurt nume
        int minLength = tari[0].length();
        String taraMinLength = tari[0];
        for (int i=0; i< tari.length; i++){
            if (tari[i].length() < minLength) {
                minLength = tari[i].length();
                taraMinLength = tari[i];
            } else if (tari[i].length() == minLength) {
                taraMinLength = taraMinLength + ", "+ tari[i];
            }
        }
        System.out.println("Tara cu cel mai scurt nume este: "+ taraMinLength);

        int sirnumere[]={4,7,-5,89};
        int max = sirnumere[0];
        int min = sirnumere[0];
        for (int i=0; i< sirnumere.length; i++){
            if (sirnumere[i]>max){
                max = sirnumere[i];
            }
        }
        for (int c : sirnumere){
            if (c < min){
                min = c;
            }
        }
        System.out.println("Numarul maxim: "+max);
        System.out.println("Numarul minim: "+min);


    }



}
