 * DBeaver - Universal Database Manager
                }
    public void openFiles(
        } else {
            for (Path path : fileList) {
import org.jkiss.dbeaver.ui.editors.file.AbstractFileHandler;
import org.jkiss.code.NotNull;
            }
import org.jkiss.code.Nullable;
    }
import org.jkiss.dbeaver.model.file.FileTypeAction;

/*
                if (dataSource != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    throw new DBException("Cannot open remote file: " + path);
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ui.editors.sql.scripts;
}
import java.util.List;
 * See the License for the specific language governing permissions and
        @NotNull FileTypeAction action
import java.nio.file.Path;
import org.jkiss.utils.IOUtils;
import java.io.File;
                    EditorUtils.setFileDataSource(file, new SQLNavigatorContext(dataSource));
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
        @NotNull List<Path> fileList,
import org.jkiss.dbeaver.ui.editors.EditorUtils;
 *
 * SQL file handler
 */
                EditorUtils.openExternalFileEditor(path, UIUtils.getActiveWorkbenchWindow());
 *


                    }
        }
 *
    @Override
    /**
import org.jkiss.dbeaver.ui.UIUtils;
/**
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (action == FileTypeAction.INTERNAL_EDITOR) {
 * You may obtain a copy of the License at
            super.openFiles(fileList, dataSource, action);
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
     * Here we track remote ones (usually from DBNPath)
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    if (tryOpenViaResourceAdapter(path, sourceNode)) {
public class SQLFileHandler extends AbstractFileHandler {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
     */
    ) throws DBException {
        @Nullable DBPDataSourceContainer dataSource,
                        continue;
                }
                    File file = path.toFile();
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
                if (!IOUtils.isLocalPath(path) && sourceNode != null) {
     * Handles SQL files. Local sql files are processed by resource handlers.
