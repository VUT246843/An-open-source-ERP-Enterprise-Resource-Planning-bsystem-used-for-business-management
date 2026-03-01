        @NotNull IDataTransferConsumer<?, ?> consumer) throws DBException;
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
 *
 * DBeaver - Universal Database Manager
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
 * you may not use this file except in compliance with the License.
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * Unless required by applicable law or agreed to in writing, software

package org.jkiss.dbeaver.tools.transfer.stream;
public interface IStreamDataImporter extends IDataTransferProcessor {

        @NotNull DBPDataSource streamDataSource,


 * IStreamDataImporter
}
    void dispose();


 */

        @NotNull DBRProgressMonitor monitor,
 * See the License for the specific language governing permissions and
    void init(@NotNull IStreamDataImporterSite site) throws DBException;
        @NotNull InputStream inputStream,
    List<StreamDataImporterColumnInfo> readColumnsInfo(StreamEntityMapping entityMapping, @NotNull InputStream inputStream) throws DBException;
 */
    @NotNull
import java.util.List;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
 *
 * You may obtain a copy of the License at
import java.io.InputStream;
/**
    void runImport(

