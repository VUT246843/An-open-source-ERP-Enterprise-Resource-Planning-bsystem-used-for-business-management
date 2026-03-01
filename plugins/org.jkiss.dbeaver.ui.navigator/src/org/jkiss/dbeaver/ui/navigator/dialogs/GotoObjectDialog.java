        }

                }
                if (objectType != null) {
import org.jkiss.dbeaver.model.DBUtils;
        @Override
            cb.setSelection(enabled);
            cb.addSelectionListener(new SelectionAdapter() {
        return Status.OK_STATUS;
    @Override
                        nameMask

        public List<DBSObjectReference> getResult() {
    @Override
    }
        this.context = context;
    }
/*
    protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter, IProgressMonitor progressMonitor)
                if (!Boolean.TRUE.equals(enabledTypes.get(type.getTypeName()))) {
            for (DBSObjectType type : structureAssistant.getSearchObjectTypes()) {
        @Override
                super.equalsFilter(filter) &&
        ObjectFilter() {
        cbGroup.setText("Objects:");
                }

    }
    private boolean isValidObjectType(DBSObjectType objectType) {
    }
 *
                    str.append(fullName, StyledString.QUALIFIER_STYLER);
                DBSStructureAssistant.ObjectsSearchParams params = new DBSStructureAssistant.ObjectsSearchParams(
    }
                return str;
            Class<? extends DBSObject> typeClass = type.getTypeClass();
        public void run(DBRProgressMonitor param) throws InvocationTargetException, InterruptedException {
                // Check for filters
import org.eclipse.swt.layout.GridData;
            }
        setListLabelProvider(new ObjectLabelProvider());
            DBExecUtils.tryExecuteRecover(monitor, context.getDataSource(), objectFinder);
        return null;
import org.eclipse.jface.viewers.LabelProvider;
    private static final int MAX_RESULT_COUNT = 1000;
        List<DBSObjectType> typesToSearch = new ArrayList<>();
import org.jkiss.dbeaver.model.DBPNamedObject;
    protected IDialogSettings getDialogBoundsSettings() {
                    return DBeaverIcons.getImage(objectType.getImage());
        DBSStructureAssistant<?> structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, context.getDataSource());
            }
                DBSObjectType objectType = ((DBSObjectReference) element).getObjectType();

 *     http://www.apache.org/licenses/LICENSE-2.0
 *

        @Override
import org.eclipse.swt.layout.RowLayout;
            }
                }

                return DBUtils.getObjectFullName((DBPNamedObject) o1, DBPEvaluationContext.UI).compareToIgnoreCase(
    private final Map<String, Boolean> enabledTypes = new HashMap<>();
        private final DBRProgressMonitor monitor;
    }
        if (DBSEntityElement.class.isAssignableFrom(typeClass)) {
    }
        for (DBSObjectType type : typesToSearch) {
                    DBUtils.getObjectFullName((DBPNamedObject) o2, DBPEvaluationContext.UI));
        for (DBSObjectType type : structureAssistant.getSearchObjectTypes()) {
import org.eclipse.ui.dialogs.SearchPattern;
    protected Comparator getItemsComparator() {
        }
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
        setTitle(NLS.bind(UINavigatorMessages.dialog_project_goto_object_title, context.getDataSource().getContainer().getName()));
        if (!SHOW_OBJECT_TYPES) {

    private final DBCExecutionContext context;

        cbGroup.setLayout(rowLayout);
        }
            return super.getText(element);
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.model.struct.*;

                }
            this.executionContext = executionContext;
            return null;
 * DBeaver - Universal Database Manager
            }


            }
            } catch (Exception e) {
        throws CoreException {
                namePattern = Pattern.compile(
    }

import org.eclipse.jface.dialogs.IDialogSettings;
                params.setGlobalSearch(true);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.ui.UIUtils;
            this.monitor = monitor;
        super(shell, true);
        @Override

            String typeName = CommonUtils.notEmpty(type.getTypeName());
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                if (filter == null || !filter.isEnabled() || filter.matches(ref.getName())) {
        if (CommonUtils.isEmpty(typesToSearch)) {
        private Pattern getNamePattern() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public boolean matchItem(Object item) {
                hasMoreResults = result.size() >= MAX_RESULT_COUNT;
        ObjectFinder(DBSStructureAssistant structureAssistant, DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBSObjectType> typesToSearch, String nameMask) {
        Class<? extends DBSObject> typeClass = objectType.getTypeClass();
        @Override
        @Override
                    SQLUtils.makeLikePattern(getNameMask()), Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    public String getElementName(Object item) {
                continue;
                return ((DBPNamedObject) element).getName();
        public boolean isSubFilter(ItemsFilter filter) {
        }
        }
        @Override

        }
            } else {
            if (namePattern == null) {
            return DBUtils.getObjectFullName((DBPNamedObject) item, DBPEvaluationContext.UI);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
            return namePattern;
import org.eclipse.osgi.util.NLS;
        cbGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            return false;
            });
            if (driverSettings.get(typeName) != null) {
    private static final String DIALOG_ID = "GotoObjectDialog";
    @Override
        setDetailsLabelProvider(new DetailsLabelProvider());
        if (item instanceof DBPNamedObject) {
    }
import org.eclipse.core.runtime.Status;
}
            boolean enabled;
        return new ObjectFilter();
                    str.append(" - ", StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

        return cbGroup;
            return SearchPattern.RULE_PATTERN_MATCH | SearchPattern.RULE_PREFIX_MATCH;
import java.lang.reflect.InvocationTargetException;
        }
                    enabledTypes.put(typeName, cb.getSelection());
import org.eclipse.jface.viewers.StyledString;
                );
        } finally {
 * See the License for the specific language governing permissions and
                enabled = true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        private Pattern namePattern = null;

        }
        }

            monitor.done();
 * You may obtain a copy of the License at
        Group cbGroup = new Group(parent, SWT.NONE);

        private final String nameMask;
                nameMask += "%";
            return 0;
                return false;

            }

    private final DBSObject container;
            ObjectFinder objectFinder = new ObjectFinder(structureAssistant, monitor, context, typesToSearch, nameMask);

                String fullName = DBUtils.getObjectFullName(namedObject, DBPEvaluationContext.UI);
        public Image getImage(Object element) {
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.core.runtime.IStatus;
        DBRProgressMonitor monitor = RuntimeUtils.makeMonitor(progressMonitor);
            cb.setText(typeName);
        public StyledString getStyledText(Object element) {
        @Override
                if (!getNamePattern().matcher(objectName).matches()) {
                throw new InvocationTargetException(e);
                return DBUtils.getObjectFullName((DBPNamedObject) element, DBPEvaluationContext.UI);
    protected IStatus validateItem(Object item) {
        public String getNameMask() {
 * you may not use this file except in compliance with the License.
            if (element instanceof DBPNamedObject) {
import org.eclipse.swt.widgets.*;
        return UIUtils.getDialogSettings(DIALOG_ID);
import org.eclipse.swt.events.SelectionEvent;
            cb.setData(type);
            String nameMask = getPattern();
            return !hasMoreResults && super.isSubFilter(filter) && CommonUtils.equalObjects(enabledTypesCopy, ((ObjectFilter)filter).enabledTypesCopy);
        }
                typesToSearch.add(type);

        }
    }

        } catch (DBException e) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
            }
            this.structureAssistant = structureAssistant;
    }
        IDialogSettings driverSettings = DialogSettings.getOrCreateSection(
        }

        private List<DBSObjectReference> result;
    protected Control createExtendedContentArea(Composite parent) {
    @Override
        if (structureAssistant == null) {

        rowLayout.wrap = true;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            DBPDataSourceContainer dsContainer = context.getDataSource().getContainer();
                filter instanceof ObjectFilter &&
        public String getText(Object element) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return result;
import org.eclipse.jface.dialogs.DialogSettings;
            return nameMask;
            }
import org.eclipse.core.runtime.IProgressMonitor;
        public int getMatchRule() {
            this.nameMask = nameMask;
    private static class DetailsLabelProvider extends ObjectLabelProvider {
            return null;
        private final DBSStructureAssistant structureAssistant;
            for (DBSObjectReference ref : objectFinder.getResult()) {
        if (structureAssistant == null) {
 * limitations under the License.
 *
        DBSStructureAssistant structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, context.getDataSource());
        private Map<String, Boolean> enabledTypesCopy;
                    contentProvider.add(ref, itemsFilter);
            } else {
        return (o1, o2) -> {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
            try {
            return new StyledString("?");
                // Skipp attributes (columns), methods, etc
        String nameMask = ((ObjectFilter) itemsFilter).getNameMask();
        return true;
    @Override
            List<DBSObjectType> typesToSearch = new ArrayList<>();
        this.container = container;
import java.util.regex.Pattern;
/**

                CommonUtils.equalObjects(enabledTypesCopy, ((ObjectFilter)filter).enabledTypesCopy);
            return null;
                params.setParentObject(container);
                enabled = driverSettings.getBoolean(typeName);
                    // Skip attributes (columns), methods, etc
                params.setMaxResults(MAX_RESULT_COUNT);
        }
            if (DBSEntityElement.class.isAssignableFrom(typeClass)) {
            }
        public boolean isConsistentItem(Object item) {
        }
import org.jkiss.dbeaver.DBException;
                DBSObjectFilter filter = dsContainer.getObjectFilter(ref.getObjectClass(), ref.getContainer(), true);
                //return TextUtils.fuzzyScore(objectName, pattern) > 0;

                        typesToSearch.toArray(new DBSObjectType[0]),
                //String pattern = getPattern().replaceAll("[\\*\\%\\?]", "");
                }
                    applyFilter();
            return

        }
                DBPNamedObject namedObject = (DBPNamedObject) element;
            }
            if (element instanceof DBSObjectReference) {
            if (item instanceof DBPNamedObject) {

            enabledTypes.put(typeName, enabled);
    @Override
                    return false;
                }
import org.eclipse.swt.SWT;

        }
        };
public class GotoObjectDialog extends FilteredItemsSelectionDialog {
                StyledString str = new StyledString(namedObject.getName());
            nameMask = nameMask.replace("*", "%").replace("?", "_");
                continue;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
        public String getText(Object element) {
    private static class ObjectLabelProvider extends LabelProvider implements DelegatingStyledCellLabelProvider.IStyledLabelProvider {

import java.util.List;
import java.util.*;
        }
            if (element instanceof DBPNamedObject) {
            }
    protected ItemsFilter createFilter() {
            return null;
                return true;
import org.eclipse.swt.graphics.Image;
        }
    public GotoObjectDialog(Shell shell, DBCExecutionContext context, DBSObject container) {
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
                if (!CommonUtils.equalObjects(fullName, namedObject.getName())) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    continue;
        private final List<DBSObjectType> typesToSearch;
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
            return false;
        @Override

            int matchRule = getMatchRule();


                @Override
        public boolean equalsFilter(ItemsFilter filter) {

        private final DBCExecutionContext executionContext;
                result = structureAssistant.findObjectsByMask(monitor, executionContext, params);
                public void widgetSelected(SelectionEvent e) {
 */
        return item.toString();
            this.enabledTypesCopy = new HashMap<>(enabledTypes);
import org.jkiss.utils.CommonUtils;

                if (!isValidObjectType(type)) {
package org.jkiss.dbeaver.ui.navigator.dialogs;
        }
            }
        @Override
 * GotoObjectDialog
 */
            return null;
import org.jkiss.dbeaver.model.sql.SQLUtils;
    private static final boolean SHOW_OBJECT_TYPES = true;
    private class ObjectFinder implements DBRRunnableParametrized<DBRProgressMonitor> {
            }
            this.typesToSearch = typesToSearch;
                }
        RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
            typesToSearch.add(type);
        try {
            if (!isValidObjectType(type)) {
    }
    private boolean hasMoreResults;
 * distributed under the License is distributed on an "AS IS" BASIS,
                String objectName = ((DBPNamedObject) item).getName();
        }
        }
            monitor.beginTask("Search for '" + nameMask + "'", 100);

    @Override
        }
        }
            if (element instanceof DBPNamedObject) {
    protected IDialogSettings getDialogSettings() {
import org.eclipse.core.runtime.CoreException;
                    continue;
            if (o1 instanceof DBPNamedObject && o2 instanceof DBPNamedObject) {

            if ((matchRule & SearchPattern.RULE_PREFIX_MATCH) != 0 && !nameMask.endsWith("%")) {


            return;
            }
 * Unless required by applicable law or agreed to in writing, software
            Button cb = new Button(cbGroup, SWT.CHECK);
                    driverSettings.put(typeName, cb.getSelection());
    }
            getDialogSettings(), context.getDataSource().getContainer().getDriver().getId());
    private class ObjectFilter extends ItemsFilter {

