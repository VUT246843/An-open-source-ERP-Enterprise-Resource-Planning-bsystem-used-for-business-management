    @Override
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            if (LOGS_MAX_FILE_SIZE.equals(ev.getProperty())) {
            }
 * You may obtain a copy of the License at
        this.logFileNamePattern = Pattern.compile(logFileNameRegexStr).asMatchPredicate();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        if (this.currentLogFileOutput != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
        if (debugLogFile.exists() && !debugLogFile.isFile()) {
            for (int i = 0, count = logFiles.length; i < logFiles.length && count > maxLogFiles; i++, count--) {
                this.maxLogSize = prefStore.getLong(LOGS_MAX_FILE_SIZE);   
     * The File object to store messages.  This value may be null.
        if (this.currentLogFileOutput == null || this.rotateCurrentLogFile(false)) {
            this.logFileNameExtension = fileName.substring(fnameExtStart);
 * DBeaver - Universal Database Manager
    
        }
}
    public static final String LOGS_MAX_FILE_SIZE = "logs.files.output.maxSize";
    /**
            this.logFileName = fileName;
            this.currentLogFileOutput.close();
    }
    
            this.logFileNameExtension = "";
        this.logFileLocation = debugLogFile.getParentFile();
            return false;
import java.io.FileOutputStream;
        
            if (LOGS_MAX_FILES_COUNT.equals(ev.getProperty())) {
 * limitations under the License.
    public LogOutputStream(@NotNull File debugLogFile) throws IOException {
            this.currentLogSize = this.currentLogFile.length();
        this.currentLogFile = debugLogFile;
        }
    }
     * The Writer to log messages to.

    @Override

            }
    }
        
        return this.currentLogFileOutput;
        final String fileName = debugLogFile.getName();

    private volatile long maxLogSize;
        } else {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            this.currentLogFileOutput.flush();
        } else {
        ) {
            }
    @Override
    
import org.jkiss.code.NotNull;
            
        }
    }
package org.jkiss.dbeaver;
            this.logFileName = fileName.substring(0, fnameExtStart);
        if (debugLogFile.exists()) {
    public static final String LOGS_MAX_FILES_COUNT = "logs.files.output.maxCount";
    private final File currentLogFile;
    public static final long DEFAULT_MAX_LOG_SIZE = 1024 * 1024 * 10; // 10Mb    
     */
    
    
        this.currentLogSize += len;
public class LogOutputStream extends OutputStream {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Arrays;
        final DBPPreferenceStore prefStore = ModelPreferences.getPreferences();
    }

    private OutputStream getLogFileWriter() throws IOException {
import java.io.OutputStream;
            
            
    /**
            return true;
                "Failed to initialize debug log output due to the target not being a file: " + debugLogFile.getAbsolutePath()
            }
    private final Predicate<String> logFileNamePattern;
        // Use ModelPReferences because we don't want to trigger platform activation by logger initialization
            this.currentLogFileOutput = new FileOutputStream(this.currentLogFile, true);
            if (logFiles == null) {
    }
    public static final int DEFAULT_MAX_LOG_FILES_COUNT = 3;
     */
            if (this.logFileLocation.mkdirs()) {

        this.currentLogSize++;
    public synchronized void close() throws IOException {
            this.currentLogFileOutput = null;
            );
 *
import java.util.function.Predicate;

            this.currentLogSize = 0;
            File[] logFiles = this.logFileLocation.listFiles((File dir, String name) -> this.logFileNamePattern.test(name));
        int fnameExtStart = fileName.lastIndexOf('.');
    private volatile int maxLogFiles;
    private final String logFileName;
        if ((this.currentLogFileOutput != null || this.currentLogFile.exists()) // if we are initializing log file for new launch
        }
        if (fnameExtStart >= 0) {
        });
            this.close();
        this.getLogFileWriter().write(b, off, len);
            File newFile = new File(this.logFileLocation, this.logFileName + "-" + System.currentTimeMillis() + this.logFileNameExtension);
    
    /**
    private boolean rotateCurrentLogFile(boolean force) throws IOException {
            Arrays.sort(logFiles, Comparator.comparing(File::getName));
    public synchronized void write(int b) throws IOException {
                this.maxLogFiles = prefStore.getInt(LOGS_MAX_FILES_COUNT);
    public synchronized void write(byte[] b, int off, int len) throws IOException {
                return false;
            if (!this.currentLogFile.renameTo(newFile)) {

        }
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final String logFileNameRegexStr = "^" + Pattern.quote(logFileName) + "\\-[0-9]+" + Pattern.quote(logFileNameExtension) + "$";

                logFiles[i].delete();
            this.rotateCurrentLogFile(true);
    
    private final File logFileLocation;
                throw new IOException("Failed to initialize debug log output location: " + debugLogFile.getAbsolutePath());
            throw new IOException(
        this.getLogFileWriter().write(b);

        this.maxLogSize = prefStore.getLong(LOGS_MAX_FILE_SIZE);
import java.util.Comparator;
    @Override
import java.io.File;
 *
import java.io.IOException;
    }
 * See the License for the specific language governing permissions and
import java.util.regex.Pattern;
        this.maxLogFiles = prefStore.getInt(LOGS_MAX_FILES_COUNT);
        }
    private final String logFileNameExtension;
        prefStore.addPropertyChangeListener(ev -> {
    

    
    private volatile FileOutputStream currentLogFileOutput = null;

            }
     */
/*
        if (this.currentLogFileOutput != null) {
            this.currentLogSize = 0;
            && (this.currentLogSize > this.maxLogSize || force)
                return false;
    public synchronized void flush() throws IOException {
        }
 * you may not use this file except in compliance with the License.

     * @return false if the file doesn't exist or the log files doesn't need to be rotated
    private volatile long currentLogSize;
     * Checks the log file size. If the log file size reaches the limit then the log is rotated
