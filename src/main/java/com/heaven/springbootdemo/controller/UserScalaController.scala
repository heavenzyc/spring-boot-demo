package com.heaven.springbootdemo.controller

import java.util

import com.heaven.springbootdemo.entity.User
import com.heaven.springbootdemo.scala.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(value = Array("/"))
class UserScalaController @Autowired()(student: Student){

  @RequestMapping(Array("sc/list")) def getListForScala = {
    student.getAllUser
  }

  @RequestMapping(Array("sc/u")) def getUserForScala: User = student.getUserById(1L)
}
