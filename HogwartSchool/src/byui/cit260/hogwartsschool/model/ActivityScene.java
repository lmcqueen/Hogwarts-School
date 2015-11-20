/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

/**
 *
 * @author lmcqueen
 */
public class ActivityScene extends Scene{
    
    boolean visited;

    public ActivityScene() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "ActivityScene{" + "visited=" + visited + '}';
    }
    
}
