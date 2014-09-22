import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony;
  
 public void setup()   
 {     
 	size(600,600);
 	noStroke();
 	frameRate(15);
 	colony=new Bacteria[25];
 	for(int i=0; i<colony.length;i++)
 	{
 		colony[i]=new Bacteria();
 	}
 }   
 public void draw()   
 {    
 	background(25);
 	 for (int i=0; i<colony.length;i++)
 	 {
 	 	colony[i].move();
 	 	colony[i].show();
 	 }
 	 fill(255,255,0,50);
ellipse(mouseX,mouseY,300,300);
	fill(255,255,0,20);
	ellipse(mouseX,mouseY,250,250);
 }  
 class Bacteria    
 {     
 	int bacteriaX, bacteriaY, bacteriaColor, bacteriaSize;
 	Bacteria()
 	{
 		bacteriaX=(int)(Math.random()*600);
 		bacteriaY=(int)(Math.random()*600);
 		bacteriaSize=(int)((Math.random()*80)-40);
 		int r=0;
 		int g=(int)(Math.random()*50);
 		int b=(int)(Math.random()*50);
 		bacteriaColor=color(r,g,b);
 	} 
 	public void show()
 	{
 		fill(bacteriaColor);
 		ellipse(bacteriaX, bacteriaY,bacteriaSize,bacteriaSize);

 	}  
 	public void move()
 	{
 		bacteriaX=bacteriaX+((int)(Math.random()*20-10));
 		bacteriaY=bacteriaY+((int)(Math.random()*20-10));
 	}
 	

 	}
 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
