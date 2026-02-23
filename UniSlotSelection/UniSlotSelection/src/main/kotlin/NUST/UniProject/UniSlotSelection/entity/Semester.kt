package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "semester")
data class Semester (
    @Id
    @GeneratedValue(GenerationType.IDENTITY)
    val semesterId: Long = 0,

    val term: String = "",
    val year: String = "",
)