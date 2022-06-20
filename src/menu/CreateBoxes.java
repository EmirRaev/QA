package menu;

import boxes.*;

import java.util.Scanner;

public interface CreateBoxes {
    default BoxShampoo createBoxS(){
        Scanner sc = new Scanner(System.in);
        BoxShampoo newBoxShampoo = new BoxShampoo();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Введите название шампуня");
        newBoxShampoo.setName(sc.next());
        System.out.println("Введите объем коробки");
        newBoxShampoo.setVolume(sc.nextInt());
        System.out.println("Введите объем бутылки шампуня");
        newBoxShampoo.setShampooVolume(sc.nextInt());
        return newBoxShampoo;
    }
    default BoxSoap createBoxSoap(){
        Scanner sc = new Scanner(System.in);
        BoxSoap newBoxSoap = new BoxSoap();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Введите название мыла");
        newBoxSoap.setName(sc.next());
        System.out.println("Введите объем коробки");
        newBoxSoap.setVolume(sc.nextInt());
        System.out.println("Введите вес мыла");
        newBoxSoap.setWeight(sc.nextInt());
        return newBoxSoap;

    }
    default BoxDrinks createBoxD(){
        Scanner sc = new Scanner(System.in);
        BoxDrinks newBoxDrinks = new BoxDrinks();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Введите название напитка");
        newBoxDrinks.setName(sc.next());
        System.out.println("Введите объем коробки");
        newBoxDrinks.setVolume(sc.nextInt());
        System.out.println("Введите объем бутылки напитка");
        newBoxDrinks.setBottleVolume(sc.nextInt());
        return newBoxDrinks;
    }
}
