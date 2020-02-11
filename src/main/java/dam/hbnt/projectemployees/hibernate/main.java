/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.hbnt.projectemployees.hibernate;

import dam.hbnt.projectemployees.Program.Program;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scan_opcio = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int opcio, opcio_submenu;
        
        Program program = new Program();
//        program.listDepartments();
//        program.listEmployees();
        //MENU
        do {
            System.out.println("1.Mantenimiento Departamentos."
                    + "\n2.Mantenimiento Empleados."
                    + "\n3.Cerrar programa");
            
            opcio = scan_opcio.nextInt();
            switch (opcio) {
                case 1:
                    System.out.println("1.Crear Departamento."
                            + "\n2.Modificar Departamento."
                            + "\n3.Eliminar Departamento."
                            + "\n4.Buscar Departamento."
                            + "\n5.Salir.");
                    opcio_submenu = scan_opcio.nextInt();
                    switch (opcio_submenu) {
                        
                        case 1:
                            //CREACIÓN DE DEPARTAMENTO
                            program.addDepartments();
                         
                            program.listDepartments();
                            break;
                        case 2:
                            //MODIFICACIÓN DE DEPARTAMENTO
                            break;
                        case 3:
                            //ELIMINAR DEPARTAMENTO
                            break;
                        case 4:
                            //BUSQUEDA DE DEPARTAMENTOS
                            System.out.println("1.Buscar por dept_no completo."
                                    + "\n2.Buscar que empieze por."
                                    + "\n3.Buscar que acabe en."
                                    + "\n4.Mostrar todos."
                                    + "\n5.Salir.");
                            opcio_submenu = scan.nextInt();
                            switch (opcio_submenu) {
                                //Buscar por dept_no completo.
                                case 1:
                                    
                                    break;
                                case 2:
                                    //Buscar que empieze por.

                                    break;
                                case 3:
                                    //Buscar que acabe en.

                                    break;
                                case 4:
                                    //Mostrar todos.

                                    break;
                                case 5:
                                    break;
                            }
                            break;
                        //FIN BUSQUEDA DE DEPARTAMENTOS
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------------------------------------------"
                            + "\n1.Crear Empleado."
                            + "\n2.Modificar Empleado."
                            + "\n3.Eliminar Empleado."
                            + "\n4.Buscar Empleado."
                            + "\n5.Salir"
                            + "\n------------------------------------------------------------------------");
                    opcio_submenu = scan.nextInt();
                    switch (opcio_submenu) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            //BUSQUEDA EMPLEADOS
                            System.out.println("Busqueda:"
                                    + "\n1.Buscar por emp_no completo."
                                    + "\n2.Buscar que empieze por."
                                    + "\n3.Buscar que acabe en."
                                    + "\n4.Mostrar todos."
                                    + "\n5.Salir");
                            
                            System.out.println("Quina opció vols:");
                            opcio_submenu = scan.nextInt();
                            switch (opcio_submenu) {
                                case 1:
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    
                                    break;
                                case 4:
                                    
                                    break;
                                case 5:
                                    break;
                                
                            }                            
                            break;
                        case 5:
                            break;
                        //FIN BUSQUEDA DE EMPLEADOS
                    }
                    
                    break;
                case 3:                    
                    System.exit(0);
                    break;

                //FIN MENU
            }
            
        } while (true);
       
        
    }
    
}
