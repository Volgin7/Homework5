public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015 ) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015 ) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int currentYear = 800;
        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear >= 400 && currentYear % 400 == 0)) {
            System.out.println(currentYear + " год является високосным");
        } else {
            System.out.println(currentYear + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 9;

        switch (monthNumber) {
            case 1:
                System.out.println("Сезон = ЗИМА");
                break;
            case 2:
                System.out.println("Сезон = ЗИМА");
                break;
            case 3:
                System.out.println("Сезон = ВЕСНА");
                break;
            case 4:
                System.out.println("Сезон = ВЕСНА");
                break;
            case 5:
                System.out.println("Сезон = ВЕСНА");
                break;
            case 6:
                System.out.println("Сезон = ЛЕТО");
                break;
            case 7:
                System.out.println("Сезон = ЛЕТО");
                break;
            case 8:
                System.out.println("Сезон = ЛЕТО");
                break;
            case 9:
                System.out.println("Сезон = ОСЕНЬ");
                break;
            case 10:
                System.out.println("Сезон = ОСЕНЬ");
                break;
            case 11:
                System.out.println("Сезон = ОСЕНЬ");
                break;
            case 12:
                System.out.println("Сезон = ЗИМА");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }



}
