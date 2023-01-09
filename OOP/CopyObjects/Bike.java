package JavaPractice.OOP.CopyObjects;

import JavaPractice.OOP.Encapsulation.Car;

public class Bike {
    private String make;
    private String model;
    private int cost;

    Bike(String make, String model, int cost) {
        this.setMake(make);
        this.setModel(model);
        this.setCost(cost);
    }
    Bike(Bike x){
        this.copy(x);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public void copy(Bike x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setCost(x.getCost());
    }
}
