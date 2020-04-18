//   - Andrew MacKenzie
//   - COMP 1731
//   - Test Class

import java.io.*;
import java.util.*;

public class TestMegaInt {
  public static void main(String[] args){
    MegaInt m1 = new MegaInt("547842168818141143430194787662859221078557079139019810621947969060922517842520009535823097036");
    MegaInt m2 = new MegaInt("0498588147790171492795508156789553975252529322109538233741897693313165467077");
    System.out.println(m1.add(m2));
    System.out.println(m1.subtract(m2));
    System.out.println(m1.multiply(m2));
  }
}
