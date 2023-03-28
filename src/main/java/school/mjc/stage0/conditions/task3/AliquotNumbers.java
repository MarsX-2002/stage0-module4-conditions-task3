package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int sum = 0;
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                sum += i;
            }
        }
        if (second == sum) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
