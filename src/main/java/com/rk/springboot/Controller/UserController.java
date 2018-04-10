package com.rk.springboot.Controller;

import com.rk.springboot.entity.user;
import com.rk.springboot.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询列表
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<user> list(){
        return userJPA.findAll();
    }
	
	 /**
     * 11111111111
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<user> list(){
        return userJPA.findAll();
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public user save(user entity){

        return userJPA.save(entity);
    }

   /* *//**
     * 删除
     * @return
     *//*
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<user> delete(Long id){
        userJPA.delete(id);
        return userJPA.findAll();
    }*/

}
