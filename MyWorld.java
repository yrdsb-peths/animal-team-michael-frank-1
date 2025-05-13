import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld() {
        super(600, 400, 1,false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        
        createFries();
        
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("'Game Over",100);
        addObject(gameOverLabel,300,200);
    }
    public void createFries()
    {
        Fries fries = new Fries();
        int x =Greenfoot.getRandomNumber(600);
        int y =0;
        addObject(fries,x,y);
        
    }
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
