package NUST.UniProject.UniSlotSelection.service

import NUST.UniProject.UniSlotSelection.entity.*
import NUST.UniProject.UniSlotSelection.repository.*
import org.springframework.stereotype.Service

@Service
class CourseService(
    private val compulsoryRepo: CompulsoryCourseRepository,
    private val courseRepo: CourseRepository
) {

    fun getCompulsoryCourses(degreeId: Long, year: Int): List<Course> {
        return compulsoryRepo
            .findByDegree_DegreeIdAndYear(degreeId, year)
            .map { it.course }
    }
}