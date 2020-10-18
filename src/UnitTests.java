import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnitTests {
    @Test
    public void GetSqrt_ReturnsSuccessResult(){
        MainProgram mainProgram = new MainProgram();
        double firstValue = 4.0;

        assertEquals(2, mainProgram.GetSqrtResult(firstValue), "Pow of 4 is 2.");
    }
}
