package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*


@Entity
@Table(name = "enrollment")
data class Enrollment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val enrollmentId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    val student: Student,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "offering_id")
    val offering: CourseOffering
)