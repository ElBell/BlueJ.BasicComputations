 


import java.math.BigInteger;

public class Factorial {
    /*
     * Write a program that computes the factorial n! = 1 x 2 x ... x n, 
     * using BigInteger. Compute the factorial of 1000
     */
    public BigInteger factorialOf(Integer value){
        BigInteger factorial = new BigInteger("1");
        for(int i = 1; i <= value; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
