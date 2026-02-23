package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "course")
data class Course (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val courseId: Long = 0,

    val courseTitle: String,
    val courseCode: String,
    val creditHours: Int
)