package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "professor")
data class Professor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val professorId : Int = 0,

    val professorName : String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    val department: Department
    )