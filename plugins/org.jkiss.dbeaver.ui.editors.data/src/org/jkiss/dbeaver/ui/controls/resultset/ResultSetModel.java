            DBDRowIdentifier rowIdentifier = column.getRowIdentifier();
            this.trace = null;
     *
            this.operator = co.getOperator();
                        if (acs.rangeCheck) {
                    continue;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
                }
                    origValue,
    }
        return visibleAttributes.get(index);
        }
        DBCEntityMetaData ent1 = attr1.getMetaAttribute().getEntityMetaData();
        }
    }
                        }
     */
                        valueToEdit = vc.cloneValue(new VoidProgressMonitor());
                                        foreground = acs.colorForeground != null ? acs.colorForeground : acs.colorForeground2;
        }
        if (!CommonUtils.isEmpty(coList)) {
                                            minValue,
            for (ResultSetRow row : oldRows) {

        }, "Release values", 5000);
        }
        @Nullable Object value,
                } else {
    private volatile boolean hasData = false;
        @Nullable int[] rowIndexes,
    public void setStatistics(DBCStatistics statistics) {
        }
    }

        final DBPPreferenceStore store = dataSourceContainer.getPreferenceStore();
        }
    };
            for (ResultSetRow row : rows) {
            if (dataFilter.getConstraint(binding) == null) {
            // Detect column filter
            CommonUtils.toString(currentValue, null),

            if (cleanupOldCache) {
            for (Map.Entry<DBDAttributeBinding, List<AttributeColorSettings>> entry : colorMapping.entrySet()) {
import org.jkiss.dbeaver.ModelPreferences;
    private final ResultSetHintContext hintContext;
        }
    private DBCExecutionSource executionSource;

 */
                }
    private DBDDataFilter dataFilter;
            if ((entity == null || (rowIdentifier != null && rowIdentifier.getEntity() == entity)) &&

    }
    /**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
            return DBVUtils.getVirtualEntity(entity, true);
                        DBDAttributeBinding attribute = (DBDAttributeBinding) cAttr;
                return rowIdentifier;
        }
            // In this case it must be root attribute
        fillVisibleAttributes();
        List<DBDAttributeBinding> result = new ArrayList<>();
package org.jkiss.dbeaver.ui.controls.resultset;
    @Nullable
            if (binding != null && (binding.getParentObject() == null || binding.getParentObject() == documentAttribute)) {
                                        cellBgColors = new Color[attributes.length];
                if (entityAttribute != null) {
            });

import org.jkiss.dbeaver.Log;
                if (constraint.getOperator() != null) {
                if (realAttr.getDataKind() == DBPDataKind.DOCUMENT || realAttr.getDataKind() == DBPDataKind.CONTENT) {
    }
                                colorInfo = new ResultSetRow.ColorInfo();
        if (!attr.getDataKind().isComplex() && !(value instanceof DBDValue) && Objects.equals(

        return trace;

        return true;
            }
                }
    }
                        }

                    origValue = row.getChange(attr);
        List<DBDAttributeBinding> nestedBindings = binding.getNestedBindings();
        // Add new data
        boolean entityDataView = executionSource != null && executionSource.getDataContainer() instanceof DBSEntity;
    private int changesCount = 0;
        if (nestedBindings != null) {
    }
    @NotNull
    public void setMetaData(@NotNull DBCResultSet resultSet, @NotNull DBDAttributeBinding[] newAttributes) {
        this.dataFilter = createDataFilter();

    @NotNull
    boolean updateCellValue(
        List<DBVColorOverride> coList = virtualEntity.getColorOverrides();
            final DBDAttributeConstraint constraint = dataFilter.getConstraint(iter.next());



                }
            topAttribute = attr.getTopParent();
    }
        // 2. Save old value in history (if it is complex then save root element)
        if (row.getState() != ResultSetRow.STATE_NORMAL) {
            newRows.add(
        if (!colorMapping.isEmpty()) {
    public void setAttributeVisibility(@NotNull DBDAttributeBinding attribute, boolean visible) {
            return "Update in progress";
        int depth = attr.getLevel();
                            } else {
    }
        this.documentAttribute = null;
    }
    public ResultSetHintContext getHintContext() {
    public boolean isMetadataChanged() {
        this.hasData = false;
            if (!attr.isCustom()) {
        if (value instanceof DBDValue) {
                filterConstraint.setOperator(constraint.getOperator());
                                    if (cellBgColors == null) {
        // For complex values we save original value in history only once.
        for (DBDAttributeBinding binding : bindings) {
                    } else if (cell1 instanceof String && cell2 instanceof String) {

        if (!newConstraints.isEmpty()) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        }
                                    if (acs.colorForeground != null && acs.colorForeground2 != null) {
            }

                                }
        newRow.setVisualNumber(rowNum);
            return true;
                    Object cell1 = getCellValue(new ResultSetCellLocation(binding, row1));
                if (filter.getConstraint(attr, true) == null) {
        } else {

    public int getVisibleAttributeCount() {
                if ((oldMeta == null && newMeta != null) || (oldMeta != null && newMeta == null)) {
import org.jkiss.code.Nullable;
import java.util.*;
                    // This may happen during FK navigation - attributes are already updated while colors mapping are still old
        }
            try {
            curRows.sort((row1, row2) -> {
        this.clearData();
            this.colorForeground = getColor(co.getColorForeground());
    private void fillVisibleAttributes() {
                                        background = UIUtils.getSharedColor(bgRowRGB);
            dataFilter.addConstraints(newConstraints);
                            if (colorInfo == null) {
                                    }
        return result;
    public DBCStatistics getStatistics() {
            if (c2 == null) {
                iter.remove();
    @Override

    @NotNull
                    }
        }
    @Nullable
            filterConstraint.setVisible(constraint.isVisible());
        final List<ResultSetRow> oldRows = curRows;

     * @param dataFilter data filter
        this.curRows = new ArrayList<>();
    void resetCellValue(@NotNull DBDAttributeBinding attr, @NotNull ResultSetRow row, @Nullable int[] rowIndexes) {
            filterConstraint.setOrderPosition(constraint.getOrderPosition());
    // Data
                            if (acs.attributeValues != null && acs.attributeValues.length > 1) {
            return c1.getVisualPosition() - c2.getVisualPosition();
        List<DBDAttributeConstraint> newConstraints = new ArrayList<>();

    ) {
                addConstraints(newConstraints, binding);
            if (row.getRowNumber() >= relative.getRowNumber()) {
                continue;
            } catch (DBException e) {
        }
                    columnFilter = container.getObjectFilter(entityAttribute.getClass(), entity, false);
        private final Object[] attributeValues;
    }
    }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

            attributes,
            }
        }
    }
 *
                    }
        }
                            // more than one
        if (colorMapping.isEmpty() || reset) {
            CommonUtils.toString(value, null))
            }

        return statistics;
    public void updateColorMapping(@NotNull DBVEntity virtualEntity, boolean reset) {
    void refreshValueHandlersConfiguration() {
    void updateDataFilter() {
        }
    @Nullable
    }
            DBDValueRenderer valueRenderer = binding.getValueRenderer();
     * @return single source entity
        }
                        attributes = nested.toArray(new DBDAttributeBinding[0]);
                filterConstraint.setValue(constraint.getValue());

        if (entityDataView) {
            // Update visibility
        return children;
                    if (result != 0) {
            updateRowColors(true, curRows);
        // Init data filter
                                    if (cellFgColors == null) {
                    attr = refAttr;
                    break;
            }
            changesCount++;
            if (realAttr != null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void appendData(@NotNull DBRProgressMonitor monitor, @NotNull List<Object[]> rows, boolean resetOldRows) {
        this.hintContext = new ResultSetHintContext(this::getDataContainer, this::getSingleSource);
                        result = DBUtils.compareDataValues(cell1, cell2);
        // Check if filter misses some attributes
        if (attr1.getMetaAttribute() == null || attr2.getMetaAttribute() == null) {
    public boolean isDirty() {
            }
import org.jkiss.dbeaver.DBException;
        private final boolean rangeCheck;
                        colorMapping.computeIfAbsent(binding, k -> new ArrayList<>());
                    Object cell2 = getCellValue(new ResultSetCellLocation(binding, row2));
        }
        {
    private boolean isSameSource(DBDAttributeBinding attr1, DBDAttributeBinding attr2) {

    /**
                    if (binding == null) {
    public Object[] getRowData(int index) {
                DBDAttributeBinding topAttr = attributes[0];
    public void resetOrdering(@NotNull DBDAttributeBinding columnElement) {
    }
                if (!ArrayUtils.contains(attributes, entry.getKey())) {
        for (ResultSetRow row : curRows) {
        List<DBDAttributeBinding> result = new ArrayList<>(nestedBindings);

                    ResultSetCellLocation cellLocation = new ResultSetCellLocation(entry.getKey(), row);
        {
                row.addChange(topAttribute, currentValue);

import org.jkiss.dbeaver.model.virtual.DBVUtils;
                    visibleAttributes.remove(cAttr);

        for (DBDAttributeBinding attr : attributes) {
                    update = true;
        // Then copy it into a new value and edit new value
    public DataSourceJob getUpdateJob() {
    @Override
        colorMapping.clear();
                }
        return getCellValue(cellLocation.getAttribute(), cellLocation.getRow(), cellLocation.getRowIndexes(), false);
                changesCount += row.getChangesCount();
                        if (attribute.getParentObject() == null || attribute.getParentObject() == documentAttribute) {
 * Result set model
    public DBCTrace getTrace() {
    }
            }
        int rootIndex;
        final Deque<DBDAttributeBinding> parents = new ArrayDeque<>(getVisibleAttributes());
            this.rangeCheck = co.isRange();
    public boolean hasData() {
                    if (!visibleAttributes.contains(cAttr)) {
                // Also check that original visual pos is the same as current position.


        return totalRowCount;
            attribute,
                                            value
        // Filter pseudo attributes if we query single entity
 * limitations under the License.
        DBSObjectFilter columnFilter = null;
        if (row.getState() == ResultSetRow.STATE_REMOVED) {
                row.setVisualNumber(row.getVisualNumber() + delta);
            DBSEntity entity = (DBSEntity) executionSource.getDataContainer();
                DBCAttributeMetaData oldMeta = this.attributes[i].getMetaAttribute();
        if (isUniqueKeyUndefinedButRequired(dataSourceContainer)) {
    void updateMetaData(@NotNull DBDAttributeBinding[] newAttributes) {
    public List<DBDAttributeBinding> getVisibleAttributes() {
            filterConstraint.setOptions(constraint.getOptions());
    @Nullable
    }

import org.jkiss.dbeaver.model.virtual.DBVColorOverride;
                                colorInfo.rowBackground = background;

        List<DBDAttributeConstraint> constraints = new ArrayList<>(attributes.length);
                    attr,
            }
                return 1;
        for (int i = 0; i < curRows.size(); i++) {
 * DBeaver - Universal Database Manager
            curRows.get(i).setVisualNumber(i);
                                    }
    @Override
            } else {


 */
                for (DBDAttributeConstraint co : orderConstraints) {

        this.visibleAttributes.clear();
        if (resultSet instanceof DBCResultSetTrace) {
                } else if (oldMeta == newMeta) {
    @Override
                    missingConstraints.add(constraint);
        }
                        Color background = null, foreground = null;
            }
            final List<DBDAttributeConstraint> orderConstraints = dataFilter.getOrderConstraints();
 * See the License for the specific language governing permissions and
        final boolean hasOrdering = dataFilter.hasOrdering();
                hintContext.resetCache();
    }
        // Refresh all rows
                    row,
        if (dataContainer == null) {
                            if (acs.evaluate(cellValue)) {
                                        cellFgColors = new Color[attributes.length];
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private Long totalRowCount = null;
import org.eclipse.swt.graphics.Color;
            }
    }
                if (origValue instanceof DBDAttributeBinding refAttr) {
                                        );
            if (container.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS) && attributes.length > 0) {
    @Nullable
            DBSAttributeBase cAttr = filterConstraint.getAttribute();
                if (!constraint.isVisible()) {
    public ResultSetModel() {
                            // Add only root attributes
        if (row.getState() == ResultSetRow.STATE_ADDED) {
        } else {
                        continue;
        if (virtualEntity == null) {
            DBDRowIdentifier rowIdentifier = attribute.getRowIdentifier();
        if (hasOrdering) {
            rowIndexes,
                    }
                    // We reset top attribute value

        }
                // Let's add it just to visualize condition in filters text
    }
    void releaseAllData() {
    // Attributes
     * Updates cell value. Saves previous value.
    @NotNull
                    false);
            changesCount++;
            DBDAttributeBinding binding = getAttributeBinding(attr);
        }
        }
                if (columnFilter != null && !columnFilter.matches(binding.getName())) {
            }
        DBSDataContainer dataContainer = getDataContainer();
            valueToEdit = value;
            } else if (row.isChanged()) {
            rootIndex = attr.getOrdinalPosition();
    }
                // the same source
    }
    public DBDAttributeBinding getAttribute(int index) {
        this.dataFilter.setAnyConstraint(filter.isAnyConstraint());
            return true;
    private transient boolean metadataDynamic;
                }
            update = false;
        private final Color colorBackground2;
    }
            if (isDocumentBased) {
        return metadataDynamic;
    }
        for (DBSAttributeBase attr : this.dataFilter.getOrderedVisibleAttributes()) {
        if (currentValue instanceof DBDValue) {
        this.visibleAttributes.clear();
                                row.colorInfo = colorInfo;
        this.visibleAttributes.clear();
        ResultSetRow newRow = new ResultSetRow(curRows.size(), data);
import org.eclipse.swt.graphics.RGB;
        return
        if (updateChanges && row.getState() == ResultSetRow.STATE_NORMAL) {
                addConstraints(constraints, nested);
        boolean update = false;

            this.singleColumn = co.isSingleColumn();

            this.attributes.length > 0 &&
import org.jkiss.dbeaver.model.exec.trace.DBCTrace;

        if (dataContainer != null) {
        }
            }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.*;
    @Override
                // Save original to history and create a copy

                    }
        return singleSourceEntity != null;
            return null;

    void setUpdateInProgress(DataSourceJob updateService) {
        return dataFilter;
        this.dataFilter.setWhere(filter.getWhere());
                    rowIndexes,
                    List<AttributeColorSettings> cmList =
                visibleAttributes.toArray(new DBDAttributeBinding[0]));
            updateDataFilter(prevFilter, false);
                this.attributes[0].getTopParent().getDataSource().getInfo().isDynamicMetadata();
        } else {
                    cmList.add(new AttributeColorSettings(co));
                return -1;
                vhc.refreshValueHandlerConfiguration(binding);
            this.colorForeground2 = getColor(co.getColorForeground2());
    }
                                }

                // We check order position only when forceUpdate=true (otherwise all previous filters will be reset, see #6311)
        RuntimeUtils.runTask(monitor -> {
            row.getValues(),
            DBUtils.updateAttributeValue(complexValue, attr, rowIndexes, value);
                DBUtils.updateAttributeValue(ownerValue, attr, rowIndexes, value);
    }
        return DBUtils.findBinding(attributes, attribute);
            if (row.getVisualNumber() >= relative.getVisualNumber()) {
    public void resetOrdering(@NotNull Collection<? extends DBDAttributeBinding> bindings) {

                        result = (cell1.toString()).compareToIgnoreCase(cell2.toString());
                filterConstraint.setVisualPosition(constraint.getVisualPosition());
                new ResultSetRow(firstRowNum + i, rows.get(i)));
        if (containerReadOnlyStatus != null) {
        this.totalRowCount = totalRowCount;
            }
     * single source is null. If driver doesn't support meta information

            DBUtils.resetValue(getCellValue(attr, row, rowIndexes, false));
                }
                            ResultSetRow.ColorInfo colorInfo = row.colorInfo;
                row.release();

                return result;
        return hasData;
        if (metadataChanged) {
            return UIUtils.getSharedColor(color);
     */
import org.jkiss.dbeaver.utils.RuntimeUtils;
        this.singleSourceEntity = null;
                                double value = DBExecUtils.makeNumericValue(cellValue);
        int index = row.getVisualNumber();
        for (DBDAttributeBinding attribute : visibleAttributes) {
        this.visibleAttributes.sort(POSITION_SORTER);
    /**
                                    Color[] cellFgColors = colorInfo.cellFgColors;

        return curRows.size();
        } else {
            filterConstraint.setOrderDescending(constraint.isOrderDescending());


        return null;
        }
    }
                        } else {
    DBDAttributeBinding getAttributeBinding(@Nullable DBSEntity entity, @NotNull String attrName) {
        for (Iterator<DBDAttributeBinding> iter = result.iterator(); iter.hasNext(); ) {
                                        colorInfo.cellBgColors = cellBgColors;
    @NotNull
        }
                }
        for (DBDAttributeBinding binding : attributes) {
        if (reset) {
        if (filter.getConstraints().size() != attributes.length) {
        }
            hintContext.cacheRequiredData(monitor, null, newRows, cleanupOldCache);
            update = true;

        hasData = true;
                } else {

        try {
                                double minValue = DBExecUtils.makeNumericValue(acs.attributeValues[0]);

        }


                if (topAttr.getDataKind() == DBPDataKind.DOCUMENT) {
        return curRows.get(index);
     *
                                    } else if (acs.colorForeground != null || acs.colorForeground2 != null) {
        this.updateInProgress = updateService;
        row.values[rootIndex] = valueToEdit;

                    break;
        appendData(monitor, rows, true);
                    List<DBDAttributeBinding> nested = topAttr.getNestedBindings();
    }
        while (!parents.isEmpty()) {
        }
     * @return true if visible attributes were changed. Spreadsheet has to be refreshed
        for (int i = 0; i < rowCount; i++) {
            if (!ArrayUtils.isEmpty(this.attributes) && !ArrayUtils.isEmpty(newAttributes) && isDynamicMetadata() &&
                                if (background != null) {

    // Flag saying that edited values update is in progress
                    Comparator<Object> comparator = columnElement.getValueHandler().getComparator();
                    if (nested != null && !nested.isEmpty()) {
    public ResultSetRow getRow(int index) {
            // Save reference on top attribute
    public boolean isEmpty() {

        updateRowColors(resetOldRows, newRows);
    }
    }
                DBDAttributeBinding binding = DBUtils.findObject(attributes, co.getAttributeName());

                if (!DBExecUtils.equalAttributes(oldMeta, newMeta)) {

        DBSEntity entity = isSingleSource() ? getSingleSource() : null;
        public int compare(DBDAttributeBinding o1, DBDAttributeBinding o2) {
            }
        if (documentAttribute != null && newAttributes.length == 1 && newAttributes[0].getDataKind() == DBPDataKind.DOCUMENT &&
            } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    } else {
                    parents.offerFirst(nested.get(i));
                    }
        DBDAttributeBinding topAttribute;
        } catch (Exception e) {
            // Remove rows (in descending order to prevent concurrent modification errors)
            }
    private DBSDataContainer getDataContainer() {
    void refreshHintsInfo(@NotNull DBRProgressMonitor monitor, List<? extends DBDValueRow> newRows, boolean cleanupOldCache) {
        DBVEntity virtualEntity = DBVUtils.getVirtualEntity(dataContainer, false);
    public DBDAttributeBinding getAttributeBinding(@Nullable DBSAttributeBase attribute) {
        boolean isOldHistoricValueAbsent = !row.isChanged(attr);
                changesCount++;
        row.release();
        // Construct new bindings from constraints. Exclude nested bindings
        for (DBDAttributeBinding column : attributes) {
                        realAttr = attr;

    public List<DBDAttributeBinding> getVisibleAttributes(DBDAttributeBinding parent) {
        changesCount++;
                    if (!DBDAttributeConstraint.isVisibleByDefault(attr)) {
        } else if (this.attributes == null || this.attributes.length == 0 || this.attributes.length != newAttributes.length || isDynamicMetadata()) {
        private final DBCLogicalOperator operator;
        }
        boolean retrieveDeepestCollectionElement
                                    }
        } else if (valueToEdit instanceof DBDValue complexValue) {
            if (valueRenderer != valueHandler && valueRenderer instanceof DBDValueHandlerConfigurable vhc) {
import org.jkiss.dbeaver.ui.UIUtils;
        } else {
        int rowCount = rows.size();


        }
    void setTotalRowCount(Long totalRowCount) {
    }
        this.totalRowCount = null;
                        iter.remove();
                    documentAttribute = realAttr;
        final List<DBDAttributeBinding> nestedBindings = parent.getNestedBindings();
        public boolean evaluate(Object cellValue) {
                } else {

            curRows.clear();
    private DBDAttributeBinding[] attributes = new DBDAttributeBinding[0];
                                            acs.colorBackground.getRGB(),

                row.colorInfo = null;

                                            background = acs.colorBackground2;
            }
            constraint.setVisible(visible);
            row.setState(ResultSetRow.STATE_NORMAL);
    public static class AttributeColorSettings {
            if (!entityDataView || DBDAttributeConstraint.isVisibleByDefault(binding)) {
            if (CommonUtils.isEmpty(nested)) {
     * Removes row with specified index from data
            updateChanges = false;
                    continue;
    public Object getCellValue(
        updateColorMapping(false);

    @Override
        for (ResultSetRow row : curRows) {

            }
                filterConstraint.setReverseOperator(constraint.isReverseOperator());

                    visibleAttributes.remove(attribute);
                constraint.getVisualPosition() == constraint.getOriginalVisualPosition()))
            return identifier == null || !identifier.isValidIdentifier();
        // So let's do it in separate job to avoid UI locking
        } else {
            DBDDataFilter prevFilter = dataFilter;
            if (attribute.getParentObject() == null || attribute.getParentObject() == documentAttribute) {

        private final boolean singleColumn;
/*
            retrieveDeepestCollectionElement
                realAttr = attributes[0];

                }
                continue;

            } else {
            final DBDRowIdentifier identifier = this.getDefaultRowIdentifier();
        return changesCount != 0;
                constraint.getVisualPosition() != DBDAttributeConstraint.NULL_VISUAL_POSITION && constraint.getVisualPosition() != filterConstraint.getVisualPosition() &&
        } else if (row.isChanged(attr)) {
    @Override
    public Object getCellValue(@NotNull ResultSetCellLocation cellLocation) {
            return true;
                            break;
                    continue;
            if (attr != topAttribute && valueToEdit instanceof DBDValue ownerValue) {
            // It has to be only one attribute in list (excluding pseudo attributes).
            final List<DBDAttributeBinding> nested = getVisibleAttributes(attribute);

            return;
                    log.debug("Attribute '" + co.getAttributeName() + "' not found in bindings. Skip colors.");
        if (isUpdateInProgress()) {
                        result = -result;
    }
        // Check for changes
        if (reset) {
            }
                    }
        if (nestedBindings == null || nestedBindings.isEmpty()) {
            if (valueHandler instanceof DBDValueHandlerConfigurable vhc) {
        return executionSource == null ? null : executionSource.getDataContainer();


        private final Color colorForeground2;
            row.setState(ResultSetRow.STATE_REMOVED);
        return newRow;

            }
                    }
            }
        }
                    // No constraint for this attribute: use default visibility
 * Unless required by applicable law or agreed to in writing, software
            final DBDAttributeConstraint c1 = dataFilter.getConstraint(o1);
        // First sort in original order to reset multi-column orderings
        for (DBDAttributeConstraint constraint : filter.getConstraints()) {
    public DBDDataFilter createDataFilter() {
                result.add(attr);
            changesCount--;
        if (dataSourceContainer == null) {
        boolean updateChanges
        @Nullable int[] rowIndexes,

        Object valueToEdit = currentValue;
     * Sets new data filter
        // Sometimes model cleanup takes much time (e.g. freeing LOB values)
        this.dataFilter.setOrder(filter.getOrder());
                for (ResultSetRow row : rows) {
    }

        private static Color getColor(String color) {
        this.dataFilter = dataFilter;
        if (singleSourceEntity == null) {

    public Long getTotalRowCount() {
            {
     *
                                        colorInfo.cellFgColors = cellFgColors;
                        fillVisibleAttributes();
        DBDAttributeConstraint constraint = dataFilter.getConstraint(attribute);
        List<DBDAttributeBinding> newBindings = new ArrayList<>();

    }
                    if (!attr.isPseudoAttribute()) {
        this.singleSourceEntity = null;
        // 1. Update root attribute
            this.executionSource = sourceStatement.getStatementSource();
            }
        }
        @NotNull DBDAttributeBinding attr,
        if (ent1 == null || ent2 == null) {

                this.attributes[0].getTopParent().getMetaAttribute() != null && newAttributes[0].getTopParent().getMetaAttribute() != null &&
        }
                final DBDAttributeBinding attr = iter.next();
    public boolean isSingleSource() {
    boolean setDataFilter(DBDDataFilter dataFilter) {
            return false;
    public DBSEntity getSingleSource() {
            }
    }
                    final DBDAttributeBinding binding = getAttributeBinding(co.getAttribute());
                                    if (acs.colorBackground != null && acs.colorBackground2 != null && value >= minValue && value <= maxValue) {

        Object currentValue = row.values[rootIndex];
                    update = true;
import org.jkiss.dbeaver.model.DBPDataKind;
 * You may obtain a copy of the License at
    @Override
                                    cellFgColors[entry.getKey().getOrdinalPosition()] = foreground;
                // Constraint not found
    }
    public DBDAttributeBinding getVisibleAttribute(int index) {
     */
        // Cleanup in separate job.
            this.executionSource = null;
                                        foreground = UIUtils.getSharedColor(fgRowRGB1);
                                            background = acs.colorBackground;
    }
        List<ResultSetRow> newRows = new ArrayList<>(rowCount);
    private DBCTrace trace;
                }
                CommonUtils.equalObjects(ent1.getEntityName(), ent2.getEntityName());
                log.error(e);
            row.addChange(attr, topAttribute);
                                // Single column color
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

            singleSourceEntity = DBExecUtils.detectSingleSourceTable(
                        if (realAttr != null) {
    public void setData(@NotNull DBRProgressMonitor monitor, @NotNull List<Object[]> rows) {
        if (updateChanges && attr != topAttribute) {
        DBCEntityMetaData ent2 = attr2.getMetaAttribute().getEntityMetaData();
        return new DBDDataFilter(constraints);
            return false;
    void clearData() {
    }
    }
        return null;


            if (constraint != null && !constraint.isVisible()) {

            DBDValueHandler valueHandler = binding.getValueHandler();
    }
        String containerReadOnlyStatus = DBExecUtils.getResultSetReadOnlyStatus(dataSourceContainer);
    // Coloring
     * Returns real (non-virtual) attribute bindings
    public boolean isUpdateInProgress() {
            return false;
            }
        return false;
        int firstRowNum = curRows.size();
        }
        }
            } else {
     * @param newAttributes attributes metadata
                            }
                }
            // Mark row as deleted
        if (!missingConstraints.isEmpty()) {
        if (this.curRows.size() > index) {
        if (metadataChanged) {
        return curRows.get(index).values;

        return visibleAttributes;
        }
     * Returns single source of this result set. Usually it is a table.
        // Clear previous data
        for (DBDAttributeBinding binding : attributes) {
        }
        } else {

        changesCount = 0;
    }
        if (entity != null) {
        }

            } else {
     * @param value new value

            this.dataFilter = createDataFilter();
     */
            for (DBVColorOverride co : coList) {

    public DBDAttributeBinding[] getRealAttributes() {
                log.debug("Missing constraint for " + o1);
    @NotNull
    }
                metadataChanged = true;
        }
    private void shiftRows(@NotNull ResultSetRow relative, int delta) {

        DBDAttributeConstraint constraint = new DBDAttributeConstraint(binding, constraintsSize, constraintsSize);

        @NotNull DBDValueRow row,
                                if (foreground != null) {
                                        RGB bgRowRGB = ResultSetUtils.makeGradientValue(
    }
        if (rows != null && !rows.isEmpty()) {
        }
                                            foreground = acs.colorForeground2;
    public DBVEntity getVirtualEntity(boolean create) {

        );
        return getVirtualEntity(entity, create);
            DBPDataSourceContainer container = entity.getDataSource().getContainer();
            // Extract nested attributes from single top-level attribute
                            }
        List<DBDAttributeConstraint> missingConstraints = new ArrayList<>();

                    final int position = Math.min(constraint.getVisualPosition(), visibleAttributes.size());
        }
                                        } else if (value > maxValue) {

                            realAttr = null;
    }
        constraints.add(constraint);
        return singleSourceEntity;
    @NotNull

        refreshHintsInfo(monitor, newRows, resetOldRows);
     */
            this.dataFilter = createDataFilter();

    }
        }

    }
        DBSDataContainer dataContainer = getDataContainer();
        return getCellValue(attribute, row, null, false);
    }
     *
            }
        }
    @Override
                    } catch (DBCException e) {
                                foreground = acs.colorForeground;
            updateRowColors(true, curRows);

    }
                                final Object cellValue = getCellValue(cellLocation);
    }
