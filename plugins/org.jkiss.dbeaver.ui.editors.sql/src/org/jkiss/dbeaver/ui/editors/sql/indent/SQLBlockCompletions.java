 * you may not use this file except in compliance with the License.
public interface SQLBlockCompletions {
    @Nullable
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *

package org.jkiss.dbeaver.ui.editors.sql.indent;
    SQLBlockCompletionInfo findCompletionByHead(int headTokenId);
    @Nullable
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
    Integer findTokenId(String str);
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

    String ONE_INDENT_COMPLETION_PART = "\t";
    String NEW_LINE_COMPLETION_PART = null;
 *
    int KNOWN_TOKEN_ID_BASE = 100;

}
 *
