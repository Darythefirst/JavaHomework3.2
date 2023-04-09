public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60.5; // вес в кг
        double height = 1.60; //рост в метрах
        int bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + bmi);

    }
}