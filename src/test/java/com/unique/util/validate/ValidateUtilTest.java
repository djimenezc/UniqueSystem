package com.unique.util.validate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.unique.util.validate.ValidateUtil;

public class ValidateUtilTest {

  @Test
  public void validateMail1() {

    final String substring = "gestion.adsl@pepe.es";

    assertTrue(ValidateUtil.validateMail(substring));
  }

  @Test
  public void validateMail2() {

    assertTrue(ValidateUtil.validateMail("adsl@pepe.es"));

  }

  @Test
  public void validateMailBeginWithArroba() {

    assertFalse(ValidateUtil.validateMail("@adsl"));
  }

  @Test
  public void validateMailBeginWithPoint() {

    assertFalse(ValidateUtil.validateMail(".adsl"));
  }
}
