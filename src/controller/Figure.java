package controller;

import processing.core.PApplet;

public class Figure extends PApplet{
	float posx;
	float posy;
	float tammano;
	float dirX;
	float dirY;
	float vel;
	float r,g,b;
	
	public Figure(int width, int height) {
		
		this.posx = random (width);
		this.posy = random (height);
		this.tammano = random (30,80);
		this.r = random (255);
		this.g = random (255);
		this.b = random (255);
		this.dirX = 1;
		this.dirY = 1;
		this.vel = random(0,3);
		this.width = width;
		this.height = height;
		
	}
	
	public void move(){
		this.posx += this.vel*this.dirX;
        this.posy += this.vel*this.dirY;
        
        if(this.posx >= this.width || this.posx <=0){
            this.dirX *= -1;
        }

        if(this.posy >= this.height || this.posy <=0){
            this.dirY *= -1;
        }
        
        

        }

}
