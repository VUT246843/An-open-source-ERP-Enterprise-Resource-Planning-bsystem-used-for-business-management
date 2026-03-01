                break;


 */
        }
            message == null ? null : message.toString());
            listeners = ArrayUtils.add(Listener.class, listeners, listener);
    }
        debugMessage(message, t);
        private final Map<String, Object> contextParameters = new LinkedHashMap<>();
        TRACE_LOG_ENABLED = enable;


public class Log {
        return new Log(name, true);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.ILog;
        String message = status.getMessage();
    public static PrintStream getLogWriter() {
        int severity = status.getSeverity();
                return;
    }
                return;
            case IStatus.CANCEL:
            handler.info(name, message);
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (logWriter == null) {
            Context context = activeContext.get();
            if (getLogWriter() == null) {
    public static void setLogHandler(@Nullable LogHandler handler) {
    }
            // Log nested exceptions
        if (message instanceof Throwable) {

        private Context(String contextName) {
            handler.warn(name, message);
    private static PrintStream defaultDebugStream;
        }
        if (logWriter.get() == null) {
        }
import org.eclipse.core.runtime.IStatus;
    public void error(Object message) {
    }
    }
        writeExceptionStatus(Status.ERROR, message, t);
        synchronized (Log.class) {
            if (getLogWriter() == null) {
    private static final boolean quietMode;

            }
                debugWriter = System.err;
    public boolean isFatalEnabled() {
        if (handler != null) {

    }
        }

    }
                    logWritten = writeEclipseLog(GeneralUtils.makeExceptionStatus(severity, message.toString(), t));
        } else {
        if (doEclipseLog && logWriter.get() == null && eclipseLog != null) {
    public static boolean isQuietMode() {

    }
        }
            severity,
        }
    public static void addListener(Listener listener) {

        int severity = Status.ERROR;
            }
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); //$NON-NLS-1$



        }
    private static Status createStatus(int severity, Object message) {
    public void fatal(Object message, Throwable t) {
            handler.info(name, message, t);
        return new Context(name);
        return name;
        }
        }
        if (message instanceof Throwable) {
            this.contextParameters.put(name, value);
        //we never include Exception to the status for some reason
    }
 * See the License for the specific language governing permissions and
    }
        } else {
        if (handler != null) {
        if (!logWritten) {
    public static Context buildContext(String name) {
            default:
import org.jkiss.utils.ArrayUtils;
            }
                if (ex instanceof SQLException) {
            } else {
        }
                listener.loggedMessage(message, t);
import org.jkiss.code.NotNull;
            handler.error(name, message);
            if (debugWriter == null && !quietMode) {


    }
            return contextParameters;
    private static boolean TRACE_LOG_ENABLED = CommonUtils.getBoolean(System.getProperty("dbeaver.trace.enabled"));
                break;
    }
    }
    public static Log getLog(String name) {
    public void trace(Object message) {
            if (getLogWriter() == null) {
            }
        }
        }
}
    static {
    public boolean isDebugEnabled() {
            return this;
            trace(message, null);
    public void info(Object message, Throwable t) {
        error(message, t);
            eclipseLog = null;
    }

                break;
    }


package org.jkiss.dbeaver;
            case IStatus.WARNING:
        return handler == null || handler.isFatalEnabled(name);
        switch (severity) {
    private static final ThreadLocal<PrintStream> logWriter = new ThreadLocal<>();
            debug(message, t);

        public Map<String, Object> getContextParameters() {
    }
        PrintStream logStream = logWriter.get();


        }
            return;
        if (TRACE_LOG_ENABLED) {
                logWritten = writeEclipseLog(createStatus(severity, message));
    private static LogHandler handler;

        return handler == null || handler.isErrorEnabled(name);

        writeExceptionStatus(Status.WARNING, message, t);
                warn(message, exception);
                return;
 *
            if (getLogWriter() == null) {

                return;

                if (message == null) {
    @Nullable
    public static void setContext(Context context) {
            for (Listener listener : listeners) {
        return new Status(
                    for (SQLException error = ((SQLException) ex).getNextException(); error != null; error = error.getNextException()) {
        if (message instanceof Throwable) {
            handler.warn(name, message, t);
    private final boolean doEclipseLog;
        }
        return new Log(name, doEclipseLog);
 * Log
            debugMessage(message, t);
    }
        if (handler != null) {
        }
    }

    }
    }
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public static Log getLog(String name, boolean doEclipseLog) {
            } else {
                break;
        writeEclipseLog(createStatus(severity, message));

    }
            if (t != null) {

                t.printStackTrace(debugWriter);
            listeners = ArrayUtils.remove(Listener.class, listeners, listener);
                            debug(chainedMessage.trim());

            this.contextName = contextName;

            if (message == null && t == null) {
        if (handler != null) {
            if (getLogWriter() == null) {
        if (message == null) {
            }
        }
    }

        return new Log(forClass.getName(), true);

import org.eclipse.core.runtime.Status;
import java.sql.SQLException;
    private Log(String name, boolean doEclipseLog) {
    }
 * you may not use this file except in compliance with the License.
import java.io.PrintStream;
                } else {
    public void flush() {
            case IStatus.OK:

    public void debug(Object message) {
            return;
            }
                error(message, exception);
            }
                return;
                info(message, exception);
    public static Log getLog(Class<?> forClass) {
            }
            Log.logWriter.remove();
        }
    public boolean isTraceEnabled() {
            eclipseLog.log(status);
            "-q", "--q", "-h", "-help", "--help", "-version", "--version"
    public void error(Object message, Throwable t) {
    private static Listener[] listeners = new Listener[0];
                debugWriter.print("[" + context.getContextName() + "] ");
import org.jkiss.code.Nullable;
        }
        boolean logWritten = false;
        public String getContextName() {

        Log.handler = handler;
        this.name = name;
        }
import java.util.LinkedHashMap;

    }
        if (t != null) {
import org.eclipse.core.runtime.Platform;
            // nothing to log
 * Unless required by applicable law or agreed to in writing, software
        }
    }
                }
        return handler == null || handler.isTraceEnabled(name);
        }
        }
 * DBeaver - Universal Database Manager

            }
    }
        }
            return;
    }
        if (handler != null) {
            }
    public static void removeListener(Listener listener) {
        }

 */
    @Nullable
            }


 * limitations under the License.
            if (getLogWriter() == null) {

            }
        synchronized (Log.class) {

            }
