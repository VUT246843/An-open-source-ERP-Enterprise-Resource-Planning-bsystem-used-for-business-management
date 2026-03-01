            return value / total;
            if (total < 0) {
 * limitations under the License.
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        }


    private class PercentOfTotalValueHandler extends ProxyValueHandler {
            if (value == null) {
import java.util.List;
public class PercentOfTotalGroupingAttributeTransformer implements DBDAttributeTransformer {
            @NotNull DBSTypedObject type,
 *
    public static final String TYPE_NAME = "percent";
            return super.getValueDisplayString(column, value, format);

        }
 */
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                return formatPercent(percentOfTotal(rowCount.doubleValue(), total));
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (total == 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @NotNull DBCSession session,

    private static final DecimalFormat df = new DecimalFormat("0.####%");


        public PercentOfTotalValueHandler(@NotNull DBDValueHandler target, long total) {
    public PercentOfTotalGroupingAttributeTransformer(@NotNull TotalRowCountProvider totalRowCountSupplier) {
import org.jkiss.code.Nullable;
            log.trace("Unexpected value type for PercentOfTotalValueHandler: " + value.getClass().getName());
                return "";
        attribute.setPresentationAttribute(new TransformerPresentationAttribute(attribute, TYPE_NAME, -1, DBPDataKind.NUMERIC));
 * you may not use this file except in compliance with the License.
        private final long total;
        attribute.setTransformHandler(new PercentOfTotalValueHandler(attribute.getValueHandler(), totalRows));
            super(target);
 *
            }
    public interface TotalRowCountProvider {
        @NotNull DBDAttributeBinding attribute,
            return df.format(percent);
                return 0;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            }
        @Nullable
        private double percentOfTotal(double value, double total) {
        }
            }
import org.jkiss.dbeaver.Log;

        @NotNull
 *
import java.util.Map;
    private static final Log log = Log.getLog(PercentOfTotalGroupingAttributeTransformer.class);
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;

 * Copyright (C) 2010-2025 DBeaver Corp and others
/**

        private String formatPercent(double percent) {
 * Transforms numeric values into their percentage of a total.
                throw new IllegalArgumentException("Total must be non-negative, but got: " + total);

        long getTotalRowCount(@NotNull DBRProgressMonitor monitor) throws DBException;
        @Override
    public void transformAttribute(
    }
            if (object instanceof Number rowCount) {
            this.total = total;
        long totalRows = totalRowCountSupplier.getTotalRowCount(session.getProgressMonitor());


 */
        this.totalRowCountSupplier = totalRowCountSupplier;
package org.jkiss.dbeaver.model.impl.data.transformers;

            }
    private final TotalRowCountProvider totalRowCountSupplier;
            }
        @Override
        @NotNull Map<String, Object> options
            boolean copy,
        @NotNull
 * Unless required by applicable law or agreed to in writing, software

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.DBPDataKind;
 * distributed under the License is distributed on an "AS IS" BASIS,
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {

            boolean validateValue
        @NotNull DBCSession session,
    ) throws DBException {
    @FunctionalInterface
            return super.getValueFromObject(session, type, object, copy, validateValue);
import org.jkiss.code.NotNull;
    @Override
    }
        }
            @Nullable Object object,
import java.text.DecimalFormat;
        }
 * DBeaver - Universal Database Manager
    }
                return percentOfTotal(rowCount.doubleValue(), total);
}
    }
import org.jkiss.dbeaver.model.data.DBDValueHandler;
        @NotNull List<Object[]> rows,
        ) throws DBCException {
        public Object getValueFromObject(
            if (value instanceof Number rowCount) {
 * See the License for the specific language governing permissions and

