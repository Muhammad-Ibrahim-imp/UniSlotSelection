package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "course_offering")
data class CourseOffering(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val offeringId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    val course: Course,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    val professor: Professor,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    val department: Department,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semester_id")
    val semester: Semester,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_slot_id")
    val timeSlot: TimeSlot,

    val capacity: Int
)