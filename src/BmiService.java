public class BmiService {
    public int calculate(double weight,double height) {
        double height2 = Math.pow(height, 2);
        double bmi = weight / height2;
        return (int) bmi;
    }

}
