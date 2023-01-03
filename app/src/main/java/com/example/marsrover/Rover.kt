package com.example.marsrover



//Rover should be able to turn right, turn left and move forward

class Rover (var plateau : Plateau, var position: Position) {

     private fun turnLeft() {
        position = position.turnLeft()
    }

     private fun turnRight() {
        position = position.turnRight()
    }
     fun instruction(instruction : String?){
         instruction?.chars()?.mapToObj {c -> c.toChar()}?.forEach (this::command)
    // separating Strings into a chars to read instruction/commands
    }

    fun command(command: Char) { // assigning  commands into methods
        when (command) {
            'L' -> turnLeft()  // L to turn left
            'R' -> turnRight()  // R to turn Right
            'M' -> moveForward()  // M to move Forward
        }

    }

    private fun moveForward() {
        if(plateau.isValidMove(position.moveForward())) // if move forward is still inside plateau
            position = position.moveForward() // move forward  or do nothing
    }
}

