package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//this  variation tells a
public class HiLow4
{
  public static void main(String[] args)
  {
    int answer = (int) (Math.random() * 100 + 1);
    System.out.println(" The answer is " + answer);
    //Random
    int uppurRange = 100;
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      // input validation
      while (guess < 1 || guess > uppurRange)
      {
        MessageBox.showMessage("Please enter a valid guess between 1 and " + uppurRange);
        guess = MessageBox.askForNumericalInput("What is your guess?");
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You Won!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Way too High!");
      }
      else
      {
        MessageBox.showMessage("Way too Low!");
      }
      if (i == 8)
      {
        MessageBox.showMessage("You Lose!");
      }
    }
  }
}
