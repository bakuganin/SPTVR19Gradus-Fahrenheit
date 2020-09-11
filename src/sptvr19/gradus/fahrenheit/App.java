/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.gradus.fahrenheit;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        double f;
        double c;
        int d = 32;
        double k = 273.15;
        double b = 1.8;
        double z;
        System.out.println("Конвентер градусов Цельсия в градусы по Фаренгейту или наоборот.");
        scanner.nextLine();
        System.out.println("Выберите: (1)-Цельсия в фаренгейт (2) - Цельсия в фаренгейт (3) - Цельсия в кельвин (4) - Кельвин в Цельсия: ");
        String znak = scanner.nextLine();
        if(null != znak) switch (znak) {
            case "1":
                System.out.println("Введите градусы по Цельсию: ");
                double gradC1 = scanner.nextDouble();
                c = gradC1 * b + d;
                System.out.println("По фаренгейту: " + c);
                break;
            case "2":
                System.out.println("Введите градусы по Фаренгейту: ");
                double gradF1 = scanner.nextDouble();
                f = (gradF1 - d) / b;
                System.out.println("По цельсию: " + f);
            case "3":
                System.out.println("Введите градусы по Цельсию: ");
                double gradC2 = scanner.nextDouble();
                z = gradC2 + k;
                System.out.println("По кельвина:" + z);
            case "4":
                System.out.println("Введите градусы по Кельвина: ");
                double gradK1 = scanner.nextDouble();
                z = gradK1 - k;
                System.out.println("По цельсия:" + z);

                
                
        }
    }
}