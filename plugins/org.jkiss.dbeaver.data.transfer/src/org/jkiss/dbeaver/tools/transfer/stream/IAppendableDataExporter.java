 * DBeaver - Universal Database Manager
    /**

    void importData(@NotNull IStreamDataExporterSite site) throws DBException;
     * @return whether the output file should be truncated before writing or not
 */
     * <p>
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @throws DBException on any error
 * you may not use this file except in compliance with the License.
     * <p>
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
     */
/**
 */
     * @param site the exporter site
 * You may obtain a copy of the License at
     * This method is called before the {@link #init(IStreamDataExporterSite)} method
     * Imports data from an existing file that is determined from the given {@code site}.
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.NotNull;
     *
 *
package org.jkiss.dbeaver.tools.transfer.stream;
     * This method is useful for file formats with strict structure, such as binary formats and etc.

     * Determines whether the output file should be truncated before writing or not.
 * Unless required by applicable law or agreed to in writing, software
     * because it may affect the way the exporter is initialized.
 *
import org.jkiss.dbeaver.DBException;
}
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    boolean shouldTruncateOutputFileBeforeExport();
/*
public interface IAppendableDataExporter extends IStreamDataExporter {
     *
     */
 * Represents an exporter that supports appending to an existing file.
