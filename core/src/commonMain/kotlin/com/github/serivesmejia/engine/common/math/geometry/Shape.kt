package com.github.serivesmejia.engine.common.math.geometry

interface Shape {
    val position: Vector2
    val size: Size2
}

data class Rectangle2(override val position: Vector2 = Vector2(0f, 0f),
                      override val size: Size2 = Size2(0f, 0f)): Shape

data class Triangle2(override val position: Vector2 = Vector2(0f, 0f),
                     override val size: Size2 = Size2(0f, 0f)): Shape