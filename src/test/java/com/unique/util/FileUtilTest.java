package com.unique.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.unique.exceptions.FileException;
import com.unique.types.FileExtensions;
import com.unique.util.file.FileUtil;

public class FileUtilTest {

  @Test
  public void getFileExtensionLinux() {

    final String filePath = "/home/user/testFile.xls";

    final String extension = FileUtil.getFileExtension(filePath);

    assertEquals(extension, FileExtensions.XLS.getValue());
  }

  @Test
  public void getFileExtensionWindows() {

    final String filePath = "c:\test\testFile.txt";

    final String extension = FileUtil.getFileExtension(filePath);

    assertEquals(extension, FileExtensions.TXT.getValue());
  }

}
