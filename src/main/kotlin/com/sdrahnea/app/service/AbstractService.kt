package com.sdrahnea.app.service

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

abstract class AbstractService<T> {

    private lateinit var repository: CrudRepository<T, Long>

    fun findAll(): List<T> {
        return repository.findAll() as List<T>
    }

    fun findById(id: Long): T? {
        return repository.findByIdOrNull(id)
    }

    fun save(entity: T): T {
        return repository.save(entity)
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }

    fun deleteAll(){
        repository.deleteAll()
    }

    fun delete(entity: T) {
        repository.delete(entity)
    }

    fun count(): Long {
        return repository.count()
    }

}