package com.example.StephenHorton_300137662;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SessionAttributes({"clientno","clientname","loanamount","years","loantype","errMsg"})

@RequestMapping

@Controller
public class controller {

    @Autowired
    LoanService service;

//    @Autowired
//    DatabaseService databaseService;

    @RequestMapping(value = "/loan", method = RequestMethod.GET)
    public String showLoanPage(ModelMap model,@RequestParam(defaultValue = "") String clientno) {
        model.addAttribute("todos", service.retrieveTodos());
        List<Loan> filteredTodos = new ArrayList<Loan>();
        filteredTodos = (List) model.get("todos");
        model.put("clientno",filteredTodos.get(0).getclientno());
        model.put("clientname",filteredTodos.get(0).getclientname());
        return "loan";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoanPage2(ModelMap model) {
        model.addAttribute("todos", service.retrieveTodos());
        List<Loan> filteredTodos = new ArrayList<Loan>();
        filteredTodos = (List) model.get("todos");
        model.put("clientno",filteredTodos.get(0).getclientno());
        model.put("clientname",filteredTodos.get(0).getclientname());
        return "loan";

    }

    @RequestMapping(value ="/add-todo", method = RequestMethod.GET)
    public String showtodopage(){
        return "loanser";
    }


    @RequestMapping(value ="/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestParam String clientno, @RequestParam String clientname, @RequestParam double loanamount, @RequestParam int years, @RequestParam String loantype){
        service.addTodo(clientno,clientname, loanamount,years,loantype);
        model.clear();
        return "redirect:/loan";
    }


    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(ModelMap model,  @RequestParam(defaultValue = "") String clientno){
        model.put("clientno", clientno);
        Loan x = service.retrieve(clientno);
        model.put("clientno",x.getclientno());
        model.put("clientname", x.getclientname());
        model.put("loanamount", x.getloanamount());
        model.put("years", x.getyears());
        model.put("loantype", x.getloantype());
        return "loanedit";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String showUpdate(ModelMap model, @RequestParam String clientno, @RequestParam String clientname, @RequestParam double loanamount, @RequestParam int years, @RequestParam String loantype) {
        String iid = (String) model.get("clientno");
        service.deleteTodo(iid);
        service.addTodo(clientno,clientname,loanamount,years,loantype);
        return "redirect:/";

    }

    @RequestMapping(value ="/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(ModelMap model, @RequestParam String clientno) throws SQLException, ClassNotFoundException {
        service.deleteTodo(clientno);
        model.clear();
        return "redirect:/";
    }

}


