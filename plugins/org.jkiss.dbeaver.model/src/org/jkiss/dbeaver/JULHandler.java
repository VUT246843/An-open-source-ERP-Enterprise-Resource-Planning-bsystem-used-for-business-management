        // No op
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import java.util.logging.Level;
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
                record.getThrown()
        // No op
        }
/*
                record.getLoggerName(),
package org.jkiss.dbeaver;
        } else if (level.intValue() >= Level.WARNING.intValue()) {
    }
        if (severity == IStatus.ERROR || severity == IStatus.WARNING) {
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
                record.getMessage(),


    @Override
 *
        int severity = getSeverity(record.getLevel());
import org.eclipse.core.runtime.Status;
    }
 * limitations under the License.
        }
 * Implementation of {@link Handler} that redirects JUL logging to DBeaver log.
import java.util.logging.LogRecord;
import java.util.logging.Handler;
import org.eclipse.core.runtime.IStatus;
 * See the License for the specific language governing permissions and
        if (level.intValue() >= Level.SEVERE.intValue()) {
 * DBeaver - Universal Database Manager
}

 * Licensed under the Apache License, Version 2.0 (the "License");
    public void publish(LogRecord record) {
        this.log = log;
            return IStatus.ERROR;
            return IStatus.CANCEL;
            log.log(new Status(
                getSeverity(record.getLevel()),
 * you may not use this file except in compliance with the License.
    }
            return IStatus.WARNING;

    @Override
 *
    public void close() throws SecurityException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        } else {
 */
    @Override
            log.debug(record.getMessage(), record.getThrown());
    public JULHandler(Log log) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    private static int getSeverity(Level level) {

        } else {
public class JULHandler extends Handler {
    public void flush() {
            ));
    private final Log log;

 *

