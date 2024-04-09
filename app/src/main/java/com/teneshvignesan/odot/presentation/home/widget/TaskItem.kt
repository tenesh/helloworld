package com.teneshvignesan.odot.presentation.home.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.teneshvignesan.odot.domain.model.Task
import java.time.format.DateTimeFormatter

@Composable
fun TaskItem(
    task: Task,
    onNavigateToTask: () -> Unit,
) {
    val startTimeInString = task.startDateTime.format(DateTimeFormatter.ofPattern("HH:mm a"))

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .clickable {
                    onNavigateToTask()
                }
        ) {
            Text(
                modifier = Modifier.padding(
                    start = 10.dp,
                    end = 10.dp,
                    bottom = 5.dp,
                    top = 15.dp
                ),
                text = task.title,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
            )
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, bottom = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .width(18.dp),
                    imageVector = Icons.Filled.AccessTime,
                    contentDescription = "Task duration"
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 4.dp),
                    text = startTimeInString.replace("am", "AM").replace("pm", "PM"),
                    style = MaterialTheme.typography.bodySmall,

                    )
            }
        }
    }
}