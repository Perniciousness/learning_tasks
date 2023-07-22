package practice.oop.task9.models;

public final class Plane {
    
    private final String manufacturer;
    private final String model;
    private final int seatingCapacity;
    
    private Plane(String manufacturer, String model, int seatingCapacity) {
        
        this.manufacturer = manufacturer;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
    }

    public String getManufacturer() {
        
        return manufacturer;
    }

    public String getModel() {
        
        return model;
    }

    public int getSeatingCapacity() {
        
        return seatingCapacity;
    }
    
    public static class PlaneBuilder implements Builder<Plane>{
        
        private String manufacturer;
        private String model;
        private int seatingCapacity;

        public PlaneBuilder setManufacturer(String manufacturer) {
            
            this.manufacturer = manufacturer;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            
            this.model = model;
            return this;
        }

        public PlaneBuilder setSeatingCapacity(int seatingCapacity) {
            
            this.seatingCapacity = seatingCapacity;
            return this;
        }
        
        @Override
        public Plane build() {
            
            return new Plane(manufacturer, model, seatingCapacity);
        }
    }
}
