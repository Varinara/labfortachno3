import javax.jws.Oneway;

public class GenericItem {

    public int ID; // ID товара
    public String name; //Наименование товара
    public float price; //Цена товара
    Category category = Category.GENERAL;
    static int currentID = 1;
    GenericItem analog;

    public GenericItem(int ID, String name, float price) {
        GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.ID = ID;
    }

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
        //System.out.println(currentID);
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %s , price:%5.2f , category:%s\n", ID, name, price, category);
    }

    public String toString(){
        String ans = "";
        ans = ans + "ID: " + Integer.toString(this.ID) + " name:" + this.name + " price:" + Float.toString(this.price) + " category:" + this.category;
        return ans;
    }

}