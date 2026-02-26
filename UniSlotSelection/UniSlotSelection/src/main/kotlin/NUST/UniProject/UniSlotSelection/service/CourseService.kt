package NUST.UniProject.UniSlotSelection.service

import NUST.UniProject.UniSlotSelection.entity.*
import NUST.UniProject.UniSlotSelection.repository.*
import com.example.university.entity.CompulsoryCourse
import org.springframework.stereotype.Service

@Service
class CourseService(
    private val courseRepository: CourseRepository
) {

    fun saveCourse(course: Course): Course {
        return courseRepository.save(course)
    }

    fun getAllCourses(): List<Course> {
        return courseRepository.findAll()
    }

    fun getCourseById(id: Long): Course? {
        return courseRepository.findById(id).orElse(null)
    }

    fun deleteCourse(id: Long) {
        courseRepository.deleteById(id)
    }
}