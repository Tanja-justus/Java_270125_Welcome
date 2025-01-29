package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9,10};
int sum=0;

        for(int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);

            sum+=numbers[i];
            System.out.println(sum);
            System.out.println(findMax(numbers));


        }

            //{




    }


    // public static  int findMax (int[] arr)

    public static int findMax(int[] arr) {
        int max = arr[0]; // stant wert max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}