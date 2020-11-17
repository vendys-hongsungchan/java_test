package test2;

class Person {
    String name;
    int age = 20;

    public Person() {
        this("이름");
    }

    public Person(String name) {
        this.name = name;
    }
    public Person print() {
        return this;
    }

    public void BBB() {
        System.out.println(name);
    }
}

class newPerson extends Person {
    int age = 18;

    public int getAge() {
        return age;
    }

    @Override
    public void BBB() {
        System.out.println(age);
    }
}