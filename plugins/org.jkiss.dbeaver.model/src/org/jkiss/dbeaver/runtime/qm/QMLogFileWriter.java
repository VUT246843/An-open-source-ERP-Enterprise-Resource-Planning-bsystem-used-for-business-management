 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            String logFolderPath = preferences.getString(QMConstants.PROP_LOG_DIRECTORY);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
            QMMConnectionInfo sessionInfo = (QMMConnectionInfo) object;
        QMMObject object = event.getObject();
 * you may not use this file except in compliance with the License.
import java.io.File;
        // Filter
                    try {
import org.jkiss.utils.CommonUtils;
        // Entry
        StringBuilder logBuffer = new StringBuilder(4000);
            int subSeverity = executeInfo.hasError() ? IStatus.ERROR : severity;
    }
    private synchronized void initLogFile()
        // Message
    }
package org.jkiss.dbeaver.runtime.qm;
                    } catch (DateTimeParseException e) {
        if (enabled) {
import org.jkiss.code.NotNull;

public class QMLogFileWriter implements QMMetaListener, DBPPreferenceListener {
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

    public QMLogFileWriter()

import java.util.stream.Stream;
 * Unless required by applicable law or agreed to in writing, software

            padding = padding / 10;
    private final String lineSeparator;
                logWriter = null;
    }
                logFolderPath = GeneralUtils.getMetadataFolder().toAbsolutePath().toString();
                    log.error("Can't create log folder '" + logFolderPath + "'");
 * You may obtain a copy of the License at
 * Query manager log writer
import java.io.Writer;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (logWriter != null) {

    private File logFile;
                        Files.delete(file);
            buffer.append("!MESSAGE ");
    private static void purgeOldLogs(@NotNull Path logDirectory, int daysToKeep) throws IOException {
        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();

import org.eclipse.core.runtime.IStatus;

        if (pad == 0)
        return buffer;
                .forEach(file -> {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
            appendEntryInfo(buffer, subSeverity, executeInfo.getErrorCode(), object.getCloseTime());
        int severity = object instanceof QMMStatementExecuteInfo ? IStatus.INFO : IStatus.OK;

            try {
    private void writeEvent(StringBuilder buffer, QMMetaEvent event)

import java.util.Locale;

            if (!logFolder.exists()) {
    private Writer logWriter;
        }
        buffer.append("!ENTRY ");
            if (CommonUtils.isEmpty(logFolderPath)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        try {
        } catch (IOException e) {
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.time.format.DateTimeParseException;
/**
        enabled = preferences.getBoolean(QMConstants.PROP_STORE_LOG_FILE);
                if (!logFolder.mkdirs()) {
        buffer.append(DBConstants.MODEL_BUNDLE_ID).append(" ").append(severity).append(" ").append(code).append(" ");
        appendPaddedInt(c.get(Calendar.HOUR_OF_DAY), 2, sb).append(':');
import org.jkiss.dbeaver.utils.GeneralUtils;
        Calendar c = Calendar.getInstance();

        } else {
import org.jkiss.dbeaver.Log;
            }
    {
 * DBeaver - Universal Database Manager
            initLogFile();
        buffer.append(value);

        appendPaddedInt(c.get(Calendar.MONTH) + 1, 2, sb).append('-');

    {
        final LocalDate judgementDay = today.minusDays(daysToKeep);
        try (Stream<Path> list = Files.list(logDirectory)) {
                }
 *
    {
                        log.debug("Unable to purge the old log file '" + file + "': " + e.getMessage());
    private QMEventFilter eventFilter;
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(this);
        if (object instanceof QMMStatementInfo || object instanceof QMMTransactionSavepointInfo ||
            (object instanceof QMMStatementExecuteInfo && action != QMEventAction.END)) {

    {

        if (object instanceof QMMStatementExecuteInfo) {
        appendPaddedInt(c.get(Calendar.YEAR), 4, sb).append('-');
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (!enabled || logWriter == null) {
                        final LocalDate date = LOG_FILENAME_FORMATTER.parse(file.getFileName().toString(), LocalDate::from);
            buffer.append(executeInfo.getQueryString());
import org.jkiss.dbeaver.model.qm.meta.*;
            return buffer.append(Integer.toString(value));
 * limitations under the License.
import java.nio.file.Path;

    private static final DateTimeFormatter LOG_FILENAME_FORMATTER = DateTimeFormatter
            buffer.append(lineSeparator);
                        return false;
                    }
import org.jkiss.dbeaver.model.DBConstants;
 */
import java.util.List;
import org.jkiss.dbeaver.model.qm.*;
                log.debug("Error purging old logs: " + e.getMessage());
            logWriter.write(logBuffer.toString());
import java.util.Calendar;
            } else {
            buffer.append('0');
            if (eventFilter.accept(event)) {
                buffer.append("COMMIT");
        }
            }
        appendEntryInfo(buffer, severity, object.getObjectId(), object.getOpenTime());
            if (executeInfo.hasError()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    {
    {
                ContentUtils.close(logWriter);
    }
import java.nio.file.Files;
            return buffer.append(Integer.toString(value));
        buffer.append(lineSeparator);
    }
import java.io.IOException;
            log.warn("IO error writing QM log. Disable log file writer", e);
            }
    @Override
                purgeOldLogs(Path.of(logFolderPath), daysToKeepLogs);
    private static final Log log = Log.getLog(QMLogFileWriter.class);
            buffer.append("!SUBENTRY 1 ");

                buffer.append("SUCCESS [").append(executeInfo.getUpdateRowCount()).append("]");
 *
        buffer.append("!MESSAGE ");
        pad = pad - 1;
    private StringBuilder appendPaddedInt(int value, int pad, StringBuilder buffer) {
import java.time.LocalDate;


        final LocalDate today = LocalDate.now();
/*
}
            QMMTransactionInfo transactionInfo = (QMMTransactionInfo) object;
    private boolean enabled;
                .filter(file -> {
        }
                        return judgementDay.isAfter(date);
        } else if (object instanceof QMMTransactionInfo) {
            return;
                    } catch (IOException e) {

    }
        while (padding > value && padding > 1) {
        }
        appendPaddedInt(c.get(Calendar.MINUTE), 2, sb).append(':');
            }

                });
        } else if (object instanceof QMMConnectionInfo) {
        c.setTimeInMillis(timestamp);
                buffer.append("ROLLBACK");

            QMMStatementExecuteInfo executeInfo = (QMMStatementExecuteInfo)object;
            final int daysToKeepLogs = preferences.getInt(QMConstants.PROP_HISTORY_DAYS);
                writeEvent(logBuffer, event);
            list
import java.io.FileWriter;
        appendDate(buffer, time);
        }
    private void appendEntryInfo(StringBuilder buffer, int severity, long code, long time)
        if (event.getProperty().startsWith(QMConstants.PROP_PREFIX)) {
        .ofPattern("'dbeaver_sql_'" + GeneralUtils.DEFAULT_DATE_PATTERN + "'.log'", Locale.ENGLISH);
            } catch (IOException e) {
    }
        appendPaddedInt(c.get(Calendar.SECOND), 2, sb).append('.');
            return;
            logWriter.flush();
        for (QMMetaEvent event : events) {
            ContentUtils.close(logWriter);
        appendPaddedInt(c.get(Calendar.DAY_OF_MONTH), 2, sb).append(' ');
            buffer.append(action).append(" SESSION [").append(sessionInfo.getContainerName()).append("]");
    @Override
    public synchronized void metaInfoChanged(@NotNull DBRProgressMonitor monitor, @NotNull List<QMMetaEvent> events)
 * See the License for the specific language governing permissions and
import java.time.format.DateTimeFormatter;
        DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(this);
            }
            } else {
        lineSeparator = GeneralUtils.getDefaultLineSeparator();

                logWriter = new FileWriter(logFile, true);
        QMEventAction action = event.getAction();
        }
            } catch (IOException e) {
        eventFilter = new DefaultEventFilter();
        buffer.append(lineSeparator);
            }
            logFile = new File(logFolder, LOG_FILENAME_FORMATTER.format(LocalDate.now()));
        }
                })
            File logFolder = new File(logFolderPath);
        int padding = (int) Math.pow(10, pad);
        appendPaddedInt(c.get(Calendar.MILLISECOND), 3, sb);
        initLogFile();
        if (value >= padding)
    }
        }
                log.error("Can't open log writer", e);
    public void dispose()
    private void appendDate(StringBuilder sb, long timestamp) {
            }
    {
    public void preferenceChange(PreferenceChangeEvent event)
                buffer.append(executeInfo.getErrorMessage());
        buffer.append(lineSeparator);
            if (transactionInfo.isCommitted()) {

import org.jkiss.dbeaver.utils.ContentUtils;
                    try {
        }
            try {
            logWriter = null;
