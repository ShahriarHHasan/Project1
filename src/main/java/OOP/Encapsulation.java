package OOP;

public class Encapsulation {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(25);
        person1.setEmail("<EMAIL>");
        person1.setPhoneNumber(123456789);

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAge(30);
        person2.setEmail("<EMAIL>");
        person2.setPhoneNumber(987654321);

        System.out.println(person1.getName());

        System.out.println(person1.getAge());

        System.out.println(person1.getEmail());
        System.out.println(person1.getPhoneNumber());

        Animal animal1 = new Animal();
        animal1.setAnimalName("Elephant");
        animal1.setAnimalAge(10);

        System.out.println(animal1.getAnimalAge());
        System.out.println(animal1.getAnimalName());





    }


}

class Person{

    private String name;
    private int age;

    private String email;
    private int phoneNumber;


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Animal{

    private String animalName;
    private int animalAge;

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }
    public String getAnimalName() {
        return animalName;
    }
    public int getAnimalAge() {
        return animalAge;
    }
}


