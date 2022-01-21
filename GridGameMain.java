// COMP1731 Lab9 Patrick Andrews, Max Sotsky

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GridGameMain
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full path name of the game board file.");

        String pathname = sc.nextLine();
        sc.close();
        //System.out.println(pathname);
        File boardfile = new File(pathname);

        //try
        //{
            Scanner sc2 = new Scanner(boardfile);
            int rows = sc2.nextInt();
            int cols = sc2.nextInt();
            char[][] gameboard = new char[rows][cols];
            //System.out.println(rows);
            //System.out.println(cols);
            for(int i = 0; i < rows; i++)
            {
                //System.out.println(i);
                String r = sc2.next();
                //System.out.println(r.length());
                for (int j = 0; j < cols; j++)
                {
                    //System.out.println(r);
                    gameboard[i][j] = r.charAt(j);
                    //System.out.println(gameboard[i][j]);
                    //System.out.println(j);
                }
            }
            sc2.close();
            GridGame newgame = new GridGame(rows, cols, gameboard);
            int result = newgame.playGame();

            if (result == GridGame.OUT)
                System.out.println("I fell off the board.");
            else if (result == GridGame.LOST)
                System.out.println("I'm lost :(");
            else
                System.out.println("I reached the treasure in " + result + " turns.");
        //}
        //catch(Exception e)
        //{
           // System.out.println("Sorry, that file cannot be found.");
        //}


    }

}
