import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1,false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        
        
    }
    
}
