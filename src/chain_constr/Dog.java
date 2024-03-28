package chain_constr;

import java.util.Arrays;

public class Dog {
    private  String nameDog;
    private int age;
    private String poroda;
    private String chipName;

    //Конструктор без параметров
    public Dog() {

    }
    // Метод виведення інфо про собаку.
    public void displayInfo(){
        System.out.println("Кличка: "+nameDog);
        System.out.println("Вік: "+age);
        System.out.println("Пордода: " +poroda);
        System.out.println("ЧИП: "+ chipName);
    }

    public static void main(String[] args) {
        Dog dogUnk=new Dog();
        System.out.println("Невідомий пес: ");
        dogUnk.displayInfo();
        System.out.println();
    }
}
