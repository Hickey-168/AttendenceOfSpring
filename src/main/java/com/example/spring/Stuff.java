package com.example.spring;


import javax.persistence.*;

@Entity
public class Stuff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String status;

    private Integer age;

    private String depart;

    private String askForLeave;

    public Stuff(){

    }


    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getAskForLeave() {
        return askForLeave;
    }

    public void setAskForLeave(String askForLeave) {
        this.askForLeave = askForLeave;
    }
}
