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
public class Dimension {
    private int width, length;

    public Dimension(int inWidth, int inLength)
    {
        this.width = inWidth;
        this.length = inLength;
    }

    public Dimension()
    {
        this.width = 0;
        this.length = 0;
    }

    public void setWidth (int width)
    {
        this.width = width;
    }

    public void setLength(int lenght)
    {
       this.length = length;
    }

    public int getWidth()
    {
       return this.width;
    }

    public int getLength()
    {
        return this.length;
    }

    public String toString()
    {
        return getWidth()+"x"+getLength();
    }
}
