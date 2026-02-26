package NUST.UniProject.UniSlotSelection.service

import org.springframework.stereotype.Service

@Service
class EmailParserService {
    fun extractDegreeAndYear(email: String): Pair<String, Int> {
        val degreeYear = email.substringAfter(".").substringBefore("@")

        // Get all characters that are NOT digits for the degree
        val degree = degreeYear.takeWhile { !it.isDigit() }

        // Get all characters that ARE digits for the year
        val year = degreeYear.drop(degree.length).toInt()

        return Pair(degree, year)
    }
}