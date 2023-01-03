package com.example.marsrover

enum class Direction{

    NORTH{
        override fun turnLeft() = WEST
        override fun turnRight() = EAST
              },
    WEST{
        override fun turnLeft(): Direction = SOUTH
        override fun turnRight() = NORTH

    },
    SOUTH {
        override fun turnLeft(): Direction = EAST
        override fun turnRight() = WEST

    },
    EAST {
        override fun turnLeft(): Direction = NORTH
        override fun turnRight() = SOUTH

    };

    abstract fun turnLeft(): Direction
    abstract fun turnRight(): Direction


}
