package kuis_sem_3;

public class Cube extends Square{private double depth;Cube(double newheight,double newwidth,double newdepth){super(newheight,newwidth);depth = newdepth;}
public double getdepth() {return depth;}
public double setdepth(double newdepth){return newdepth = depth;}
public double computesurfaceArea() {return height*width*depth;}
}
