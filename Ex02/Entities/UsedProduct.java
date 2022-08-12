package Atividade.Ex02.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manuFactureDate;

    public UsedProduct(Date manuFactureDate) {
        this.manuFactureDate = manuFactureDate;
    }

    public UsedProduct(String name, Double price, Date manuFactureDate) {
        super(name, price);
        this.manuFactureDate = manuFactureDate;
    }

    public Date getManuFactureDate() {
        return manuFactureDate;
    }

    public void setManuFactureDate(Date manuFactureDate) {
        this.manuFactureDate = manuFactureDate;
    }

    @Override
    public String priceTag () {
        return getName() + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manuFactureDate)
                + ")";
    }
}
