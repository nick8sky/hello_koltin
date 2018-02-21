package org.kx.de

import org.kx.de.dal.UserMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 *
 *create by sunkx on 2018/2/21
 */

@RestController
@RequestMapping(value = "/")
class DataController {

    @Resource
    lateinit var userMapper: UserMapper

    @RequestMapping( "i")
    fun test():String{
        return "hello koltin ."
    }

    @RequestMapping( "user")
    fun add() {
        userMapper.insert(User(null,"test","123456"))
    }

    @RequestMapping( "get")
    fun get():User {
        return userMapper.get(User(1))
    }

}


data class User(var id: Long? = -1, var username: String = "", val password: String? = "")