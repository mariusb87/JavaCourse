public class ExercitiiOptionaleOperatori {
    public static void main(String[] args) {
        // ex1
        int var1, var2, var3, var4;
        var1 = 100;
        var2 = 2;
        var3 = 2;
        var4 = 9;
        System.out.println("Suma variabilelor este: "+ (var1+var2+var3+var4));
        System.out.println("Produsul variabilelor este: "+ var1*var2*var3*var4);
        System.out.println("Restul impartirii dintre var4 si var2 este: "+ (var4%var2));

        // ex2
        for (int i=0; i<2;i++) {
            var1++;
        }

        System.out.println(var1);
        // ex3
        for (int i=0; i<2;i++){
            var2 -= 2;
        }

        System.out.println(var2);
        // ex4
        boolean cond1=(var1+var2+var3+var4)>100;
        boolean cond2=(var1*var2*var3*var4)>1000;

        System.out.println("cond1= "+ cond1);
        System.out.println("cond2= "+ cond2);

        // ex5
        if (cond1 || cond2){
            System.out.println("una dintre conditii este adevarata");
        }
        if (cond1 && cond2){
            System.out.println("ambele conditii sunt adevarate");
        }

    }
}
