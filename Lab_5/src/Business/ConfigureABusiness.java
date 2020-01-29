/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        LabOrganization labOrganization = new LabOrganization();
        
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        
        Employee adminEmployee = new Employee();
        adminEmployee.setName("Abc Xyz");
        UserAccount adminAccount = new UserAccount();
        adminAccount.setUsername("admin");
        adminAccount.setPassword("admin");
        adminAccount.setRole("Admin");
        adminAccount.setEmployee(adminEmployee);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(adminEmployee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(adminAccount);
        
        Employee doctorEmployee = new Employee();
        doctorEmployee.setName("Jackie");
        UserAccount doctorAccount = new UserAccount();
        doctorAccount.setUsername("doctor");
        doctorAccount.setPassword("doctor");
        doctorAccount.setRole("Doctor");
        doctorAccount.setEmployee(doctorEmployee);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(doctorEmployee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(doctorAccount);
        
        Employee labEmployee = new Employee();
        labEmployee.setName("Ben");
        UserAccount labAccount = new UserAccount();
        labAccount.setUsername("lab");
        labAccount.setPassword("lab");
        labAccount.setRole("Lab");
        labAccount.setEmployee(labEmployee);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(labEmployee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(labAccount);
        
        return business;
    }
    
}
