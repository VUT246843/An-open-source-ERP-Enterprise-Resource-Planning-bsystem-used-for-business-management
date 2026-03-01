
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
public class SelectionQuery {
package org.jkiss.dbeaver.model.lsm.sql.impl;
 * Unless required by applicable law or agreed to in writing, software
    public GroupingSpec groupBy;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public List<SelectionItem> columns;

    public SelectQuantifier quantifier;
 * limitations under the License.
    public List<SelectionSource> sources;

 *
/*
 *
import java.util.List;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * DBeaver - Universal Database Manager
    public SearchCondition.BooleanExpression having;
    public SearchCondition.BooleanExpression where;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *
 * You may obtain a copy of the License at
