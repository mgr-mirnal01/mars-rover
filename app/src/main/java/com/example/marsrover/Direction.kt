package com.example.marsrover

enum class Direction (val direction : String){

    NORTH("N"){
        override fun turnLeft() = WEST
        override fun turnRight() = EAST
              },
    WEST("W") {
        override fun turnLeft(): Direction = SOUTH
        override fun turnRight() = NORTH

    },
    SOUTH("S") {
        override fun turnLeft(): Direction = EAST
        override fun turnRight() = WEST

    },
    EAST("E") {
        override fun turnLeft(): Direction = NORTH
        override fun turnRight() = SOUTH

    };

    abstract fun turnLeft(): Direction
    abstract fun turnRight(): Direction


}
