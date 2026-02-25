package NUST.UniProject.UniSlotSelection.repository

import NUST.UniProject.UniSlotSelection.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long> {
    fun findByEmail(email: String): Student?
}