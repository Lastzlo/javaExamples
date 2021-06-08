package org.example.oop.lambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasExample3 {

    //Consumer returns no result
    @Test
    public void createConsumer() {
        // takes a string as the parameter
        Consumer<String> c = System.out::println;

        c.accept("Print this text");

        c = (String s) -> System.out.println(s);

        c.accept("Print this text 2");

        c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        c.accept("Print this text 3");

        c = (s) -> System.out.println(s);
        c = s -> System.out.println(s);

        c.accept("Print this text 4");
    }

    /**Approach 6: Use Standard Functional Interfaces with Lambda Expressions*/
    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Test
    public void run_printPersonsWithPredicate() {
        List<Person> people = Arrays.asList(
                new Person("Person 1", 23, Person.Sex.MALE),
                new Person("Person 2", 43, Person.Sex.MALE),
                new Person("Person 3", 23, Person.Sex.FEMALE),
                new Person("Person 4", 20, Person.Sex.MALE)
        );

        printPersonsWithPredicate(
                people,
                (Person p) -> {
                    return p.getGender() == Person.Sex.MALE
                            && p.getAge() >= 18
                            && p.getAge() <= 25 ;
                }
        );
    }

    @Test
    public void run_printPersonsWithPredicate_withoutWordReturn() {
        List<Person> people = Arrays.asList(
                new Person("Person 1", 23, Person.Sex.MALE),
                new Person("Person 2", 43, Person.Sex.MALE),
                new Person("Person 3", 23, Person.Sex.FEMALE),
                new Person("Person 4", 20, Person.Sex.MALE)
        );

        printPersonsWithPredicate(
                people,
                (Person p) ->
                     (p.getGender() == Person.Sex.MALE)
                            && (p.getAge() >= 18)
                            && (p.getAge() <= 25)
        );
    }

}

class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private int age;
    private String name;
    private Sex gender;

    public Person(String name, int age, Sex gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public void printPerson() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
