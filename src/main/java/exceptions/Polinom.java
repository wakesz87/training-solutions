package exceptions;

public class Polinom {

    private double[] coefficients;

    public Polinom(double[] coefficients) {
        if ( coefficients == null) {
            throw new NullPointerException("Coefficients is null");
        }
        this.coefficients = coefficients;
    }



    public Polinom(String[] coefficientsString) {
        if ( coefficientsString == null) {
            throw new NullPointerException("coefficientsString is null");
            try {
                this.coefficients = convertCoefficientsString(coefficientsString);
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
            }

        }

        public double evaluate(double x) {
            int n = coefficients.length - 1;
            double sum = 0;
            for (int j = n; j >= 0; j--) {
                sum += coefficients[j] * Math.pow(x,(double)n - j);
            }
            return sum;
        }

        public double[] getCoefficients() {
            return coefficients;
        }

    }

    private double[] convertCoefficientsString(String[] coefficientsString) {
        double[] coefficients = new double[coefficientsString.length];
        for(int j = 0; j < coefficientsString.length  j++) {
            coefficients[j] = Double.parseDouble(coefficientsString[j]);
        }
        return coefficients;

    }
}


