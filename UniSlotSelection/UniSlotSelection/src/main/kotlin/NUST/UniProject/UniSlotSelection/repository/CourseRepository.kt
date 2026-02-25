package NUST.UniProject.UniSlotSelection.repository

import NUST.UniProject.UniSlotSelection.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository {
    interface CourseRepository : JpaRepository<Course, Long>
}