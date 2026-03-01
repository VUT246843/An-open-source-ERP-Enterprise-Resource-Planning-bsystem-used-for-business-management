    default int getCompleteScore() {
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
/*

            score++;
     */
    @NotNull
 *
        return score;

    @NotNull
}
 */
     * Meta attributes which belongs to this entity
    String getEntityName();
/**
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    String getCatalogName();
        }
    @Nullable
 */
 * You may obtain a copy of the License at
        }

        if (!CommonUtils.isEmptyTrimmed(this.getSchemaName())) {
        if (!CommonUtils.isEmptyTrimmed(this.getCatalogName())) {
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
    @Nullable
package org.jkiss.dbeaver.model.exec;
     * Entity name
            score++;
import java.util.List;
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
        int score = 0;
 * Unless required by applicable law or agreed to in writing, software


    /**
 *
        if (!CommonUtils.isEmptyTrimmed(this.getEntityName())) {
    List<? extends DBCAttributeMetaData> getAttributes();
    /**
 * you may not use this file except in compliance with the License.
        }
 * limitations under the License.
public interface DBCEntityMetaData {
            score++;

 * Result set table metadata
 *
    String getSchemaName();

