 * Native client home descriptor
import org.jkiss.dbeaver.model.DBPNamedObject;
 */
    @NotNull
package org.jkiss.dbeaver.model.connection;
import org.jkiss.code.NotNull;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");


 * You may obtain a copy of the License at
    File getPath();

 * Copyright (C) 2010-2025 DBeaver Corp and others
    String getDisplayName();
 *
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
    boolean validateFilesPresence(@NotNull DBRProgressMonitor progressMonitor) throws DBException, InterruptedException;
 * Unless required by applicable law or agreed to in writing, software
}
 * limitations under the License.
import java.io.File;
public interface DBPNativeClientLocation extends DBPNamedObject {



import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
