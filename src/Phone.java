public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")");
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... numbers) {
        System.out.print("Номера телефонів для відправки повідомлення: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("0957654887", "Xiaomi", 0.7);
        Phone phone2 = new Phone("0976356765", "Iphone", 0.3);
        Phone phone3 = new Phone("0934565444", "Samsung", 0.2);

        System.out.println("Телефон 1: номер - " + phone1.getNumber() + ", модель - " + phone1.model + ", вага - " + phone1.weight);
        System.out.println("Телефон 2: номер - " + phone2.getNumber() + ", модель - " + phone2.model + ", вага - " + phone2.weight);
        System.out.println("Телефон 3: номер - " + phone3.getNumber() + ", модель - " + phone3.model + ", вага - " + phone3.weight);

        phone1.receiveCall("Vinarchik Vitaliy", "0934565444");
        phone2.receiveCall("Zadorogniy Mihaylo", "0957654887");
        phone3.receiveCall("Ostap Grigorskiy", "0976356765");

        phone2.sendMessage("0957654887", "," , "0976356765");
    }
}