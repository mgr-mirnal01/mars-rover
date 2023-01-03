package com.example.marsrover

class Plateau(var x: Int, var y: Int) {


    fun isValidMove(position: Position): Boolean {
        return position.isInTheRange(x, y)
    }
}
