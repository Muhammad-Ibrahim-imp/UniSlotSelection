package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "department")
data class Department (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val departmentId : Long = 0,
    val departmentName : String
)