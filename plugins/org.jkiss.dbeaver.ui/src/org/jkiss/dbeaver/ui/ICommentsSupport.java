 */
 *
package org.jkiss.dbeaver.ui;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * Contains information about comments

     * @return comment prefixes or null if single line comments are nto supported
 * distributed under the License is distributed on an "AS IS" BASIS,

public interface ICommentsSupport {
/*
    /**
     */
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Two-item array containing begin and end of multi-line comments.
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
     */
 * limitations under the License.
 *
import org.jkiss.code.Nullable;
 * <p/>
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
    Pair<String, String> getMultiLineComments();
/**
     * List of possible single-line comment prefixes
    String[] getSingleLineComments();
import org.jkiss.utils.Pair;
    /**
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */

     * @return string array or null if multi-line comments are not supported
}
 * Comments manager.
