/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.util.Arrays;

/**
 *
 * @author lmcqueen
 */
public class GreatHall extends Scene{
    
    private boolean blocked;
    private boolean visited;
    private String[] testQuestions;

    public GreatHall() {
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String[] getTestQuestions() {
        return testQuestions;
    }

    public void setTestQuestions(String[] testQuestions) {
        this.testQuestions = testQuestions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.blocked ? 1 : 0);
        hash = 59 * hash + (this.visited ? 1 : 0);
        hash = 59 * hash + Arrays.deepHashCode(this.testQuestions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GreatHall other = (GreatHall) obj;
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Arrays.deepEquals(this.testQuestions, other.testQuestions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GreatHall{" + "blocked=" + blocked + ", visited=" + visited + ", testQuestions=" + testQuestions + '}';
    }
    
}
