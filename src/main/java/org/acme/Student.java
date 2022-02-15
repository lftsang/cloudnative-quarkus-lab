package org.acme;

public class Student {
    private String name;
    private String gender;
    private String year;

    public Student(String name, String gender , String year) {
        this.name = name;
        this.gender = gender;
        this.year = year;
    }

    public String getGender() {
        return gender;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
