/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

/**
 *
 * @author User
 */
public class GridHelper {

    private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    static int getXCoordinate(int x, double adjustedGrid) {
        int coordinate = (int) Math.round(x / adjustedGrid);
        return coordinate;
    }

    static String getYCoordinate(int y, double adjustedGrid) {
        int coordinate = (int) Math.round(y / adjustedGrid);

        String result = "";

        int index = coordinate / 26;

        if (index > 0) {
            result += alphabet[index -1];
            coordinate -= 26 * index;

            result += alphabet[coordinate];
        }else{
            result += alphabet[coordinate - 1];
        }

        return result;
    }
}
