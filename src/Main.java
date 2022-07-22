public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double veight = 90;
        double growth = 1.7;
        int index = service.calculate(veight, growth);
        System.out.println(index);
    }
}