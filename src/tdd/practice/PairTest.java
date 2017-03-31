package tdd.practice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergioperezgago on 31/3/17.
 */
public class PairTest {
    @Test
    public void conValorUnoDevuelveUno(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzbuzz(1);
        assertEquals(result,"1");
    }
    @Test
    public void conValorTresDevuelveFizz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzbuzz(3);
        assertEquals(result,"fizz");
    }

    @Test
    public void conValorCincoDevuelvbuzz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzbuzz(5);
        assertEquals(result,"buzz");
    }

    @Test
    public void conValorQuinceDevuelvefizzbuzz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzbuzz(15);
        assertEquals(result,"fizzbuzz");
    }

    @Test
    public void conMultiploTressDevuelvefizz() {
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzbuzz(6);
        assertEquals(result, "fizz");
    }
}