/*
        if (logStream != null) {
    public void log(IStatus status) {
            if (message != null) {
        activeContext.set(context);
            logStream.flush();
        debugMessage(message, null);
        return handler == null || handler.isWarnEnabled(name);
        }

        public Context withParameter(String name, Object value) {

    public String getName() {
        return handler == null || handler.isDebugEnabled(name);
            handler.fatal(name, message, t);
import java.text.SimpleDateFormat;
        try {
    }
    public boolean isInfoEnabled() {

                    logWritten = writeEclipseLog(GeneralUtils.makeExceptionStatus(severity, t));
        }
            }
            return true;
            debugWriter.flush();
                break;
            }
        } catch (Throwable e) {
import org.jkiss.utils.CommonUtils;
        Log.defaultDebugStream = defaultDebugStream;
    }

        ModelActivator instance = ModelActivator.getInstance();
            if (debugWriter == null) {

    public void fatal(Object message) {

    private boolean writeEclipseLog(IStatus status) {
                        }
import java.util.Date;
    }

    public boolean isWarnEnabled() {
    }

    public interface Listener {

                        String chainedMessage = error.getMessage();
    public boolean isErrorEnabled() {
            return;
        return logWriter.get();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case IStatus.INFO:
        error(message);
                return;
            for (Throwable ex = t; ex != null; ex = ex.getCause()) {
        if (message instanceof Throwable) {
        Throwable exception = status.getException();
    }
        if (handler != null) {
        }
        }
    public static class Context {
    public void warn(Object message) {

        if (handler != null) {
    }
        } else {
    }
        debugMessage(message, null);
                break;
        }
                Log.logWriter.set((PrintStream) logWriter);
            if (context != null) {
        writeExceptionStatus(Status.INFO, message, t);
        }
        this.doEclipseLog = doEclipseLog;

        void loggedMessage(Object message, Throwable t);
            }
        if (handler != null) {
 *
    }
        synchronized (Log.class) {
            info(message.toString(), (Throwable) message);
            case IStatus.ERROR:
            }
            if (getLogWriter() == null) {
import org.jkiss.dbeaver.utils.GeneralUtils;
            eclipseLog = instance == null ? null : instance.getLog();
        }
        if (message instanceof Throwable) {

            handler.debug(name, message, t);
            debugWriter.print(sdf.format(new Date()) + " - "); //$NON-NLS-1$

import java.io.OutputStream;
        writeEclipseLog(createStatus(severity, message));
                debugWriter.println();
            if (getLogWriter() == null) {
    public void warn(Object message, Throwable t) {
    public void debug(Object message, Throwable t) {
import java.util.Map;
    }
        );
    public void info(Object message) {
            }
                debug(message, exception);
                    // Log all chained SQL exceptions
                return;
        } else {
                return;

    public static void setDefaultDebugStream(@NotNull PrintStream defaultDebugStream) {
    public static void setLogWriter(OutputStream logWriter) {
import org.jkiss.dbeaver.bundle.ModelActivator;
            if (getLogWriter() == null) {

    }
                    }

                }
        if (status == null) {
    }
                return;
            return;
            trace(message.toString(), (Throwable) message);
                return;
            }
        int severity = Status.INFO;
        if (handler != null) {
    private static ILog eclipseLog;
            }
        PrintStream logStream = logWriter.get();
 *
            if (getLogWriter() == null) {
    private final String name;
            debug(message, null);
            handler.trace(name, message, t);
 * distributed under the License is distributed on an "AS IS" BASIS,
        int severity = Status.WARNING;
            return false;
    public static final boolean DEV_DEBUG_ENABLED = CommonUtils.getBoolean(System.getProperty("dbeaver.debug.enabled"));
    private static final ThreadLocal<Context> activeContext = new ThreadLocal<>();
            debug(message.toString(), (Throwable) message);
            error(null, (Throwable) message);
        }
                trace(message, exception);
    }
    private void debugMessage(Object message, Throwable t) {
                debugWriter.println(message);
        }
            handler.error(name, message, t);
            if (logWriter instanceof PrintStream) {
            return contextName;
            handler.fatal(name, message);
        writeEclipseLog(createStatus(severity, message));
    public void trace(Object message, Throwable t) {
            ModelPreferences.PLUGIN_ID,
/**

                return;
    }
        private final String contextName;
    public static void enableTraceLogs(boolean enable) {
        return handler == null || handler.isInfoEnabled(name);
    }
            Platform.getApplicationArgs(),
        return quietMode;
                Log.logWriter.set(new PrintStream(logWriter, true));

            warn(message.toString(), (Throwable) message);
        debugMessage(message, null);
 * You may obtain a copy of the License at
            PrintStream debugWriter = logStream != null ? logStream : (quietMode ? null : defaultDebugStream);
        if (handler != null) {
    private void writeExceptionStatus(int severity, Object message, Throwable t) {
            if (t == null) {
        quietMode = ArrayUtils.containsAny(
                        if (!CommonUtils.isEmpty(chainedMessage)) {
