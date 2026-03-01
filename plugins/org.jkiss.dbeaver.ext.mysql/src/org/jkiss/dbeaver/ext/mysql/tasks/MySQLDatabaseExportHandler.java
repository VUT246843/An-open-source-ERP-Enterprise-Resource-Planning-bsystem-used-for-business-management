            .getHandler(DBWUtils.SSH_TUNNEL);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        }
 *

                            break;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        if (fullVersion == null || fullVersion.contains("MariaDB")) {

        if (settings.isNoCreateStatements()) {
                }

        job.start();

        super.startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);

 * distributed under the License is distributed on an "AS IS" BASIS,
            monitor.beginTask("Export database", 100);
        }
        }
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        if (!CommonUtils.isEmpty(arg.getTables())) {

        }
    }
            for (MySQLDatabaseExportInfo exportObject : settings.getExportObjects()) {
        Log log
        }
    ) throws IOException, DBException {
    @Override
        DumpFilterJob(DBRProgressMonitor monitor, InputStream stream, Path outFile, Log log) {
    @Override

        if (supportsColumnStatistics(dumpPath) && !arg.getDatabase().getDataSource().supportsColumnStatistics()) {
                        }
        return false;
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, GeneralUtils.DEFAULT_ENCODING));
                        if (line == null) {
        }
            }
            for (MySQLTableBase table : arg.getTables()) {
                NumberFormat numberFormat = NumberFormat.getInstance();
 * You may obtain a copy of the License at
        if (fromIdx == -1) {
            long prevStatusUpdateTime = 0;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        final MySQLDatabaseExportInfo arg,
        cmd.add(dumpPath);
    protected boolean validateTaskParameters(DBTTask task, MySQLExportSettings settings, Log log) {
            new DumpFilterJob(monitor, process.getInputStream(), outFile, log) :
        DBTTask task,
            fullVersion = RuntimeUtils.executeProcess(mysqldumpPath, MySQLConstants.FLAG_VERSION);
        DBRProgressMonitor monitor,
            cmd.add("--comments"); //$NON-NLS-1$
            return false;
            } finally {
        @Override
        if (settings.isNoData()) {
            cmd.add(arg.getDatabase().getName());
        log.debug("Dump database into " + outFile.toUri());
        if (settings.isAddDropStatements()) {
        if (settings.isComments()) {
    private static final String VER = "Ver ";
            }
                try {

            cmd.add("--no-create-info"); //$NON-NLS-1$
                    Path outFile = DBFUtils.resolvePathFromString(new VoidProgressMonitor(), task.getProject(), dir);
        if (settings.isDisableKeys()) {
            cmd.add("--no-data"); //$NON-NLS-1$
            cmd.add("--skip-extended-insert"); //$NON-NLS-1$
        int fromIdx = fullVersion.indexOf(DISTRIB);

    }
            fromIdx += VER.length();
    private static final String DISTRIB = "Distrib ";
        }
                    writer.flush();
        if (task.getType().getId().equals(MySQLTasks.TASK_DATABASE_BACKUP)) {
import org.jkiss.dbeaver.ext.mysql.MySQLUtils;
import java.text.NumberFormat;
        private String filterLine(@NotNull String line) {
        if (Files.exists(outFile)) {


        if (sshTunnelHandler != null) {
    }
        }
            return line;
        }
        }
 * Unless required by applicable law or agreed to in writing, software
                }
    protected boolean isLogInputStream() {
                cmd.add("--routines"); //$NON-NLS-1$
        String fullVersion;

            super("MySQL database dump filter", monitor, stream, outFile, log);

            fromIdx += DISTRIB.length();

import java.nio.file.Path;
            cmd.add("--compress"); //$NON-NLS-1$
import org.jkiss.dbeaver.DBException;
import java.io.*;
    @Override
            cmd.add("--hex-blob"); //$NON-NLS-1$
        } else {
import org.jkiss.dbeaver.model.net.DBWUtils;
import java.util.Collection;
import java.nio.file.Files;
 * you may not use this file except in compliance with the License.
        if (settings.isDumpEvents()) {
        return settings;
                        String line = reader.readLine();
        settings.loadSettings(context, new TaskPreferenceStore(task));
        } else {
                final String dir = settings.getOutputFolder(exportObject);
                        if (matcher.find()) {
            return false;
 * limitations under the License.
        DBWHandlerConfiguration sshTunnelHandler = settings.getDataSourceContainer().getActualConnectionConfiguration()
import org.jkiss.dbeaver.utils.GeneralUtils;
                monitor.done();
            cmd.add("--add-drop-table"); //$NON-NLS-1$
        }

                            prevStatusUpdateTime = currentTime;
    @Override
            cmd.add(arg.getDatabase().getName());
        MySQLExportSettings settings,
        @NotNull
        return cmd;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

    }
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
        MySQLExportSettings settings = new MySQLExportSettings(task.getProject());
    protected void startProcessHandler(
        return true;
            new DumpCopierJob(monitor, "Dump database", process.getInputStream(), outFile, log);
        }
        }
    }

        String dumpPath = dumpBinary.getAbsolutePath();
        }
            // Unlike pg_dump, mysqldump happily overrides files which can easily lead to a lost dump.
import org.jkiss.dbeaver.Log;
                    return false;
        if (settings.isBinariesInHex()) {
                            monitor.subTask("Saved " + numberFormat.format(reader.getLineNumber()) + " lines");
        int toIdx = fullVersion.indexOf(".", fromIdx);
import org.jkiss.dbeaver.model.fs.DBFUtils;
        return false;

        Thread job = isFiltering ?
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        private final Pattern DEFINER_PATTER = Pattern.compile("DEFINER\\s*=\\s*`.*?`@`.*?`", Pattern.CASE_INSENSITIVE);
            // We prevent that with our manual check
    }
    protected boolean needsModelRefresh() {
                    if (!Files.exists(outFile)) {
                cmd.add(table.getName());
    @Override
        try {
    @Override
    protected List<String> getCommandLine(MySQLExportSettings settings, MySQLDatabaseExportInfo arg) throws IOException {
public class MySQLDatabaseExportHandler extends MySQLNativeToolHandler<MySQLExportSettings, DBSObject, MySQLDatabaseExportInfo> {
    private static boolean supportsColumnStatistics(@NotNull String mysqldumpPath) {
            cmd.add("--skip-add-drop-table"); //$NON-NLS-1$
                } catch (Exception e) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
        List<String> cmd = super.getCommandLine(settings, arg);
        } else {
    }

    protected MySQLExportSettings createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException {
        } else {
            cmd.add("--disable-keys"); //$NON-NLS-1$
            }
                            line = matcher.replaceFirst("");
        return majorVersion >= 8;
 *
                        long currentTime = System.currentTimeMillis();
            cmd.add("--protocol=TCP"); //$NON-NLS-1$
import org.jkiss.dbeaver.model.task.DBTTask;
    @Override
    public Collection<MySQLDatabaseExportInfo> getRunInfo(MySQLExportSettings settings) {
        }
        String outFileStr = settings.getOutputFile(arg);

                    }
            try {

                        final Matcher matcher = DEFINER_PATTER.matcher(line);
        }
                        line = filterLine(line);
        Path outFile = DBFUtils.resolvePathFromString(monitor, task.getProject(), outFileStr);
            cmd.add("--extended-insert"); //$NON-NLS-1$
 */
        ProcessBuilder processBuilder,
package org.jkiss.dbeaver.ext.mysql.tasks;
}
                    for (; ; ) {
                        Files.createDirectories(outFile);
            throw new IOException("Output file already exists");
        settings.addExtraCommandArgs(cmd);
 * DBeaver - Universal Database Manager
        }
/*
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
                try (OutputStream output = Files.newOutputStream(outFile)) {
 *
            if (fromIdx == -1) {
import org.jkiss.utils.CommonUtils;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void fillProcessParameters(MySQLExportSettings settings, MySQLDatabaseExportInfo arg, List<String> cmd) throws IOException {
                LineNumberReader reader = new LineNumberReader(new InputStreamReader(input, GeneralUtils.DEFAULT_ENCODING));
        public void runDump() throws IOException {
        Process process,
        File dumpBinary = MySQLUtils.getDumpExecutablePath(settings);
                    }
            }
                        writer.newLine();
        } catch (DBException e) {
            if (CommonUtils.isEmpty(arg.getTables()) && !settings.isNoRoutines()) {
                        writer.write(line);
                return false;
                    log.error("Can't create directory '" + dir + "'");
    static class DumpFilterJob extends DumpJob {
                        }
            fromIdx = fullVersion.indexOf(VER);
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.regex.Matcher;
import java.util.List;
    }
            // https://github.com/dbeaver/dbeaver/issues/11532
        return settings.getExportObjects();
                        if (currentTime - prevStatusUpdateTime > 300) {
    }
        cmd.add(settings.getMethod().getCliOption());
        }
        } else {
        if (settings.isExtendedInserts()) {
            cmd.add("--events"); //$NON-NLS-1$

            cmd.add("--column-statistics=0");
        boolean isFiltering = settings.isRemoveDefiner();
import java.util.regex.Pattern;
        }
        }

        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        if (settings.isCompressed()) {
    }
        int majorVersion = CommonUtils.toInt(fullVersion.substring(fromIdx, toIdx));
