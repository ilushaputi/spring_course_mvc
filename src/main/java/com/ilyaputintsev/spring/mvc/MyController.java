package com.ilyaputintsev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee
    , BindingResult bindingResult){

     //   System.out.println("surname length = " + employee.getSurName().length());

        if (bindingResult.hasErrors()) return  "aks-emp-details-view";
        else return "show-emp-details-view";
    }

}
