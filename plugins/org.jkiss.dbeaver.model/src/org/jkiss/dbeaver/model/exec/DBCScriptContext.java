            this.type = type;
 * The same for series of queries executed as a single script


 *     http://www.apache.org/licenses/LICENSE-2.0
    Object getVariable(String name);
    <T> T getData(String key);
        private final String title;
import java.util.List;


/*
        }


    boolean hasVariable(String name);
    void removeVariable(String name);
    }


 * Unless required by applicable law or agreed to in writing, software
        VariableType(String title) {
import org.jkiss.code.NotNull;
        }

            return title;
        public VariableInfo(String name, Object value, VariableType type) {
 */
    void setVariable(String name, Object value);
        public VariableType type;


        PARAMETER("Parameter"),
 * See the License for the specific language governing permissions and
        QUERY("Query");
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    enum VariableType {

 * limitations under the License.
    class VariableInfo {

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface DBCScriptContext {
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *

        public String getTitle() {
 *
            this.title = title;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


}
    void setData(String key, Object value);

package org.jkiss.dbeaver.model.exec;
            this.value = value;

            this.name = name;
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
    boolean hasDefaultParameterValue(String name);
    void addListener(DBCScriptContextListener listener);
    }
 * DBeaver - Universal Database Manager
        public Object value;
    void removeListener(DBCScriptContextListener listener);
        VARIABLE("Variable"),
 * you may not use this file except in compliance with the License.
        public String name;
 * Script context.
    List<VariableInfo> getVariables();
        }
    void removeDefaultParameterValue(String name);
/**
    DBCOutputWriter getOutputWriter();
 * You may obtain a copy of the License at

