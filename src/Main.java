import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = 0; i <= 2; i++) {
            System.out.println(number1[i]);
        }
        double[] number2 = {1.57, 7.654, 9.986};
        for (int i = 0; i <= 2; i++) {
            System.out.println(number2[i]);
        }
        int[] number3 = {123, 456, 789, 987, 654, 321};
        for (int i = 0; i <= 5; i++) {
            System.out.println(number3[i]);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i != number1.length-1){
            System.out.print(", ");}
        }
        System.out.println();
        double[] number2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length-1){
                System.out.print(", ");}
        }
        System.out.println();
        int[] number3 = {123, 456, 789, 987, 654, 321};
        for (int i = 0; i < number3.length; i++) {
            System.out.print(number3[i]);
            if (i != number3.length-1){
                System.out.print(", ");}
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = number1.length-1; i >=0; i--) {
            System.out.print(number1[i]);
            if (i != 0){
                System.out.print(", ");}
        }
        System.out.println();
        double[] number2 = {1.57, 7.654, 9.986};
        for (int i = number2.length-1; i >=0; i--) {
            System.out.print(number2[i]);
            if (i != 0){
                System.out.print(", ");}
        }
        System.out.println();
        int[] number3 = {123, 456, 789, 987, 654, 321};
        for (int i = number3.length-1; i >=0; i--) {
            System.out.print(number3[i]);
            if (i != 0){
                System.out.print(", ");}
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = 0; i <= 2; i++) {
            if (number1 [i] %2 != 0){
                number1[i] +=1;
            }
        }
        System.out.println(Arrays.toString(number1));
    }
}