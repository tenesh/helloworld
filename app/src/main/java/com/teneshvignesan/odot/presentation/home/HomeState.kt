package com.teneshvignesan.odot.presentation.home

import com.teneshvignesan.odot.domain.model.Task
import java.time.LocalDate

data class HomeState (
    val tasks: List<Task> = emptyList(),
    val selectedDate: LocalDate = LocalDate.now()
)