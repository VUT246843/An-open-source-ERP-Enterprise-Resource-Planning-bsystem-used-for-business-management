                totalCopied += count;
                if (count <= 0) {
            NumberFormat nf = new ByteNumberFormat(ByteNumberFormat.BinaryPrefix.ISO);
        }
    public static void saveContentToFile(InputStream contentStream, File file, DBRProgressMonitor monitor)

        }
    }
            }
        File file,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static Path makeTempFile(Path folder, String name, String extension) throws IOException {
                        IOUtils.close(contentStream);
        return mimeType != null && mimeType.toLowerCase(Locale.ENGLISH).startsWith("text");
                }
                    return (String) cachedValue;

    private static final String LOB_DIR = ".lob"; //$NON-NLS-1$
                    return;
        String backupFileName = file.getFileName().toString() + ".bak";
    }
    }
            copyStreams(contentReader, file.length(), writer, monitor);
            backupFileName = "." + backupFileName;
                length += count;
        } catch (IOException e) {
    }
        } catch (CoreException e) {
 *
                }

    }
            getLobFolder(monitor, application),
                Date backupTime = new Date(Files.getLastModifiedTime(backupFile).toMillis());

        return contentType != null && contentType.toLowerCase(Locale.ENGLISH).startsWith("text");
            if (!file.delete()) {
    }
        return IOUtils.readToString(new UnicodeReader(is, charset));
        return object.toString();
            long totalCopied = 0;
