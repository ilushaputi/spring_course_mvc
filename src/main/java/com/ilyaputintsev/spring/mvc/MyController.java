package com.ilyaputintsev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        /*Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setSurName("Pupkin");
        employee.setSalary(500);*/

        model.addAttribute("employee", new Employee());

        return "aks-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee){
        String name = employee.getName();
        employee.setName("Mr " + name);

        String surname = employee.getSurName();
        employee.setSurName(surname + "!!!");

        int sal = employee.getSalary();
        employee.setSalary(sal*10);


        return "show-emp-details-view";
    }

}
