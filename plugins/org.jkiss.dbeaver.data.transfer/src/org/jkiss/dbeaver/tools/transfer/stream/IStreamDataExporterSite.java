/**
 *


    DBDDisplayFormat getExportFormat();
import org.jkiss.dbeaver.model.DBPNamedObject;
 * IStreamDataExporter
    Path getOutputFile();
    @NotNull
 *
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    OutputStream getOutputStream();
 * See the License for the specific language governing permissions and

    String getOutputEncoding();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
package org.jkiss.dbeaver.tools.transfer.stream;


import java.io.OutputStream;
/*
import org.jkiss.dbeaver.model.data.DBDContentStorage;
    PrintWriter getWriter();
import java.nio.file.Path;
    Map<String, Object> getProperties();
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBPNamedObject getSource();

public interface IStreamDataExporterSite {

import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    DBDAttributeBinding[] getAttributes();
    void writeBinaryData(@NotNull DBDContentStorage cs) throws IOException;
 * You may obtain a copy of the License at
import java.io.PrintWriter;
import java.util.Map;
}import org.jkiss.dbeaver.model.data.DBDAttributeBinding;


    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software

 */
import org.jkiss.code.NotNull;
 *
import java.io.IOException;


    void flush() throws IOException;
 * DBeaver - Universal Database Manager
