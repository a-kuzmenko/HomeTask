package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 1. Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

    // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = args.length - 1; i > -1; i--) {
            System.out.println("arg = " + args[i]);
        }

    //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        int number [] = new int[6];
        for (int j = 0; j < number.length; j++) {
            number[j] = (int)(Math.random() * 6);
            System.out.println(number[j]);
        }
        for (int x = 0; x < number.length; x++) {
            number[x] = (int)(Math.random() * 6);
            System.out.print(number[x]);
        }

    //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        String password = "123456789";

        System.out.print("\nEnter your password: ");
        String pass = scanner.next();

        if(password.equals(pass)){
            System.out.println("Your password is right: " + password);
        }
        else
            System.out.println("Your password is wrong");

    //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.

        int sum = 0;
        int cum = 1;
        for(String arg : args){
            sum += Integer.parseInt(arg);
        }
        System.out.println("sum = "+ sum);

        for(String arg : args){
            cum *= Integer.parseInt(arg);
        }
        System.out.println("cum = "+ cum);


    //6.Ввести с консоли n целых чисел. На консоль вывести:
    //    6.1. Четные и нечетные числа.
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 9: ");

        //int arr [] = new int[6];
        int size = scanner.nextInt();
        int scanNumber [] = new int[size];

        System.out.print("Enter " + size + " integer(s): ");
        for(int i = 0; i < scanNumber.length; i++){
            scanNumber[i] = scanner.nextInt();
            System.out.println(scanNumber[i]);

        }
        for(int i = 0; i < scanNumber.length; i++) {
            if (scanNumber[i] % 2 != 0)
                System.out.println("Odd number:" + scanNumber[i]);
            else if (scanNumber[i] % 2 == 0)
                System.out.println("Even number:" + scanNumber[i]);
        }
    //    6.2. Наибольшее и наименьшее число.

        int min = scanNumber[0];
        int max = scanNumber[0];
        for(int i = 0; i < scanNumber.length; i++) {
                min = Math.min(min,scanNumber[i]);
                max = Math.max(max,scanNumber[i]);
        }
        System.out.println("Min number:" + min);
        System.out.println("Max number:" + max);

    //    6.3. Числа, которые делятся на 3 или на 9.
        for(int i = 0; i < scanNumber.length; i++) {
            if ((scanNumber[i] % 3 == 0) || (scanNumber[i] % 9 == 0)) {
                if(scanNumber[i]!=0)
                System.out.println("Divided by 3 or 9: " + scanNumber[i]);
            }

        }

    //    6.4. Числа, которые делятся на 5 и на 7.

        for(int i = 0; i < scanNumber.length; i++) {
            if ((scanNumber[i]% 5 == 0) && (scanNumber[i]% 7 == 0)) {
                if(scanNumber[i]!=0)
                System.out.println("Divided by 5 and 7: " + scanNumber[i]);
            }
        }
    //    6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.

        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < size; i++)
            if ((scanNumber[i] > 99) && (scanNumber[i] < 1000)) {
                a = scanNumber[i] / 10 / 10;
                b = scanNumber[i] / 10 % 10;
                c = scanNumber[i] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)

                    System.out.println("3х-значное число в десятичной записи которых нет одинаковых цифр: " + scanNumber[i]);
            }


    //    6.6. «Счастливые» числа.
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 9: ");
        int newsize = scanner.nextInt();
        int happyNumber [] = new int[newsize];
        int a1 = 0;
        int b1 = 0;

        System.out.print("Enter " + newsize + " 4-digit numbers: ");
        //for(int i = 0; i < happyNumber.length; i++){
        //    happyNumber[i] = scanner.nextInt();
        //}

        for (int i = 0; i < happyNumber.length; i++) {
            happyNumber[i] = scanner.nextInt();
            if ((happyNumber[i] > 999) && (happyNumber[i] < 10000)) {

                a1 = happyNumber[i] / 100; // выделение 1й 2ки чисел
                b1 = happyNumber[i] % 100; // выделение 2й 2ки чисел

                int sum1 = 0;
                int sum2 = 0;

                while (a1 != 0) {  //подсчитать сумму 1й двойки чисел
                    sum1 = sum1 + a1 % 10;
                    a1 = a1 / 10;
                }

                while (b1 != 0) {  //подсчитать сумму 2й двойки чисел
                    sum2 = sum2 + b1 % 10;
                    b1 = b1 / 10;
                }

                if (sum1 == sum2) {
                    System.out.println("Happy number: " + happyNumber[i]);
                }
            }
        }
    }
}
