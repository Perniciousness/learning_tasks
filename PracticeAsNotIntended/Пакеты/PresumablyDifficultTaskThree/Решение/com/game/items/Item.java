package com.game.items;

public class Item {
    String itemUsed;
    public Item(String item){
        itemUsed = item;
    }

    public void use() {
        System.out.printf("You have used: %s.", itemUsed);
    }
}