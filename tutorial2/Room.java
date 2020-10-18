/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial2;

/**
 *
 * @author Wayndeen
 */
public class Room {
   private String name;
    private int noOfChairs,a;
    private boolean isBooked;
    private Dimension[] arrayDimension = new Dimension[10];
    private Window[] arrayWindow = new Window[10];


    public Room(String name, int noOfChairs, boolean isBooked, Dimension inDimension, Window inWindow)
    {
        this.name = name;
        this.noOfChairs = noOfChairs;
        this.isBooked = isBooked;
        this.arrayDimension[0] = inDimension;
        this.arrayWindow[0] = inWindow;
    }

    public Room()
    {
        this.name = null;
        this.noOfChairs = 0;
        this.isBooked = false;
        this.arrayDimension[0] = null;
        this.arrayWindow[0] = null;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setnoOfChairs(int noOfChairs)
    {
        this.noOfChairs = noOfChairs;
    }

    public void setisBooked(boolean isBooked)
    {
        this.isBooked = isBooked;
    }

    public String getName()
    {
        return this.name;
    }

    public int getnoOfChairs()
    {
        return this.noOfChairs;
    }

    public boolean getisBooked()
    {
        return this.isBooked;
    }

    public void addDimension(Dimension inDimension) {
        this.arrayDimension[a] = inDimension;
        a=a+1;
    }

    public void removeDimension(int x)
    {
        this.arrayDimension[x] = null;
    }

    public void printDimension()
    {

        for(int i=0;i<arrayDimension.length;i++)
        System.out.println(arrayDimension[i]);
    }

    public String toString()
    {
        return "Room " + this.getName() + " with " + this.dimension+ " (in m), with " + this.window
                + " and " + this.getnoOfChairs() + " chairs , and is already booked : " + this.getisBooked() + ".";
    }






}
