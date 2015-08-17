package com.maleshen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Лабораторная работа номер 9\nВведите первое число:\n->");
        Scanner in = new Scanner(System.in);
        String tmp = in.nextLine();
        dec a = new dec(tmp);
        System.out.print("Введите второе число:\n->");
        Double q = in.nextDouble();
        dec b = new dec(q);
        System.out.print("Вывод.\nПервое : ");a.print();
        System.out.print("Второе : ");b.print();
        dec raz = a.raz(b);
        System.out.print("Разность строк = ");raz.print();
        if (a.IsBigger(b)) System.out.println("Первое число больше");
        if (a.IsSmaller(b)) System.out.println("Первое число меньше");
        if (!a.IsSmaller(b) && !a.IsBigger(b)) System.out.println("Числа равны.");
        dec[] m = new dec[4];
        m[0] = a;
        m[1] = b;
        m[2] = new dec(54.2);
        m[3] = new dec("-33");
        System.out.print("\nДобавлено еще 2 числа: 54 и -33. Выведем отсортированный массив.\n");
        Arrays.sort(m);
        for (dec aM : m) {
            aM.print();
        }
    }
}
