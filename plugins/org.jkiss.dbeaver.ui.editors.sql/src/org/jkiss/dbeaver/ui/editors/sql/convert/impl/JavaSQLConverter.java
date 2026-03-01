 */

 * You may obtain a copy of the License at

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    }
        for (int i = 0; i < sourceLines.length; i++) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
 * JavaSQLConverter
 * Unless required by applicable law or agreed to in writing, software
/**
 *
 */
                    result.append(" + \n");
}
            result.append("StringBuilder query = new StringBuilder();\n");
                } else {
/*
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
              result.append("query.append(\"").append(escapedLine).append(lineDelimiter).append("\");\n");
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (i < sourceLines.length - 1) {
            if (useStringBuilder) {
    protected void convertSourceLines(StringBuilder result, String[] sourceLines, String lineDelimiter, Map<String, Object> options) {

public class JavaSQLConverter extends SourceCodeSQLConverter {
            String escapedLine = CommonUtils.escapeJavaString(sourceLines[i]);

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
    @Override
 *
                    result.append(";");
                result.append('"').append(escapedLine).append(lineDelimiter).append('"');
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
        if (useStringBuilder)
            else {
        boolean useStringBuilder = CommonUtils.toBoolean(options.get(OPTION_USE_STRING_BUILDER));

    public static final String OPTION_USE_STRING_BUILDER = "use-string-builder";
import java.util.Map;
