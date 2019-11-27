package com.sdrahnea.app.controller

import com.sdrahnea.app.service.AbstractService
import org.springframework.web.bind.annotation.*

abstract class AbstractController<T> {

    private lateinit var service: AbstractService<T>

    @RequestMapping(method = [RequestMethod.GET])
    fun findAll(): List<T> {
        return service.findAll()
    }

    @GetMapping(value = ["/{id}"])
    fun findById(@PathVariable("id") id: Long): T? {
        return service.findById(id)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun save(@RequestBody entity: T){
        service.save(entity)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun deleteAll() {
        service.deleteAll()
    }

    @RequestMapping(method = [RequestMethod.DELETE], value = ["/{id}"])
    fun delete(@PathVariable("id") id: Long) {
        service.delete(id)
    }

}
