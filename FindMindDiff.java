/**
 * Write a description of howmework_part1 here:
 * 
 * the findMinDiff method:
 * 
 *  finds the minimal distance between two given numbers inside a given array.
 * @param int[] a - the given array
 * @param x - the first number
 * @param y - the second number
 * @return - the min difference between to numbers inside a given array 
 * or Integer.MAX_VALUE in case that x or y aren't found inside the given array.
 * time complexity = O(n) - iterating over the array once.
 * space complexity = O(1) - constant number of variables.
 *
 * @author Max Freeman
 * @version 15.01.22
 */
public class FindMindDiff
{

    public static int findMinDiff (int[] a, int x, int y){

        boolean x_in_matay = false;
        boolean y_in_matay = false;
        int min_distance = a.length;
        int distance = a.length;
        int e = a.length;
        for (int i = 0; i<a.length; i++){

            if (a[i] == x){
                x_in_matay = true;
                distance = i;
                min_distance = Math.min(min_distance,Math.abs(distance-e));
            } 

            else if (a[i] == y){
                y_in_matay = true;
                e = i;
                min_distance = Math.min(min_distance,Math.abs(distance-e));

            }

        }
        if (! x_in_matay || ! y_in_matay){
            return Integer.MAX_VALUE;
        }
        return min_distance;
    }
}