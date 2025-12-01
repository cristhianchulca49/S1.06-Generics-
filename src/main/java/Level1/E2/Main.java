package Level1.E2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Maria", "Gonzalez", 25);
        String level = "level 1";
        double height = 1.25;
        GenericMethods.printGenericMethod(person1, level, height);
        GenericMethods.printGenericMethod(level, height , person1);
    }
}
