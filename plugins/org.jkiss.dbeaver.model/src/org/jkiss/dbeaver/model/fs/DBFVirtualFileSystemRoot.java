    String getRootId();
import org.jkiss.code.NotNull;
 *
    DBFVirtualFileSystem getFileSystem();

 */
/**
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.DBPNamedObject;

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.fs;


    Path getRootPath(DBRProgressMonitor monitor) throws DBException;

 */
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

public interface DBFVirtualFileSystemRoot extends DBPNamedObject, Closeable {
    @NotNull
import java.nio.file.Path;
import java.io.Closeable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    @NotNull
import java.io.IOException;
 * Virtual file system root
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
    @NotNull
}
    DBPImage getRootIcon();
 * You may obtain a copy of the License at


    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    default void close() throws IOException {}
/*
 * DBeaver - Universal Database Manager

 *
