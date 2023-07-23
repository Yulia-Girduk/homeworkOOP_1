package org.example;

public class Homework_1 {
    public static void main(String[] args) {
        HotDrink drinkFirst = new HotDrink("Зеленый чай", 100);
        HotDrinkHeir drinkSecond = new HotDrinkHeir("Черный чай", 150, 90);
        HotDrinkHeir drinkThird = new HotDrinkHeir("Чай на травах", 200, 60);

        HotDrinkMachine machine = new HotDrinkMachine();

        drinkFirst.getInfo();
        drinkSecond.getInfo();
        drinkThird.getInfo();


        machine.getProduct("Зеленый чай", 100);
        machine.getProduct("Черный чай", 150, 90);
        machine.getProduct("Чай на травах", 200, 60);
    }
}
interface VendingMachine {
    void getProduct(String name, int volume);
    void getProduct(String name, int volume, int temperature);
}

class HotDrink {
    private String name;
    private int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void getInfo() {
        System.out.println("Название: " + name);
        System.out.println("Объём: " + volume + " мл");
    }
}

class HotDrinkHeir extends HotDrink {
    private int temperature;

    public HotDrinkHeir(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Температура: " + temperature + " градусов");
    }
}

class HotDrinkMachine implements VendingMachine {
    @Override
    public void getProduct(String name, int volume) {
        System.out.printf("Выдан продукт по имени " + name + "  и объёму " + volume);
        System.out.println();
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {
        System.out.printf("Выдан продукт по имени " + name + "  и объёму " + volume + " и температуре " + temperature);
        System.out.println();
    }
}
