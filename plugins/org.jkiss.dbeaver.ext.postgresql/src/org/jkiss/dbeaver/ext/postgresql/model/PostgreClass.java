import org.jkiss.dbeaver.model.struct.DBSEntity;

/**
        @Override
 * DBeaver - Universal Database Manager
        // Redshift
            } catch (Throwable e1) {
 * limitations under the License.
{
            return code;
            this.code = code;
        public static final RelKind c = new RelKind("c");  // composite type
        public static final RelKind e = new RelKind("e");



            return code;
public interface PostgreClass extends PostgreObject, DBSEntity, DBPRefreshableObject
        public static RelKind valueOf(String code) {
        }
        public static final RelKind S = new RelKind("S");  // sequence
        public static final RelKind M = new RelKind("M"); // special (?? Greenplum 6+)

 * See the License for the specific language governing permissions and

        public String getCode() {
                return new RelKind(code);
            }
        public static final RelKind o = new RelKind("o"); // special (?? Greenplum 6+)
    @NotNull

        public static final RelKind t = new RelKind("t");  // TOAST table

        }
        public static final RelKind R = new RelKind("R");  // partition
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * you may not use this file except in compliance with the License.
        public String toString() {
    }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others

    class RelKind {
        // Greenplum
        }
 *

        public RelKind(String code) {
        public static final RelKind p = new RelKind("p");  // partitionedtable
 */
        public static final RelKind s = new RelKind("s"); // special (?? redshift)
        public static final RelKind m = new RelKind("m");  // materialized view
package org.jkiss.dbeaver.ext.postgresql.model;
 */
        public static final RelKind i = new RelKind("i");  // index
        public static final RelKind f = new RelKind("f");  // = foreign table
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    PostgreDataSource getDataSource();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * PostgreClass
            try {
        }

        public static final RelKind r = new RelKind("r");  // ordinary table
 *
 * Unless required by applicable law or agreed to in writing, software
        public static final RelKind I = new RelKind("I");  // partitioned index
import org.jkiss.code.NotNull;
                return (RelKind) RelKind.class.getField(code).get(null);
        private final String code;
        public static final RelKind v = new RelKind("v");  // view
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
/*
