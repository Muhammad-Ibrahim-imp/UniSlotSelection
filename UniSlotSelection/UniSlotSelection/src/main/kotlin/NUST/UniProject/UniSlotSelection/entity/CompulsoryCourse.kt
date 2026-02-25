package com.example.university.entity

import NUST.UniProject.UniSlotSelection.entity.*
import jakarta.persistence.*

@Entity
@Table(name = "compulsory_courses")
data class CompulsoryCourse(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "degree_id", nullable = false)
    val degree: DegreeProgram,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    val course: Course,

    @Column(nullable = false)
    val year: Int
)