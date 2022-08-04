public class Main {
    public static void main(String[] args) {
    task1();
        System.out.println();
    task2();
        System.out.println();
    task3();
        System.out.println();
    task4();
        System.out.println();
    task5();
        System.out.println();
    task6();
    }
    // Task 1
    public static void task1() {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    // Task 2
    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2020;
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
    }
    // Task 3
    public static void task3() {
        int year = 2028;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    // Task 4
    public static void task4() {
    int deliveryDistance = 13;
    if (deliveryDistance <= 20 && deliveryDistance >0) {
        System.out.println("Потребуется дней: 1");
    }
    if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется дней: 2");
    }
    if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется дней: 3");
    }
    }
    // Task 5
    public static void task5() {
        int monthNumber = 3;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень"); break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
    // Task 6
    public static void task6() {
        int age = 24;
        int salary = 81000;
        int limit;
        if (age >= 23) {
            limit = 3 * salary;
        } else {
            limit = 2 * salary;
        }
        if (salary >= 50000 && salary < 80000) {
            limit *= 1.2;
        }
        if (salary >= 80000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
    }
}
