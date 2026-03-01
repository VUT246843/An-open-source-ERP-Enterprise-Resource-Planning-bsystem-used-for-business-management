        return fsPrefix;


    private final DBFVirtualFileSystemRoot fsRoot;
    }
package org.jkiss.dbeaver.model.fs.nio;
    }

 *
    private final IProject project;


 */

 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    public IProject getProject() {

 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.project = project;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
        this.fsRoot = fsRoot;
    public String getPrefix() {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public DBFVirtualFileSystemRoot getRoot() {
        this.fsPrefix = fsPrefix;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystemRoot;
 * limitations under the License.
import org.eclipse.core.resources.IProject;
 *
/*
}
    private final String fsPrefix;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return project;
    public EFSNIOFileSystemRoot(IProject project, DBFVirtualFileSystemRoot fsRoot, String fsPrefix) {
        return fsRoot;
 * Unless required by applicable law or agreed to in writing, software
public class EFSNIOFileSystemRoot {
 * you may not use this file except in compliance with the License.
 * NIOFileSystemRoot
 */
