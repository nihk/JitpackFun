package ca.nick.core

import java.util.*

object ThingDoer {
    val random = Random()

    fun doTheThing(): Int = random.nextInt()
}