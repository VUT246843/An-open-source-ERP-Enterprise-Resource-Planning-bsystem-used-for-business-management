        super.subTask(name);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

    @Override
 */
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
    @Override
/*
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

        out.println(name);
    }
 * Progress monitor with extra logging
    public void subTask(@NotNull String name) {
    private final PrintStream out;
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * DBeaver - Universal Database Manager
 *
}    }
    }
    public PrintStreamProgressMonitor(DBRProgressMonitor monitor, PrintStream out) {
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.model.runtime;
        super(monitor);
 * See the License for the specific language governing permissions and
    public void beginTask(@NotNull String name, int totalWork) {
 * Licensed under the Apache License, Version 2.0 (the "License");

public class PrintStreamProgressMonitor extends ProxyProgressMonitor {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import java.io.PrintStream;

        super.beginTask(name, totalWork);
        out.println("\t" + name);
/**
        this.out = out;
