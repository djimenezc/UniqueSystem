package com.unique.util.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {

  public static boolean isContainIlegalCharacters(String substring,
    final String stringPattern) {

    final Pattern pattern = Pattern.compile(stringPattern);
    final Matcher matcher = pattern.matcher(substring);
    final StringBuffer sb = new StringBuffer();
    boolean result = matcher.find();
    boolean illegalCharacters = false;

    while (result) {
      illegalCharacters = true;
      matcher.appendReplacement(sb, "");
      result = matcher.find();
    }

    // Añade el ultimo segmento de la entrada a la cadena
    matcher.appendTail(sb);

    substring = sb.toString();

    if (illegalCharacters) {
      return true;
    }

    return false;
  }

  /**
   * @param substring
   * @param patternString
   * @return
   */
  public static boolean isCorrectPattern(final String substring,
    final String patternString) {

    final Pattern p = Pattern.compile(patternString);
    final Matcher m = p.matcher(substring);

    if (m.find()) {
      return false;
    }

    return true;
  }

  public static boolean isValidateIntSize(final String string, final int size) {

    boolean validateIntSize = true;

    final Pattern p = Pattern.compile("[^0-9]");
    final Matcher m = p.matcher(string);

    if (m.find() || (string.length() != size)) {
      validateIntSize = false;
    }

    return validateIntSize;
  }

  /**
   * Method that check if the mail is build correctly
   * 
   * @param substring
   * @return 1 -> mail is correct <br/>
   *         -1 -> general error, mail format incorrect<br/>
   *         -2 -> error, mail can't begin with . o @ <br/>
   *         -3 -> error, mail can't begin with www. <br/>
   *         -4 -> error, mail doesn't contain @ <br/>
   *         -5 -> error, mail contain illegal characters <br/>
   */
  // public static int validateMail(final String substring) {
  //
  // if (!isCorrectPattern(substring, "^.")) {
  // return -2;
  // }
  //
  // if (!isCorrectPattern(substring, "^@")) {
  // return -2;
  // }
  //
  // if (!isCorrectPattern(substring, "^www.")) {
  // return -3;
  // }
  //
  // if (isCorrectPattern(substring, "@")) {
  // return -4;
  // }
  //
  // if (isContainIlegalCharacters(substring, "[^A-Za-z0-9.@_-~#]+")) {
  // return -5;
  // }
  //
  // return 1;
  // }

  public static boolean validateMail(final String substring) {

    final String conditionMail =
      "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Za-z]{2,4}$";
    if (!substring.matches(conditionMail)) {
      return false;
    }
    return true;
  }

}
