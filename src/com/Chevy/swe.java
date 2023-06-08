package com.Chevy;

import java.util.LinkedList;
import java.util.HashMap;

public class swe {

    private LinkedList<HashMap<employee, engProject>> company;

    //constructor
    public swe(){

        company = new LinkedList<>();

    }

    //methods
    public void add(String name, int age, String pname, int pcost){
        employee q  = new employee(name, age);
        engProject p = new engProject(pname, pcost);

        HashMap<employee, engProject> temp = new HashMap<>();
        temp.put(q, p);
        company.add(temp);
    }

    public void findEmployee(String x){

        for (int i = 0; i < company.size(); i++){

        }
    }

    public void removeEmployee(){

    }

public void display(){
        System.out.println("List of employees: ");
        for (int i = 0;i < company.size(); i++)
        System.out.println(company.get(i).get(i));
    }

}
