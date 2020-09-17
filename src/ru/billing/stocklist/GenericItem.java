package ru.billing.stocklist;

public class GenericItem {

    private int ID; // ID товара
    private String name; //Наименование товара
    private float price; //Цена товара
    private Category category = Category.GENERAL;
    static int currentID = 1;
    private GenericItem analog;

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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}