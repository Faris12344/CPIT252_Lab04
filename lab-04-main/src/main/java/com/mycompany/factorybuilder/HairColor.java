

package com.mycompany.factorybuilder;

public enum HairColor {

  WHITE,
  BLOND,
  RED,
  BROWN,
  BLACK,
  //added none for bald charecters
  NONE;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
