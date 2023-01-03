package com.example.marsrover

class Plateau(var x: Int, var y: Int) {


    fun isValidMove(position: Position): Boolean { //  check  if its  valid move
        return position.isInTheRange(x, y)
    }
}
