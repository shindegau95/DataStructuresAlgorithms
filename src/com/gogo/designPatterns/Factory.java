package com.gogo.designPatterns;

import javax.annotation.PostConstruct;
import java.util.HashMap;

public class Factory {
}

/*
*
public interface Shape{
    int getIdentityNumber();
    void configure();
}

interface 3pointer extends SHape
    default configure(){
        sout     hi i am 3 pointer
    }

 }




rect impl shape
square impl
circle impl
diamond

@Component
class Rect implements Shape{

    @Value("{rect}")
    int number;

    int getIdentityNumber(){
        returns number;
    }

    changeNumber(){
     ths.number+1;
     }

}
rect - 2

class ShapeFactory{

    @Autowired
    public List<Shape> shapes;
    //[rect, sqARE, circle, diamond]



    public Map<Integer, Shape> map;
    /*
    * 1- rect
    * 2 - sq
    * */

    /*@PostConstruct
    public void initializeMap(){
        map = new HashMap<>();
        for (Shape s : shape){
            s.changeNumber();
            map.put(s.getIdentityNumber(), s);
        }
    }

    public Shape getShape(int number){
        return map.get(number);
    }
}*/
