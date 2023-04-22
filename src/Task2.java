/*
Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
Программа получает на вход три числа: a, b, n.
Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Sample Input:
10 15 2

Sample Output:
20 30
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость одного пирога в рублях: ");
        int rubles = scanner.nextInt();
        System.out.println("Введите количество копеек к стоимости в одного пирога в рублях: ");
        int pennies = scanner.nextInt();
        System.out.println("Введите нужное количество пирогов для расчёта стоимости: ");
        int amount = scanner.nextInt();

        int calculate = pennies * amount;
        System.out.println((rubles * amount + calculate / 100) + " " + calculate % 100);
    }
}


