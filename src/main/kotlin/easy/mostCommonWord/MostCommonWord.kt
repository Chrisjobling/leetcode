package easy.mostCommonWord

import java.util.*

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
  return paragraph
    .lowercase(Locale.getDefault())
    .split( Regex("\\W+"))
    .filter { ! banned.toSet().contains(it) }
    .groupBy { it }
    .values
    .maxByOrNull { it.size }!!
    .first()
}