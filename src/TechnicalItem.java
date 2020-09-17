public class TechnicalItem extends GenericItem {

    short warrantyTime; // гарантийный срок

    @Override
    void printAll(){
        super.printAll();
        System.out.printf("Warranty Time: %d\n", warrantyTime);
    }

    @Override
    public String toString(){
        String ans = super.toString();
        ans = ans + " Warranty Time::" + Short.toString(warrantyTime);
        return ans;
    }
}