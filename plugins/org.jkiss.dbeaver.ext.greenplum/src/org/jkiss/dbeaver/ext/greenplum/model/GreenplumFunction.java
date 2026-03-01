 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public GreenplumFunction(DBRProgressMonitor monitor, PostgreSchema schema, ResultSet dbResult) {
        return functionDeclaration;
    }
 *
        a("ANY"),

}


        private String execLocation;
        i("INITPLAN");

 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
        super(monitor, schema, dbResult);
 */
    }
    }
    }
 * You may obtain a copy of the License at
    }
    }
        }
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

        FunctionExecLocation(String execLocationString) {
 * limitations under the License.
package org.jkiss.dbeaver.ext.greenplum.model;
    private FunctionExecLocation executionLocation;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;



                CommonUtils.valueOf(FunctionExecLocation.class, JDBCUtils.safeGetString(dbResult, "proexeclocation"))
        this.executionLocation = getDataSource().isServerVersionAtLeast(9,4) ? FunctionExecLocation.a : null;
        }
        }
                : null;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        public String getValue() {
        String functionDeclaration = super.generateFunctionDeclaration(language, returnTypeName, functionBody);
            return def.append("EXECUTE ON ").append(this.executionLocation.getValue()).toString();
    public enum FunctionExecLocation {

 * See the License for the specific language governing permissions and
    @Override
            StringBuilder def = new StringBuilder(functionDeclaration);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
    public GreenplumFunction(PostgreSchema schema) {
public class GreenplumFunction extends PostgreProcedure {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        m("MASTER"),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


 *

/*
        return executionLocation;
    private FunctionExecLocation readExecutionLocationIfSupported(ResultSet dbResult) {

        if(this.executionLocation != null) {
    protected String generateFunctionDeclaration(PostgreLanguage language, String returnTypeName, String functionBody) {
        return getDataSource().isServerVersionAtLeast(9, 4) ?
    public FunctionExecLocation getExecutionLocation() {
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.ResultSet;
        s("ALL SEGMENTS"),
        super(schema);
            this.execLocation = execLocationString;
        this.executionLocation = readExecutionLocationIfSupported(dbResult);
 *
 * Unless required by applicable law or agreed to in writing, software

            return execLocation;
