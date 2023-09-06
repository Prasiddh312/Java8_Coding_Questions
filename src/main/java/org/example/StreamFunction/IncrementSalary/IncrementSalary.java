package org.example.IncrementSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncrementSalary {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<Employee>();
        Employee e1= new Employee("Prasiddh",24,16000);
        Employee e2= new Employee("Rajul",26,10000);
        Employee e3= new Employee("Richa",27,15000);
        Employee e4= new Employee("Shreyansh",25,12000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Salaries before Increment");
        System.out.println(employees);

        List<Employee> increment=employees.stream().map(e->{
            if(e.getAge()>25){
                e.setSalary(e.getSalary()*1.1);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println("Salaries after Increment");
        System.out.println(increment);
    }
}
