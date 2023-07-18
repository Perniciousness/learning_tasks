package practice.oop.task5;

public enum AccessibleProduct {
    // Elements enumerated by bits and their prices
    VEGETABLE((byte) 0b0000_0001){ public float price(){ return 2.99f; } },
    FRUIT(    (byte) 0b0000_0010){ public float price(){ return 4.99f; } },
    CEREAL(   (byte) 0b0000_0100){ public float price(){ return 1.79f; } },
    TUBER(    (byte) 0b0000_1000){ public float price(){ return 0.99f; } },
    LEGUME(   (byte) 0b0001_0000){ public float price(){ return 40.6f; } },
    MEAT(     (byte) 0b0010_0000){ public float price(){ return 53.1f; } },
    FISH(     (byte) 0b0100_0000){ public float price(){ return 53.0f; } },
    DAIRY(    (byte) 0b1000_0000){ public float price(){ return 17.4f; } };

    // Constructor
    final byte bitRepresentation;
    AccessibleProduct(byte bitRepresentation) {
        this.bitRepresentation = bitRepresentation;
    }

    public abstract float price();
}