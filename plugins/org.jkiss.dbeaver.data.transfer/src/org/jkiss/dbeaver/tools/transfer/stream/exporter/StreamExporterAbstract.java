
/**
 * you may not use this file except in compliance with the License.
 * limitations under the License.

        this.site = site;
    public void init(IStreamDataExporterSite site) throws DBException



 *
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        final DBDValueHandler valueHandler = column.getValueHandler();
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (this.exportFormat == null) {


    {
    @Override

 * You may obtain a copy of the License at
        DBDAttributeBinding column,
import org.jkiss.dbeaver.model.data.DBDValueHandler;
 *
    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    private IStreamDataExporterSite site;
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
    {
 * DBeaver - Universal Database Manager
        Object value)
    }
        return valueHandler.getValueDisplayString(column, value, getValueExportFormat(column));
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * Abstract Exporter
    protected PrintWriter getWriter() {
    public void dispose()
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
    public IStreamDataExporterSite getSite()

import java.io.PrintWriter;
    protected DBDDisplayFormat getValueExportFormat(DBDAttributeBinding column) {
    }
        }
    protected String getValueDisplayString(
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.io.OutputStream;
    }

    }
            this.exportFormat = getSite().getExportFormat();
        return site;
        return site.getOutputStream();
public abstract class StreamExporterAbstract implements IStreamDataExporter {
    }
    protected OutputStream getOutputStream() {
    private DBDDisplayFormat exportFormat;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporter;
} *

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        return this.exportFormat;
    @Override
        // do nothing
        return site.getWriter();
