package com.example.hope.reminder.ui.components


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DayView(
    date: LocalDate,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .padding(4.dp)
            .background(
                color = if (isSelected) Color(0xFFBBDEFB) else Color.Transparent,
                shape = CircleShape
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = date.dayOfMonth.toString(),
            fontSize = 16.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
        )
    }
}