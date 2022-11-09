package com.example.evam1.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.*

@Entity
@Table(name = "asistente")
class Asistente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombres:String? = null
    var email:String? = null
    var institucion:String? = null
    var cargo:String? = null

}