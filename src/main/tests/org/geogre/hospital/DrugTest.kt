package org.geogre.hospital

import org.junit.Test
import kotlin.test.assertEquals

internal class DrugTest{

    @Test
    fun parseAspirin() {
        assertEquals(Drug.ASPIRIN, Drug.parseDrugs("As")[0])
    }

}