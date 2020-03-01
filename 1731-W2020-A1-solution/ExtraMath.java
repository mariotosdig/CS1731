// COMP 1731 (Winter 2020)
// Assignment 1, Problem 3
// Liam Keliher

public class ExtraMath
{
    //---------------------------------------------------------------
    // This method determines whether or not the argument, n, is a
    // prime number by attempting to divide in all integers between
    // 2 and (n-1), inclusive.  If any divisor is found, n is not prime.
    // If no divisor is found, n is prime.
    public static boolean isPrime(int n)
    {
        if (n < 2)
        {
            return false;
        } // if
        else if (n == 2)
        {
            return true;
        } // else if
        else
        {
            int x = 2;
            while (x < n)
            {
                if (n % x == 0)   // x divides into n
                {
                    return false;
                } // if
                x++;
            } // while

            // Nothing divided in, so n must be prime
            return true;
        } // else
    } // isPrime(int)
    //---------------------------------------------------------------
} // class ExtraMath