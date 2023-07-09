package tpractice.tpackages.task5test;

// Test related libraries
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// What we're gonna test
import practice.packages.task5.solution.com.company.Utils;
import practice.packages.task5.solution.com.company.utils.MathUtils;

class SolutionTest {

    @Test
    void mathUtilsCheck(){
        assertEquals(MathUtils.calculateSum(15, 5), 20);
    }

    @Test
    void utilsCheck(){
        assertEquals(Utils.utilizeMath(15, 5), 20);
    }

    @Test
    void bothUtilsCheck(){
        assertEquals(Utils.utilizeMath(15, 5), MathUtils.calculateSum(15, 5));
    }
}
