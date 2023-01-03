package com.example.marsrover

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*


 class RoverTest {

     private lateinit var rover: Rover
    @Before
    fun before() {

        rover = Rover(Plateau(5,5), Position(1,2,Direction.NORTH))
    }

     @Test
    fun `checking if the rover rotate EAST when command is L while facing North`(){
        rover.command('L')
        assertEquals(Direction.WEST, rover.position.direction)
    }
    @Test
    fun `checking if the rover rotate South when its turn R while facing North`(){
        rover.command('R')
        assertEquals(Direction.EAST, rover.position.direction )
    }

     @Test
     fun `Rover should move 1 step forward when the command is M `() {
         rover.command('M')
         assertEquals(3, rover.position.y)
     }
     @Test
     fun `Rover should follow instructions "LMLMLMLM" and reach destination`() {
         rover.instruction("LMLMLMLMM")
         assertEquals(1, rover.position.x)
         assertEquals(3,rover.position.y)
         assertEquals(Direction.NORTH,rover.position.direction)
     }
     @Test
     fun `Rover should follow instructions "MMRMMRMRRM" and reach destination {5 1 E}`() {
         rover = Rover(Plateau(5,5),Position(3,3,Direction.EAST))
         rover.instruction("MMRMMRMRRM")
         assertEquals(5, rover.position.x)
         assertEquals(1,rover.position.y)
         assertEquals(Direction.EAST,rover.position.direction)
     }
     @Test
     fun `Test should not move if rover goes is at the edge of the plateau `(){
         rover = Rover(Plateau(5,5), Position(5,5,Direction.NORTH))
         rover.instruction("MMMM")
         assertEquals(5,rover.position.y)
     }

}