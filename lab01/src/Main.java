import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // lab01.01
        showPersonalData();
        // lab01.02
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Integer num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        Integer num2 = scan.nextInt();
        calculateNumbers(num1, num2);
        // lab01.03
        System.out.println("Enter number to check if it is a even: \n");
        Integer num3 = scan.nextInt();
        boolean isEvenNumber = isEvenNumber(num3);
        System.out.format("Number %d is even: %b \n", num3, isEvenNumber);
        // lab01.04
        System.out.println("Enter number to check if it is devided by 3 and 5: \n");
        Integer num4 = scan.nextInt();
        boolean isDevidedByThreeAndFive = isDevidedByThreeAndFive(num4);
        System.out.format("Number %d is devided by 3 and 5: %b \n", num4, isDevidedByThreeAndFive);
        // lab01.05
        System.out.println("Enter a number and i will raise it to the power of 3 \n");
        Integer num5 = scan.nextInt();
        Integer numberToPowerOfTree = numberToPowerOfThree(num5);
        System.out.format("Number %d raised to the power of 3: %d \n", num5, numberToPowerOfTree);
        // lab01.06
        System.out.println("Enter a number and i will sqrt it \n");
        Integer num6 = scan.nextInt();
        Float sqrtOfNumber = sqrtOfNumber(num6);
        System.out.format("Sqrt of %d: %.2f \n", num6, sqrtOfNumber);
        // lab01.07
        System.out.println("Enter first number of range <a,b>: \n");
        Integer a = scan.nextInt();
        System.out.println("Enter last number of range <a,b>: \n");
        Integer b = scan.nextInt();
        Random rand = new Random();
        Integer num7 = rand.nextInt(b - a) + a;
        Integer num8 = rand.nextInt(b - a) + a;
        Integer num9 = rand.nextInt(b - a) + a;
        Boolean createRectangularTriangle = createRectangularTriangle(num7, num8, num9);
        System.out.format("You can create rectangular triangle with sides: %d %d %d: %b \n", num7,num8,num9,createRectangularTriangle);
    }
    public static void showPersonalData(){
        System.out.println("Kacper 20");
    }
    public static void calculateNumbers(Integer num1, Integer num2){
        System.out.format("Sum %d + %d: %d \n", num1, num2, num1 + num2);
        System.out.format("Difference %d - %d: %d \n", num1, num2, num1 - num2);
        System.out.format("Product %d * %d: %d \n", num1, num2, num1 * num2);
    }
    public static boolean isEvenNumber(Integer num1){
        return num1 % 2 == 0;
    }
    public static boolean isDevidedByThreeAndFive(Integer num1){
        return num1 % 15 == 0; // if num1 % 15 == 0 is also devided by 3 and 5 simultaneously
    }
    public static Integer numberToPowerOfThree(Integer num1){
        return (int) Math.pow(num1, 3);
    }
    public static Float sqrtOfNumber(Integer num1){
        return (float) Math.sqrt(num1);
    }
    public static boolean createRectangularTriangle(Integer num1, Integer num2, Integer num3){
        if(Math.pow(num1, 2) == ((Math.pow(num2, 2) + Math.pow(num3, 2)))) return true;
        if(Math.pow(num2, 2) == ((Math.pow(num1, 2) + Math.pow(num3, 2)))) return true;
        if(Math.pow(num3, 2) == ((Math.pow(num1, 2) + Math.pow(num2, 2)))) return true;
        else return false;
    }
}