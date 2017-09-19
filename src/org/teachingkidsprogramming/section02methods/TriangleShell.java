package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(5);
    // Do the following 60 times --#7.1
    //      Change the pen color of the line the tortoise draws to a random color --#9
    //      Increase the current length of the side by 4 pixels --#8
    //
    drawTriangle();
    //
    //      Turn the tortoise 1/60th of 360 degrees to the right --#10
    // End Repeat --#7.2
  }
  private static void drawTriangle()
  {
    //      ------------- Recipe for drawTriangle --#5.2
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
    //      ------------- End of drawTriangle recipe --#5.3
  }
}
