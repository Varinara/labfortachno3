package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;

public class TechnicalItem extends GenericItem {

    private short warrantyTime; // гарантийный срок

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

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

}