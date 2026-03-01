 */
    private final PrintWriter out;
 * Progress monitor with extra logging
}
import org.jkiss.code.NotNull;

 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.runtime;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class WriterProgressMonitor extends ProxyProgressMonitor {
        super.beginTask(name, totalWork);
 * You may obtain a copy of the License at
        super(monitor);
 *

        super.subTask(name);

import java.io.PrintWriter;
/*
 * Unless required by applicable law or agreed to in writing, software
        out.println(name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    public WriterProgressMonitor(DBRProgressMonitor monitor, Writer out) {
 */
    public void beginTask(@NotNull String name, int totalWork) {
/**
    public void subTask(@NotNull String name) {
    @Override
 * limitations under the License.

 * you may not use this file except in compliance with the License.
    }
import java.io.Writer;

    }
        out.println("\t" + name);
        this.out = new PrintWriter(out);
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *
