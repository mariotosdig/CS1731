//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 3
//   - 4.13.2020

public final class MegaInt{
  private final char[] VALID_CHARACTERS = {'0','1','2','3','4','5','6','7','8','9','-'};
  private final byte[] VALID_BYTES = {48,49,50,51,52,53,54,55,56,57};
  private byte[] digits;
  private boolean isNegative;

  private boolean contains(char[] characters, char c){ // helper method
    for (int i=0; i < characters.length; i++){
      if (c == characters[i]){
        return true;
      }
    }
    return false;
  }

  private boolean contains(byte[] bytes, byte b){ // helper method
    for (int i=0; i < bytes.length; i++){
      if (b == bytes[i]){
        return true;
      }
    }
    return false;
  }

  MegaInt(String str_integer){
    super();

    if (str_integer == null){
      throw new IllegalArgumentException("Value cannot be null.");
    } else if (str_integer.equals("-")){
      throw new IllegalArgumentException("Value must be a number.");
    } else if (str_integer.equals("")){
      throw new IllegalArgumentException("Value cannot be empty");
    }

    for (int i = 0; i < str_integer.length(); i++){
      if (!contains(VALID_CHARACTERS, str_integer.charAt(i))){
        throw new IllegalArgumentException("Value must only include digits and an optional negative sign.");
      }
    }

    if (str_integer.charAt(0) == '-'){
      isNegative = true;
      str_integer = str_integer.substring(1);
    }

    int zero_count = 0;
    for (int i = 0; i < str_integer.length(); i++){
      if (str_integer.charAt(i) == '0'){
        zero_count++;
      } else {
        break;
      }
    }

    if (str_integer.length() == zero_count){
      isNegative = false;
      str_integer = "0";
    } else {
      str_integer = str_integer.substring(zero_count);
    }

    byte[] digits = new byte[str_integer.length()];

    int j = 0;
    for (int i = str_integer.length()-1; i >= 0; i--){
      digits[j] = (byte) str_integer.charAt(i);
      j++;
    }

    this.digits = digits;
    this.isNegative = isNegative;
  }

  public MegaInt(byte[] inDigits, boolean isNegative){
    if (inDigits == null){
      throw new IllegalArgumentException("Value cannot be null.");
    } else if (inDigits.length == 0) {
      throw new IllegalArgumentException("Value cannot have length of zero.");
    }

    for (int i=0; i < inDigits.length; i++){
      if (!(contains(VALID_BYTES, inDigits[i]))){
        throw new IllegalArgumentException("Array must only consist of digits 0-9.");
      }
    }

    int zero_count = 0;
    for (int i = inDigits.length-1; i >= 0; i--){
      if (inDigits[i] == 0){
        zero_count++;
      }
    }

    if (inDigits.length == zero_count){
      isNegative = false;
      byte[] digits = {0};
    } else {
      byte[] digits = new byte[inDigits.length - zero_count];
      for (int i=0; i < (digits.length); i++){
        digits[i] = inDigits[i];
      }
    }

    this.isNegative = isNegative;
    this.digits = inDigits;
  }

  public String toString(){
    StringBuilder build = new StringBuilder();
    if (isNegative == true){
      build.append('-');
    }
    for (int i = digits.length-1; i >= 0; i--){
      build.append( (char) digits[i]);
    }
    return build.toString();
  }

  public static int compareAbs(MegaInt m1, MegaInt m2){
    if (m1 == null || m2 == null){
      throw new IllegalArgumentException("Value cannot be null.");
    }
    if (m1.digits.length < m2.digits.length){
      return -1;
    } else if (m1.digits.length > m2.digits.length) {
      return 1;
    }
    for(int i = 0; i < m1.digits.length; i++){
      if (m1.digits[i] < m2.digits[i]){
        return -1;
      } else if (m1.digits[i] > m2.digits[i]) {
        return 1;
      }
    }
    return 0;
  }

