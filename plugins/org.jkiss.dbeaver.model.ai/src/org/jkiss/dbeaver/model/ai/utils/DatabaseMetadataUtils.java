    @NotNull
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (!isAttribute) {
}
        String objectComment = object.getDescription().replace("\n", isAttribute ? "\n\t" : "\n");
package org.jkiss.dbeaver.model.ai.utils;
            description.append(" ");
        return description.toString();

            description.append("\n");
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (isAttribute) {
 * DBeaver - Universal Database Manager
public final class DatabaseMetadataUtils {
        @NotNull DBPObjectWithDescription object
        }
        boolean isAttribute = object instanceof DBSEntityAttribute;
/*
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.utils.CommonUtils;

    ) {
        description.append("-- ").append(objectComment);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
    public static String generateObjectDescription(
 *
            return "";
 */
        StringBuilder description = new StringBuilder();
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBRProgressMonitor monitor,
 *
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        if (!CommonUtils.isEmptyTrimmed(object.getDescription())) {
 * You may obtain a copy of the License at
