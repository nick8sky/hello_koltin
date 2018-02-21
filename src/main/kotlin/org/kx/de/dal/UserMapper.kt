package org.kx.de.dal

/**
 *
 *create by sunkx on 2018/2/21
 */


import org.kx.de.User



interface UserMapper {

    fun insert(oper: User): Int

    operator fun get(oper: User): User

}