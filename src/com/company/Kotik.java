package com.company;
import java.util.Scanner;

public class Kotik {
    private static boolean isHigh;
    private static boolean isLow;
    String name;
    int age;

    public void sayMeow() {
        System.out.println("Мяу!");
    }
    public void eat() {
        System.out.println("Кушать!");
    }
    public void hungry() {
        System.out.println("Голоден!");
    }
    public void play() {
        System.out.println("Играть!");
    }
    public void chaseMouse() {
        System.out.println("Поиск мыши!");
    }
    public void sleep() {
        System.out.println("Спать!");
    }

    public void liveAnotherDay() {
        System.out.println("Другой день.");
    }

    public void doRandomEvent() {
        switch((int)(Math.random()*24)){
            case 1: play();
            case 2: eat();
            case 3: chaseMouse();
            case 4: sleep();
            case 5: sayMeow();
            case 6: hungry();
            default: break;
        }
    }

    public static void main(String[] args) {
        Kotik alice = new Kotik();
        alice.age = 3;
        alice.name = "Алиса";
        alice.sayMeow();
        alice.play();
        alice.sleep();
        alice.eat();
        alice.hungry();
        alice.chaseMouse();
        alice.doRandomEvent();

        int hungrymin = 1;
        int hungrymax = 100;
        Scanner hunger = new Scanner(System.in);
        int hungry = hunger.nextInt();
        isHigh = hungry > 90;
        isLow = hungry == 1;
            if (isHigh) {
                System.out.println("Я сыт.");
            }
            else if (isLow) {
                System.out.println("Кушать хочу!");
            }
            else {
                System.out.println("Слушаюсь и повинуюсь, Хозяин");
            }

        System.out.println("Кошку зовут " + alice.name + ", ее возраст - " + alice.age);
    }
}