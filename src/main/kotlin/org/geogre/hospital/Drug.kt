package org.geogre.hospital

/**
 * Drug contains the known drugs,
 * just add an enum in the list if needed.
 */
enum class Drug(val drugCode: String) {

    ASPIRIN("As"),
    ANTIBIOTIC("An"),
    INSULIN("I"),
    PARACETAMOL("P");

    companion object {

        fun parseDrugs(input: String): List<Drug> {
            return input
                .split(",")
                .mapNotNull { str -> parseDrug(str) }
                .toList()
        }

        private fun parseDrug(drugString: String): Drug? {
            return values().firstOrNull { drug -> drug.drugCode == drugString }
        }
    }

}