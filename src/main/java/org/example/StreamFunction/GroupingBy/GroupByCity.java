package org.example.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCity {
    public static void main(String[] args) {
        Employee e1=new Employee("Prasiddh","Raipur");
        Employee e2=new Employee("Lucky","Raipur");
        Employee e3=new Employee("Rajul","Pune");
        Employee e4=new Employee("Richa","Pune");

        List<Employee> employees= Arrays.asList(e1,e2,e3,e4);
      Map<String,List<Employee>> groupedBy= employees.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(groupedBy);
    }
}
