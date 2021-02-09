package org.geogre.hospital

import java.util.*
import java.util.function.Predicate
import java.util.stream.Collectors
import java.util.stream.Stream


/**
 * State contains the known states of a patient,
 * just add an enum in the list if needed.
 */
enum class State(val statusCode: String) {

    FEVER("F"),
    HEALTHY("H"),
    DIABETES("D"),
    TUBERCULOSIS("T"),
    DEAD("X");

    companion object {

        fun parseStates(input: String): List<State> {
            return input
                .split(",")
                .mapNotNull { str -> parseDrug(str) }
                .toList()
        }

        private fun parseDrug(statetring: String): State? {
            return values().firstOrNull { drug -> drug.statusCode == statetring }
        }
    }

}