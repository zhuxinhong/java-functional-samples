package com.zhuxinhong.basictype;

public class Sample7 {

  private static final int tt = 1;

  public static void main(String[] args) {
    Sample7 s = new Sample7();
    Short i = s.getShort();
    System.out.println(i == tt);
  }

  private Short getShort() {
    return 1;
  }

}
