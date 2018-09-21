import java.util.Scanner;

public class MethodsExercises {
    static  Scanner rangeScanner = new Scanner(System.in);// use the scanner to get user input

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

    public static long Product(int num1, int num2){

        //if (a==0 || numberOfTimes == 0){
        // return 0;
        // }
        //
        // in product = 0;
        // while(numberOfTimes > 0){
        //      product += a;
        //      numberOfTImes --;
        // }
        //return product;


        int result=0;
        if(num1>0&&num2>0){
            for(int i=0;i<num2;i++){
                result=result+num1;
            }
        }else if(num1==0|| num2==0){
            result=0;
        }else if(num1<0||num2<0){
            if(num1<0&&num2>0){
                for(int i=num1;i<0;i++){
                    num1+=num2;
                }
                result=-result;
            }
            else if(num1>0&&num2<0){
                for(int i=num2;i<0;i++){
                    result=result+num1;
                }
                result=-result;
            }
            else if(num1<0&&num2<0){
                int temp=-num1;
                for(int i=num2;i<0;i++){
                    result=result+temp;
                }
            }
        }

        return result;
    }

    public static int getInteger(int min, int max){//we want a min and maximum limit
        int brandNewInteger = rangeScanner.nextInt();//get user input
        if(brandNewInteger < min||brandNewInteger > max){//Sad path: if user input is less than minimum or greater than maximum
            System.out.println("Your number needs to be between " + min + " and " +max);//let them know they are out of range
            return getInteger(min, max);//RECURSION: recall the function to begin again.
        }
        return brandNewInteger; //Happy Path: user picked a number inside the range.
    }


    public static int factorial(int number){

        Scanner factorialScanner = new Scanner(System.in);

        int userFactorial = factorialScanner.nextInt();

        if (number == 0)
            return 1;
        else
            return number * factorial(number-1);
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
        //Multiply without multiplication operator


        long prod = Product(4, 4);
        System.out.println("The product is: "+ prod);
        prod = Product(4567, 38);
        System.out.println("The product is: "+ prod);
        prod = Product(4, 123456);
        System.out.println("The product is: "+ prod);
        prod = Product(879393, 4234565);
        System.out.println("The product is: "+ prod);

        //Validating User Input


        System.out.println("Pick a number between 1 and 10");//ask for input
        int userInput = getInteger(1, 10);//set the range
        System.out.println(userInput);//display the user's input that falls within that range.

        //Factorials
        System.out.println("Pick a number to factor between 1 and 10");

    }
}




//method overloading  = have same method type, name, parameter order !!!!!! NOTES