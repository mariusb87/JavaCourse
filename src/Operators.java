public class Operators {

    public static void main(String[] args) {

        // 1. operatori aritmetici
        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;

        System.out.println("sum1= "+sum1);
        System.out.println("sum2= "+sum2);
        System.out.println("sum3= "+sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);
        System.out.println(9/2); // catul impartirii
        System.out.println(9%2); // restul impartirii
        System.out.println(++number1); // incrementeaza apoi afiseaza
        System.out.println(number1++); // afiseaza number 1 apoi incrementeaza
        System.out.println(number1);
        System.out.println(--number2); // decrementare

        // 2. operatori de atribuire
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);

        //number2 = number2 + 4;
        number2+=4; //number2 = number2 + 4;
        number2-=2; //number2 = number2 - 2;
        number2*=2; //number2 = number2 * 2;
        number2/=2; //number2 = number2 / 2;
        System.out.println(number2);

        // 3. operatori de comparare
        System.out.println('K'<'L');
        System.out.println('A'!='B');

        // 4. operatori logici
        // && - and
        // || - or
        // !  - not

        boolean condition1 = number1>number2 && number1>100;
        boolean condition2 = number1>number2 || number1>100;
        System.out.println(condition1);
        System.out.println(condition2);

        if(!condition1){
            System.out.println("conditia este adevarata");

        } else System.out.println("conditia nu este adevarata");
        System.out.println("asdfsdg");
    }
}
