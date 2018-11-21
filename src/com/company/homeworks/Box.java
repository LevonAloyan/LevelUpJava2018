package com.company.homeworks;

public class Box {

  private int width;
  private int height;
  private int depth;
  private String name;

  // Constructor of class Box
  public Box(String name, int width, int height, int depth) {
    this.name = name;
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  // isBoxSidesValid method validating box side (width, height and depth)
  private boolean isBoxSidesValid(int width, int height, int depth) {
    return width > 0 && height > 0 && depth > 0;
  }

  // countVolume method counts volume of box
  public void countVolume() {
    boolean isBoxValide = isBoxSidesValid(width, height, depth);
    if (isBoxValide) {
      int countVolumeSize = width * height * depth;
      System.out.println(name + " " + "Volume equal to " + countVolumeSize);
    } else {
      System.out.println(name + " " + "Volume can't be zero or have negative value");
    }
  }

  // Box class Getter and Setter of variables
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getDepth() {
    return depth;
  }

  public void setDepth(int depth) {
    this.depth = depth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}