 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPScriptObject;
        return "";
    @Override
import java.util.Map;

    @NotNull
        }
import org.jkiss.code.NotNull;
    @Override
        if (source == null && isPersisted()) {
    public AltibaseTableIndex(GenericTableBase table, boolean nonUnique, String qualifier, long cardinality,
    @Property(hidden = true)
 * distributed under the License is distributed on an "AS IS" BASIS,

    
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
package org.jkiss.dbeaver.ext.altibase.model;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSystemGenerated() {
/*
 *
 *
 */
            source = ((AltibaseMetaModel) getDataSource().getMetaModel()).getIndexDDL(monitor, this, options);
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getQualifier() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        super(table, nonUnique, qualifier, cardinality, indexName, indexType, persisted);
    }
    private String source;
        return source;
 *
            String indexName, DBSIndexType indexType, boolean persisted) {

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
    
import org.jkiss.dbeaver.model.meta.Property;
public class AltibaseTableIndex extends GenericTableIndex implements DBPScriptObject {
    }
        return this.getName().startsWith(AltibaseConstants.SYSTEM_GENERATED_PREFIX);
    }
}
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    
