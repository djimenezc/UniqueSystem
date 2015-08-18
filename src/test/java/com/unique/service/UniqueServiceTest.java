package com.unique.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.unique.service.UniqueService;
import com.unique.service.UniqueServiceImpl;

public class UniqueServiceTest {

  private UniqueService parserFileTelefonicaServiceImpl;

  @Test
  public void proccessCsvFileTest() {

    final String destinationFilePath =
      new String("destinationFile/altas_telefonica_csv.txt");
    String sourceFilePath = new String("sourceFiles/altas_telefonica.csv");

    sourceFilePath =
      System.getProperty("user.dir") + "/target/test-classes/" + sourceFilePath;

//    assertEquals(parserFileTelefonicaServiceImpl
//      .convertExcelToTelefonicaFormat(sourceFilePath, destinationFilePath, ";",
//        "\n"), 1);
  }

  // @Test
  // public void proccessOdsFileTest() {
  //
  // final String destinationFilePath =
  // new String("destinationFile/altas_telefonica_ods.txt");
  // String sourceFilePath = new String("sourceFiles/altas_telefonica.ods");
  //
  // sourceFilePath =
  // System.getProperty("user.dir") + "/target/test-classes/" + sourceFilePath;
  //
  // assertEquals(parserFileTelefonicaService.convertExcelToTelefonicaFormat(
  // sourceFilePath, destinationFilePath, ";", "\n"), 1);
  // }

  @Test
  public void proccessXlsFileTest() {

    final String destinationFile =
      new String("destinationFile/altas_telefonica_xls.txt");
    String sourceFilePath = new String("sourceFiles/altas_telefonica.xls");

    sourceFilePath =
      System.getProperty("user.dir") + "/target/test-classes/" + sourceFilePath;

//    assertEquals(parserFileTelefonicaServiceImpl
//      .convertExcelToTelefonicaFormat(sourceFilePath, destinationFile, ";",
//        "\n"), 1);
  }

  @Before
  public void setup() {

    parserFileTelefonicaServiceImpl = new UniqueServiceImpl();
  }

  @After
  public void tearDown() {
  }
}
