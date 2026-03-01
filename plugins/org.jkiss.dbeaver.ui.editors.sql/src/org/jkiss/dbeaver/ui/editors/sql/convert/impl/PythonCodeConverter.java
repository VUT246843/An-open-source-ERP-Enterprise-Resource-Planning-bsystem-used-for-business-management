
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 * limitations under the License.
 * See the License for the specific language governing permissions and
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
            String escapedString = CommonUtils.escapeJavaString(sourceLine);
        for (String sourceLine : sourceLines) {
 * Unless required by applicable law or agreed to in writing, software
 *
        }
import org.jkiss.utils.CommonUtils;
 *
import java.util.Map;
 */
    @Override
 * You may obtain a copy of the License at
    protected void convertSourceLines(StringBuilder result, String[] sourceLines, String lineDelimiter, Map<String, Object> options) {
        result.append("\"\"\"").append('\n');

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
            result.append(escapedString).append('\n');


 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        result.append("\"\"\"").append('\n');
public class PythonCodeConverter extends SourceCodeSQLConverter {
