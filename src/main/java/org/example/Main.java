package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Реализовать приложение, которое:
//  Принимает от пользователя и запоминает строки
//  Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
//  Если введено revert, то удаляем последнюю введеную строку
//  Если введено exit, то завершаем программу
//  java
//  c++
//  python
//  c#
//  print
//  < [c#, python, c++, java]
//  revert
//  print
//< [python, c++, java]
//  exit
        Scanner sc = new Scanner(System.in);
        List<String> storage = new ArrayList<>();
        String input;
        while (!(input = sc.nextLine()).equals("exit")) {
            if ("print".equals(input)) {
                Collections.reverse(storage);
                System.out.println(storage);
                continue;
            }
            if ("revert".equals(input)) {
                if (storage.size() == 0){
                    System.out.println("Элементов больше нет!");
                } else {
                    storage.remove(storage.size() - 1); }
            }
            else {
                storage.add(input); }
        }
    }
}