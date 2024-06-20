public class Car implements Comparable<Car>{
    private String model;
    private int productionYear;

    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.getProductionYear(), other.getProductionYear());
    }
    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", productionYear=" + productionYear + '}';
    }
}
