public class BmiService {

    public int calculate(double height, int weight) {
        double result = weight / Math.pow(height, 2);
        return (int) result;
    }
}
