package com.example.marsrover

class Position(val x: Int, val y: Int, val direction: Direction) {

    fun turnLeft(): Position = Position(x, y, direction.turnLeft())

    fun turnRight(): Position = Position(x,y, direction.turnRight())

    fun moveForward():Position {
        return when(direction){
            Direction.NORTH -> Position(x, y+1, direction) // if its facing north then +1 to y
            Direction.WEST -> Position(x-1, y, direction)  // if its facing west then -1 to x
            Direction.SOUTH -> Position(x, y-1, direction) // if its facing south then its -1 to y
            Direction.EAST -> Position(x+1, y, direction)  // if its facing east then its +1 to x
        }
    }

    fun isInTheRange(max_x: Int, max_y: Int): Boolean = x <= max_x && y <= max_y && x >= 0 && y >= 0
    // check if rover position is inside the plateau
}
