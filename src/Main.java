import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        double d;

        d = ((b + sqrt(b*b + 4*a*c)/(2*a)) - (pow(a, 3) * c + pow(b, -2)));
        System.out.println(d);
    }
}
