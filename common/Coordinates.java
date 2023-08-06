package common;

import java.util.HashMap;
import java.util.Map;

public class Coordinates {
    public Map<String, Integer> getCoords() {
        Map<String, Integer> coords = new HashMap<String, Integer>();
        coords.put("x", this.x);
        coords.put("y", this.y);
        return coords;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setX(Integer newX) {
        this.x = newX;
    }

    public void setY(Integer newY) {
        this.y = newY;
    }

    private Integer x;
    private Integer y;
}
