import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {


    @Test
    public void testRealPart(){
        ComplexNumber c =new ComplexNumber(2.3,5);
        assertEquals("Comprobando que la parte real es 2.3", 2.3, c.realPart(), 0.01);

    }

    @Test
    public void testImaginaryPart() {
        ComplexNumber c = new ComplexNumber(4.2, 9.1);
        assertEquals("Comprobando que la parte imaginaria es 9.1", 9.1, c.imaginaryPart(), 0.01);
    }

    @Test
    public void testAdd(){
        ComplexNumber   c1 =new ComplexNumber(3,4);
        ComplexNumber c2 = new ComplexNumber(2, 7);
        ComplexNumber c3 = c1.add(c2);
        ComplexNumber c3Expected = new ComplexNumber(5,11);
        assertEquals(5, c3.realPart(), 0.01);
        assertEquals(11, c3.imaginaryPart(), 0.01);

        assertEquals(c3Expected, c3);
    }

    @Test
    public void testDivision(){
        ComplexNumber c1 = new ComplexNumber(13,1);
        ComplexNumber c2 = new ComplexNumber(1,-3);
        ComplexNumber c3 = null;
        try {
            c3 = c1.division(c2);
        } catch (ComplexNumber.ComplexNumberException e) {
            throw new RuntimeException(e);
        }
        ComplexNumber c3Expected = new ComplexNumber(1 ,4);
        assertEquals("Parte real",1,c3.realPart(),0.01);
        assertEquals("Parte imag",4,c3.imaginaryPart(),0.01);
        assertEquals(c3Expected,c3);
    }
    @Test
    public void testConjugate(){
        ComplexNumber c= new ComplexNumber(8,-2);
        assertEquals("Comprobando que la parte imaginaria es 2", 2, c.conjugate().imaginaryPart(), 0.01);
    }

    /**
     * Test different ways to catch an exception.
     * AssertThrows()
     */
    @Test
    public void testException1() {
        ComplexNumber c1 = new ComplexNumber(4, -3);
        ComplexNumber c2 = new ComplexNumber(0, 0);
        assertThrows(ComplexNumber.ComplexNumberException.class, () -> {
            c1.division(c2);
        });
    }

    /**
     * Test different ways to catch an exception.
     * fail()
     */
    @Test
    public void testException2() {
        ComplexNumber c1 = new ComplexNumber(4, -3);
        ComplexNumber c2 = new ComplexNumber(0, 0);
        try {
            c1.division(c2);
            // If we reach this point, the test has failed
            fail();
        } catch (ComplexNumber.ComplexNumberException e) {
            // If we reach this point, the test has passed
            assert true;
        }
    }
}
