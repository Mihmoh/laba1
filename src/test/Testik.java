package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testik {
    @Test
    public void TestDivision() throws Exception{
        Complex c = new Complex(0, 0);
        Complex d = new Complex(1, 1);
        c.divide(d);
        System.out.printf("c = %f + i * %f \n", c.GetReal(), c.GetImag());
        assertEquals(0, c.GetReal());
        assertEquals(0, c.GetImag());
    }

    @Test
    public void TestGetters() throws Exception{
        Complex c = new Complex(7, 2);
        assertEquals(7, c.GetReal());
        assertEquals(2, c.GetImag());
    }
}
