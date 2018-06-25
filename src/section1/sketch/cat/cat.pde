PImage catPic;
void setup(){
size(500,500);
catPic = loadImage ("cat.jpg");
catPic.resize(width,height);
background(catPic);
}
void draw(){
if(mousePressed){ println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
ellipse(248,169,25,25);
ellipse(326,161,25,25);}