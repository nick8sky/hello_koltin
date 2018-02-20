package org.kx.de

/**
 *
 *create by sunkx on 2018/2/20
 */

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
open class DemoBootApplication

    fun main(args: Array<String>){
        SpringApplication.run(DemoBootApplication::class.java,*args)
    }



