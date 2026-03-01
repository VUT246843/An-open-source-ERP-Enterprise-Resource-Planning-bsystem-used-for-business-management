 * Licensed under the Apache License, Version 2.0 (the "License");
/**
     */
import java.nio.file.Path;

     */


 * limitations under the License.
     * Sets the source node from which files are being opened.
import java.util.Set;
    void setSourceNode(@Nullable DBNPathBase sourceNode);

     *
    Set<FileTypeAction> supportedActions();
     * This node represents the navigation tree element (file or folder) that triggered the file opening action.
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
 * DBeaver - Universal Database Manager
     * @param sourceNode the source navigation node, or null if there is no specific source node
    void openFiles(@NotNull List<Path> fileList, @Nullable DBPDataSourceContainer dataSource, @NotNull FileTypeAction action)
}
 * See the License for the specific language governing permissions and
 */
import org.jkiss.dbeaver.DBException;
 *
 * based on the provided parameters, including the action type and optional data source context.
    /**
public interface FileOpenHandler {
/*
    @NotNull
    throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.file;
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
     * Open NIO files in associated handlers
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    /**
 *
 * you may not use this file except in compliance with the License.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;

 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
 * Interface that defines the contract for handling the opening of files.
 * Implementations of this interface are responsible for managing how files are opened
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
