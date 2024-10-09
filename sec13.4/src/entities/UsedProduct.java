package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;
    
    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    public LocalDate getDate(){
        return manufactureDate;
    }
    
    public void setDate(LocalDate date) {
        this.manufactureDate = date;
    }
    
    @Override
    public String priceTag() {
        return name + " (used) $ " + price + "(Manufacture date: " + manufactureDate + ")";
    }
}
