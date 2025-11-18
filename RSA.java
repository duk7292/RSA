import java.math.BigInteger;
import java.util.Random;

public class RSA {
    private BigInteger d, e, n;

    BigInteger eulerPhi(BigInteger p, BigInteger q) 
    {
        BigInteger result = (p.subtract(BigInteger.ONE)).multiply((q.subtract(BigInteger.ONE)));
        return result;
    }

    static Boolean lessThan(BigInteger a, BigInteger b) 
    {
        return a.compareTo(b) < 0;
    }
    private Boolean isValidNumber(BigInteger e, BigInteger x)
    {   
        if(!e.gcd(x).equals(BigInteger.ONE) )
        {
            return false;
        }
        if(e.equals(BigInteger.ONE))
        {
            return false;
        }
        if(e.max(x).equals(e))
        {
            return false;
        }

        return true;
    }
    BigInteger generateCoprime(BigInteger x)
    {
        BigInteger a;


        do{
            a = (new BigInteger(x.bitLength(), new  Random()));

        }while(!isValidNumber(a,x));

        return a;
    }
}
