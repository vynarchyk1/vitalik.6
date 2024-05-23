public abstract class Task4 {
    public String model;
    public String color;
    public int maxSpeed;

    public Task4(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Поїхали!");
    }

    public abstract void brake();
}