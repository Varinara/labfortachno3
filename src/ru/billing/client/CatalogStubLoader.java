package ru.billing.client;
import ru.billing.stocklist.*;
import ru.itmo.exceptions.*;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

    @Override
    public void load(ItemCatalog cat) {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short) 10);
        try {
            cat.addItem(item1);
            cat.addItem(item2); }
        catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}