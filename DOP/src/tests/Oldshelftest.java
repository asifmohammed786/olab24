package tests;

import org.junit.Assert;
import oldshelf.*;
import org.junit.Test;

public class Oldshelftest{
    @Test
    public void test1(){
        TextBook t = new TextBook("C programming");
        Assert.assertEquals(OldSelection.getAgeOrTitle(t),"C programming");
    }
    @Test
    public void test2(){
        Fiction f = new Fiction("Wheels of fortunate",FictionType.Tragedy);
        Assert.assertEquals(OldSelection.getAgeOrTitle(f),"fortunate");
    }
}