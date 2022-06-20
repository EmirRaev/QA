import menu.Menu;
import stock.Stock;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock s1 = new Stock();
        Stock s2 = new Stock();
        Stock s3 = new Stock();
        stocks.add(s1);
        stocks.add(s2);
        stocks.add(s3);

        Menu menu = new Menu(stocks);
        menu.mainMenu();
    }
}
