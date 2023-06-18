public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.86;
        double weight = 98;
        int index;
        index = (int) service.calculate(weight, height);
        System.out.println(index);
    }
}
