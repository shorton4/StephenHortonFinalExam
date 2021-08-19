package com.example.StephenHorton_300137662;

public class Loan {
    private String clientno;
    private String clientname;
    private double loanamount;
    private int years;
    private String loantype;

    public Loan(String clientno, String clientname, double loanamount, int years, String loantype) {
        this.clientno = clientno;
        this.clientname = clientname;
        this.years = years;
        this.loantype = loantype;
    }
    public String getclientno() {
        return clientno;
    }
    public void setclientno(String clientno) {
        this.clientno = clientno;
    }
    public String getclientname(){
        return clientname;
    }
    public void setclientname(String clientname){
        this.clientname = clientname;
    }
    public double getloanamount(){
        return loanamount;
    }
    public void setloanamount(double loanamount){
        this.loanamount = loanamount;
    }
    public int getyears(){
        return years;
    }
    public void setyear(int years){
        this.years = years;
    }
    public String getloantype(){
        return loantype;
    }
    public void setloantype(String loantype){
        this.loantype =  loantype;
    }


}
