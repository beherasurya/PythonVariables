package com.cab.book.user.demo.streamAPI;

import com.cab.book.user.demo.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code8 {
    public static void main(String[] args) {

        //Top 3 highest paid salary by dept
        List<Employee> list = Arrays.asList(
                new Employee(1,"IT","Rahul",50000),
                new Employee(2,"IT","Rahul",120000),
                new Employee(3,"Finance","Rahul",30000),
                new Employee(4,"Finance","Rahul",90000),
                new Employee(5,"HR","Rahul",35000),
                new Employee(8,"HR","Rahul",45000),
                new Employee(9,"TA","Rahul",50000)
        );
        List<Employee> empList = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed())
                .filter(emp -> emp.getDept().equals("IT"))
                .limit(3)
                .collect(Collectors.toList())
                ;
//        System.out.println(empList);
        Map<String,List<Employee>> empList2 = list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(empList2);

        //Find Total salary for Each Dept.
       Map<String,Double> map =  list.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.summingDouble(Employee::getSalary)));
//       System.out.println(map);


       //Highest Paid  Employee
        Employee emp =list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst().get();
        emp = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
//        System.out.println(emp);

        Map<String,List<Employee>> employeeList = list.stream().collect(Collectors
                .groupingBy(Employee::getDept,
               Collectors.toList()));
        System.out.println(employeeList);
    }
}
