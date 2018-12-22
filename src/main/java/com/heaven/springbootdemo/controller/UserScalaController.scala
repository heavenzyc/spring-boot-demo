package com.heaven.springbootdemo.controller

import com.heaven.springbootdemo.entity.User
import com.heaven.springbootdemo.scala.{Student, StudentImpl, UserScala}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(value = Array("/"))
class UserScalaController @Autowired()(student: Student, studentImpl : StudentImpl){

  @RequestMapping(Array("sc/list")) def getListForScala = {
    student.getAllUser
  }

  @RequestMapping(Array("sc/u")) def getUserForScala: User = student.getUserById(1L)

  @RequestMapping(Array("sc/id"))
  @RequestBody
  def getUserById() = {
//    studentImpl.getUserScala(1)
    studentImpl.getUserById()
  }

  @RequestMapping(Array("sc/us"))
  @RequestBody
  def getUserScala() = {
    val u = studentImpl.getUserScala(1)
    u.nickName
  }
}