import org.jkiss.utils.ArrayUtils;
        }
    ResultSetRow addNewRow(int rowNum, @NotNull Object[] data) {
    @NotNull
            this.attributeValues = co.getAttributeValues();
        }
                CommonUtils.equalObjects(ent1.getSchemaName(), ent2.getSchemaName()) &&


/**
    public DBDAttributeBinding[] getAttributes() {
    public DBVEntity getVirtualEntity(DBSEntity entity, boolean create) {
            if ((!forceUpdate &&

            }
                return attribute;

        } else {
                Object origValue = row.getChange(attr);


    public void updateColorMapping(boolean reset) {
                        if (foreground != null || background != null) {

     * @param resultSet     resultset
                                double maxValue = DBExecUtils.makeNumericValue(acs.attributeValues[1]);
            boolean isDocumentBased = false;
                            if (!acs.singleColumn) {
                    visibleAttributes.add(position, attribute);
    public Object getCellValue(@NotNull DBDAttributeBinding attribute, @NotNull DBDValueRow row) {
                }
        this.attributes = new DBDAttributeBinding[0];
    private DBCStatistics statistics;
     */
        this.clearData();

                cleanupRow(row);
        }
            }
        @NotNull DBDAttributeBinding attribute,


            }
            this.trace = ((DBCResultSetTrace) resultSet).getExecutionTrace();
                    for (AttributeColorSettings acs : entry.getValue()) {
    }
            if (this.attributes.length == 1) {
import org.jkiss.dbeaver.model.data.*;
                }
    }
        }
            }
                                        }*/

                attribute.getName().equals(attrName)) {
    private DBDAttributeBinding documentAttribute = null;
            // The same document source
    @NotNull
        if (!newBindings.isEmpty() && !newBindings.equals(visibleAttributes)) {
        if (store.getBoolean(ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING)) {
            return "No unique key defined";
                children.add(attribute);
            if (updateChanges && isOldHistoricValueAbsent) {
     *
    }
                                        // FIXME: coloring value before and after range. Maybe we need an option for this.
        colorMapping.clear();
            for (int i = 0; i < this.attributes.length; i++) {
    public DBDAttributeBinding getDocumentAttribute() {

 *

            DBDAttributeBinding realAttr = null;
    }
                log.debug("Missing constraint for " + o2);
            isSameSource(this.documentAttribute, newAttributes[0]))
        }
            }
                return null;
        return false;
    private static final Log log = Log.getLog(ResultSetModel.class);
    }
        return curRows;

                                            maxValue,
                vhc.refreshValueHandlerConfiguration(binding);
                        result = comparator.compare(cell1, cell2);

    void updateDataFilter(DBDDataFilter filter, boolean forceUpdate) {
    public DBDRowIdentifier getDefaultRowIdentifier() {
                }
            this.shiftRows(row, -1);
            topAttribute = attr;
    boolean isDynamicMetadata() {
            return false;
                    log.debug("Cannot copy complex value. Undo is not possible!");
        }
            for (Iterator<DBDAttributeBinding> iter = visibleAttributes.iterator(); iter.hasNext(); ) {
                }
        {
            }
    }
        } else {
    private DBSEntity singleSourceEntity;
        }

