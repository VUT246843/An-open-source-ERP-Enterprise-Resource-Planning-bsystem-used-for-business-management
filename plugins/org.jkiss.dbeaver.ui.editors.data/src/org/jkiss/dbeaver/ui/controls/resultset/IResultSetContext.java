 *

    @RuntimeAction
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
    @RuntimeAction
 */

{
    @RuntimeAction
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    String getDocumentContentType();
    boolean hasAttributeOfType(String typeName);
    boolean supportsReferences();

 * See the License for the specific language governing permissions and


    @RuntimeAction
    @RuntimeAction
import org.jkiss.code.Nullable;

}
    boolean supportsGrouping();
    boolean supportsDocument();
 *
 * distributed under the License is distributed on an "AS IS" BASIS,


 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 *
package org.jkiss.dbeaver.ui.controls.resultset;
    boolean supportsAttributes();
 * Result set context

 * limitations under the License.
import org.jkiss.dbeaver.model.meta.RuntimeAction;
    DBCResultSet getResultSet();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    boolean supportsTrace();

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

 */
/**

import org.jkiss.dbeaver.model.exec.DBCResultSet;
/*
public interface IResultSetContext
    DBDAttributeBinding getDocumentAttribute();
