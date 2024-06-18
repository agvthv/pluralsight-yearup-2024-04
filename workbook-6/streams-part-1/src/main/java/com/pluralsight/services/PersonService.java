package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService
{
    public List<Person> findPeople(List<Person> people, String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeople(List<Person> people, int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() == age) {
                result.add(person);
            }
        }
        return result;
    }

    public int calculateAverageAge(List<Person> people) {
        if (people.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum / people.size();
    }

    public int findOldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    public int findYoungestAge(List<Person> people) {
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people) {
        List<Person> sortedPeople = new ArrayList<>(people);
        Collections.sort(sortedPeople, Comparator.comparingInt(Person::getAge));
        return sortedPeople;
    }

    public List<Person> sortOldestFirst(List<Person> people) {
        List<Person> sortedPeople = new ArrayList<>(people);
        Collections.sort(sortedPeople, (p1, p2) -> p2.getAge() - p1.getAge());
        return sortedPeople;
    }

    public List<Employee> createEmployees(List<Person> people) {
        List<Employee> employees = new ArrayList<>();
        for (Person person : people) {
            int salary = person.getAge() * 3000;
            employees.add(new Employee(person.getFirstName(), person.getLastName(), person.getAge(), salary));
        }
        return employees;
    }
}

