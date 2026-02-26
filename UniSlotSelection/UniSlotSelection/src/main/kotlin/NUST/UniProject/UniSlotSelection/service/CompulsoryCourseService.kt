package NUST.UniProject.UniSlotSelection.service

import NUST.UniProject.UniSlotSelection.repository.CompulsoryCourseRepository
import com.example.university.entity.CompulsoryCourse
import org.springframework.stereotype.Service

@Service
class CompulsoryCourseService(
    private val compulsoryCourseRepository: CompulsoryCourseRepository
) {

    fun saveCourse(course: CompulsoryCourse): CompulsoryCourse {
        return compulsoryCourseRepository.save(course)
    }

    fun getAllCourses(): List<CompulsoryCourse> {
        return compulsoryCourseRepository.findAll()
    }

    fun getByDegreeAndYear(degreeId: Long, year: Int): List<CompulsoryCourse> {
        return compulsoryCourseRepository
            .findByDegree_DegreeIdAndYear(degreeId, year)
    }

    fun deleteCourse(id: Long) {
        compulsoryCourseRepository.deleteById(id)
    }
}