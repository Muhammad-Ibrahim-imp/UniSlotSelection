package NUST.UniProject.UniSlotSelection.service

import NUST.UniProject.UniSlotSelection.entity.Enrollment
import NUST.UniProject.UniSlotSelection.repository.CourseOfferingRepository
import NUST.UniProject.UniSlotSelection.repository.EnrollmentRepository
import NUST.UniProject.UniSlotSelection.repository.StudentRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class EnrollmentService (
    private val enrollmentRepository: EnrollmentRepository,
    private val studentRepository: StudentRepository,
    private val courseOfferingRepository: CourseOfferingRepository
){
    @Transactional
    fun enroll(studentId: Long, offeringId: Long){
        // condition preventing duplicates
        if(enrollmentRepository.existsByStudent_StudentIdAndOffering_OfferingId(studentId, offeringId)){
            throw RuntimeException("Student is already enrolled")
        }
        //checks the number of students enrolled in class/capacity of class
        val enrolledCount = enrollmentRepository.countByOffering_OfferingId(offeringId)
        val offering = courseOfferingRepository.findById(offeringId)
            .orElseThrow{RuntimeException("No offering found for id $offeringId")}

        //checks whether student exists or not
        val student= studentRepository.findById(studentId)
            .orElseThrow{RuntimeException("No student found for id $studentId")}

        enrollmentRepository.save(
            Enrollment(
                student = student,
                offering = offering
            )
        )
    }
}