package cn.edu.springboot.controller;

import cn.edu.springboot.dao.DepartmentDao;
import cn.edu.springboot.dao.EmployeeDao;
import cn.edu.springboot.entities.Department;
import cn.edu.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.thymeleaf.model.IModel;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();

        model.addAttribute("emps",employees);
        //model 没讲,跟map差不多

        //thymeleaf会自己拼串
        return "emp/list";

    }
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";

    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("保存信息：" + employee);
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);

        //查页面
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        //二合一页面
        return "emp/add";
    }
    @PutMapping(/emp)
    public String updataEmployee(Employee employee){
        System.out.println("修改数据:"+employee);
        employeeDao.save(employee);
        return "redirect:/emps";

    }

}











//    @GetMapping("/emp")
//    public String toAddPage(){
//        Collection<Department> departments = departmentDao.getDepartments();
////        model.addAttribute("departments",departments);
//        return "emp/add";
//
//    }

