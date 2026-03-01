                        log.debug("Formatter result code: " + rc);
 *

        if (CommonUtils.isEmpty(command)) {
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        return source;
            } finally {
                    return formatJob.result;
                    result = buf.toString();
                ProcessBuilder pb = new ProcessBuilder(commandList);

import org.eclipse.core.runtime.Status;
                } finally {
        @Override

public class SQLFormatterExternal implements SQLFormatter {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
                            stdout.write(source.getBytes(sourceEncoding));
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
                }
 */
            this.useFile = useFile;
import org.jkiss.utils.IOUtils;
import org.jkiss.dbeaver.model.runtime.AbstractJob;

                    int rc = process.waitFor();
                    throw new IOException("No command specified for external formatter");
 * limitations under the License.
/*
                        try (final Writer out = new OutputStreamWriter(os, sourceEncoding)) {
            return source;
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                if (formatJob.finished) {

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean useFile = store.getBoolean(ModelPreferences.SQL_FORMAT_EXTERNAL_FILE);
        void stop() {
//                log.error(e);
                process = pb.start();
/**
                    process.destroy();
import org.jkiss.dbeaver.utils.GeneralUtils;
                pb.redirectErrorStream(true);
                finished = true;
            if (process != null) {
                    try (Reader input = new InputStreamReader(process.getInputStream(), sourceEncoding)) {
                    }
                    try (final OutputStream os = new FileOutputStream(tmpFile)) {
        final String command = store.getString(ModelPreferences.SQL_FORMAT_EXTERNAL_CMD);
        String command;
    }
    public String format(String source, SQLFormatterConfiguration configuration) {
                }
 *
            formatJob.schedule();
    public static final String VAR_FILE = "file";
            } catch (Exception e) {
        boolean useFile;
        String result = "";
            this.source = source;

                }
 *
            this.configuration = configuration;

            final FormatJob formatJob = new FormatJob(configuration, command, source, useFile);
                    }
            finished = true;
    private static final Log log = Log.getLog(SQLFormatterExternal.class);
                        log.debug("Can't delete temp file '" + tmpFile.getAbsolutePath() + "'");
import org.jkiss.dbeaver.ModelPreferences;
                    if (tmpFile == null) {
        }
                return GeneralUtils.makeExceptionStatus(e);
                if (CommonUtils.isEmpty(command)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.io.*;
        int timeout = store.getInt(ModelPreferences.SQL_FORMAT_EXTERNAL_TIMEOUT);
                    if (!tmpFile.delete()) {
        public FormatJob(SQLFormatterConfiguration configuration, String command, String source, boolean useFile) {
        catch (Exception ex) {
 * Unless required by applicable law or agreed to in writing, software
        @NotNull
            for (int i = 0; i < 10; i++) {
        final DBPPreferenceStore store = configuration.getSyntaxManager().getPreferenceStore();
                result = source;
    private static class FormatJob extends AbstractJob {
            log.warn("Formatter process hangs. Terminating.");
        Process process;
                if (useFile) {
                    StringWriter buf = new StringWriter();
        public boolean finished;
                if (tmpFile != null && tmpFile.exists()) {
    }

            // Nothing to format
                List<String> commandList = ArgumentTokenizer.tokenize(command, false);
            this.command = command;
                        }
                try {
                    if (rc != 0) {


            try {
        try {
}
            final String sourceEncoding = configuration.getSourceEncoding();
    public static final String FORMATTER_ID = "EXTERNAL";
                }
                    }
        SQLFormatterConfiguration configuration;
                    command = command.replace(GeneralUtils.variablePattern(VAR_FILE), tmpFile.getAbsolutePath());
                    }
                    }
import java.util.List;
 * External SQL formatter
 * DBeaver - Universal Database Manager
 */
import org.jkiss.utils.ArgumentTokenizer;
                Thread.sleep(timeout / 10);

            }
import org.eclipse.core.runtime.IStatus;
            }
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.sql.format.external;
import org.jkiss.dbeaver.Log;
                        IOUtils.copyText(input, buf);
                    tmpFile = File.createTempFile("dbeaver-sql-format", "sql");
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            File tmpFile = null;
                            IOUtils.copyText(new StringReader(source), out);
                        }
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
                process.destroy();
        }
                        try (final OutputStream stdout = process.getOutputStream()) {
            super("External format - " + command);
            log.warn("Error executing external formatter [" + command + "]", ex);
            formatJob.stop();
                }
        }
            return Status.OK_STATUS;
        }

        String source;
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.utils.CommonUtils;
