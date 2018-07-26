
public class PrimeFactor {

    public String of(int prime) {

        String returnPrime = "";
        for (int i = 2; i <= prime; i++) {
            for (;prime % i == 0;prime = prime / i) {
                returnPrime = returnPrime.concat("" + i);
            }
        }

        return returnPrime;
    }

}
