
                log.error(e);
            return;

        String userPassword = null;
                    IOUtils.close(output);

                }
                if (monitor.isCanceled()) break;
            }
            byte[] buffer = new byte[10000];
                    try {
                    output.close();

                } catch (Exception e) {
            final File execPath = new File(commandLine.get(0));
        private final String outputCharset;


    }
                    throw new DBCException("Client binaries location is not specified");
    }
        SETTINGS settings,
                    readStream(input.getErrorStream());
                if (cmdString.length() > 0) cmdString.append(' ');
            String lf = GeneralUtils.getDefaultLineSeparator();
            throw new IOException(e);
                monitor.beginTask(task.getType().getName(), 1);
                break;
                        break;
                    isSuccess = false;
        private final String inputCharset;
import org.jkiss.dbeaver.tasks.nativetool.messages.NativeToolMessages;
                    output.flush();
        SETTINGS settings = createTaskSettings(runnableContext, task);
            monitor.done();
                task.getName(),
                    if (count <= 0) {
        private final Path inputFile;
    }
        } finally {
        return new DBTTaskRunStatus();
        protected NullReaderJob(DBTTask task, InputStream stream) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    listener.taskFinished(task, null, error, settings);
        } catch (DBException e) {
                output.flush();
                    int count = input.read(buffer);
        }
        protected LogReaderJob(DBTTask task, SETTINGS settings, ProcessBuilder processBuilder, Process stream, boolean isLogInputStream) {
                    Log.setLogWriter(null);
        if (serviceSystemAgent != null && workTime > serviceSystemAgent.getLongOperationTimeout() * 1000) {
            ) {
        DBPConnectionConfiguration cfg = new DBPConnectionConfiguration(dataSourceContainer.getActualConnectionConfiguration());
            if (locationManager != null) {
import org.jkiss.dbeaver.DBException;
                DBPNativeClientLocation clientHome = DBUtils.findObject(clientLocations, clientHomeId);
        if (CommonUtils.isEmpty(userPassword)) {
import org.jkiss.code.NotNull;
        private InputStream input;
    protected boolean doExecute(DBRProgressMonitor monitor, DBTTask task, SETTINGS settings, Log log) throws DBException, InterruptedException {
                }
                    Files.newInputStream(inputFile),
        private final Log log;
                try {
    abstract protected java.util.List<String> getCommandLine(SETTINGS settings, PROCESS_ARG arg) throws IOException;

    protected void startProcessHandler(
        } catch (InterruptedException e) {
        protected DBRProgressMonitor monitor;
            }
        }
    }
    private class LogReaderJob extends Thread {
    protected abstract SETTINGS createTaskSettings(DBRRunnableContext context, DBTTask task) throws DBException;
    }
        validateClientHome(monitor, settings);
package org.jkiss.dbeaver.tasks.nativetool;
            }
import org.jkiss.dbeaver.model.DBConstants;
                }
                    if (!executionResult) {
 * limitations under the License.
                    readInputThread.start();
        try {
                try {
        DBTTask task,
        ProcessBuilder processBuilder,
    public static class DumpCopierJob extends DumpJob {
            this.output = stream;

            this.logWriter = settings.getLogWriter();
                Files.size(inputFile))
            userPassword = dataSourceContainer.getActualConnectionConfiguration().getUserPassword();
        }
                        int count = input.read(buffer);
        }
                                readStream(input.getInputStream());
        private final OutputStream output;
        DBRProgressMonitor monitor,
            long totalBytesDumped = 0;
                }
    private class NullReaderJob extends Thread {
                } finally {
            processBuilder.directory(execPath.getParentFile());

            }
                logWriter.print(

        return CommonUtils.isEmpty(taskErrorMessage);
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
        protected Log log;
                        buf.setLength(0);
 *
import org.jkiss.dbeaver.runtime.ui.UIServiceSystemAgent;
            try {
                logWriter.print(cmdString);
            log.error("Process error: " + e.getMessage());
                NumberFormat numberFormat = NumberFormat.getInstance();
    }
        }
        }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.IOUtils;
                }
                    }
                try (InputStream scriptStream = new ProgressStreamReader(
            final List<String> commandLine = getCommandLine(settings, arg);
                }
                        break;
        monitor.beginTask(task.getType().getName(), 1);
                } else {
        protected Path outFile;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

                        logWriter.println(buf);

            throw new DBException("Error executing native tool", e.getTargetException());
        }

                    // Still running
                }
                }
        return GeneralUtils.UTF8_ENCODING;
                } catch (IllegalThreadStateException e) {
        } catch (InterruptedException e) {
                        writer.println(line);
    public void validateErrorCode(int exitCode) throws IOException {
    }
            // ignore
                    userPassword = CommonUtils.toString(authPassword);
        PROCESS_ARG arg,
                logWriter.flush();
        private final Process input;
                    output.flush();
                    output.flush();
        }
                if (!executeProcess(monitor, task, settings, arg, log)) {
    protected boolean isNativeClientHomeRequired() {
                    }
                            break;
                processBuilder.redirectErrorStream(true);
        public void runDump() throws IOException {
            runnableContext.run(true, true, monitor -> {
                ) {
        notifyToolFinish(task.getType().getName() + " - " + task.getName() + " has finished", workTime);

        private final PrintStream logWriter;
                Properties connProperties = new Properties();
                        }
            } catch (DBException e) {
            if (settings.getClientHome() == null) {
                if (settings.getClientHome() == null) {
        private final ProcessBuilder processBuilder;
                        // ignore
import org.jkiss.dbeaver.model.task.DBTTaskHandler;
import java.text.NumberFormat;
                    if (b == -1) {
import org.jkiss.dbeaver.Log;
        } catch (Exception e) {

            }
        } catch (InterruptedException e) {
            //process.waitFor();
        boolean isSuccess = true;
                } catch (IOException e) {
                    }

                }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

                        error = new DBCException("Task execution failed, reason: " + taskErrorMessage);
import org.jkiss.dbeaver.model.struct.DBSObject;
            final List<DBPNativeClientLocation> clientLocations = driver.getNativeClientLocations();
            } finally {
                            if (!DBWorkbench.getPlatform().getApplication().isHeadlessMode()) {
                        taskErrorMessage = errorMessage;
    }
            }

                }
                // ignore
            }

                byte[] buffer = new byte[100000];
    public static class TextFileTransformerJob extends Thread {

                            prevStatusUpdateTime = currentTime;
            Process process = processBuilder.start();
                            }
            monitor.subTask("Start native tool " + getClass().getSimpleName());
                if (clientHome == null) {
    }
        settings.setLogWriter(logStream);
        @NotNull Locale locale,
        @Override
                    settings.setClientHome(clientLocations.get(0));
                listener.taskStarted(task);
            isLogInputStream());
                    continue;
            this.log = log;
            this.outputCharset = outputCharset;


                    settings.setClientHome(null);
        public final void run() {
    public boolean executeProcess(
            } finally {
                    if (!CommonUtils.isEmpty(errorMessage)) {
            } catch (IOException e) {
                    for (; ; ) {
                        }
 * See the License for the specific language governing permissions and
    public abstract void fillProcessParameters(SETTINGS settings, PROCESS_ARG arg, List<String> cmd) throws IOException;
        }

import org.jkiss.dbeaver.model.task.DBTTask;
                        message.append(buf);

        public DumpCopierJob(DBRProgressMonitor monitor, String name, InputStream stream, Path outFile, Log log) {
        DBPDataSourceContainer dataSourceContainer = settings.getDataSourceContainer();
        @NotNull DBTTask task,
            String clientHomeId = dataSourceContainer.getConnectionConfiguration().getClientHomeId();
                    task.getName(),
    ) throws IOException, DBException {

                        }
                    new Date() + lf));
                        String line = reader.readLine();
            monitor.subTask("Executing");
            DBAAuthCredentials credentials = authModel.loadCredentials(dataSourceContainer, cfg);
                            } catch (IOException e) {
    }
        DBTTask task,
                    final DBNDatabaseNode node = navigatorModel.findNode(object);
                        }
        private final DBTTask task;
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
            super("Task " + task.getName() + " log reader");

            throws IOException;
            cmdString.append(lf);
            }
                    monitor,
