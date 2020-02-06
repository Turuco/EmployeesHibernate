/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.hbnt.projectemployees.Program;


import dam.hbnt.projectemployees.programa.model.Departments;

import java.util.List;
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

    
    public Program() {
        factory=HibernateUtil.getSessionFactory();
        sesion=factory.openSession();
    }
    public void listDepartments() {
        Query query = sesion.createQuery("Select d from Departments d");
        List<Departments> depts = query.list();
        depts.forEach((dept) -> {
            System.out.println(dept.toString());
        });

    }
    public void addDepartments(String deptNo,String deptName){
          sesion.beginTransaction();
          sesion.save(new Departments(deptNo, deptName));
          sesion.getTransaction().commit();
    }
    
}
