 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLRuleScanner;
            @NotNull Map<String, Object> options);


            int length,
/**
 * limitations under the License.
            @NotNull SQLRuleScanner ruleManager,
/*

 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            int startPos,
import org.jkiss.code.NotNull;
import java.util.Map;
    String convertText(
import org.eclipse.jface.text.IDocument;
 * See the License for the specific language governing permissions and
 *
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.sql.convert;
 */
 * SQL code converter
public interface ISQLTextConverter {
}
 * DBeaver - Universal Database Manager

    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
import org.jkiss.dbeaver.model.sql.SQLDialect;

            @NotNull SQLDialect dialect,

 *
 */
 * You may obtain a copy of the License at
            @NotNull SQLSyntaxManager syntaxManager,
 *
            @NotNull IDocument document,
