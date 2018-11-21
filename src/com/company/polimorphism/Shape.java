package com.company.polimorphism;

public abstract class Shape {

  private float width;
  private float height;

  public void setWidth(float width){
    this.width= width;
  }

  public void setHeight (float height){
    this.height = height;
  }

  public float getWidth (){
    return this.width;
  }

  public float getHeight(){
    return this.height;
  }

  public abstract String draw();

}
