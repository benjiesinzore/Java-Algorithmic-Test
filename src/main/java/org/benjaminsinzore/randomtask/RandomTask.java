package org.benjaminsinzore.randomtask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomTask {

    public static void main(String[] arg){

        int numDirections = solution(new int[] {3, 2}, new int[] {1, 1}, new int[] {2, 1}, 4);
        System.out.println(numDirections);

    }


    /*

        Uh-oh -- you've been cornered by one of Commander Lambdas elite bunny trainers!
        Fortunately, you grabbed a beam weapon from an abandoned storeroom while you were
        running through the station, so you have a chance to fight your way out.
        But the beam weapon is potentially dangerous to you as well as to the bunny trainers:
        its beams reflect off walls, meaning you'll have to be very careful where you shoot to
        avoid bouncing a shot toward yourself! Luckily, the beams can only travel a certain maximum
        distance before becoming too weak to cause damage. You also know that if a beam
        hits a corner, it will bounce back in exactly the same direction. And of course,
        if the beam hits either you or the bunny trainer, it will stop immediately (albeit painfully).
        Write a function solution(dimensions, your_position, trainer_position, distance)
        that gives an array of 2 integers of the width and height of the room, an array of 2
        integers of your x and y coordinates in the room, an array of 2 integers of the
        trainer's x and y coordinates in the room, and returns an integer of the number of
        distinct directions that you can fire to hit the elite trainer, given the maximum
        distance that the beam can travel. The room has integer dimensions [1 < x_dim <= 1250,
        1 < y_dim <= 1250]. You and the elite trainer are both positioned on the integer
        lattice at different distinct positions (x, y) inside the room such that
         [0 < x < x_dim, 0 < y < y_dim]. Finally, the maximum distance that the beam can
         travel before becoming harmless will be given as an integer 1 < distance <= 10000.
         For example, if you and the elite trainer were positioned in a room with dimensions [3, 2],
         your_position [1, 1], trainer_position [2, 1], and a maximum shot distance of 4,
         you could shoot in seven different directions to hit the elite trainer
         (given as vector bearings from your location): [1, 0], [1, 2], [1, -2], [3, 2],
         [3, -2], [-3, 2], and [-3, -2]. As specific examples, the shot at bearing [1, 0]
         is the straight line horizontal shot of distance 1, the shot at bearing [-3, -2]
         bounces off the left wall and then the bottom wall before hitting the elite
         trainer with a total shot distance of sqrt(13), and the shot at bearing [1, 2]
         bounces off just the top wall before hitting the elite trainer with a total
         shot distance of sqrt(5).

     */

    public static int solution(int[] dimensions, int[] your_position, int[] trainer_position, int distance) {
        // First, we'll find the minimum and maximum x and y values that the beam
        // can travel to. This will help us determine which directions we can shoot
        // in.
        int minX = your_position[0] - distance;
        int maxX = your_position[0] + distance;
        int minY = your_position[1] - distance;
        int maxY = your_position[1] + distance;

        // Next, we'll check if the beam would go out of the bounds of the room
        // in the x and y directions. If it would, we'll need to "wrap" the beam
        // around to the other side of the room.
        if (minX < 0) {
            minX = dimensions[0] + minX;
        }
        if (maxX > dimensions[0]) {
            maxX = maxX - dimensions[0];
        }
        if (minY < 0) {
            minY = dimensions[1] + minY;
        }
        if (maxY > dimensions[1]) {
            maxY = maxY - dimensions[1];
        }

        // Now that we know the minimum and maximum x and y values that the beam
        // can travel to, we can find all of the possible directions we can shoot
        // in.
        Set<List<Integer>> directions = new HashSet<>();
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                // If the new direction is within the maximum distance, we can add it
                // to the set of possible directions.
                if (getDistance(your_position, new int[] {x, y}) <= distance) {
                    directions.add(Arrays.asList(x, y));
                }
            }
        }

        // Finally, we can return the number of unique directions we can shoot in.
        return directions.size();
    }

    // This helper function returns the Euclidean distance between two points.
    public static double getDistance(int[] point1, int[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }
}





