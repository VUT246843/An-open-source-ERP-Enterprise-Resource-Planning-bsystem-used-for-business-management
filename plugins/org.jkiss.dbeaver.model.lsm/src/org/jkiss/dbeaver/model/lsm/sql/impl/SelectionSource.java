        INNER,
    public static class Table extends SelectionSource {
    public static class CrossJoin extends SelectionSource {
        FULL_OUTER,
    }

        public SelectionQuery selectionQuery;
    public static class Subquery extends SelectionSource {
        public ValueExpression condition;


        public JoinKind kind;
        NATURAL_RIGHT_OUTER,
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        NATURAL_INNER,
public abstract class SelectionSource {
import java.util.List;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
        NATURAL_FULL_OUTER,
        NATURAL_FULL,
/*
        NATURAL_RIGHT,
    }

    public static class NaturalJoin extends SelectionSource {

        public List<String> columnNames;
        NATURAL_LEFT_OUTER,
        NATURAL_LEFT,
 *     http://www.apache.org/licenses/LICENSE-2.0
        public String alias;
        LEFT_OUTER,
    }
        public Table table;
        NATURAL_UNION
package org.jkiss.dbeaver.model.lsm.sql.impl;
        public String catalogName;
        public List<String> columnNames;
        FULL,
 * Unless required by applicable law or agreed to in writing, software
 */
        RIGHT_OUTER,

 *
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        RIGHT,
        UNION,

        public Table table;
        public String alias;
 * See the License for the specific language governing permissions and
 *
 *
}
 * DBeaver - Universal Database Manager
        LEFT,

        public String tableName;
    public enum JoinKind {
 * you may not use this file except in compliance with the License.
        public String schemaName;
