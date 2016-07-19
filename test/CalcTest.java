import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wills on 7/19/16.
 */
public class CalcTest {

    @Test
    public void main() throws Exception {
        String[] t = {"2", "1", "+", "3", "*"};
        Double res = Calc.calc(t);
        Double exp = 9.0;
        assertEquals(res, exp);
    }
    @Test
    public void second() throws Exception {
        String[] t = {"4", "5", "5", "/", "+"};
        Double res = Calc.calc(t);
        Double exp = 5.0;
        assertEquals(res, exp);
    }
    @Test
    public void third() throws Exception {
        String[] t = {"3", "4", "2", "*", "2", "1", "-", "2", "3", "^", "^", "/", "+"};
        Double res = Calc.calc(t);
        Double exp = 11.0;
        assertEquals(res, exp);
    }
}