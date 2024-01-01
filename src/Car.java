public class Car {
    private String make;
    private String model;
    private String year;
    private String color;
    private String price;
    public Car(String make, String model, String year, String color, String price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price
                + "]";
    }

    
    

    

    
}
