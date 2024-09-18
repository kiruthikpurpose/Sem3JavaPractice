class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPersonDetails() {
        return "Person Name: " + name + ", Age: " + age;
    }

    public void updateAge(int newAge) {
        this.age = newAge;
    }

    public static class PersonProcessor {
        public Person updatePerson(Person person) {
            person.updateAge(person.age + 1);
            person.name += " Updated";
            return person;
        }
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", 25);
        PersonProcessor processor = new PersonProcessor();
        Person updatedAlice = processor.updatePerson(alice);
        System.out.println(updatedAlice.getPersonDetails());

        Person bob = new Person("Bob", 30);
        Person updatedBob = processor.updatePerson(bob);
        System.out.println(updatedBob.getPersonDetails());

        Person charlie = new Person("Charlie", 40);
        Person updatedCharlie = processor.updatePerson(charlie);
        System.out.println(updatedCharlie.getPersonDetails());
    }
}
