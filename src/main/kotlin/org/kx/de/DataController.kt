package org.kx.de

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/**
 *
 *create by sunkx on 2018/2/21
 */

@RestController
@RequestMapping(value = "/")
class DataController {



    @RequestMapping( "i")
    fun test():String{
        return "hello koltin ."
    }
}
