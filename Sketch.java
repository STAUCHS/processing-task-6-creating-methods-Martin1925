import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
          Square(intRow, intColumn, 175, 100);
          
      }
    }

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
          Circle(intRow, intColumn, 255, 0);
      }
    }


  /**
   * Description
   * 
   * @param 
   * @param 
   * @return
   * @author 
   */

    }

  private void Square(int intRow, int intColumn, int intColor1, int intColor2) {
    int intX = 0;
    int intY = 0;
    intX = 3 + intRow*30;  // Instead of zero, calculate the proper intX location using 'intRow'
    intY = 3 + intColumn*30; // Instead of zero, calculate the proper intY location using 'intColumn'
    fill(intColor1);
    noStroke();
    rect(intX, intY, 20, 20);

    int intX2 = 0;
    int intY2 = 0;
    intX2 = 3 + intRow*30;  // Instead of zero, calculate the proper intX location using 'intRow'
    intY2 = 3 + intColumn*30; // Instead of zero, calculate the proper intY location using 'intColumn'
    fill(intColor2);
    noStroke();
    rect(intX2, intY2, 10, 10);


  }
  private void Circle(int intRow, int intColumn, int intColor3, int intColour4) {
    int intX = 0;
    int intY = 0;
    intX = 3 + intRow*25;  // Instead of zero, calculate the proper intX location using 'intRow'
    intY = 3 + intColumn*45; // Instead of zero, calculate the proper intY location using 'intColumn'
    fill(intColor3);
    noStroke();
    ellipse(intX, intY, 15, 15);

    int intX2 = 0;
    int intY2 = 0;
    intX2 = 3 + intRow*25;  // Instead of zero, calculate the proper intX location using 'intRow'
    intY2 = 3 + intColumn*45; // Instead of zero, calculate the proper intY location using 'intColumn'
    fill(intColour4);
    noStroke();
    ellipse(intX2, intY2, 5, 5);


  }
}

