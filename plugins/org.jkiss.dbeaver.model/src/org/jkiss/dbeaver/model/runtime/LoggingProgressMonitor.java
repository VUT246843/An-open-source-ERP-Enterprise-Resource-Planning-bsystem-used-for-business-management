            this.log = log;
            isCanceled = value;


        super(new LoggingMonitorProxy(null));
                log.debug("\t" + name);
        private volatile boolean isCanceled;
        @Override
public class LoggingProgressMonitor extends DefaultProgressMonitor {
 *
        public void worked(int work) {

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others



            if (log != null) {
        }
        @Override
            }
    private static class LoggingMonitorProxy implements IProgressMonitor {
        @Override

        public void internalWorked(double work) {
 * Unless required by applicable law or agreed to in writing, software

 */
        private final Log log;
        @Override
            if (log != null) {
        @Override
            return isCanceled;
        super(new LoggingMonitorProxy(log));
                log.debug(name);
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * Progress monitor null implementation

    }
 *
    }

            }
        }
 * you may not use this file except in compliance with the License.
                out.println(name);
        public void done() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

package org.jkiss.dbeaver.model.runtime;
import org.eclipse.core.runtime.IProgressMonitor;
        }
        }
 * You may obtain a copy of the License at
    public LoggingProgressMonitor(Log log) {

 * limitations under the License.
        }

        public void beginTask(String name, int totalWork) {
 * DBeaver - Universal Database Manager
        public LoggingMonitorProxy(Log log) {
        public void setTaskName(String name) {

        }


            } else {
import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
/*
import java.io.PrintStream;
    }
}


 *
        public boolean isCanceled() {
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    public LoggingProgressMonitor() {
        }
            } else {
        @Override
        public void setCanceled(boolean value) {
        private PrintStream out = System.out;

        }
                out.println("\t" + name);
        public void subTask(String name) {
