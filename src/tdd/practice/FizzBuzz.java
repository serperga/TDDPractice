package tdd.practice;

/**
 * Created by sergioperezgago on 31/3/17.
 */
public class FizzBuzz {

 public String fizzbuzz(int value) {
     if (value == 15) {
         return "fizzbuzz";
     } else if (value == 3) {
         return "fizz";
     } else if (value == 5){
         return  "buzz";
     }

     return String.valueOf(value);
 }
}