import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
                hintContext.initProviders(attributes);

                row.addChange(topAttribute, currentValue);
        updateDataFilter();
            }
        shiftRows(newRow, 1);
            row.clearChange(attr);
                    }
        curRows.sort(Comparator.comparingInt(ResultSetRow::getRowNumber));
            addConstraints(constraints, binding);
                                background = acs.colorBackground;
            hintContext.resetCache();
import org.jkiss.code.NotNull;
    public String getReadOnlyStatus(@Nullable DBPDataSourceContainer dataSourceContainer) {
        }
    }
        curRows.addAll(newRows);
                            visibleAttributes.add(attribute);
            return null;
                }
        }

        return result.toArray(new DBDAttributeBinding[0]);
                    }
            if (CommonUtils.isEmpty(color)) {
            if (constraint.getVisualPosition() != DBDAttributeConstraint.NULL_VISUAL_POSITION) {
            DBDAttributeConstraint filterConstraint = this.dataFilter.getConstraint(constraint.getAttribute(), true);
            List<ResultSetRow> rowsToRemove = new ArrayList<>(rows);

        processColorOverrides(virtualEntity);

        return visibleAttributes.size();

        return hintContext;
                    }
     * for queries then is will null.
            // Sort locally
import org.jkiss.dbeaver.model.struct.*;
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
                        log.error("Error copying cell value", e);
        constraint.setVisible(visibleAttributes.contains(binding) || binding.getParentObject() != null);
                                if (value >= minValue && value <= maxValue) {
                        }
            if (c1 == null) {
            for (ResultSetRow row : rowsToRemove) {
    }
        @NotNull ResultSetRow row,
    private transient boolean metadataChanged;
        this.statistics = statistics;
                    rowIndexes = null;
            this.dataFilter.addConstraints(missingConstraints);
        newRow.setState(ResultSetRow.STATE_ADDED);
            if (rowIdentifier != null) {
        if (sourceStatement != null) {
        } else {
            this.curRows.remove(index);
                    isDocumentBased = true;
            rootIndex = topAttribute.getOrdinalPosition();
    @Nullable
                                    cellBgColors[entry.getKey().getOrdinalPosition()] = background;
    @Nullable
                    if (comparator != null) {

        Collections.addAll(this.visibleAttributes, this.attributes);
            CommonUtils.equalObjects(ent1.getCatalogName(), ent2.getCatalogName()) &&

            }
                                    }
        return attributes;
    public int getRowCount() {
        //
        }

                                        /* else if (value < minValue) {
            return operator.evaluate(cellValue, attributeValues);
    }
     * @return true on success
     * or false if it just marked as deleted
            visibleAttributes = newBindings;
            if (constraint.getOperator() != null) {
    private volatile DataSourceJob updateInProgress = null;
public class ResultSetModel implements DBDResultSetModel {
                updateCellValue(
    ) throws DBException {
    @NotNull
    void cleanupRow(@NotNull ResultSetRow row) {
            }
            log.debug("Error removing row from list: invalid row index: " + index);
            if (updateChanges && isOldHistoricValueAbsent) {
                }
    }
 *
     * @param row row
                            }
                // Make visible "real" attributes
            if (row.getState() != ResultSetRow.STATE_NORMAL) {
    }
        }
    }
        }
                                        RGB fgRowRGB1 = ResultSetUtils.makeGradientValue(acs.colorForeground.getRGB(), acs.colorForeground2.getRGB(), minValue, maxValue, value);
            if (attributes.length == 1 && attributes[0].getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES)) {
    @Nullable
    /**
                                }
    private List<DBDAttributeBinding> visibleAttributes = new ArrayList<>();
                                colorInfo.rowForeground = foreground;
        }
    @Nullable
                DBSEntityAttribute entityAttribute = attributes[0].getEntityAttribute();
        this.documentAttribute = null;
    }
        if (constraint != null && constraint.isVisible() != visible) {
            final DBDAttributeConstraint c2 = dataFilter.getConstraint(o2);
    }
    @Nullable
        }
        return DBUtils.getAttributeValue(
    public boolean isUniqueKeyUndefinedButRequired(@NotNull DBPDataSourceContainer dataSourceContainer) {
    }

        this.metadataDynamic =
                                    Color[] cellBgColors = colorInfo.cellBgColors;
     * Sets new metadata of result set
            return DBVUtils.getVirtualEntity(dataContainer, create);
        this.releaseAllData();
    }
    boolean deleteRow(@NotNull ResultSetRow row) {
        return documentAttribute;
                metadataChanged = false;
                        }


        int constraintsSize = constraints.size();
                if (currentValue instanceof DBDValueCloneable vc) {
    public void refreshChangeCount() {
            updateColorMapping(true);
        }
                valueToEdit = value;
        @Override
    }
    }
     * If result set is a result of joins or contains synthetic attributes then
    }

        if (depth == 0) {
        }
    }
            }
        private final Color colorForeground;
        curRows.add(rowNum, newRow);
                // Otherwise this means that column was reordered visually and we must respect this change
            if (cAttr instanceof DBDAttributeBinding) {
            }
        for (DBDAttributeBinding binding : this.attributes) {
        if (update) {
    private void addConstraints(List<DBDAttributeConstraint> constraints, DBDAttributeBinding binding) {
            this.colorBackground = getColor(co.getColorBackground());
        this.updateMetaData(newAttributes);
                                            acs.colorBackground2.getRGB(),
    public DBDDataFilter getDataFilter() {
                // There can be multiple attributes with the same name in rs (in some databases)

    void resetMetaData() {
    @NotNull
     * @return true if row was physically removed (only in case if this row was previously added)
import org.jkiss.dbeaver.model.DBUtils;
    public List<DBDAttributeBinding> getVisibleLeafAttributes() {
        }
            rowsToRemove.sort(Comparator.comparingInt(ResultSetRow::getVisualNumber));
    }

            }
        return updateInProgress != null;
    private final Map<DBDAttributeBinding, List<AttributeColorSettings>> colorMapping = new TreeMap<>(POSITION_SORTER);

                    try {
            // Detect document attribute
                for (int i = nested.size() - 1; i >= 0; i--) {
                } else {
        this.visibleAttributes.sort(POSITION_SORTER);
                int result = 0;
        AttributeColorSettings(DBVColorOverride co) {
                            final Object cellValue = getCellValue(cellLocation);
            }
        private final Color colorBackground;
            }
        }
        return attributes[index];
            // New value if also a complex value. Probably DBDContent
        processColorOverrides(virtualEntity);
        ) {
            // It is complex
                if (dataContainer instanceof DBSEntity) {
                for (DBDAttributeBinding attr : attributes) {
        final List<DBDAttributeBinding> children = new ArrayList<>();
            log.debug("Error caching data for column hints", e);
    /**
    }
            }
                    // Filtered out by column filter
                this.attributes[0].getTopParent().getMetaAttribute().getSource() == newAttributes[0].getTopParent().getMetaAttribute().getSource())
                if (binding != null) {
    private void processColorOverrides(@NotNull DBVEntity virtualEntity) {
            for (DBDAttributeBinding nested : nestedBindings) {
        for (DBDAttributeBinding binding : attributes) {
        updateDataFilter();
                }
                DBSDataContainer dataContainer = getDataContainer();
        return null;
        this.attributes = newAttributes;
    }
                if (visible) {
            return;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
    }
        }
            this.colorBackground2 = getColor(co.getColorBackground2());
                                            foreground = acs.colorForeground;
                            }
                this.visibleAttributes.add(binding);
    boolean cleanupRows(Collection<ResultSetRow> rows) {
    public List<ResultSetRow> getAllRows() {


        DBCStatement sourceStatement = resultSet.getSourceStatement();
        }
                        break;
                    if (co.isOrderDescending()) {

        return metadataChanged;

            final DBDAttributeBinding attribute = parents.removeFirst();

                DBCAttributeMetaData newMeta = newAttributes[i].getMetaAttribute();
        if (resetOldRows) {
    private List<ResultSetRow> curRows = new ArrayList<>();
 * you may not use this file except in compliance with the License.
        return getRowCount() <= 0 || visibleAttributes.size() <= 0;
        return updateInProgress;
            resetOrdering(binding);
    /**
        return null;
            }
            if (filterConstraint == null) {
                }
        refreshChangeCount();
}
                newBindings.add(binding);
    private void updateRowColors(boolean reset, List<ResultSetRow> rows) {
    private final Comparator<DBDAttributeBinding> POSITION_SORTER = new Comparator<>() {
                    singleSourceEntity = (DBSEntity) dataContainer;
                // If ordinal position doesn't match then probably it is a wrong attribute.
        this.metadataChanged = update;
        }
                row.setRowNumber(row.getRowNumber() + delta);
            return false;
            cleanupRow(row);
            {
        updateColorMapping(true);
                filterConstraint.setCriteria(constraint.getCriteria());

            return containerReadOnlyStatus;
