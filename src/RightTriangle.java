import java.util.Scanner;

public class RightTriangle {
    private final double cathetus1;
    private final double cathetus2;

    // Конструктор класу
    public RightTriangle(double cathetus1, double cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    // Метод для обчислення гіпотенузи
    public double calculateHypotenuse() {
        return Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
    }

    // Метод для обчислення синуса першого кута
    public double calculateSinFirstAngle() {
        return cathetus1 / calculateHypotenuse();
    }

    // Метод для обчислення косинуса першого кута
    public double calculateCosFirstAngle() {
        return cathetus2 / calculateHypotenuse();
    }

    // Метод для обчислення тангенса першого кута
    public double calculateTanFirstAngle() {
        return cathetus1 / cathetus2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину першого катета:");
        double cathetus1 = scanner.nextDouble();

        System.out.println("Введіть довжину другого катета:");
        double cathetus2 = scanner.nextDouble();

        RightTriangle triangle = new RightTriangle(cathetus1, cathetus2);

        System.out.println("Гіпотенуза: " + triangle.calculateHypotenuse());
        System.out.println("Синус першого кута: " + triangle.calculateSinFirstAngle());
        System.out.println("Косинус першого кута: " + triangle.calculateCosFirstAngle());
        System.out.println("Тангенс першого кута: " + triangle.calculateTanFirstAngle());

        scanner.close();
    }
}
