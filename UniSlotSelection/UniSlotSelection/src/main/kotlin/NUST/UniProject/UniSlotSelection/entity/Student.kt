package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "student")
data class Student (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val studentId : Long = 0,

    val name : String = "",

    @Column(unique = true)
    val email : String = "",

    val year : Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "degree_id")
    val degree: DegreeProgram,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    val department: Department
)