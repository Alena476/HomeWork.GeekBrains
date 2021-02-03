package lesson5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private long numberPhone;
    private long salary;
    private int age;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Недопустимый возраст");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person (String fullName, String position, String email, long numberPhone, long salary, int age) {
        setFullName(fullName);
        setPosition(position);
        setEmail(email);
        setNumberPhone(numberPhone);
        setSalary(salary);
        setAge(age);
    }

    public static String infoAboutPerson(Person person) {
        return "FullName: " + person.fullName +  "\nPosition: " + person.position + "\nEmail: " + person.email + "\nNumber: "
                + person.numberPhone + "\nSalary: " + person.salary + "\nAge: " + person.age;
    }
}
