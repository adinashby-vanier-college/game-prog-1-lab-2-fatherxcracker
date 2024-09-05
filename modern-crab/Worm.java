// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Worm extends Actor
{

    /**
     * Act - do whatever the Worm wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(6);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(3);
        }
    }
}
