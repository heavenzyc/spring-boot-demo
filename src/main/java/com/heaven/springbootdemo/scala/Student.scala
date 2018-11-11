package com.heaven.springbootdemo.scala

import java.{lang, util}

import com.heaven.springbootdemo.dao.UserMapper
import com.heaven.springbootdemo.entity.User
import com.heaven.springbootdemo.service.UserService
import javax.annotation.Resource
import org.springframework.stereotype.Service

@Service("student")
class Student extends UserService {
  var nickName : String = "_V2"
  def sayName(name:String): String = {
    nickName = "_v3"
    return name + "_V1" + nickName
  }

  @Resource private val userMapper: UserMapper = null

  override def getAllUser: util.List[User] = userMapper.selectAllUser()

  override def getUserById(id: lang.Long): User = userMapper.selectByPrimaryKey(id:Long)

  override def insertUser(user: User): Int = userMapper.insert(user: User)
}
