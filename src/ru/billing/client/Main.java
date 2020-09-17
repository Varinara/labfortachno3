package ru.billing.client;

import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.client.CatalogFileLoader;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws CatalogLoadException, ItemAlreadyExistsException {

        GenericItem water = new GenericItem(1, "water", 300);
        GenericItem wood = new GenericItem(2, "wood", 1000);
        GenericItem table = new GenericItem(3, "table", 5000);
        GenericItem desk = new GenericItem(4, "desk", 3000);
        GenericItem milk = new GenericItem(5, "milk", 90);
        GenericItem meat = new GenericItem(6, "meat", 250);
        GenericItem phone = new GenericItem(7, "phone", 100000);
        GenericItem salt = new GenericItem(8, "salt", 100);
        FoodItem mars = new FoodItem("mars", 90, (short)100);
        //System.out.println(mars.ID);
        FoodItem twix = new FoodItem("twix", 100, (short) 120);
        GenericItem[] itemsArray = { water, wood, table, desk, milk, meat, phone,
                salt, mars, twix };

        ItemCatalog catalog = new ItemCatalog();
        for (GenericItem i : itemsArray) {
             catalog.addItem(i);
        }

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(catalog);

        CatalogLoader fls = new CatalogFileLoader("1.txt");
        fls.load(catalog);
        catalog.printItems();
    }
    //loader.load(catalog);
}