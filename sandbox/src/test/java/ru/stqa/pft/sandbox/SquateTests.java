package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by Cj on 8/10/2016.
 */
public class SquateTests {
    @Test
    public void testArea{
        Square s = new Square(5);
       assert s.area() ==25;
    }
}
