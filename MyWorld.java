import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1,false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        
        
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
