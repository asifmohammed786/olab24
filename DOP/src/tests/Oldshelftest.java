package tests;

import org.junit.Assert;
import oldshelf.*;
import org.junit.Test;

public class Oldshelftest{
    @Test
    public void test1(){
        TextBook t = new TextBook("Science");
        Assert.assertEquals(OldSelection.getAgeOrTitle(t),"Science");
    }
    @Test
    public void test2(){
        Fiction f = new Fiction("Harry Potter And the Deathly Hallows",FictionType.GoK);
        Assert.assertEquals(OldSelection.getAgeOrTitle(f),"Lord of the Rings");
    }
}