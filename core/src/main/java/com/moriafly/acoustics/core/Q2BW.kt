@file:Suppress("unused", "PropertyName", "MemberVisibilityCanBePrivate", "UnusedFormalParameter", "RemoveRedundantBackticks")

package com.moriafly.acoustics.core

import kotlin.math.ln
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * @author Moriafly 2022/8/1
 */
object Q2BW {

    /**
     * 带通滤波器（BPF）和 EQ 滤波器中 Q 因数换算倍频程带宽的算法
     *
     * @param q 声学 Q 因素
     * @return 倍频程带宽
     */
    fun calcQ2BW(q: Float): Float {
        return ln(1f + 1f / (2f * q.pow(2)) + sqrt(((2f + 1f / (q.pow(2))).pow(2)) / 4f - 1f)) / ln(2f)
    }

    /**
     * 计算 3 dB 带宽
     */
    fun calc3dBBindwidth(q: Float, f0: Float): Float {
        val cutoffFrequencyPair = calcCutoffFrequency(q, f0)
        return cutoffFrequencyPair.second - cutoffFrequencyPair.first
    }

    /**
     * 计算下限截至频率和上限截至频率
     */
    fun calcCutoffFrequency(q: Float, f0: Float): Pair<Float, Float> {
        // 下限截至频率
        val f1 = f0 * (sqrt(1f + 1f / 4f * q.pow(2)) - 1f / 2f * q)
        // 上限截至频率
        val f2 = f0 * (sqrt(1f + 1f / 4f * q.pow(2)) + 1f / 2f * q)
        return Pair(f1, f2)
    }

}