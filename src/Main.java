public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        int i = 1;
        int salary = 15_000;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;

            System.out.println("Месяц " + i + ", сумма накопление " + total + " рублей");
            i++;

        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }
        for (int a = 10; a >= 1; ) {
            System.out.println(a--);
        }
    }

    public static void task3() {
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 9 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population += birthRate;
            population -= deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
            // так же решала Ольга Лугачева в видеоразборе
        }
    }
}