/**
        }
            log.warn("Error closing stream", e);
            }
            }
                List<Path> files = list.toList();
        if (Files.exists(backupFile)) {
            } catch (IOException e) {
*/
        return file;
    }
    public static byte[] getContentBinaryValue(@NotNull DBRProgressMonitor monitor, @NotNull DBDContent object) throws DBCException {
        if (file.isDirectory()) {

        }
        }
            }
    }
        InputStream inputStream,
        @NotNull DBPPlatform application,
        String contentType = content == null ? null : content.getContentType();
        }
            fileName,
        }
                int count = reader.read(buffer);
            return;
    public static void deleteTempFile(Path tempFile) {
        try {
        // Check for cancel
            }
        DBDContentStorage data = object.getContents(monitor);
import org.jkiss.utils.CommonUtils;
                        ContentUtils.copyStreams(contentReader, object.getContentLength(), buf, monitor);
    public static boolean isTextValue(Object value) {
                int count = reader.read(buffer);
            if (!file.delete()) {
                if (contentLength > 0) {
                monitor.worked(STREAM_COPY_BUFFER_SIZE);

        }
    }
            Files.delete(tempFile);
        }
        Reader reader,
                log.debug("Can't extract string from content", e);
    private static final Log log = Log.getLog(ContentUtils.class);
        }

            if (data instanceof DBDContentCached) {
                    } finally {
        }
        if (data != null) {
        DBDContentStorage data = object.getContents(monitor);
                    } finally {
        }
        try {
        return MimeTypes.TEXT_JSON.equalsIgnoreCase(content.getContentType());
package org.jkiss.dbeaver.utils;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Files.createFile(tempFile);
        if (!Files.exists(file)) {
    @Nullable

    }
        if (monitor.isCanceled()) {
                    if (!deleteFileRecursive(ch)) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.IOUtils;
import org.jkiss.code.Nullable;
        if (bytes == null || bytes.length == 0) {
/*
            }
            } catch (IOException e) {
                outputStream.write(buffer, 0, count);
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), charset)) {
            try {
        }
 *
        return calculateContentLength(
                Object cachedValue = ((DBDContentCached) data).getCachedValue();
                }
            try (Stream<Path> list = Files.list(file)) {
                }
        name = CommonUtils.escapeFileName(name);
import java.io.*;
        monitor.beginTask("Copy binary content", contentLength < 0 ? STREAM_COPY_BUFFER_SIZE : (int) contentLength);
        if (value instanceof CharSequence) {
        return null;
 */
        String charset)
        } finally {
            }
                if (!Character.isLetterOrDigit(b) && !Character.isSpaceChar(b) && !Character.isISOControl(b)) {

                return false;
    }
    }
                    }
                    }
                        StringWriter buf = new StringWriter();
        DBRProgressMonitor monitor)
 * limitations under the License.
        try {
    public static void close(Closeable closeable) {
                if (cachedValue instanceof String) {
            if (data instanceof DBDContentCached) {
        }
    public static boolean isJSON(DBDContent content) {
            return false;
                }
                if (CommonUtils.isSameDay(backupTime, new Date())) {

    public static void copyStreams(
        try {
        throws IOException {
        throws IOException {
                    break;

    public static String getContentStringValue(@NotNull DBRProgressMonitor monitor, @NotNull DBDContent object) throws DBCException {
        long contentLength,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    break;
                        IOUtils.close(contentReader);
                    if (!deleteFileRecursive(ch)) {
        if (data != null) {
                    try {
            copyStreams(contentStream, file.length(), os, monitor);
        long contentLength,
            monitor.done();
 * DBeaver - Universal Database Manager
            char[] buffer = new char[STREAM_COPY_BUFFER_SIZE];
                if (contentStream != null) {
            return length;

        return file.delete();

        }
                        return false;

    static final int STREAM_COPY_BUFFER_SIZE = 10000;
    }
    }
            for (; ; ) {
        return true;
                    break;
    }
                int count = inputStream.read(buffer);
            charset);
        }
            // Delete output file
            for (; ; ) {
public class ContentUtils {
            log.error("Can't set file charset", e);
        }
                        return buf.toString();
                for (File ch : files) {
        throws IOException {
}
            new InputStreamReader(
                        ContentUtils.copyStreams(contentStream, object.getContentLength(), buf, monitor);
    public static boolean isAsciiText(@Nullable byte[] bytes) {
import org.jkiss.dbeaver.model.data.DBDContentCached;
        try {
    }
        }
        for (byte b : bytes) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.DBDContent;
            String subtaskSuffix = " / " + nf.format(contentLength);
                log.error("Error getting file modified time", e);
 * distributed under the License is distributed on an "AS IS" BASIS,
        Path backupFile = file.getParent().resolve(backupFileName);

        try {
                        ByteArrayOutputStream buf = new ByteArrayOutputStream();

            }
    }
                }

        throws IOException {
            if (b < ' ' || '~' < b) {

            }
                    try {
            if (files != null) {
import org.jkiss.dbeaver.model.exec.DBCException;
            log.error("Error creating backup copy of " + file.toAbsolutePath(), e);
        if (!tempFile.delete()) {
import java.util.stream.Stream;
            String charset = application.getPreferenceStore().getString(ModelPreferences.CONTENT_HEX_ENCODING);
        DBRProgressMonitor monitor)
        if (object.isNull()) {

        if (monitor.isCanceled()) {

        try (reader) {
    }
    public static boolean isXML(DBDContent content) {
        monitor.beginTask("Copy character content", contentLength < 0 ? STREAM_COPY_BUFFER_SIZE : (int) contentLength);
        }
        String charset)
        OutputStream outputStream,
                writer.write(buffer, 0, count);
                }
import java.nio.file.Path;
    }
                }

    public static long calculateContentLength(
                if (cachedValue instanceof byte[]) {
    }
        } catch (IOException e) {
    @Nullable
            return true;
        throws IOException {
                    break;

            long length = 0;
        Writer writer,
    public static boolean isTextContent(DBDContent content) {

                    }
import java.util.List;
            }

                }
        return tempFile;
            new FileInputStream(file),
                Object cachedValue = ((DBDContentCached) data).getCachedValue();
        } catch (IOException e) {
 */
            return null;
        return MimeTypes.TEXT_XML.equalsIgnoreCase(content.getContentType());
        return true;
 *
            }
                }
                log.warn("Error reading directory " + file, e);
        if (value == null) {
            }
    public static Path getLobFolder(@NotNull DBRProgressMonitor monitor, @NotNull DBPPlatform application) throws IOException {
import java.nio.file.StandardCopyOption;
                        return false;
            monitor.done();

        Path tempFile = folder.resolve(name + "-" + System.currentTimeMillis() + "." + extension);  //$NON-NLS-1$ //$NON-NLS-2$
        @NotNull String fileName
import org.jkiss.utils.ByteNumberFormat;
        }
import java.util.Date;
 * You may obtain a copy of the License at
                if (monitor.isCanceled()) {
                InputStream contentStream = data.getContentStream();
            } catch (IOException e) {
        InputStream stream,
            Files.deleteIfExists(file);
        return application.getTempFolder(monitor, LOB_DIR);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public static long calculateContentLength(
            File[] files = file.listFiles();
    }
    public static Path createTempContentFile(
 * See the License for the specific language governing permissions and
        if (Files.isDirectory(file)) {
        return true;
    ) throws IOException {
                Reader contentReader = data.getContentReader();
    public static boolean isTextMime(String mimeType) {
import org.jkiss.code.NotNull;
                charset));

            "data");
    public static void copyStreams(
            closeable.close();

            return false;
            // Delete output file
                }

        } catch (Exception e) {
        @NotNull DBRProgressMonitor monitor,
                }
        return calculateContentLength(
                    }
            }
/*
import java.text.NumberFormat;
                if (monitor.isCanceled()) {
                if (count <= 0) {
                if (contentReader != null) {
    public static boolean deleteFileRecursive(File file) {
            log.warn("Error deleting file " + file, e);
        throws IOException {
            try {

                    monitor.subTask(nf.format(totalCopied) + subtaskSuffix);
                monitor.worked(STREAM_COPY_BUFFER_SIZE);
                    return false;
        }
 * Content manipulation utilities
    }
            byte[] buffer = new byte[STREAM_COPY_BUFFER_SIZE];
                }
                for (Path ch : files) {
        if (value instanceof byte[]) {
    public static boolean deleteFileRecursive(Path file) {

        try {
import org.jkiss.dbeaver.model.app.DBPPlatform;
                stream,
        return makeTempFile(
            log.warn("Can't delete temp file '" + tempFile.getAbsolutePath() + "'");
            return false;
                        return buf.toByteArray();
            Files.copy(file, backupFile, StandardCopyOption.REPLACE_EXISTING);
                log.debug("Can't extract string from content", e);
    public static long calculateContentLength(Reader reader) throws IOException {
    public static void deleteTempFile(File tempFile) {
    }
    }
import java.nio.file.Files;
                }
        try (OutputStream os = new FileOutputStream(file)) {
        if (!backupFileName.startsWith(".")) {
                if (count <= 0) {
        }
                log.warn("Can't delete incomplete file '" + file.getAbsolutePath() + "'");
 * you may not use this file except in compliance with the License.
    public static String readToString(InputStream is, Charset charset) throws IOException {

import org.jkiss.dbeaver.model.data.DBDContentStorage;
import java.nio.charset.Charset;
    }
            for (byte b : (byte[]) value) {
        } finally {
import java.util.Locale;
            try {
                    return (byte[]) cachedValue;
        // Check for cancel
                log.warn("Can't delete incomplete file '" + file.getAbsolutePath() + "'");
    public static void makeFileBackup(Path file) {
            char[] buffer = new char[STREAM_COPY_BUFFER_SIZE];
            }
        }
                    break;
    public static void saveContentToFile(Reader contentReader, File file, String charset, DBRProgressMonitor monitor)
            } catch (IOException e) {
import org.jkiss.dbeaver.Log;
            file.setCharset(charset, monitor.getNestedMonitor());

        }
        }
            for (; ; ) {
            log.warn("Can't delete temp file '" + tempFile.toAbsolutePath() + "'");
        }
