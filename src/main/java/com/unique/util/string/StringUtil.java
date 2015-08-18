package com.unique.util.string;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.unique.util.DefaultValues;
import com.unique.util.helper.DateHelper;

/**
 * Class that handles string utilities
 * 
 * @author djimenezc
 * @version 1.0
 */
public class StringUtil {

  /* Constant for left justification. */
  public static final int JUST_LEFT = 'l';

  /* Constant for centering. */
  public static final int JUST_CENTRE = 'c';
  /* Constant for right-justified Strings. */
  public static final int JUST_RIGHT = 'r';
  public static final char CHAR_SPACE = ' ';
  public static final String CHAR_ZERO = "0";
  public static final int TWO = 2;
  public static final int FIVE = 5;
  public static final int SIX = 6;
  public static final int EIGH = 8;

  public static boolean contains(final String frase, final String palabra) {
    final int index = frase.toUpperCase().indexOf(palabra.toUpperCase());
    return index != -1;
  }

  public static String deleteLastCharacter(final String string,
    final char characterDelete) {

    final StringBuffer stringBuffer = new StringBuffer();

    final StringTokenizer stringTokenizer = new StringTokenizer(string);

    final int lastPositionDelete =
      string.lastIndexOf(characterDelete) - string.length();

    int position = 0;

    while (stringTokenizer.hasMoreElements()
      && (position != lastPositionDelete)) {

      stringBuffer.append(stringTokenizer.nextElement());
      position++;
    }

    return stringBuffer.toString();
  }

  /**
   * Delete left spaces
   * 
   * @param input
   * @return String
   */
  public static String deleteSpace(final String input) {
    return input.replaceAll(" +", "");
  }

  public static String fillNumberWithChars(final int number,
    final char fillChar, final int size) {

    String string = String.valueOf(number);

    final int stringLength = string.length();

    if (stringLength < size) {

      final String stringFilled = new String();

      for (int i = 0; i == (size - stringLength); i++) {

        stringFilled.concat(String.valueOf(fillChar));
      }

      string = stringFilled.concat(string);
    }

    return string;
  }

  /**
   * @param cadena
   * @param longitud
   * @return a new string with left padding.
   */
  public static String fillsLeftWithZeros(final String cadena,
    final long longitud) {

    String retString;

    if (cadena.length() >= longitud) {
      retString = cadena;
    }
    else {
      final long longitudARellenar = longitud - cadena.length();
      String zeroString = DefaultValues.DEFAULT_STRING;
      for (long i = 0; i < longitudARellenar; i++) {
        zeroString = zeroString.concat(DefaultValues.ZERO_STRING);
      }
      retString = zeroString.concat(cadena);
    }
    return retString;
  }

  /**
   * Format a String.
   * 
   * @param input
   *          - the string to be aligned.
   * @param capacity
   *          - Current max length
   * @param just
   *          - Current justification.
   */
  public static String format(final String input, final int capacity,
    final int just) {
    final StringBuffer output = new StringBuffer();
    final String wanted =
      input.substring(0, Math.min(input.length(), capacity));
    switch (just) {
      case JUST_RIGHT:
        pad(output, capacity - wanted.length());
        output.append(wanted);
        break;
      case JUST_CENTRE:
        final int toAdd = capacity - wanted.length();
        pad(output, toAdd / 2);
        output.append(wanted);
        pad(output, toAdd - toAdd / 2);
        break;
      case JUST_LEFT:
        output.append(wanted);
        pad(output, capacity - wanted.length());
        break;
      default:

    }

    return output.toString();
  }

  /**
   * Converts numeric parameters to a string type(invoice counter)
   * 
   * @param input
   * @return String
   */
  public static String getInvoiceNumber(final String prefix, final Long middle,
    final Long suffix) {
    final String outputSite = "" + prefix;
    final String outputWorkstation = "" + middle;
    final String outputCounter = "" + suffix;
    return fillsLeftWithZeros(outputSite, FIVE)
      + fillsLeftWithZeros(outputWorkstation, TWO)
      + fillsLeftWithZeros(outputCounter, FIVE);

  }

  /**
   * Converts numeric parameters to a string type(pre invoice counter)
   * 
   * @param input
   * @return String
   */
  public static String getPreInvoiceNumber(final String prefix,
    final Long middle, final Long suffix) {
    final String outputSite = "" + prefix;
    final String outputWorkstation = "" + middle;
    final String outputCounter = "" + suffix;
    final String currentDate = DateHelper.getInstance().getStringCurrentDate();
    return fillsLeftWithZeros(outputSite, FIVE)
      + fillsLeftWithZeros(outputWorkstation, TWO)
      + fillsLeftWithZeros(outputCounter, FIVE) + currentDate;

  }

  public static boolean isEmptyString(final String substring) {

    final String stringPattern = "\\s*";

    final Pattern pattern = Pattern.compile(stringPattern);
    final Matcher matcher = pattern.matcher(substring);
    final boolean result = matcher.matches();

    return result;
  }

  private static void pad(final StringBuffer stringBuffer, final int quantity) {
    for (int i = 0; i < quantity; i++) {
      stringBuffer.append(CHAR_SPACE);
    }
  }

  private StringUtil() {
  }

}
