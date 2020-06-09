package com.example.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StuffRepository extends JpaRepository<Stuff,Integer>{

    //通过年龄来查询
    public List<Stuff> findByAge(int age);

    public List<Stuff> findByDepart(String depart);
}
