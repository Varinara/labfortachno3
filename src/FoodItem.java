import java.util.Date;

public class FoodItem extends GenericItem{

    Date dateOfIncome; //Дата производства
    short expires; //срок годности

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("Date: %tD, expires: %d\n", dateOfIncome, expires);
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, (float) 0, null, null, (short) 0);
    }

    public FoodItem() {
        super();
    }

    @Override
    public String toString(){
        String ans = super.toString();
        ans = ans + " Date: " + this.dateOfIncome + " expires:" + Short.toString(expires);
        return ans;
    }

}
