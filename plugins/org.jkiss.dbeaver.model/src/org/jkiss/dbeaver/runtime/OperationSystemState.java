 * you may not use this file except in compliance with the License.
        log.debug(sleep ? "Application goes into sleep mode" : "Application wakes");

 *
 */

import org.jkiss.dbeaver.Log;
public class OperationSystemState {
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.runtime;

 * See the License for the specific language governing permissions and
 *
 *
import java.awt.desktop.SystemSleepListener;

        return sleepStart > 0;
 * limitations under the License.
 * DBeaver - Universal Database Manager
        return sleepStart;
 *     http://www.apache.org/licenses/LICENSE-2.0
        OperationSystemState.sleepStart = sleep ? System.currentTimeMillis() : 0;
}
    }

import java.awt.*;
    private static long sleepStart;
import java.awt.desktop.SystemSleepEvent;
    private static final Log log = Log.getLog(OperationSystemState.class);
    public static boolean isInSleepMode() {

/*
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public static long getSleepStartTime() {
    public static void toggleSleepMode(boolean sleep) {

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
