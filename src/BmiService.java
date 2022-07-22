public class BmiService {
    public int calculate(double veight, double growth) {
        double result = veight / (growth * growth);
        return (int) result;
    }
}
