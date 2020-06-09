package com.example.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class stuffController {

    @Autowired
    private StuffRepository stuffRepository;

    /*
     获取所有职员列表
     */
    @GetMapping(value = "/stuffs")
    public List<Stuff> stuffs(){
        return stuffRepository.findAll();
    }

    /*
    添加一位职员
     */

    @PostMapping(value = "/stuffs")
    public Stuff stuffAdd(@RequestParam("status") String status,
                          @RequestParam("age") int age,
                          @RequestParam("askForLeave") String aFL,
                          @RequestParam("depart") String depart) {
    Stuff stuff = new Stuff();
    stuff.setStatus(status);
    stuff.setAge(age);
    stuff.setAskForLeave(aFL);
    stuff.setDepart(depart);

    return stuffRepository.save(stuff);
    }

    /*
    通过id查询职员
     */

    @GetMapping(value = "/stuffs/{id}")
    public Stuff findStuff(@PathVariable("id") int id){
        if(stuffRepository.findById(id).isPresent()) {
            return stuffRepository.findById(id).get();
        }else return null;
    }

    /*
    通过年龄查询职员
     */
    @GetMapping(value = "/stuffs/age/{age}")
    public List<Stuff> stuffListByAge(@PathVariable("age") int age){
        return stuffRepository.findByAge(age);
    }


    /*
    通过职位查询职员
     */
    @GetMapping(value = "/stuffs/depart/{depart}")
    public List<Stuff> stuffListByAge(@PathVariable("depart") String depart){
        return stuffRepository.findByDepart(depart);
    }

    /*
    通过id更新职员信息
     */
    @PutMapping(value = "/update/{id}")
    public Stuff stuffUpdate(@PathVariable("id") int id,
                            @RequestParam("status") String status,
                            @RequestParam("age") int age,
                             @RequestParam("askForLeave") String aFL,
                             @RequestParam("depart") String depart) {
        Stuff stuff = new Stuff();
        stuff.setId(id);
        stuff.setStatus(status);
        stuff.setAge(age);
        stuff.setAskForLeave(aFL);
        stuff.setDepart(depart);

        return   stuffRepository.save(stuff);
    }



    /*
    通过id删除一位职员
     */

    @DeleteMapping(value = "/stuffs/{id}")
    public void deleteStuff(@PathVariable("id") int id){
        stuffRepository.deleteById(id);
    }
}
