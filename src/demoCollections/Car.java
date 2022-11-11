package demoCollections;

public class Car {
    public String getBrand() {
        return brand;
    }

    public Car(String brand, Integer prduceYear) {
        this.brand = brand;
        this.prduceYear = prduceYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrduceYear() {
        return prduceYear;
    }

    public void setPrduceYear(Integer prduceYear) {
        this.prduceYear = prduceYear;
    }

    private String brand;
    private Integer prduceYear;

}
