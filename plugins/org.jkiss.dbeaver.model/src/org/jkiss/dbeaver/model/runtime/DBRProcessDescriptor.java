        }
            e.printStackTrace(new PrintWriter(buf, true));
        }
}
        if (command.getCommandParams() != null) {
    public int waitFor(int timeoutMs)
    }
    }

    public int getUpdatedExitValueCode() {
                }

        } catch (IOException e) {
 */
                // Note: do not close reader because it will close process error stream
            processListener.onProcessStarted();
            throw new DBException("Empty command specified");

            try {
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                    process.destroy();
        return doWaitFor(true, timeoutMs);
                // it's ok
public class DBRProcessDescriptor {

            if (inputStream != null) {
                        exitValue = this.process.exitValue();
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    public void setProcessListener(DBRProcessListener processListener) {
        processBuilder = new ProcessBuilder(commandParams);
                    if (exited) {
            } catch (InterruptedException e) {
        List<String> commandParams;
                // Skip
    {
            commandParams = command.getCommandParams();
                }
        } catch (IllegalThreadStateException e) {
    public DBRProcessListener getProcessListener() {
import org.jkiss.dbeaver.runtime.IVariableResolver;
            e.printStackTrace(new PrintWriter(buf, true));

            return null;
 */
    }
    {
        if (process == null) {
                if (useTimeout) {

    public int getExitValue()
                if (process != null) {
 *
        if (process == null) {
    public DBRProcessDescriptor(final DBRShellCommand command, final IVariableResolver variablesResolver)
        }
        return exitValue;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (process != null) {
    public DBRProcessDescriptor(DBRShellCommand command)
import org.jkiss.utils.IOUtils;
 * you may not use this file except in compliance with the License.
            try {
        if (processListener != null) {
            //exitValue = process.exitValue();
        this(command, null);
                command.getCommand() :
    }
        StringWriter buf = new StringWriter();

            exitValue = this.process.exitValue();
        return process;
        if (processListener != null) {

        }
package org.jkiss.dbeaver.model.runtime;
                IOUtils.copyText(input, buf);

            if (inputStream != null) {
        this.processListener = processListener;


        return buf.toString();

    public DBRShellCommand getCommand()
                // Skip

    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public ProcessBuilder getProcessBuilder()
        return exitValue;
            commandLine = CommonUtils.notEmpty(commandLine);
        }
            throw new DBException("Process " + getName() + " already running");

        if (process != null) {
        } catch (IOException e) {
    }
                } else {

            }
        if (!CommonUtils.isEmpty(command.getWorkingDirectory())) {
    }
    }
 *
        } else {
/*
            } catch (InterruptedException e) {
            } catch (InterruptedException e) {
    {

            if (processListener != null) {
import org.jkiss.dbeaver.utils.GeneralUtils;
                if (process != null) {
    {
    private volatile int exitValue = -1;
    private int doWaitFor(boolean useTimeout, int timeoutMs)
    {
                Reader input = new InputStreamReader(inputStream, GeneralUtils.getDefaultConsoleEncoding());
                // Note: do not close reader because it will close process error stream
    public Process getProcess()

    {
            }
    }
        return doWaitFor(false, Integer.MAX_VALUE);
import java.io.*;
        if (this.command.getPauseAfterExecute() > 0) {
                IOUtils.copyText(input, buf);
            processListener.onProcessTerminated(exitValue);

    private static final Log log = Log.getLog(DBRProcessDescriptor.class);
 *
            }
 * Unless required by applicable law or agreed to in writing, software
            }
        }
import java.util.List;
                GeneralUtils.replaceVariables(command.getCommand(), variablesResolver);
            return null;
    public String dumpErrors() {
    {
    public String getName()

    }
    public boolean isRunning() {

    public void execute() throws DBException
                    exitValue = this.process.waitFor();
        }
        return exitValue;
        StringWriter buf = new StringWriter();
    {
        try {
 * You may obtain a copy of the License at
    }

 * See the License for the specific language governing permissions and
    {
    public void terminate()
            }
        return buf.toString();
 * DBRProcessDescriptor
    {
    public int waitFor()
        }

            try {
        final List<String> command = processBuilder.command();
        try {
/**
    private volatile Process process;
import java.util.concurrent.TimeUnit;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private DBRProcessListener processListener;
 * DBeaver - Universal Database Manager
    public String dumpOutput() {

        if (CommonUtils.isEmpty(processBuilder.command())) {
        }
                    boolean exited = this.process.waitFor(timeoutMs, TimeUnit.MILLISECONDS);
        return command.isEmpty() ? "?" : command.get(0);
    }
                }
        }
            throw new DBException("Can't start process", e);
            String commandLine = variablesResolver == null ?
import org.jkiss.dbeaver.Log;
                    exitValue = process.waitFor();
            process = null;
        return processListener;
        //processBuilder.redirectErrorStream(true);
    private final DBRShellCommand command;
        return command;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        try {
            InputStream inputStream = process.getInputStream();
        if (this.process != null) {

            this.process = processBuilder.start();
        Process theProcess = this.process;
        }
 * limitations under the License.
    }
    private ProcessBuilder processBuilder;
        // Set working directory
        this.command = command;
    }
    }
            }
            synchronized (this) {
    {
                    }
        }
                processListener.onProcessTerminated(exitValue);
        } catch (IOException e) {
            log.debug("Process still executing");

    }
        }
    }
            processBuilder.directory(new File(command.getWorkingDirectory()));
        try {

            commandParams = RuntimeUtils.splitCommandLine(commandLine, !RuntimeUtils.isWindows());
        return theProcess != null && theProcess.isAlive();
        }
                Reader input = new InputStreamReader(inputStream, GeneralUtils.getDefaultConsoleEncoding());
        return processBuilder;
        }
import org.jkiss.utils.CommonUtils;
                Thread.sleep(this.command.getPauseAfterExecute());
            InputStream inputStream = process.getErrorStream();
