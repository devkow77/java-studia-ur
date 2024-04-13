import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // lab04.01
        int[] numbers = randNumbers(5, 10, 30);
        calculateSumAndAvg(numbers);
        // lab04.02
        int[] tab1 = {1,2,3,4,5,6};
        int[] tab2 = {1,2,3};
        showEverySecondNumber(tab1, tab2);
        // lab04.03
        String[] stringTab = {"Ala", "ma", "kota", "i", "psa"};
        showStringsFromTab(stringTab);
        // lab04.04
        showStringsByReverse();
        // lab04.05
        sortNumbers();
        // lab04.06
        showFactorialOfNumbers();
        // lab04.07
        String[] stringTab1 = {"Als", "ma", "kota", "i", "rybe"};
        String[] stringTab2 = {"Ala", "ma", "kota", "i", "rybe"};
        compareTwoStringTabs(stringTab1, stringTab2);
    }
    // lab04.01
    public static int[] randNumbers(Integer quantity, Integer minRange, Integer maxRange){
        Random rand = new Random();
        int[] numbers = new int[quantity];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(maxRange - minRange) + minRange;
        }
        return numbers;
    }
    public static void calculateSumAndAvg(int[] numbers){
        int sum = 0;
        int avg;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        avg = sum / numbers.length;
        System.out.format("Sum of %d numbers is equal: %d \n", numbers.length, sum);
        System.out.format("Avg of %d numbers is equal: %d \n", numbers.length, avg);
    }
    // lab04.02
    public static void showEverySecondNumber(int[] tab1, int[] tab2){
        System.out.println("Numbers in tab1:");
        for(int i = 0; i < tab1.length; i += 2){
            System.out.format("%d.number: %d \n", i, tab1[i]);
        }
        System.out.println("Numbers in tab2:");
        for(int i = 0; i < tab2.length; i += 2){
            System.out.format("%d.number: %d \n", i, tab2[i]);
        }
    }
    // lab04.03
    public static void showStringsFromTab(String[] tab1){
        for(String word : tab1){
            System.out.println(word.toUpperCase());
        }
    }
    // lab04.04
    public static void showStringsByReverse(){
        Scanner scan = new Scanner(System.in);
        String[] tab = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.format("Enter %d from 5 words: ", i + 1);
            tab[i] = scan.nextLine();
        }

        for(int i = 4; i >= 0; i--){
            StringBuilder builder = new StringBuilder(tab[i]);
            System.out.println(builder.reverse());
        }
    }
    // lab04.05
    public static void sortNumbers(){
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.format("Enter %d from 8 words: ", i + 1);
            numbers[i] = scan.nextInt();
        }

        Arrays.sort(numbers);

        for(int number : numbers){
            System.out.println(number);
        }
    }
    //lab04.06
    public static int calculateFactorial(int number){
        if(number == 0 || number == 1) return 1;
        else{
            return number * calculateFactorial(number - 1);
        }
    }
    public static void showFactorialOfNumbers(){
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.format("Enter %d from 5 numbers: ", i + 1);
            numbers[i] = scan.nextInt();
        }

        for(int i = 0; i < 5; i++){
            int factorialOfNumber = calculateFactorial(numbers[i]);
            System.out.format("Factorial of %d is equal: %d \n", numbers[i], factorialOfNumber);
        }
    }
    // lab04.07
    public static void compareTwoStringTabs(String[] tab1, String[] tab2){
        if(tab1.length != tab2.length) System.out.println("tabs are not the same!");
        else{
            for(int i = 0; i < tab1.length; i++){
                if(!Objects.equals(tab1[i], tab2[i])){
                    System.out.println("tabs have the same length, but they are not the same!");
                    return;
                }
            }
            System.out.println("tabs are the same");
        }
    }
}
