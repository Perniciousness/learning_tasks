package practice.packages.task3.solution.com.game.items;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Item {
    private String itemUsed;
    public Item(String item){
        itemUsed = item;
    }

    public void use() {
        Logger logger = Logger.getLogger("output");
        logger.log(Level.INFO, "You have used: {0}.", itemUsed);
        itemUsed = null;
    }

    public String getItem(){
        return itemUsed;
    }
}