package com.example.StephenHorton_300137662;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class LoanService {


        private static List<Loan> todos = new ArrayList<Loan>();
        static {
            todos.add(new Loan("A1", "John", 5, "Business"));
            todos.add(new Loan("B2", "Drinks", 2, "Business"));
        }

        public void initialadd(){
            todos.add(new Loan("A1", "John", 5, "Business"));
            todos.add(new Loan("B2", "Drinks", 2, "Business"));
        }


        public List<Loan> retrieveTodos() {
            List<Loan> filteredTodos = new ArrayList<Loan>();
            for (Loan todo : todos) {
                filteredTodos.add(todo);
            }
            return filteredTodos;
        }


        public void addTodo(String clientno, String clientname, int years, String loantype) {
            todos.add(new Loan( clientno,  clientname,  years,  loantype));
        }

        public void deleteTodo(String id) {
            for (int i = 0; i < todos.size(); i++) {
                if(id.equals(todos.get(i).getclientno())) {
                    todos.remove(i);
                    break;
                }
            }
        }

        public Loan retrieve(String id){
            for(Loan todo: todos){
                if(todo.getclientno().equals(id)){
                    return todo;
                }
            }
            return null;
        }

        public void update(Loan todo){
            todos.remove(todo);
            todos.add(todo);
        }
}




