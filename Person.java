
public class Person {
    private final String name;
    private String surname;
    private final int dateBD;
    private final int monthBD;
    private final int yearBD;
    private final String email;
    private final String phone;
    private double weight;
    private int pressure;
    private int steps;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateBD() {
        return dateBD;
    }

    public int getMonthBD() {
        return monthBD;
    }

    public int getYearBD() {
        return yearBD;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
	        return 2022 - yearBD;
	    }

    public Person(String name, String surname, int dateBD, int monthBD, int yearBD, String email, String phone, double weight, int pressure, int steps
    ) {
        this.name = name;
        this.surname = surname;
        this.dateBD = dateBD;
        this.monthBD = monthBD;
        this.yearBD = yearBD;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void printAccountInfo() {
        //System.out.println("--==New account:==--");
        System.out.println(
                "Name: " + getName() + "\n" +
                        "Surname: " + getSurname() + "\n" +
                        "Date Of Birth: " + getDateBD() + "/" + getMonthBD() + "/" + getYearBD() + "\n" +
                        "Email: " + getEmail() + "\n" +
                        "Phone number: " + getPhone() + "\n" +
                        "Age: " + getAge() + " years\n" +
                        "Weight: " + getWeight() + " kg" + "\n" +
                        "Pressure: " + getPressure() + " mm. rt. Art." + "\n" +
                        "Count of steps: " + getSteps() + "\n-----------------------------\n");
    }

}
