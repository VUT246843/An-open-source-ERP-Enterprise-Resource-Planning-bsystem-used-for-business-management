 * Represents information about the predicate describing one dialect feature which requires special handling during SQL parsing
 */
    int getMaxSuffixLength();
}

    /**
     */
 * Unless required by applicable law or agreed to in writing, software
/*
 * you may not use this file except in compliance with the License.
     * Action to perform during parse on condition match
 */
    @NotNull
import org.jkiss.code.NotNull;
    SQLParserActionKind getActionKind();
    /**
    @Nullable
public interface SQLTokenPredicate {


     * Maximum lengths of corresponding suffixes under condition. Zero when prefix is enough to trigger the action.
     * The parameter of the predicate describing the special way of handling during SQL parsing
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
/**
 * You may obtain a copy of the License at
 * limitations under the License.
package org.jkiss.dbeaver.model.sql.parser;
 *
 * See the License for the specific language governing permissions and

     */
 *
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
    String getParameter();
import org.jkiss.code.Nullable;
