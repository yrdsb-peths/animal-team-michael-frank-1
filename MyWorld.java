import greenfoot.*;

public class MyWorld extends World {
    // Variables
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {
        // Create a new world with 600 x 400 cells and a cells siza of 1 x 1 pixels.
        super(600, 400, 1,false);
        
        // Create elephant object.
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        
        // Run method createFries.
        createFries();
        
    }
    /**
     * End the game and draw "Game Over".
     */
    public void gameOver()
    {
        // Creates Game Over with a size of 100.
        Label gameOverLabel = new Label("'Game Over",100);
        // Position of the Game Over.
        addObject(gameOverLabel,300,200);
    }
    /**
     * Create a new fries at random location at top of screen.
     */
    public void createFries()
    {
        Fries fries = new Fries();
        // Creates a random position of the fries.
        int x =Greenfoot.getRandomNumber(600);
        int y =0;
        addObject(fries,x,y);
        
    }
    /**
     * Increase score.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
}
