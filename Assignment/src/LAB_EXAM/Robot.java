package LAB_EXAM;

import java.awt.*;

public class Robot {
    private int x ;
    private int y ;
    private int cmp = 0 ;
    private String direction = "W" ;
    Robot( int initial_x , int initial_y ){
        this.x = initial_x ;
        this.y = initial_y ;
    }

    public void turnLeft(){
        System.out.print("Turned Left   ");
        if( direction.equals("W") ){
            direction = "S" ;
        }
        else if( direction.equals("S") ){
            direction = "E" ;
        }
        else if( direction.equals("E") ){
            direction = "N" ;
        }
        else if( direction.equals("N") ){
            direction = "W" ;
        }
    }
    public void TurnRight(){
        System.out.print("Turned Right   ");
        if( direction.equals("W") ){
            direction = "N" ;
        }
        else if( direction.equals("N") ){
            direction = "E" ;
        }
        else if( direction.equals("E") ){
            direction = "S" ;
        }
        else if( direction.equals("S") ){
            direction = "W" ;
        }
    }
    public void move(){
        if( cmp==0 ){
            System.out.println("Initial:");
            System.out.print(getDirection()+" ");
            getLocation();
            System.out.println();
            cmp = cmp+1 ;
        }
        System.out.print(getDirection()+" ");
        if( direction.equals("W") ){
            y = y+1 ;
        }
        if( direction.equals("N") ){
            x = x+1 ;
        }
        if(direction.equals("E") ){
            y = y-1 ;
        }
        if( direction.equals("S") ){
            x = x-1 ;
        }
        getLocation();
    }
    public void getLocation(){
        System.out.println("x,y: " + x +"," + y );
    }
//    public Point getLocation(){
//
//    }
    public String getDirection(){
        return direction ;
    }
}
