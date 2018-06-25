PImage hat;
PImage mustache;
PImage friend;
void setup(){
friend = loadImage ("friend.jpg");
size (800,600);
friend.resize(width,height);
mustache = loadImage ("mustache.png");
mustache.resize(500,200);
hat = loadImage ("hat.png");
hat.resize(400,200);
}
void draw(){
background(friend);
image(mustache, mouseX, mouseY);
image(hat, 200, 10);
if(mousePressed){background(friend);}}