/*
Дано целое число n. Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную инструкцию if и циклы.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + 2 - (n % 2));
    }
}
