public class Pushups {


    public static int countDown(int number){//static is needed because this is not an instance of this method being used
        if (number > 0){//condition to countDown
            System.out.println(number);//this prints the initial number passed
            return countDown(number-1);//this is the recursion
        }else System.out.println("BlastOff!!!");
        return number;//you have to return something
    }

    public static int countUp(int number){//static is needed because this is not an instance of this method being used
        if (number == 1) {  //if the number is 1 print the number
            System.out.println(number);
        }
        else { //otherwise
            int n = number - 1; //the integer variable is number - 1
            // use that variable in the recursion
            countUp(n);
            // then print out that number
            System.out.println(number);
        }
        return number;
    }


    public static int Fizzbuzz(int number){
        for(int i = 1; i<=number; i++){
            if(i%15 == 0) System.out.println("FizzBuzz");
            else if(i%5 == 0) System.out.println("Buzz");
            else if(i%3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
        return number;
    }


    public static int[] reverse(int[] nums){ //reverse method that receivs an int[] of nums as the parameter;
        int[]backwards = new int[nums.length];//create a new array called backwards that will have the same amount of space as the nums parameter's length
        for(int i = 0; i<nums.length; i++){//do a for loop  where i begins at index 0 and goes the length of the array;
            //backwards array begins at the end of the array and replaces the index of nums at the backwards location
            //i.e. in an array of numbers 1-9, nums[0] is the same as backwards[8] which is 1;
            backwards[backwards.length - i -1] = nums[i];
        }
        return backwards;
    }

    public static void main(String[] args) {
//        boolean isBad = true;
//        System.out.println(isBad);
//        byte byteExample = 0b100;
//        System.out.println(byteExample);
//        short shortExample = 3333;
//        System.out.println(shortExample);
//        int integerExample = 299999999;
//        System.out.println(integerExample);
//        long longExample = 10000000000L;
//        System.out.println(longExample);
//        float floatExample = 9.666776676767676F;
//        System.out.println(floatExample);
//        double doubleExample = 3.14157;
//        System.out.println(doubleExample);
//        char charExample = 'b';
//        System.out.println(charExample);
//        String manOnFireQuotes = "You move, you make one sound, I'll snatch the life right out of you. You understand?";
//        System.out.println(manOnFireQuotes);

        countDown(7);

//
//        int[] numbers = {1,2,3,4,5,6,7,8,9};//input an array of numbers in the numbers array
//        for(int num: numbers) System.out.print(num + " ");//enhanced loop (forEach) taking the numbers and printing it out on the screen;
//        System.out.println();
//
//        for (int num:reverse(numbers)) System.out.print(num + " ");//taking the numbers and placing them in the reverse method and printing;
//


//        TicTacToe game - new TicTacToe();
//
//        while(true){
//            get.takeTurn();
//        }


        countUp(15);
        Fizzbuzz(100);

    }
}
