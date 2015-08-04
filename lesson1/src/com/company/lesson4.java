package com.company;

/**
 * Created by admin on 28.07.15.
 */
public class lesson4 {

    public static void main(String[] args) {
        int i = f();
        int f1 = i;
        System.out.println(f1(2));
        System.out.println(f1(8));
        String task2="I am learning how to code ";
        int task2_1 = 6;
        String result_two = "";
        System.out.println(taskTwo(task2_1, task2));

   }

    public static int f() {
        return 2;
    }
    public static int f1(int i) {
         i= i*i; return i;

    }

    public static String taskTwo (int hi, String non1) {
        for (int i = 0; i<=hi; i++)
        {
            non1+=non1;
        }
        return non1;
    }
    public static boolean taskThree (int [] arr1, int [] arr2)
    {
        return true;
    }
}














































