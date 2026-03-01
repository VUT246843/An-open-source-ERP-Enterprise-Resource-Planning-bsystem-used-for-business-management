     */
    /**
    @Nullable
public interface DBSTypeDescriptor {
    record CompositeMemberInfo(
/**
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    }
    }
        return null;
    /**
    }
    }
    @Nullable
     * with the given amount of indexes or splicing specification
    @NotNull
    /**
        return 0;
    default DBSDataType getUnderlyingType() {
     */
 *
import org.jkiss.code.Nullable;
 * Provides extra type description, not covered by the database model
 * limitations under the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataKind;
     * Named member type information


        @NotNull DBSTypeDescriptor type
        return null;
     */
 * See the License for the specific language governing permissions and
     * Returns type description for the member having given name if such a member exists
 *
     */

    @Nullable
    enum Kind {
 */
import java.util.Collection;
        COMPOSITE

/*
     * Returns data type name
        return Kind.UNKNOWN;
        UNKNOWN,
    @NotNull
    default DBSTypeDescriptor getIndexableItemType(int depth, boolean[] slicingSpecOrNull) {
        return null;

 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
    /**
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String getTypeName();


        return null;
    /**
}
import org.jkiss.dbeaver.DBException;
    default int getIndexableDimensions() {
    }


     * Returns underlying data type, if presented
    default Kind getKind() {
        SIMPLE,
 *
    default Collection<CompositeMemberInfo> getCompositeMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
     */
     */
    }
    ) {
    @Nullable
 */
     * Returns type description for the result of the collection indexing

     * Returns collection for containing type descriptions for all the known named members of this type
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
     * Returns the amount of indexable dimensions for indexable data type
    /**
    @Nullable
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        INDEXABLE,
    }

    }
    default DBPDataKind getDataKind() {
     */
    default DBSTypeDescriptor findCompositeMember(@NotNull DBRProgressMonitor monitor, String name) throws DBException {

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.model.struct;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull String name,
