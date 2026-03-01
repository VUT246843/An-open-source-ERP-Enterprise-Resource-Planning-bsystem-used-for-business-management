import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
 *
/**
 */
 * limitations under the License.
package org.jkiss.dbeaver.model;
 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
public interface DBPContextProvider {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * May be editor, view or selection element
 */
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 * DBeaver - Universal Database Manager

     */
     * Underlying datasource

}
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Unless required by applicable law or agreed to in writing, software

     * @return data source object.
 * DataSource provider.
    DBCExecutionContext getExecutionContext();
