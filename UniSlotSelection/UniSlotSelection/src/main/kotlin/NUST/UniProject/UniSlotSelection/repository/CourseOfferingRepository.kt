package NUST.UniProject.UniSlotSelection.repository

import NUST.UniProject.UniSlotSelection.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface CourseOfferingRepository {
    interface CourseOfferingRepository :
        JpaRepository<CourseOffering, Long> {

        fun findByCourse_CourseId(courseId: Long): List<CourseOffering>
    }
}