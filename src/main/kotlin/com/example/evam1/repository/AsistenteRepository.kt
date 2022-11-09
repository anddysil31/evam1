package com.example.evam1.repository

import com.example.evam1.model.Asistente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface AsistenteRepository:JpaRepository<Asistente, Long> {
    fun findById(id: Long?): Asistente?
}
