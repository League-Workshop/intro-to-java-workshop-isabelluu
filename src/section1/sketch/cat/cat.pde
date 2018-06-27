int X1 = 250;
int Y1 = 167;
int X2 = 326;
int Y2 = 164;
PImage catPic;
void setup(){
size(500,500);
catPic = loadImage ("cat.jpg");
catPic.resize(width,height);
background(catPic);
}
void draw(){
if(mousePressed){ println("Mouse’s x-position: " + 
mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#FFFFFF);
ellipse(X1,Y1,25,25);
ellipse(X2,Y2,25,25);}
void keyPressed() 
{X1++; Y1++;X2++; Y2++;}