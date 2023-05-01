import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void romanToIntegerTest() {
        String inputLine = "MCMXIVIXCD";
        int expected = 2323;
        int actual = Solution.romanToInteger(inputLine);
        Assert.assertEquals(expected, actual);
    }
}