  public MegaInt add(MegaInt other){
    if (other == null){
      throw new IllegalArgumentException("Value cannot be null.");
    }
    if (isNegative==true && other.isNegative == true) { // both are negative
      String num1 = "0" + this.toString().substring(1);
      String num2 = "0" + other.toString().substring(1);
      String num3 = new String();
      String leading_zeros = new String();
      int carry = 0;
      int digit = 0;

      // addition start
      if (num1.length() > num2.length()){
        for (int i = 0; i < num1.length() - num2.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num2 = leading_zeros + num2;
      } else if (num1.length() < num2.length()){
        for (int i = 0; i < num2.length() - num1.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num1 = leading_zeros + num1;
      }

      int max = num1.length() - 1;
      for (int i = max; i >= 0; i--){
        if (Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry >= 10){
          digit = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry - 10;
          carry = 1;
        } else {
          digit = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry;
          carry = 0;
        }
        num3 = digit + num3;
      }
      // addition end
      return new MegaInt("-" + num3);
    } else if (isNegative == false && other.isNegative == false) { // both are positive
      String num1 = "0" + this.toString();
      String num2 = "0" + other.toString();
      String num3 = new String();
      String leading_zeros = new String();
      int carry = 0;
      int digit = 0;

      if (num1.length() > num2.length()){
        for (int i = 0; i < num1.length() - num2.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num2 = leading_zeros + num2;
      } else if (num1.length() < num2.length()){
        for (int i = 0; i < num2.length() - num1.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num1 = leading_zeros + num1;
      }

      int max = num1.length() - 1;
      for (int i = max; i >= 0; i--){
        if (Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry >= 10){
          digit = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry - 10;
          carry = 1;
        } else {
          digit = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry;
          carry = 0;
        }
        num3 = digit + num3;
      }

      return new MegaInt(num3);
    } else if (isNegative == false && other.isNegative == true){ // pos plus neg
      MegaInt pos = this;
      MegaInt neg = new MegaInt(other.toString().substring(1));
      return pos.subtract(neg);
    } else if (isNegative == true && other.isNegative == false){ // neg plus pos
      MegaInt neg = new MegaInt(this.toString().substring(1));
      MegaInt pos = other;
      return pos.subtract(neg);
    } else return null;
  }

  public MegaInt subtract(MegaInt other){
    if (other == null){
      throw new IllegalArgumentException("Value cannot be null.");
    }
    if (isNegative == false && other.isNegative == false){ // both positive
      String num1 = this.toString();
      String num2 = other.toString();
      String num3 = new String();
      String bigger = new String();
      String smaller = new String();
      String leading_zeros = new String();
      boolean not_zero = true;
      int carry = 0;
      int digit = 0;

      if (num1.length() > num2.length()){
        for (int i = 0; i < num1.length() - num2.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num2 = leading_zeros + num2;
      } else if (num1.length() < num2.length()){
        for (int i = 0; i < num2.length() - num1.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num1 = leading_zeros + num1;
      }
      if (MegaInt.compareAbs(this, other) == 1){
        bigger = num1;
        smaller = num2;
      } else if (MegaInt.compareAbs(this, other) == -1){
        bigger = num2;
        smaller = num1;
      } else {
        not_zero = false;
      }

      if (not_zero){
        int max = num1.length() - 1;
        for (int i = max; i >= 0; i--){
          if (Character.getNumericValue(bigger.charAt(i)) - Character.getNumericValue(smaller.charAt(i)) - carry < 0){
            digit = Character.getNumericValue(bigger.charAt(i)) + 10 - Character.getNumericValue(smaller.charAt(i)) - carry;
            carry = 1;
          } else {
            digit = Character.getNumericValue(bigger.charAt(i)) - Character.getNumericValue(smaller.charAt(i)) - carry;
            carry = 0;
          }
          num3 = digit + num3;
        }
      } else {
        num3 = "0";
      }

      MegaInt m3 = new MegaInt(num3);
      MegaInt sign = new MegaInt("" + MegaInt.compareAbs(this, other));
      return m3.multiply(sign);
    } else if (isNegative == true && other.isNegative == true){ // both negative
      String num1 = this.toString().substring(1);
      String num2 = other.toString().substring(1);
      String num3 = new String();
      String bigger = new String();
      String smaller = new String();
      String leading_zeros = new String();
      boolean not_zero = true;
      int carry = 0;
      int digit = 0;

      if (num1.length() > num2.length()){
        for (int i = 0; i < num1.length() - num2.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num2 = leading_zeros + num2;
      } else if (num1.length() < num2.length()){
        for (int i = 0; i < num2.length() - num1.length(); i++){
          leading_zeros = leading_zeros + "0";
        }
        num1 = leading_zeros + num1;
      }

      if (MegaInt.compareAbs(this, other) == 1){
        bigger = num1;
        smaller = num2;
      } else if (MegaInt.compareAbs(this, other) == -1){
        bigger = num2;
        smaller = num1;
      } else {
        not_zero = false;
      }

      if (not_zero){
        int max = num1.length() - 1;
        for (int i = max; i >= 0; i--){
          if (Character.getNumericValue(bigger.charAt(i)) - Character.getNumericValue(smaller.charAt(i)) - carry < 0){
            digit = Character.getNumericValue(bigger.charAt(i)) - Character.getNumericValue(smaller.charAt(i)) - carry + 10;
            carry = 1;
          } else {
            digit = Character.getNumericValue(bigger.charAt(i)) - Character.getNumericValue(smaller.charAt(i)) - carry;
            carry = 0;
          }
          num3 = digit + num3;
        }
      } else {
        num3 = "0";
      }

      MegaInt m3 = new MegaInt(num3);
      MegaInt sign = new MegaInt("" + MegaInt.compareAbs(other, this));
      return m3.multiply(sign);
    } else if (isNegative == false && other.isNegative == true){ // pos minus neg
      MegaInt pos = this;
      MegaInt neg = new MegaInt(other.toString().substring(1));
      return pos.add(neg);
    } else if (isNegative == true && other.isNegative == false){ // neg minus pos
      MegaInt neg = new MegaInt("-" + other.toString());
      return this.add(neg);
    } else return null;
  }

  public MegaInt multiply(MegaInt other){
    String num1 = this.toString();
    String num2 = other.toString();
    MegaInt total = new MegaInt("0");
    String first_zeros = new String();
    String second_zeros = new String();
    boolean negative = false;
    int digit; // naming it digit even though it will be 2 digits in many cases

    if (other == null){
      throw new IllegalArgumentException("Value cannot be null.");
    }

    if (isNegative == false && other.isNegative == false){
      negative = false;
    } else if (isNegative == true && other.isNegative == true){
      negative = false;
      num1 = this.toString().substring(1);
      num2 = other.toString().substring(1);
    } else if (isNegative == true && other.isNegative == false && !num1.equals("0") && !num2.equals("0")){
      negative = true;
      num1 = this.toString().substring(1);
    } else if (isNegative == false && other.isNegative == true && !num1.equals("0") && !num2.equals("0")){
      negative = true;
      num2 = other.toString().substring(1);
    }

    for (int i = num1.length() - 1; i >= 0; i--){
      first_zeros = "";
      for (int j = num2.length() - 1; j >= 0; j--){
        digit = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
        total = total.add(new MegaInt(digit + first_zeros + second_zeros));
        first_zeros = first_zeros + "0";
      }
      second_zeros = second_zeros + "0";
    }
    return new MegaInt(total.digits, negative);
  }
}
