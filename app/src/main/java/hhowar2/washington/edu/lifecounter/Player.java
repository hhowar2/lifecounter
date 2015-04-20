package hhowar2.washington.edu.lifecounter;

/**
 * Created by Howard on 4/18/2015.
 */
public class Player {
    private int lifePoints;

    public Player() {
        this.lifePoints = 5;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public void changeLifePoints(int points) {
        this.lifePoints = lifePoints + points;
    }
}
