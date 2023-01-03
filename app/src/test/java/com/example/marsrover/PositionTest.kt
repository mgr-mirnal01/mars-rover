package com.example.marsrover

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*


 class PositionTest{
     private lateinit var positionFacingNorth: Position
     lateinit var positionFacingWest: Position
     private lateinit var positionFacingSouth: Position
     lateinit var positionFacingEast: Position


     @Before
    fun before() {
        positionFacingNorth = Position(1, 2, Direction.NORTH)
        positionFacingWest = Position(1, 2, Direction.WEST)
        positionFacingSouth = Position(1, 2, Direction.SOUTH)
        positionFacingEast = Position(1, 2, Direction.EAST)
    }
    @Test
    fun `When facing North turnLeft should return facing West`() {
        assertEquals(Direction.WEST, positionFacingNorth.turnLeft().direction)
    }
     @Test
     fun `When facing West turnLeft should return facing South`() {
         assertEquals(Direction.SOUTH, positionFacingWest.turnLeft().direction)
     }
     @Test
     fun `When facing South turnLeft should return facing East`() {
         assertEquals(Direction.EAST, positionFacingSouth.turnLeft().direction)
     }
     @Test
     fun `When facing East turnLeft should return facing North`() {
         assertEquals(Direction.NORTH, positionFacingEast.turnLeft().direction)
     }
     @Test
     fun `When facing North turnRight should return facing East`() {
         assertEquals(Direction.EAST, positionFacingNorth.turnRight().direction)
     }
     @Test
     fun `When facing East turnRight should return facing South`() {
         assertEquals(Direction.SOUTH, positionFacingEast.turnRight().direction)
     }
     @Test
     fun `When facing South turnRight should return facing West`() {
         assertEquals(Direction.WEST, positionFacingSouth.turnRight().direction)
     }
     @Test
     fun `When facing West turnLeft should return facing North`() {
         assertEquals(Direction.NORTH, positionFacingWest.turnRight().direction)
     }
     @Test
     fun `When facing north move forward should return + 1 on y coordinate`() {
         assertEquals(3, positionFacingNorth.moveForward().y)
     }
     @Test
     fun `When facing West move forward should return - 1 on x coordinate`() {
         assertEquals(0, positionFacingWest.moveForward().x)
     }
     @Test
     fun `When facing South move forward should return - 1 on y coordinate`() {
         assertEquals(1, positionFacingSouth.moveForward().y)
     }
     @Test
     fun `When facing East move forward should return + 1 on x coordinate`() {
         assertEquals(2, positionFacingEast.moveForward().x)
     }

}