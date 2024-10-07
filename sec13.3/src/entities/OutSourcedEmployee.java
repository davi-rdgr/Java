package entities;

public class OutSourcedEmployee extends Employee {

    private double additionalCharge;

    public OutSourcedEmployee() {
    }

    public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    // getters
    public double getAdditionalCharge() {
        return additionalCharge;
    }

    // setters
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    // métodos
    
    @Override
    public double Payment(){

        return (hours * valuePerHour) * (additionalCharge / 110);
    }
    
}
