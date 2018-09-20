public class MethodsExercises {

    public static int Addition(int n1, int n2){

        return n1 + n2;
    }

    public static int Subtraction(int n1, int n2){
        return n1 - n2;
    }

    public static int Multiplication(int n1, int n2){
        return n1 * n2;
    }

    public static int Division(int n1, int n2){
        if (n1 > 0 || n1 < 0) return n1 / n2;
        else if(n2>0 || n2 < 0) return n1/n2;
        else return -0;
    }


    public static int Modulus(int n1, int n2){
        if(n1>n2) return n1 % n2;
        else return n1;
    }



    public static void main(String[] args) {

        int val = Addition(5,9);
        System.out.println("add: "+val);
        val = Subtraction(8,37);
        System.out.println("sub: "+val);
        val = Multiplication(897,346);
        System.out.println("mult: "+val);
        val = Division(192803, -42);
        System.out.println("div: "+val);

        val = Modulus(100, 543);
        System.out.println("mod: "+val);
        System.out.println("if your 'mod: value' is equal to the your first number it is because " +
                "a lower number can't be divided into a larger number and return a remainder");


    }



}
