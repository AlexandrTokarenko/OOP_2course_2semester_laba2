package main;

import train.Train;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {

        Train[] st = fillTrainArray();
        int item;
        do {
            item = menu();
            switch (item) {
                case 1:
                    printTrain(st);
                    break;
                case 2:
                    printPoint(st);
                    break;
                case 3:
                    printPointAndOclock(st);
                    break;
                case 4:
                    printPointAndSeat(st);
                    break;
            }
        } while (item != 0);
    }

    private void printPointAndSeat(Train[] st) {

        System.out.println("Введіть пункт призначення");
        Scanner in = new Scanner(System.in);
        String point = in.next();
        Train[] trains = findTrainsByPointAndSeat(st, point);
        printTrain(trains);
    }

    private Train[] findTrainsByPointAndSeat(Train[] st, String point) {

        Train[] trains = new Train[st.length];
        int count = 0;
        for (Train train : st) {
            if (train.getPoint().equals(point)) {
                if (train.getCommon() > 0) trains[count++] = train;
            }
        }
        return Arrays.copyOf(trains, count);
    }

    private void printPoint(Train[] st) {

        System.out.println("Введіть пункт призначення");
        Scanner in = new Scanner(System.in);
        String point = in.next();
        Train[] trains1 = findTrainsByPoint(st, point);
        printTrain(trains1);
    }

    private Train[] findTrainsByPoint(Train[] st, String point) {

        Train[] trains = new Train[st.length];
        int count = 0;
        for (Train train : st) if (train.getPoint().equals(point)) trains[count++] = train;
        return Arrays.copyOf(trains, count);
    }

    private void printPointAndOclock(Train[] st) {

        System.out.println("Введіть пункт призначення");
        Scanner in = new Scanner(System.in);
        String point = in.next();
        System.out.println("Введіть годину після якої відправляється потяг");
        int hour = in.nextInt();
        Train[] trains1 = findTrainsByPointAndOclock(st, point,hour);
        printTrain(trains1);
    }

    private Train[] findTrainsByPointAndOclock(Train[] st, String point, int hour) {

        Train[] trains1 = new Train[st.length];
        int count = 0;
        for (Train train : st) {
            if (train.getPoint().equals(point)) {
                if (train.getHour() >= hour) trains1[count++] = train;
            }
        }
        return Arrays.copyOf(trains1, count);
    }

    private void printTrain(Train[] st) {

        for (int i = 0; i < st.length; i++) System.out.println(st[i]);
    }

    private int menu() {

        System.out.println("1. Вивести всі потяги");
        System.out.println("2. Список поїздів, які прямують до заданого пункту призначення");
        System.out.println("3. Список поїздів, які прямують до заданого пункту призначення та відправляються після " +
                "заданої години");
        System.out.println("4. Список поїздів, які відправляються до заданого пункту призначення та мають загальні місця");
        System.out.println("0. Вихід");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private Train[] fillTrainArray() {
        return new Train[] {
                new Train("Київ","121", 20,30,0,50,12,32),
                new Train("Львів", "100A",14,28,125,100,32,50),
                new Train("Харків", "999",12,0,100, 100, 45,58),
                new Train("Київ", "212B",6,5,0,90,31,24),
                new Train("Одеса","28",13,45,75,35,34,45)
        };
    }
}



/*package main;

import train.Train;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {

        Train[] st = fillTrainArray();
        int item;
        do {
            item = menu();
            switch (item) {
                case 1:
                    printTrain(st);
                    break;
                case 2:
                    printPoint(st);
                    break;
                case 3:
                    printPointAndOclock(st);
                    break;
                case 4:
                    printPointAndSeat(st);
                    break;
            }
        } while (item != 0);
    }

    private void printPointAndSeat(Train[] st) {

        System.out.println("Введіть пункт призначення");
        Scanner in = new Scanner(System.in);
        String point = in.next();
        for (Train train : st) {
            if (train.getPoint().equals(point)) {
                if (train.getCommon() > 0) System.out.println(train);
            }
        }
    }

    private void printPoint(Train[] st) {

        System.out.println("Введіть пункт призначення");
        Scanner in = new Scanner(System.in);
        String point = in.next();
        Train[] trains1 = findTrainsByPoint(st, point);
        printTrain(trains1);
    }

    private Train[] findTrainsByPoint(Train[] st, String point) {

        Train[] trains = new Train[st.length];
        int count = 0;
        for (Train train : st) if (train.getPoint().equals(point)) trains[count++] = train;
        return Arrays.copyOf(trains, count);
    }

    private void printPointAndOclock(Train[] st) {

        System.out.println("Введіть пункт призначення");
        Scanner in = new Scanner(System.in);
        String point = in.next();
        System.out.println("Введіть годину після якої відправляється потяг");
        int hour = in.nextInt();
        for (int i = 0; i < st.length; i++) {
            if (st[i].getPoint().equals(point)) {
                if (st[i].getHour() >= hour) System.out.println(st[i]);
            }
        }
    }

    private void printTrain(Train[] st) {

        for (int i = 0; i < st.length; i++) System.out.println(st[i]);
    }

    private int menu() {

        System.out.println("1. Вивести всі потяги");
        System.out.println("2. Список поїздів, які прямують до заданого пункту призначення");
        System.out.println("3. Список поїздів, які прямують до заданого пункту призначення та відправляються після " +
                "заданої години");
        System.out.println("4. Список поїздів, які відправляються до заданого пункту призначення та мають загальні місця");
        System.out.println("0. Вихід");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private Train[] fillTrainArray() {
        return new Train[] {
                new Train("Київ","121", 20,30,0,50,12,32),
                new Train("Львів", "100A",14,28,125,100,32,50),
                new Train("Харків", "999",12,0,100, 100, 45,58),
                new Train("Київ", "212B",6,5,0,90,31,24),
                new Train("Одеса","28",13,45,75,35,34,45)
        };
    }
}*/
