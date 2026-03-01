    private final int replacementPosition;
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class SQLQueryCompletionSet {
 * distributed under the License is distributed on an "AS IS" BASIS,
    
        this.replacementLength = replacementLength;
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.sql.semantics.completion;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    
        this.replacementPosition = replacementPosition;
 *
 *
 * See the License for the specific language governing permissions and
        return this.items;
    }
        this.items = items;
    public Collection<? extends SQLQueryCompletionItem> getItems() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import java.util.Collection;
    private final int replacementLength;
 * limitations under the License.

    }
 */
    }
    
}
    public int getReplacementLength() {
    private final Collection<? extends SQLQueryCompletionItem> items;
 *
    public SQLQueryCompletionSet(int replacementPosition, int replacementLength, Collection<? extends SQLQueryCompletionItem> items) {
        return this.replacementLength;
    
        return this.replacementPosition;

    public int getReplacementPosition() {
