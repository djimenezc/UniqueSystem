package com.unique.document;

import java.awt.Toolkit;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;

public class CharacterLimitator extends DefaultStyledDocument {

  /**
   * 
   */
  private static final long serialVersionUID = 3659835416399217918L;

  int characterLimit;

  public CharacterLimitator(final int characterLimit) {

    this.characterLimit = characterLimit;
  }

  @Override
  public void insertString(final int offs, final String str,

  final AttributeSet a) throws BadLocationException {

    if ((str.indexOf("?") == -1) && (str.indexOf("?") == -1)
      && ((getLength() + str.length()) <= characterLimit)) {
      super.insertString(offs, str, a);
    }
    else {
      Toolkit.getDefaultToolkit().beep();
    }
  }

}