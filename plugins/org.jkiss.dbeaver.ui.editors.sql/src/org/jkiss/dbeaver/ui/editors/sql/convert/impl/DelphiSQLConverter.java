 *
            result.append('\'').append(CommonUtils.escapeJavaString(line));
 * you may not use this file except in compliance with the License.
 */
    	boolean useStringBuilder = CommonUtils.toBoolean(options.get(OPTION_USE_STRING_BUILDER));
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else if (useStringBuilder){
 * See the License for the specific language governing permissions and
                result.append(");\n");
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class DelphiSQLConverter extends SourceCodeSQLConverter {
            if (i < sourceLines.length - 1 && !useStringBuilder) {
                result.append(lineDelimiter);

            line = line.replace("'", "''");
 * DBeaver - Universal Database Manager
 * DelphiSQLConverter
    @Override
    }
 * limitations under the License.
            }

}
            if (trailingLineFeed) {
	
            result.append('\'');
import org.jkiss.utils.CommonUtils;
        boolean trailingLineFeed = lineDelimiter.startsWith("#");
 * Unless required by applicable law or agreed to in writing, software
            }
                result.append(lineDelimiter);
 * distributed under the License is distributed on an "AS IS" BASIS,
	public static final String OPTION_USE_STRING_BUILDER = "use-string-builder";
import java.util.Map;
        if(useStringBuilder) {
        }
 * You may obtain a copy of the License at
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (int i = 0; i < sourceLines.length; i++) {
/*
                result.append("Query.Add(");
/**
            }
            if (!trailingLineFeed) {
            if (useStringBuilder) {
        	result.append("Query := TStringList.Create;\n");
 *
 */
            }
                result.append(" + \n");
            String line = sourceLines[i];

 *
 * Licensed under the Apache License, Version 2.0 (the "License");


    protected void convertSourceLines(StringBuilder result, String[] sourceLines, String lineDelimiter, Map<String, Object> options) {
