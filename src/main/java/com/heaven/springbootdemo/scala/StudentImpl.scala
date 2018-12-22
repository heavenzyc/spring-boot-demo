package com.heaven.springbootdemo.scala

import java.{lang, util}

import com.heaven.springbootdemo.dao.UserMapper
import com.heaven.springbootdemo.entity.User
import com.heaven.springbootdemo.service.UserService
import javax.annotation.Resource
import org.springframework.stereotype.Service

@Service("studentImpl")
class StudentImpl @Resource()(userMapper: UserMapper) extends StudentService {
  /*override def getUserScala(id: Int)= {
    val user = new UserScala
    user.nickName = "zyc"
    user
  }*/
  def getUserById() = {
    userMapper.selectByPrimaryKey(1L)
  }

  override def getUserScala(id: Int): UserScala = {
    val user = new UserScala
    user.nickName = "zyc"
    user
  }
}