import org.jkiss.dbeaver.model.DBUtils;
        protected abstract void runDump()
        long workTime = System.currentTimeMillis() - startTime;
                    BufferedReader reader = new BufferedReader(new InputStreamReader(scriptStream, inputCharset));
                    NLS.bind(NativeToolMessages.native_tool_handler_log_task, task.getName(), new Date() + lf));
                runDump();
        protected DumpJob(String name, DBRProgressMonitor monitor, InputStream stream, Path outFile, Log log) {
                settings.setClientHome(clientHome);
            this.monitor = monitor;
        }

                        logWriter.flush();
            throw new DBCException("Client file download interrupted", e);
            final DBPNativeClientLocationManager locationManager = driver.getNativeClientManager();
                            }
            Thread.sleep(100);
            throw e;
 *
            return new DBTTaskRunStatus();

                    buf.append((char) b);
            } else {
import org.jkiss.dbeaver.utils.GeneralUtils;
                }
import org.jkiss.dbeaver.model.task.DBTTaskExecutionListener;
                } else {
        return true;
    ) throws DBException {
            monitor.beginTask(getName(), 100);
        Process process,
    }
                    clientHome = settings.findNativeClientHome(clientHomeId);
            StringBuilder message = new StringBuilder();
        public void run() {

                    }
                for (; ; ) {
            super(name);
            try (Reader reader = new InputStreamReader(inputStream, GeneralUtils.getDefaultConsoleEncoding())) {
            } catch (IOException e) {

        return true;
            super(task.getName());
        return true;
            long prevStatusUpdateTime = 0;
            }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        @Override
import org.jkiss.dbeaver.model.access.DBAAuthModel;
                    }

        private final SETTINGS settings;
        }
    protected String getInputCharset() {
            for (String cmd : command) {
                        public void run() {
                StringBuilder buf = new StringBuilder();
            super(task.getName());
                monitor.subTask(task.getType().getName());
 *
            throw new IOException("Process failed (exit code = " + exitCode + "). See error log.");
        @Override

        if (monitor.isCanceled()) {
                            break;
    public DBTTaskRunStatus executeTask(
                    int b = reader.read();

            this.task = task;
        UIServiceSystemAgent serviceSystemAgent = DBWorkbench.getService(UIServiceSystemAgent.class);
                } finally {
                Log.setLogWriter(logStream);
        LogReaderJob logReaderJob = new LogReaderJob(
    public abstract Collection<PROCESS_ARG> getRunInfo(SETTINGS settings);
                monitor.done();
            });


            clientHome.validateFilesPresence(monitor);
import org.jkiss.utils.CommonUtils;
            this.task = task;
        if (exitCode != 0) {
        }
                            try {
        private String readStream(@NotNull InputStream inputStream) throws IOException {
                        @Override

        }
        public void run() {

                if (!clientLocations.isEmpty()) {
        DBPNativeClientLocation clientHome = settings.getClientHome();
                    if (readSize < 0) {

                    validateErrorCode(exitCode);
            } finally {

                    }

        
        } catch (InvocationTargetException e) {
        @Override
    }
        }
    }
            throw new DBException("Error executing process", e);
        }
        @Override
            }
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
        return Collections.emptyList();

    }
                    };
        Log log
                Throwable error = null;
            }
                    cmd = "******";
                        totalBytesDumped += count;
                    }
    protected boolean needsModelRefresh() {
            } catch (IOException e) {
            this.output = stream;
    }
        try {
    }
            try {
    protected String getDataSourcePassword(DBRProgressMonitor monitor, SETTINGS settings) {

                }

                if (NativeToolUtils.isSecureString(settings, cmd)) {
            setupProcessParameters(monitor, settings, arg, processBuilder);
        public void run() {
                }
import org.eclipse.core.runtime.IStatus;
                        break;
            log.error("IO error: " + e.getMessage());
            log.error("Task parameters validation failed");
        private final DBRProgressMonitor monitor;
            } catch (IOException e) {
                    process.destroy();
        } catch (DBException e) {
                    if (b == '\n') {
    @Override
            for (; ; ) {
    protected boolean isMergeProcessStreams() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        Log log
        try {
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocationManager;

                throw new DBCException("Local client home '" + clientHomeId + "' not found");
            for (PROCESS_ARG arg : getRunInfo(settings)) {
                logWriter.println(e.getMessage() + lf);

        }
        }
                    String errorMessage = readStream(input.getErrorStream());
    }
            }
        // Notify agent
            this.processBuilder = processBuilder;

import java.io.*;
                // just skip

        return true;
        long startTime = System.currentTimeMillis();
                // Refresh navigator node (script execution can change everything inside)
                        output.write(buffer, 0, count);
 */
        return GeneralUtils.UTF8_ENCODING;
    }
                clientLocations.addAll(locationManager.findLocalClientLocations());
            super(name, monitor, stream, outFile, log);
                // just skip

        private final DBTTask task;
                byte[] buffer = new byte[1000];
        @NotNull DBRRunnableContext runnableContext,
            // ignore
        if (!isNativeClientHomeRequired() || clientHome == null) {
            this.inputFile = inputFile;
                monitor,
        @NotNull Log log,
                                monitor.subTask(numberFormat.format(totalBytesDumped) + " bytes");
import org.jkiss.dbeaver.runtime.DBWorkbench;

    }
            throw new InterruptedException();
    }

                    //int avail = input.available();
        protected InputStream input;
                        if (line == null) {
 * you may not use this file except in compliance with the License.
            throw new DBCException("Error downloading client file(s)", e);
/*
        private final boolean isLogInputStream;
                Thread.sleep(100);
    public static abstract class DumpJob extends Thread {
        @NotNull DBTTaskExecutionListener listener
        }
import org.jkiss.dbeaver.model.exec.DBCException;
            StringBuilder cmdString = new StringBuilder();
        private final OutputStream output;
            try {
                }
                        writer.flush();
                    output.write(buffer, 0, readSize);
            }
        }

                    monitor.worked(1);
            serviceSystemAgent.notifyAgent(toolName, IStatus.INFO);

                Object authPassword = connProperties.get(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD);
        DBAAuthModel authModel = cfg.getAuthModel();
                    Thread readInputThread = new Thread("Reading process input stream") {
                    if (node != null) {

            this.inputCharset = inputCharset;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    error = e;
        DBPDataSourceContainer dataSourceContainer = settings.getDataSourceContainer();
            startProcessHandler(monitor, task, settings, arg, processBuilder, process, log);
            log.error(e);
        public TextFileTransformerJob(DBRProgressMonitor monitor, DBTTask task, Path inputFile, OutputStream stream, String inputCharset, String outputCharset, Log log) {
                if (isLogInputStream) {
    @NotNull
import org.jkiss.dbeaver.model.connection.DBPDriver;
            try (InputStream scriptStream = new ProgressStreamReader(
                try {
            this.monitor = monitor;
            // Dump command line
                }
                while (!monitor.isCanceled()) {
        SETTINGS settings,
                    }
            processBuilder,
        }
                    monitor.done();
            this.task = task;
            process,
            }
            ProcessBuilder processBuilder = new ProcessBuilder(commandLine);
        if (authModel != AuthModelDatabaseNative.INSTANCE) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
        return isSuccess;
                authModel.initAuthentication(monitor, dataSourceContainer.getDataSource(), credentials, cfg, connProperties);
    protected boolean validateTaskParameters(DBTTask task, SETTINGS settings, Log log) {
                }
import java.util.*;
                cmdString.append(cmd);
            } catch (IOException e) {
            }
            var navigatorModel = task.getProject().getNavigatorModel();
        }
                }
            this.input = stream;
    }
            return message.toString();
        private final DBRProgressMonitor monitor;
                    final boolean executionResult = doExecute(monitor, task, settings, log);
                    Files.size(inputFile))
                        if (count <= 0) {
        }
            final DBPDriver driver = dataSourceContainer.getDriver();

                if (authPassword != null) {
            try {
                log.error(e);

                    log.error(e);
            settings,
        try {
        } catch (IOException e) {
                log.error(e);
                        if (currentTime - prevStatusUpdateTime > 300) {
            this.monitor = monitor;
import org.jkiss.dbeaver.model.task.DBTTaskRunStatus;
                    } catch (InterruptedException ignore) {
                    final int exitCode = process.exitValue();
            listener.taskFinished(task, null, new InterruptedException("Task parameters validation failed"), settings);

        public BinaryFileTransformerJob(DBRProgressMonitor monitor, DBTTask task, Path inputFile, OutputStream stream, Log log) {
    protected boolean isLogInputStream() {
}
    public static class BinaryFileTransformerJob extends Thread {
            task,
            if (this.isMergeProcessStreams()) {
            this.input = stream;
            } finally {
        }
            super("Log reader for " + task.getName());
import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.runtime.ProgressStreamReader;
        @NotNull PrintStream logStream,
 * DBeaver - Universal Database Manager
        return userPassword;
            }
        PROCESS_ARG arg,
        private final DBTTask task;
 * distributed under the License is distributed on an "AS IS" BASIS,
        public void run() {
                Files.newInputStream(inputFile),
    protected void notifyToolFinish(String toolName, long workTime) {

                                logWriter.println(e.getMessage() + lf);
                for (; ; ) {
                logWriter.print(NLS.bind(NativeToolMessages.native_tool_handler_log_finished_task, task.getName(),
        private final Path inputFile;
            this.log = log;
                logWriter.flush();
            try {
        }
        logReaderJob.start();
            if (navigatorModel != null && refreshObjects && needsModelRefresh()) {
    private String taskErrorMessage;
                try (OutputStream output = Files.newOutputStream(outFile)) {
            try {
            this.settings = settings;

        }
                for (BASE_OBJECT object : settings.getDatabaseObjects()) {

        @Override
import java.nio.file.Path;
                monitor.done();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                        long currentTime = System.currentTimeMillis();
            throw e;
                    int readSize = scriptStream.read(buffer);
            this.log = log;
        DBRProgressMonitor monitor,
                    PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, outputCharset));
    }
        return false;
                    }
        // Try to obtain password through auth model (makes sense for IAM-like models)
            List<String> command = processBuilder.command();
            if (clientHomeId == null) {
    }

                        node.refreshNode(monitor, this);
    protected String getOutputCharset() {
        private final Log log;
    ) throws IOException, InterruptedException {
            boolean refreshObjects = isSuccess && !monitor.isCanceled();
            this.outFile = outFile;
                        readInputThread.join();
            this.isLogInputStream = isLogInputStream;
        if (!validateTaskParameters(task, settings, log)) {
        if (isNativeClientHomeRequired()) {
import java.lang.reflect.InvocationTargetException;
                    }

                    while (!monitor.isCanceled()) {
import java.nio.file.Files;
public abstract class AbstractNativeToolHandler<SETTINGS extends AbstractNativeToolSettings<BASE_OBJECT>, BASE_OBJECT extends DBSObject, PROCESS_ARG> implements DBTTaskHandler {
    protected void setupProcessParameters(DBRProgressMonitor monitor, SETTINGS settings, PROCESS_ARG arg, ProcessBuilder process) {
                if (monitor.isCanceled()) {
    public Collection<BASE_OBJECT> getUpdatedObjects(PROCESS_ARG settings) {
            this.inputFile = inputFile;
    private void validateClientHome(DBRProgressMonitor monitor, SETTINGS settings) throws DBCException {

            this.input = stream;
