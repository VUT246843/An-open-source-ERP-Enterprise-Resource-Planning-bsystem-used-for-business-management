 * distributed under the License is distributed on an "AS IS" BASIS,



        }
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        for (DBDAttributeBinding binding : rowIdentifier.getAttributes()) {
        @NotNull OrderingPolicy policy
public final class OrderingUtils {
        }
    }
    public static void addOrderingOnServerSide(
        if (rowIdentifier == null || rowIdentifier.isIncomplete()) {
        if (!entity.getDataSource().getSQLDialect().supportsOrderByIndex() || policy == OrderingPolicy.DEFAULT) {

        } catch (DBException exception) {
import org.jkiss.dbeaver.model.struct.DBSEntity;

            .toList()) + " " + (policy == OrderingPolicy.PRIMARY_KEY_DESC ? "DESC" : "ASC"));
 * Utilities for applying default ordering in a non-UI layer.
        @NotNull DBRProgressMonitor monitor,
            return;
    }
import org.jkiss.dbeaver.Log;
/**
            DBDAttributeConstraint constraint = dataFilter.getConstraint(binding);
    ) {
        }
import java.util.List;
                constraint.setOrderPosition(dataFilter.getMaxOrderingPosition() + 1);
package org.jkiss.dbeaver.model.data.order;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
}
    public static boolean addOrderingOnClientSide(
        try {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            }
        List<? extends DBSEntityAttribute> attrs = List.of();
        @NotNull OrderingPolicy policy
    private static final Log log = Log.getLog(OrderingUtils.class);
 * You may obtain a copy of the License at
        @NotNull DBSEntity entity,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
 */
    private OrderingUtils() {
    ) {
            return false;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        dataFilter.setOrder(String.join(",", attrs.stream()

            .map(attr -> DBUtils.getQuotedIdentifier(entity.getDataSource(), attr.getName()))
        }
        if (policy == OrderingPolicy.DEFAULT) {
 */
import org.jkiss.code.NotNull;
        return true;
 * limitations under the License.
        @NotNull DBDDataFilter dataFilter,
/*
import org.jkiss.dbeaver.model.DBUtils;
                constraint.setOrderDescending(policy == OrderingPolicy.PRIMARY_KEY_DESC);
import org.jkiss.dbeaver.model.data.DBDDataFilter;
            return;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;
            log.warn("Can't get table identifier", exception);
            if (constraint != null) {
        if (attrs.isEmpty()) {
import org.jkiss.dbeaver.DBException;

        }
        @Nullable DBDRowIdentifier rowIdentifier,


    }
            return false;
        // no instances


 * you may not use this file except in compliance with the License.
        @NotNull DBDDataFilter dataFilter,
            attrs = DBUtils.getBestTableIdentifier(monitor, entity);
 * See the License for the specific language governing permissions and
