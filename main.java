import java.math.BigInteger;
import java.util.Random;
void main() {

    RSA a = new RSA();
    for(int i = 0; i < 100; i++)
    {
        IO.println(a.generateCoprime(a.eulerPhi(BigInteger.valueOf(53503),BigInteger.valueOf(91957))));
    }

}
