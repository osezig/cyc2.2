public class Main {
    public static void main(String[] args) {
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    public static void task4() {
        int sum = 15000;
        int monthnum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            System.out.println("Месяц " + monthnum + ", сумма накоплений составляет " + sum);
            monthnum++;
        }
    }

    public static void task5() {
        int sum = 15000;
        int monthnum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            if (monthnum % 6 == 0) {
                System.out.println("Месяц " + monthnum + ", сумма накоплений составляет " + sum);
            }
            monthnum++;
        }
    }

    public static void task6() {
        int sum = 15000;
        int monthnum = 1;
        for (int i = 1; i < 9 * 12; i += 6) {
            sum *= 1.07;
            if (monthnum % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма " + sum);
            }
            monthnum++;
        }
    }

    public static void task7() {
        int firstFriday = 4;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-ое число " + "Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task9() {
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println("2*" + i + " = " + 2 * i);
        }
    }
}