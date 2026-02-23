package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "degree_program")
data class DegreeProgram (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val degreeId : Long = 0,
    val degreeName : String
)