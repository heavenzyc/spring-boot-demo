package com.heaven.springbootdemo.scala

import org.springframework.stereotype.Service

@Service("studentImpl")
class StudentImpl extends StudentService{
  override def getUserScala(id: Int)= {
    val user = new UserScala
    user.nickName = "zyc"
    user
  }
}
