package NUST.UniProject.UniSlotSelection.entity

import jakarta.persistence.*

@Entity
@Table(name = "time_slot")
class TimeSlot (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val timeSlotId: Long,

    val dayOfWeek: String,
    val startTime: String,
    val endTime: String
    )