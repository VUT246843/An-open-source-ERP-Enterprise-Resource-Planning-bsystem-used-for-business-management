 * DBeaver - Universal Database Manager
/**
{

import org.jkiss.dbeaver.DBException;
 */
        public final int depth;

 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * Driver library dependencies
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Override
        }
 * limitations under the License.
import java.util.List;
public interface DBPDriverDependencies


    void resolveDependencies(DBRProgressMonitor monitor) throws DBException;
            this.depth = owner == null ? 0 : owner.depth + 1;
    List<DependencyNode> getLibraryList();
        public final List<DependencyNode> dependencies = new ArrayList<>();
}


        public final DBPDriverLibrary library;
            return library.getPath();
        public final DependencyNode owner;
 *
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */

 *
            this.owner = owner;
            this.library = library;
package org.jkiss.dbeaver.model.connection;
        }
/*
        public String toString() {
import java.util.ArrayList;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        public boolean duplicate;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public DependencyNode(DependencyNode owner, DBPDriverLibrary library) {
    class DependencyNode {
 *
 * Unless required by applicable law or agreed to in writing, software
    List<DependencyNode> getLibraryMap();

