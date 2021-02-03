package lesson5;

public class Main {

    public static void main(String[] args) {

        Person[] personsArray = new Person[5];
        personsArray[0] = new Person("Ivanov Dmitriy", "director", "email@mail.ru",
                89265648888l,100000, 42);
        personsArray[1] = new Person("Sidorov Oleg", "menedger", "email@mail.ru",
                89265648887l,80000, 48);
        personsArray[2] = new Person("Petrov Semen", "financier", "email@mail.ru",
                89265648886l,90000, 34);
        personsArray[3] = new Person("Ivanova Lidiya", "cleaninig lady", "email@mail.ru",
                89265648885l,40000, 30);
        personsArray[4] = new Person("Ivanov Maksim", "courier", "email@mail.ru",
                89265648884l,50000, 34);

        for(int i = 0; i < personsArray.length; i++) {
            if(personsArray[i].getAge() > 40) {
                System.out.println(Person.infoAboutPerson(personsArray[i]));
                System.out.println();
            }
        }
    }
}
