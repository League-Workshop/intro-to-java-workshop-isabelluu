int X1 = 250;
int Y1 = 167;
//int X2 = 326;
//int Y2 = 164;
int acceleration = 5;
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
noStroke();}
void keyPressed() 
{
X1+=2*acceleration; Y1+=2*acceleration;//X2-=2*acceleration;
//Y2+=3*acceleration;
if (X1>width){background(catPic);  X1 = 250;
Y1 = 167;}
ellipse(X1+75,Y1,25,25);
ellipse(X1,Y1,25,25);
//X2 = 326;
//Y2 = 164;
//acceleration= 1;}

//ellipse(X1+220,Y1, 60,50);
}