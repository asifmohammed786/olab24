package tests;

import org.junit.Assert;
import newshelf.*;
import org.junit.Test;

public class Newshelftest{
    @Test
    public void test1(){
        TextBook t = new TextBook("C programming");
        Assert.assertEquals("C programming",NewSelection.getAgeOrTitle(t));
    }
    @Test
    public void test2(){
        Fiction f = new Fiction("Wheels of fortunate",FictionType.GoK);
        Assert.assertEquals("fortunate",NewSelection.getAgeOrTitle(f));
    }
}