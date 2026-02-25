package NUST.UniProject.UniSlotSelection.repository

import com.example.university.entity.CompulsoryCourse
import org.springframework.data.jpa.repository.JpaRepository

interface CompulsoryCourseRepository :
    JpaRepository<CompulsoryCourse, Long> {

    fun findByDegree_DegreeIdAndYear(
        degreeId: Long,
        year: Int
    ): List<CompulsoryCourse>
}