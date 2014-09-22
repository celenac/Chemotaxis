Bacteria [] colony;

void setup()   
{     
  size(600, 600);
  noStroke();
  frameRate(15);
  colony=new Bacteria[25];
  for (int i=0; i<colony.length; i++)
  {
    colony[i]=new Bacteria();
  }
}   
  
void draw()   
{    
  background(25);
  for (int i=0; i<colony.length; i++)
  {
    colony[i].move();
    colony[i].show();
  }
    fill(255, 255, 0, 60);
    ellipse(mouseX, mouseY, 300, 300);
    fill(255, 255, 0, 20);
    ellipse(mouseX, mouseY, 250, 250);
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
    bacteriaColor=color(r, g, b);
  } 
  void show()
  {
    fill(bacteriaColor);
    ellipse(bacteriaX, bacteriaY, bacteriaSize, bacteriaSize);
  }  
  void move()
  {
    bacteriaX=bacteriaX+((int)(Math.random()*20-10));
    bacteriaY=bacteriaY+((int)(Math.random()*20-10));
  }
}