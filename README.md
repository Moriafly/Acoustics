## Acoustics 

简单的几个声学算法

## 带通滤波器（BPF）和 EQ 滤波器中 Q 因数换算倍频程带宽的算法

倍频程带宽：Bandwidth in octaves

http://www.sengpielaudio.com/calculator-bandwidth.htm

| 带宽（以倍频程 N 为单位）| 滤波器 Q 系数 |
| -- | -- |
| 3.0 wide | 0.404 low |
| 2.0 | 0.667 |
| 1.5 | 0.920 |
| 1.0 | 0.414 |
| 2/3 | 2.145 |
| 1/2 | 2.871 |
| 1/3 | 4.318 |
| 1/6 | 8.651 |
| 1/12 small | 17.310 high |

$$\text{对方程形如}: x^3-1=0\\\text{设}: \omega =\frac{-1+i\sqrt{3}}{2}\\x_1=1, x_2=\omega =\frac{-1+i\sqrt{3}}{2}, x_3=\omega ^2=\frac{-1+i\sqrt{3}}{2}$$

$$
\left[
\begin{matrix}
1 & 0 & 0 \\
0 & 1 & 0 \\
0 & 0 & 1
\end{matrix}
\right]
$$

## ReplayGain

https://github.com/Moriafly/SaltPlayerSource/issues/158