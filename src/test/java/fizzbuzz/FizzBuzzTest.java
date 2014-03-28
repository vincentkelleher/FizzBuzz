package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vincent on 28/03/2014.
 */
public class FizzBuzzTest
{
    private FizzBuzz fb;

    @org.junit.Before
    public void setUp() throws Exception
    {
        fb = new FizzBuzz();
    }

    @Test
    public void testFizz() throws Exception
    {
        assertEquals("Fizz !", fb.answer(3));
    }

    @Test
    public void testBuzz() throws Exception
    {
        assertEquals("Buzz !", fb.answer(5));
    }

    @Test
    public void testFizzBuzz() throws Exception
    {
        assertEquals("FizzBuzz !", fb.answer(15));
    }

    @Test
    public void testNotFizzNorBuzz() throws Exception
    {
        assertEquals("7 !", fb.answer(7));
    }

    @Test
    public void testHundredAnswers() throws Exception
    {
        assertEquals(100, fb.getAnswers(100).length);
    }

    @org.junit.After
    public void tearDown() throws Exception
    {

    }
}
