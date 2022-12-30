/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    public boolean equals(Object obj) {
        if ( obj == null )
            return false;
        if ( this.getClass() != obj.getClass() )
            return false;
        Location loc =(Location)obj;
        return this.xCoord == loc.xCoord && this.yCoord == loc.yCoord;
    }

    public int hashCode() {
//        int result = 17;
//
//        result = 37 * result + xCoord;
//        result = 37 * result + yCoord;
        return this.yCoord*1000 + this.xCoord;
    }

}