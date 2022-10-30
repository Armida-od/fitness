public class fitnessMain {

    public static void main(String[] args) {

        Person viktor = new Person("Viktor", "Buryak", 25, 1, 1987, "viktor_b@mail.com", "+380631234578", 75.0, 110, 10010);
        viktor.printAccountInfo();
        Person alex = new Person("Alex", "Green", 13, 10, 1990, "alex_g@mail.com", "+12139056321", 88.3, 105, 8050);
        alex.printAccountInfo();
        Person max = new Person("Maxim", "Ivanov", 01, 06, 1989, "max_i@mail.com", "+380506932312", 101.5, 130, 8050);
        max.printAccountInfo();

        viktor.setSurname("Svekla");
        viktor.setWeight(93.4);
        viktor.setSteps(8532);
        viktor.printAccountInfo();

        max.setSurname("Petrov");
        max.setWeight(93.2);
        max.setSteps(12532);
        max.setPressure(150);
        max.printAccountInfo();
    }

}
//