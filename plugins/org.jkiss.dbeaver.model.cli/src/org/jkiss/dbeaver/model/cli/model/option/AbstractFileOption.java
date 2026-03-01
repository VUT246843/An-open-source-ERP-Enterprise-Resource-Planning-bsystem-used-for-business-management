 * Unless required by applicable law or agreed to in writing, software
/*

    protected DBFPath getPath(@Nullable String filePath) {
import org.jkiss.dbeaver.model.fs.DBFUtils;
 * limitations under the License.
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Nullable
}
 *
            log.error("Error getting path from URI: " + filePath + " " + e.getMessage(), e);

public class AbstractFileOption {
import org.jkiss.code.Nullable;
            return DBFUtils.getDBFPathFromURI(filePath);
        if (CommonUtils.isEmpty(filePath)) {
        try {
import org.jkiss.utils.CommonUtils;
    }
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
package org.jkiss.dbeaver.model.cli.model.option;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return null;
        } catch (DBException e) {
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(AbstractFileOption.class);
 * See the License for the specific language governing permissions and
        }

        }
 *
 *
import org.jkiss.dbeaver.model.fs.DBFPath;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
