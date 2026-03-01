 * Unless required by applicable law or agreed to in writing, software
 *
    }

package org.jkiss.dbeaver.model.impl;
import java.io.PrintWriter;
/*
    private final PrintWriter writer;
 * you may not use this file except in compliance with the License.

    public OutputWriterAdapter(@NotNull PrintWriter writer) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override

}
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.output.DBCOutputSeverity;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.writer = writer;
    @Override
        writer.println(message);
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void println(@Nullable DBCOutputSeverity severity, @Nullable String message) {

    public void flush() {
 *

public class OutputWriterAdapter implements DBCOutputWriter {
import org.jkiss.code.NotNull;
    }
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
 * DBeaver - Universal Database Manager
 *
        writer.flush();
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
 * limitations under the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
