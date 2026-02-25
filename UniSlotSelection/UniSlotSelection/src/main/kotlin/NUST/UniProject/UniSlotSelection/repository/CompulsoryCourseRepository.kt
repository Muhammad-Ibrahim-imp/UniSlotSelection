package NUST.UniProject.UniSlotSelection.repository

import NUST.UniProject.UniSlotSelection.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface CompulsoryCourseRepository {
    interface CompulsoryCourseRepository :
        JpaRepository<CompulsoryCourse, Long> {

        fun findByDegree_DegreeIdAndYear(
            degreeId: Long,
            year: Int
        ): List<CompulsoryCourse>
    }
}