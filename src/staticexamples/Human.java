package staticexamples;

public class Human {
    static int pop;
    int age;
    int salary;
    String name;

    Human(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.pop +=1;
    }
}
