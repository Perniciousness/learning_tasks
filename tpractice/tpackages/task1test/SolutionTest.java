package tpractice.tpackages.task1test;

// Test related libraries
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// What we are checking for
import practice.packages.task1.solution.com.company.Office;
import practice.packages.task1.solution.com.library.Library;

class SolutionTest {
    @Test
    void officeIsUsingLibraryMethodCheck(){
        assertEquals(Library.printBooks(), Office.useLibrary());
    }
}
