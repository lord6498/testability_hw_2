package com.company;

public class Main {

    public static void main(String[] args) {
        double mass = 75.0;
        int height = 190;
        BmiService service = new BmiService();
        double index = service.calculate(height, mass);
        System.out.print("Индекс массы тела: ");
        System.out.printf("%.2f", index);
    }
}
