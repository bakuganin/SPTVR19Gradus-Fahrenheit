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
        double b = 1.8;
        System.out.println("Конвентер градусов Цельсия в градусы по Фаренгейту или наоборот.");
        scanner.nextLine();
        System.out.println("Выберите: (1)-Цельсия в фаренгейт (2) - наоборот: ");
        String znak = scanner.nextLine();
        if(null != znak) switch (znak) {
            case "1":
                System.out.println("Введите градусы по Цельсию: ");
                double gradC = scanner.nextDouble();
                c = gradC * b + d;
                System.out.println("По фаренгейту: " + c);
                break;
            case "2":
                System.out.println("Введите градусы по Фаренгейту: ");
                double gradF = scanner.nextDouble();
                f = (gradF - d) / b;
                System.out.println("По цельсию: " + f);
        }
    }
}