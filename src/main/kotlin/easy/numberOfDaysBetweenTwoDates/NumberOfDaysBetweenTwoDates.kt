package easy.numberOfDaysBetweenTwoDates

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.math.abs

fun daysBetweenDates(date1: String, date2: String): Int {
    return abs((LocalDate.parse(date1, DateTimeFormatter.ISO_DATE).toEpochDay() - LocalDate.parse(date2, DateTimeFormatter.ISO_DATE).toEpochDay()).toInt())
}