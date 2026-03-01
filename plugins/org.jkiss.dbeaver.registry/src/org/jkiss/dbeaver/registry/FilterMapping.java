
    }
            return defaultFilter;
        for (Map.Entry<String, DBSObjectFilter> entry : mapping.customFilters.entrySet()) {
    @Override
    }
    }

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.typeName = typeName;
        return
    DBSObjectFilter defaultFilter;
        DBSInstance ownerInstance = DBUtils.getObjectOwnerInstance(parentObject);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            String objectID = getFilterContainerUniqueID(parentObject);
 *
        }
        if (!(obj instanceof FilterMapping)) {
 * Filter mapping
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    // Copy constructor
        if (!customFilters.isEmpty()) {
    @Override
    FilterMapping(FilterMapping mapping) {
        String objectFullName = DBUtils.getObjectFullName(parentObject, DBPEvaluationContext.UI);
    public final String typeName;
            this.customFilters.put(entry.getKey(), new DBSObjectFilter(entry.getValue()));

        }
            DBSObjectFilter filter = customFilters.get(objectID);
            return false;
        if (parentObject == null) {
 *

import org.jkiss.dbeaver.model.DBUtils;
/*
                        CommonUtils.equalObjects(customFilters, source.customFilters);
            return ownerInstance.getName() + ":" + objectFullName;
/**


        }
            CommonUtils.hashCode(defaultFilter) +
 *
}
        return firstMatch ? null : defaultFilter;
            CommonUtils.hashCode(typeName) +
                CommonUtils.equalObjects(typeName, source.typeName) &&

 */
 * you may not use this file except in compliance with the License.
        } else {
 * limitations under the License.
public class FilterMapping {
    FilterMapping(String typeName) {
        }
    Map<String, DBSObjectFilter> customFilters = new HashMap<>();
    public static String getFilterContainerUniqueID(@Nullable DBSObject parentObject) {
        FilterMapping source = (FilterMapping) obj;
    }
                return filter;
    @Nullable
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

            return objectFullName;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.HashMap;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
                        CommonUtils.equalObjects(defaultFilter, source.defaultFilter) &&
import org.jkiss.utils.CommonUtils;


        }
    DBSObjectFilter getFilter(@Nullable DBSObject parentObject, boolean firstMatch) {
        this.defaultFilter = mapping.defaultFilter == null ? null : new DBSObjectFilter(mapping.defaultFilter);
    public boolean equals(Object obj) {
 * Unless required by applicable law or agreed to in writing, software
        return
        if (!CommonUtils.equalObjects(ownerInstance.getName(), parentObject.getDataSource().getName())) {
        this.typeName = mapping.typeName;
import java.util.Map;
import org.jkiss.code.Nullable;
    public int hashCode() {
import org.jkiss.dbeaver.model.struct.DBSInstance;

            }
 *     http://www.apache.org/licenses/LICENSE-2.0
            if ((filter != null && !filter.isNotApplicable()) || firstMatch) {
            CommonUtils.hashCode(customFilters);
package org.jkiss.dbeaver.registry;
