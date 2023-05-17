package com.Chevy;

import java.util.LinkedList;

public class swe {

    private LinkedList<employee> company;
    //constructor
    public swe(){
        company = new LinkedList<employee>();
        company.add(new employee("Tim", 34));
    }

    //methods
    public void add(String x, int y){
        employee q  = new employee(x, y);
        company.add(new employee(q.getName(), q.getAge()));
    }

    public void findEmployee(){

    }

    public void removeEmployee(){

    }

public void displayAll(){
        System.out.println("List of employees: ");
        for (int i = 0;i < company.size(); i++)
        System.out.println(company.get(i).getName() + ", " + company.get(i).getAge());
    }

}
