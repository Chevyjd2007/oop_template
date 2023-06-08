package com.Chevy;

public class engProject {
    private String projectName;
    private int projectCost;

    public engProject(String projectName, int projectCost){
        this.projectName = projectName;
        this.projectCost = projectCost;
    }

    public String getprojectName(){
        return projectName;
    }
    public double getprojectCost(){
        return projectCost;
    }

    public void setprojectName(){
        this.projectName = projectName;
    }
    public void setprojectCost(){
        this.projectCost = projectCost;
    }

}
