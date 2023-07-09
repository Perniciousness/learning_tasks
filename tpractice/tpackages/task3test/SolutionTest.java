package tpractice.tpackages.task3test;

// Test related libraries
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// What we're gonna test
import practice.packages.task3.solution.com.game.Player;
import practice.packages.task3.solution.com.game.items.Item;

class SolutionTest {
    String[] items = new String[]{"Candy", "Stick", "Toy"};
    private static final byte MIN = 1;
    private static final byte MAX = 3;
    int pickItem = (byte) Math.random() * (MAX - MIN + 1) + MIN - 1;
    
    @Test
    void itemWasUsed(){
        Item item = new Item(items[pickItem]);
        item.use();
        assertEquals(item.getItem(), null);
    }

    @Test
    void itemWasUsedByPlayer(){
        Item item = new Item(items[pickItem]);
        new Player().useItem(item);
        assertEquals(item.getItem(), null);
    }
}
