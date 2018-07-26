
public class PrimeFactor {

    public String of(int prime) {

        String returnPrime = "";
        for (int i = 2; i <= prime; i++) {
            while (prime % i == 0) {
                returnPrime = returnPrime.concat("" + i);
                prime = prime / i;
            }
        }

        return returnPrime;
    }

}
