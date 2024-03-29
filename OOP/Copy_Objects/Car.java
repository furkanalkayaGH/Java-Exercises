package OOP.Copy_Objects;

public class Car {

    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year){
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x){
        this.copy(x);
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car x){
        this.setBrand(x.getBrand());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }




}
