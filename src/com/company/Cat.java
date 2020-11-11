package com.company;

public class Cat {
    String name;
    private int satiety = 10; //Сытость кота.
    private final int h; //Число методов класса Cat.

    {
        h = 6;
    }
    private final int food = 2;
    private final String nameFood = "Royal Canin.";

    public void play() {
        if (satiety == 0) {
            System.out.println("Хочу кушать...");
            eat();}
        else {
        System.out.println("Играю...");
        satiety--; }
    }
    public void sleep() {
        if (satiety == 0) {
            System.out.println("Хочу кушать...");
            eat();}
        else {
        System.out.println("Сплю...");
        satiety--; }
    }
    public void chaseMouse() {
        if (satiety == 0) {
            System.out.println("Хочу кушать...");
            eat(); }
        else {
        System.out.println("Ловлю мышь...");
        satiety--; }
    }
    public void sayMeow() {
        if (satiety == 0) {
            System.out.println("Хочу кушать...");
            eat(); }
        else {
        System.out.println("Мяу-мяу...");
        satiety--;}
    }
    public void rumble() {
        if (satiety == 0) {
            System.out.println("Хочу кушать...");
            eat(); }
        else {
        System.out.println("Мрр-Мрр...");
        satiety--; }
    }
    public void eat(int food) {
        System.out.println("Скушал упаковку влажного корма...");
        satiety = satiety + food;
    }
    public void eat(int food, String nameFood) {
        System.out.println("Сегодня в миске " + nameFood);
        satiety = satiety + food;
    }
    public void eat() {
        if (satiety == 0) {
            System.out.println("Подошел к миске и поел..."); }
        else {
            System.out.println("Кушаю...");
        }
        satiety++;
        satiety++;
        satiety++;
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 24; i++) {
    switch ((int) (Math.random()*h+1)) {
        case 1: eat();
            System.out.println("Час " + i);
            break;
        case 2: sleep();
            System.out.println("Час " + i);
            break;
        case 3: chaseMouse();
            System.out.println("Час " + i);
            break;
        case 4: play();
            System.out.println("Час " + i);
            break;
        case 5: sayMeow();
            System.out.println("Час " + i);
            break;
        case 6: rumble();
            System.out.println("Час " + i);
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + (int) (Math.random() * h + 1));
            }
        }
    }

}
