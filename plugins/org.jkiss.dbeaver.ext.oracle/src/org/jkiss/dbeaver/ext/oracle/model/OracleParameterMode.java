    OUT(DBSProcedureParameterKind.OUT),
 * DBeaver - Universal Database Manager
    RETURN(DBSProcedureParameterKind.RETURN);
    public DBSProcedureParameterKind getParameterKind()
 * limitations under the License.
 * See the License for the specific language governing permissions and
*/
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
 *

public enum OracleParameterMode {
        if (CommonUtils.isEmpty(modeName)) {
        } else if ("OUT".equals(modeName)) {
}
 * Unless required by applicable law or agreed to in writing, software
    public static OracleParameterMode getMode(String modeName)
 * you may not use this file except in compliance with the License.
    {
/**
    IN(DBSProcedureParameterKind.IN),
* Parameter/argument mode
 *     http://www.apache.org/licenses/LICENSE-2.0

    private final DBSProcedureParameterKind parameterKind;
    }

    }
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
            return OracleParameterMode.OUT;
        return parameterKind;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.parameterKind = parameterKind;
    }
        }
    INOUT(DBSProcedureParameterKind.INOUT),
import org.jkiss.utils.CommonUtils;
 *

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.oracle.model;
            return null;
        } else {
            return IN;
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    OracleParameterMode(DBSProcedureParameterKind parameterKind)

            return OracleParameterMode.INOUT;
 * You may obtain a copy of the License at
 *
        } else if ("IN".equals(modeName)) {
