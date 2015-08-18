package com.unique.util.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.unique.exceptions.FileException;

/**
 * @author djimenez
 * @version 1.0
 */
public final class FileUtil {

	private static final int BUFFER_SIZE = 256;
	private static final Logger logger = Logger.getLogger(FileUtil.class);

	public static String getFileExtension(final String sourceFilePath) {

		final String[] pathSplited = sourceFilePath.split("\\.");

		final String extension = pathSplited[pathSplited.length - 1];

		return extension;
	}

	/**
	 * @param inputStream
	 * @param count
	 *            number of bytes that it will return
	 * @return
	 * @throws FileException
	 * @throws IOException
	 */
	public static String readBytes(final InputStream inputStream,
			final int count) throws FileException, IOException {

		final byte[] buffer = new byte[BUFFER_SIZE];

		if (inputStream.read(buffer, 0, count) < count) {
			throw new FileException("Expected to read " + count
					+ " bytes from file but EOF");
		}

		return new String(buffer, 0, count);
	}

	/**
	 * @param file
	 * @return
	 * @throws FileException
	 * @throws IOException
	 */
	public static List<String> readLines(final File file) throws FileException,
			IOException {

		LineNumberReader lineReader = null;
		final BufferedReader bufferReader = new BufferedReader(new FileReader(
				file));
		final List<String> lines = new ArrayList<String>();

		try {

			lineReader = new LineNumberReader(bufferReader);
			String line = "";

			while ((line = bufferReader.readLine()) != null) {

				lines.add(line);

				logger.debug("Line:  " + lineReader.getLineNumber() + ": "
						+ line);

			}
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			bufferReader.close();
			lineReader.close();
		}

		return lines;
	}

	/**
	 * @param file
	 * @param count
	 * @return
	 * @throws FileException
	 * @throws IOException
	 */
	public static String readLines(final File file, final int count)
			throws FileException, IOException {

		final BufferedReader bufferReader = new BufferedReader(new FileReader(
				file));
		final StringBuffer stringBuffer = new StringBuffer();

		try {

			while (bufferReader.ready()) {
				stringBuffer.append(bufferReader.readLine());
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}

		return stringBuffer.toString();
	}

	public static String readOdsToCsv(final InputStream is,
			final int recordsLimit, final String columnSeparator,
			final String rowSeparator) {

		return null;
	}

	public static List<String> readOdsToList(final InputStream is,
			final int recordsLimit, final String columnSeparator,
			final String rowSeparator) {

		return null;
	}

	private FileUtil() {
	}
}
