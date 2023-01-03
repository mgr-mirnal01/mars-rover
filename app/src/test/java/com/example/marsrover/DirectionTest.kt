package com.example.marsrover

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class DirectionTest {

    @Test
   fun `When facing North and turnLeft it should return West`(){
        assertEquals(Direction.WEST, Direction.NORTH.turnLeft())
    }

    @Test
    fun `When facing West and turnLeft it should return South`(){
        assertEquals(Direction.SOUTH, Direction.WEST.turnLeft())
    }

    @Test
    fun `When facing South and turnLeft it should return East`(){
        assertEquals(Direction.EAST, Direction.SOUTH.turnLeft())
    }

    @Test
    fun `When facing East and turnLeft it should return North`(){
        assertEquals(Direction.NORTH, Direction.EAST.turnLeft())
    }

    @Test
    fun `When facing North and turnRight it should return East`(){
        assertEquals(Direction.EAST, Direction.NORTH.turnRight())
    }

    @Test
    fun `When facing West and turnRight it should return North`(){
        assertEquals(Direction.NORTH, Direction.WEST.turnRight())
    }

    @Test
    fun `When facing South and turnRight it should return West`(){
        assertEquals(Direction.WEST, Direction.SOUTH.turnRight())
    }

    @Test
    fun `When facing East and turnRight it should return South`(){
        assertEquals(Direction.SOUTH, Direction.EAST.turnRight())
    }

}