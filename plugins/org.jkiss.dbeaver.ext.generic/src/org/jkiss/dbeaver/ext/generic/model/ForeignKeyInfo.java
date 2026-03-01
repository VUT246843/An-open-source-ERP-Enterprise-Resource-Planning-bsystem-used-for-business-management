        fkTableName = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.FKTABLE_NAME);
        keySeq = GenericUtils.safeGetInt(fkObject, dbResult, JDBCConstants.KEY_SEQ);
 * See the License for the specific language governing permissions and
    String fkTableSchema;
    int deferabilityNum;
    String fkColumnName;
        fkName = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.FK_NAME);
        fkColumnName = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.FKCOLUMN_NAME);
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
    int deleteRuleNum;
    String fkTableName;
 * distributed under the License is distributed on an "AS IS" BASIS,
    String fkName;
    int keySeq;
    }
        updateRuleNum = GenericUtils.safeGetInt(fkObject, dbResult, JDBCConstants.UPDATE_RULE);
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * limitations under the License.
    String fkTableCatalog;
 */
/*
 * DBeaver - Universal Database Manager

    String pkName;

 *     http://www.apache.org/licenses/LICENSE-2.0
public class ForeignKeyInfo {
        fkTableSchema = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.FKTABLE_SCHEM);
 *
 * You may obtain a copy of the License at
    String pkColumnName;
        pkColumnName = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.PKCOLUMN_NAME);
    int updateRuleNum;
import org.jkiss.code.NotNull;
 *
        deleteRuleNum = GenericUtils.safeGetInt(fkObject, dbResult, JDBCConstants.DELETE_RULE);
        deferabilityNum = GenericUtils.safeGetInt(fkObject, dbResult, JDBCConstants.DEFERRABILITY);
        fkTableCatalog = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.FKTABLE_CAT);
* Helper class for reading foreign key fields
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        pkName = GenericUtils.safeGetStringTrimmed(fkObject, dbResult, JDBCConstants.PK_NAME);
package org.jkiss.dbeaver.ext.generic.model;

 *
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
/**
 * Unless required by applicable law or agreed to in writing, software
    public void fetchColumnsInfo (GenericMetaObject fkObject, @NotNull JDBCResultSet dbResult) {
}
