package NUST.UniProject.UniSlotSelection.controller


import NUST.UniProject.UniSlotSelection.service.CompulsoryCourseService
import com.example.university.entity.CompulsoryCourse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("compulsory-course")
class CompulsoryCourseController(
    private val compulsoryCourseService: CompulsoryCourseService
){
    //Get compulsory courses by degree and year
    @GetMapping("/filter")
    fun getByDegreeAndYear(
        @RequestParam degreeId: Long,
        @RequestParam year: Int
    ): List<CompulsoryCourse>{
        return compulsoryCourseService.getByDegreeAndYear(degreeId, year)
    }

    //Get all compulsory courses
    @GetMapping
    fun getAll():List<CompulsoryCourse>{
        return compulsoryCourseService.getAllCourses()
    }
    //Add compulsory course (for testing/admin)
    @PostMapping
    fun create(
        @RequestBody course: CompulsoryCourse
    ): CompulsoryCourse{
        return compulsoryCourseService.saveCourse(course)
    }

    //Delete compulsory course
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long){
        compulsoryCourseService.deleteCourse(id)
    }
}