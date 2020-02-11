/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.hbnt.projectemployees.Program;

import dam.hbnt.projectemployees.programa.model.Departments;
import dam.hbnt.projectemployees.programa.model.Employees;
import java.util.Date;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumne
 */
public class Program {

    private SessionFactory factory = null;
    private Session sesion = null;
    Scanner scan, s_line;

    public Program() {
        factory = HibernateUtil.getSessionFactory();
        sesion = factory.openSession();
        scan = new Scanner(System.in);
        s_line = new Scanner(System.in);
    }

    //---------------METODES PER A DEPARTAMENTS---------------
    public void listDepartments() {
        Query query = sesion.createQuery("Select d from Departments d");
        List<Departments> depts = query.list();
        depts.forEach((dept) -> {
            System.out.println(dept.toString());
        });

    }

    public void addDepartments() {
        String deptNo = null, deptName = null;
        System.out.println("dept_no: (Ejemplo: d009)");
        deptNo = scan.nextLine();
        System.out.println("dept_name: (Ejemplo: Customer Service)");
        deptName = scan.nextLine();
        sesion.beginTransaction();
        sesion.save(new Departments(deptNo, deptName));
        sesion.getTransaction().commit();
    }

    //---------------METODES PER A EMPLEATS---------------
    public void addEmployees() {
        int empNo = 0;
        String firstName, lastName, birthDate, hireDate, gender;

        empNo += 1;

        System.out.println("Nom:");
        firstName = s_line.nextLine();

        System.out.println("Apellidos:");
        lastName = s_line.nextLine();
        do {
            System.out.println("Genero:");
            gender = scan.next().toUpperCase();

            if (gender.equals("F") || gender.equals("M")) {
                break;
            }
        } while (!gender.equals("F") || !gender.equals("M"));

        System.out.println("Fecha de nacimiento:(2020-12-31)");
        birthDate = s_line.nextLine();

        System.out.println("Fecha de contratación:(2020-12-31)");
        hireDate = s_line.nextLine();
        
        
    }
    public int employeesList(){
          int empNo=0;
        Query query=sesion.createQuery("select e from Employees e");
        List <Employees> employees = query.list() ;
        employees.forEach((employes) -> {
            int emp_No=employes.getEmpNo();
         
        });
        
    return empNo;
    }
    public void listEmployees() {
        Query query = sesion.createQuery("Select e from Employees e");
        List<Employees> employees = query.list();
        employees.forEach((employes) -> {
            System.out.println(employees.toString());
        });

    }

}
