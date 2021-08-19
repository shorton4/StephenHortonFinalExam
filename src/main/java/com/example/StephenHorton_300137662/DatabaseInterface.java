package com.example.StephenHorton_300137662;


import java.sql.SQLException;

import java.util.List;


public interface DatabaseInterface {
    public void add(Loan loan) throws ClassNotFoundException, SQLException;
    public Loan edit(Loan loan, String clientno) throws SQLException, ClassNotFoundException;
    public void delete(String clientno) throws SQLException;
    public List<Loan> display() throws ClassNotFoundException, SQLException;
}

