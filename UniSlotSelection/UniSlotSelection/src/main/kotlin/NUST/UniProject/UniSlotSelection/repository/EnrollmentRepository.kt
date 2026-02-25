package NUST.UniProject.UniSlotSelection.repository

import NUST.UniProject.UniSlotSelection.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface EnrollmentRepository :
    JpaRepository<Enrollment, Long> {

    fun existsByStudent_StudentIdAndOffering_OfferingId(
        studentId: Long,
        offeringId: Long
    ): Boolean

    fun countByOffering_OfferingId(offeringId: Long): Long
}