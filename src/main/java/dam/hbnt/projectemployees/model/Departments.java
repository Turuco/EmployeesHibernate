package dam.hbnt.projectemployees.model;
// Generated 5 de febr. 2020, 13:17:50 by Hibernate Tools 4.3.1



/**
 * Departments generated by hbm2java
 */
public class Departments  implements java.io.Serializable {


     private String deptNo;
     private String deptName;

    public Departments() {
    }

    public Departments(String deptNo, String deptName) {
       this.deptNo = deptNo;
       this.deptName = deptName;
    }
   
    public String getDeptNo() {
        return this.deptNo;
    }
    
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }
    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }




}


