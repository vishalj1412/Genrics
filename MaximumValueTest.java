package org.genrics;

import org.junit.jupiter.api.Test;

public class MaximumValueTest {
    @Test
    public void MaxTest(){
        MaximumValue maxvalue=new MaximumValue();
        //integer three value and check max value
      int value= maxvalue.maximum(3,10,5);
      String string =maxvalue.maximum("vishal","kunal","raj");
     System.out.println(value);
     System.out.println(""+string);
    }
    @Test
    public void FolatingTest(){
        MaximumValue maxval=new MaximumValue();
        Double value= maxval.maximum(3.1,1.0,5.4);
        System.out.println(""+value);
    }
}
