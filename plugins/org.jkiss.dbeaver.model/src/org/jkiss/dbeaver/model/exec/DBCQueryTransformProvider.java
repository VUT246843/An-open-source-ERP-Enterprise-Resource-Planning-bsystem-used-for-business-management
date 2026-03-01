 *
    /**


 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
public interface DBCQueryTransformProvider {

 * This interface could be implemented by {@link org.jkiss.dbeaver.model.DBPDataSource} implementor.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
}
    @Nullable
/*
 * you may not use this file except in compliance with the License.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param type transformation type
 * Query transform provider.
    DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type);
 */
     * @return new transformer or null if transformation of specified type is not supported
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.exec;

     * Creates new query transformer
/**
