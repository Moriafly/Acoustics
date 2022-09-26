package com.moriafly.acoustics.core

import kotlin.math.pow

object ReplayGain {

    fun getMaxVolume(replayGain: String): Float {
        if (replayGain.isEmpty()) {
            return 1f
        }
        val value = replayGain.replace(" dB", "").toFloatOrNull() ?: return 1f
        return 10f.pow(value / 20)
    }

}