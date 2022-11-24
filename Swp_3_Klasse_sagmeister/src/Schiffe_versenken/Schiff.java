package Schiffe_versenken;

public class Schiff {

	 private int  posX;
	 private int posY;
	boolean dirInt;
 private int length;
 private int index;
 
public Schiff(int posX, int posY, boolean dirInt, int length, int index) {
	super();
	this.posX = posX;
	this.posY = posY;
	this.dirInt = dirInt;
	this.length = length;
	this.index = index;
}
public int getPosX() {
	return posX;
}
public void setPosX(int posX) {
	this.posX = posX;
}
public int getPosY() {
	return posY;
}
public void setPosY(int posY) {
	this.posY = posY;
}
public boolean isDirInt() {
	return dirInt;
}
public void setDirInt(boolean dirInt) {
	this.dirInt = dirInt;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getIndex() {
	return index;
}

public void setIndex(int index) {
	this.index = index;
}

 
 
	
	
	
	
	
}
