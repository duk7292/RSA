import java.math.BigInteger;

public class RSA {
    private BigInteger d, e, n;

    BigInteger eulerPhi(BigInteger p, BigInteger q) {
        BigInteger result = (p.subtract(BigInteger.ONE)).multiply((q.subtract(BigInteger.ONE)));
        return result;
    }

    static Boolean lessThan(BigInteger a, BigInteger b) {
        return a.compareTo(b) < 0;
    }
}
