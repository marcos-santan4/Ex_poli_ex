package Atividade.Ex01.Application;

import Atividade.Ex01.Entities.Employee;
import Atividade.Ex01.Entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Employee> employee = new ArrayList<>(); // Tambem funciona
        List<Employee> employee = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char res = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(res == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                employee.add(new OutsourceEmployee(name, hours, valuePerHour, additional)); // UpCast
            } else {
                employee.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for(Employee emp : employee) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
