public class MyArray {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4};
        String myStringArray[] = {"a","b","c"};

        System.out.println(myArray[3]);
        System.out.println(myStringArray[2]);

        //parcurgere array cu 'for'
        for (int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }

        for (int i=myArray.length-1; i>-1; i--){
            System.out.print(myArray[i]+" ");
        }

        // parcurgere cu 'for each'
        for (String str:myStringArray){
            System.out.println(str);
        }

        // exercitii Automation 4 - 20.09.2023
        // exercitiul 4 - Arrays

        double elemente[] = {4.5, 7.8, 1.1, 2.2};
        System.out.println("Elementul de pe a doua pozitie: "+elemente[1]);
        System.out.println("Elementul de pe ultima pozitie: "+elemente[3]);
        System.out.println("Sirul are: "+elemente.length+ " elemente");

        for (int i=0; i<elemente.length; i++){
            System.out.print(elemente[i]+", ");
        }

        //Exercitii optionale (continuare de la MyString)
        // exercitiul 5

        char elements[] = {'a','b','c','d'};
        System.out.println("Elementul de pe prima pozitie: "+ elements[0]);
        System.out.println("Elementul de pe a doua pozitie: "+ elements[1]);
        System.out.println("Elementul de pe a ultima pozitie: "+ elements[3]);

        System.out.println("Elementele sirului sunt: ");
        for (char i = 0; i< elements.length; i++){
            System.out.print(elements[i]+ ", ");
        }

    }


}

