package org.geogre.hospital

import java.util.concurrent.atomic.AtomicBoolean
import java.util.function.BiFunction


class Patient  internal constructor( state: State ) {

    private var state: State? = null
    private val isTreated = AtomicBoolean(false)


    fun treat(drugs: List<Drug>) {
        listOf(this.deathEffect)
            .stream()
            .filter { effect: BiFunction<List<Drug>, State?, State>? -> !isTreated.get() }
            .map<Any> { effect: BiFunction<List<Drug>, State?, State> ->
                effect.apply(
                    drugs,
                    state
                )
            }
            .filter { newState: Any -> newState != state }
            .findFirst()
            .ifPresent { newState: Any? -> changePatientState(newState) }
        isTreated.set(false)
    }

    private fun changePatientState(newState: State) {
        this.state = newState
        this.isTreated.set(true)
    }

}
