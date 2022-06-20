package menu;

import boxes.*;
import stock.Stock;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements CreateBoxes{
    private static final Scanner in = new Scanner(System.in);
    private ArrayList <Stock> stocks = new ArrayList<>();

    public void mainMenu() {
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню");
            System.out.println(" 1) Работа с товарами");
            System.out.println(" 2) Работа со складом");
            System.out.println(" 0) Выход из программы");
            mainMenuItem = in.nextInt();
            if (mainMenuItem == 1) {
                //Метод для работы с товарами
                workWithProducts();
            } else if (mainMenuItem == 2) {
                //Метод для работы со складами
                workWithStorages();
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход из программы...");
                System.exit(0);
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

        //workWithProducts

    private void workWithProducts() {   //workWithProducts
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе с товарами");
            System.out.println(" 1) Добавление товара на склад");
            System.out.println(" 2) Добавление группы товаров на склад");
            System.out.println(" 3) Удаление товара со склада");
            System.out.println(" 4) Удаление группы товаров со склада");
            System.out.println(" 5) Показать типы товаров и их количество");
            System.out.println(" 0) Выход в главное меню");
            mainMenuItem = in.nextInt();
            if(mainMenuItem == 1){
                setGoodsWarehouse(0);
            }else if(mainMenuItem == 2){
                int amountItem;
                System.out.println("-------------------------------------------------------------");
                System.out.println("Введите количество");
                amountItem = in.nextInt();
                setGoodsWarehouse(amountItem);
            }else if(mainMenuItem == 3){
                deleteGoodsWarehouse(1); //при удалении не получается найти предмет нужного типа под индексом 0(остальные индексы он находит)
            }else if(mainMenuItem == 4){
                int amountItem;
                System.out.println("-------------------------------------------------------------");
                System.out.println("Введите количество");
                amountItem = in.nextInt();
                deleteGoodsWarehouse(amountItem);
            }else if(mainMenuItem == 5){
                showWarehousesTypes();
            }else if(mainMenuItem == 0){
                mainMenu();
            }
        }
    }
    private void showWarehousesTypes() {
        int setGoodsItem;
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите склад(1,2,3,...)");
            setGoodsItem = in.nextInt();
            stocks.get(setGoodsItem - 1).showTypes();
            workWithProducts();
        }
    }
    private void deleteGoodsWarehouse(int amountItem) {//workWithProducts
        int setGoodsItem;
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите склад(1,2,3,...)");
            setGoodsItem = in.nextInt();
            deleteBox(setGoodsItem - 1, amountItem);
        }
    }
    private void deleteBox(int setGoodsItem, int amountItem) {//workWithProducts
        int setBoxItem;
        while (true){
            System.out.println("-------------------------------------------------------------");
            System.out.println(" 1) Шампунь");
            System.out.println(" 2) Мыло");
            System.out.println(" 3) Напитки");
            setBoxItem = in.nextInt();
            if (setBoxItem == 1){
                Box boxS = new BoxShampoo();
                stocks.get(setGoodsItem).deleteGoods(amountItem, boxS);
                System.out.println(stocks.get(0)+" "+ stocks.get(1)+ " " + stocks.get(2));
                workWithProducts();
            }else if(setBoxItem == 2){
                Box boxSoap = new BoxSoap();
                stocks.get(setGoodsItem).deleteGoods(amountItem, boxSoap);
                System.out.println(stocks.get(0)+" "+ stocks.get(1)+ " " + stocks.get(2));
                workWithProducts();
            }else if(setBoxItem == 3){
                Box boxDrinks = new BoxDrinks();
                stocks.get(setGoodsItem).deleteGoods(amountItem, boxDrinks);
                System.out.println(stocks.get(0)+" "+ stocks.get(1)+ " " + stocks.get(2));
                workWithProducts();
            }else{
                System.out.println("Ошибка!");
            }
        }
    }
    private void setGoodsWarehouse(int amountItem) {//workWithProducts
        int setGoodsItem;
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите склад(1,2,3,...)");
            setGoodsItem = in.nextInt();
            setBox(setGoodsItem - 1, amountItem);
        }
    }
    private void setBox(int a, int amountItem) {//workWithProducts
        int setBoxItem;
        while (true){
            System.out.println("-------------------------------------------------------------");
            System.out.println(" 1) Шампунь");
            System.out.println(" 2) Мыло");
            System.out.println(" 3) Напитки");
            setBoxItem = in.nextInt();
            if (setBoxItem == 1){
                stocks.get(a).setGoods(createBoxS(), amountItem);
                System.out.println(stocks.get(0)+" "+ stocks.get(1)+ " " + stocks.get(2));
                workWithProducts();
            }else if(setBoxItem == 2){
                stocks.get(a).setGoods(createBoxSoap(), amountItem);
                System.out.println(stocks.get(0)+" "+ stocks.get(1)+ " " + stocks.get(2));
                workWithProducts();
            }else if(setBoxItem == 3){
                stocks.get(a).setGoods(createBoxD(), amountItem);
                System.out.println(stocks.get(0)+" "+ stocks.get(1)+ " " + stocks.get(2));
                workWithProducts();
            }else{
                System.out.println("Ошибка!");
            }
        }
    }
        //workWithProducts

        //workWithStorages
    private void workWithStorages() {
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе со складами");
            System.out.println(" 1) Показать список складов и товаров в них");
            System.out.println(" 2) Добавть новый склад");
            System.out.println(" 3) Удалить склад");
            System.out.println(" 0) Выход в главное меню");
            mainMenuItem = in.nextInt();
            //Код для дальнейшей работы
            if(mainMenuItem == 1){
                showOllStocks();
            }else if (mainMenuItem == 2){
                addNewStock();
            }else if (mainMenuItem == 3){
                deleteStock();
            }else if(mainMenuItem == 0){
                mainMenu();
                break;
            }else{
                System.out.println("Ошибка!");
            }
        }
    }
    private void showOllStocks() {
        for (Stock stock: stocks){
            System.out.println("Склад "+ stock);
            for(Box box: stock.getBoxs()){
                System.out.println(box);
            }
        }
        workWithStorages();
    }
    private void deleteStock() {
        int delStockItem;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Какой склад вы хотите удалить?");
        for (int i = 0; i < stocks.size(); i++){
            System.out.println("Склад  №" + (i+1));
        }
        delStockItem = in.nextInt();
        stocks.remove(delStockItem - 1);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Склад успешно удален!");
        workWithStorages();
    }
    private void addNewStock() {
        Stock stock = new Stock();
        stocks.add(stock);
        System.out.println("Склад успешно добавлен!");
        workWithStorages();
    }
    //workWithStorages
    
    public Menu(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }
    public ArrayList<Stock> getStocks() {
        return stocks;
    }
    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }
}