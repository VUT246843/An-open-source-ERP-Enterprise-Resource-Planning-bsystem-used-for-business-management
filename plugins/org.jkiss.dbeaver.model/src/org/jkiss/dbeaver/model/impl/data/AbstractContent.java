 * you may not use this file except in compliance with the License.

 */
package org.jkiss.dbeaver.model.impl.data;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
public abstract class AbstractContent implements DBDContent {
 * See the License for the specific language governing permissions and
    public boolean isModified() {

    {
    @NotNull
}
    {
    protected boolean modified = false;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        this.modified = copyFrom.modified;
    public void resetContents()
 * AbstractContent

        // do nothing
 * @author Serge Rider
 * DBeaver - Universal Database Manager
        return executionContext.getDataSource();
    public AbstractContent(AbstractContent copyFrom) {
    }

    }
import org.jkiss.dbeaver.model.DBConstants;
    protected final DBCExecutionContext executionContext;
 * limitations under the License.
 *
 *
    public String toString()
 *
    {
/**
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
        this.executionContext = executionContext;


    @Override
    @Override

 *
    protected AbstractContent(DBCExecutionContext executionContext)
        return modified;
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    public DBPDataSource getDataSource() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return displayString == null ? DBConstants.NULL_VALUE_LABEL : displayString;

    }
        this.executionContext = copyFrom.executionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
        String displayString = getDisplayString(DBDDisplayFormat.UI);
    }
