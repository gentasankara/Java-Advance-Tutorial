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
public class Window {
    private String direction;

    public Window(String inDirection)
    {
        this.direction = inDirection;
    }

    public Window()
    {
        this.direction = "";
    }

    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    public String getDirection()
    {
        return this.direction;
    }

    public String toString()
    {
        return "Window facing : "+getDirection();
    }

}
