public class Rational {
    private int numerator;
    private int denominator;

    public static void main(String[] args) {

        //Rational.toString();
        int n1 = Integer.parseInt(args[0]);
        int d1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);
        Rational r = add(new Rational(n1, d1), new Rational(n2, d2));

        //String result = Integer.toString(r.numerator) + "/" + Integer.toString(r.denominator);

        String output = r.toString();    //r.show();

       // System.out.println(output);
        System.out.println(r);
    }

    @Override
    public String toString(){
        String result = Integer.toString(numerator) + "/" + Integer.toString(denominator);
        return result;
    }

    /*private String show() {
        return (Integer.toString(numerator) + "/" + Integer.toString(denominator));
    }*/

    private static Rational add(Rational r1, Rational r2){
        int n1 = r1.numerator;
        int d1 = r1.denominator;
        int n2 = r2.numerator;
        int d2 = r2.denominator;
        int numerator = n1 * d2 + n2 * d1;
        int denominator = d1 * d2;

        return new Rational(numerator, denominator);
    }



    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
}