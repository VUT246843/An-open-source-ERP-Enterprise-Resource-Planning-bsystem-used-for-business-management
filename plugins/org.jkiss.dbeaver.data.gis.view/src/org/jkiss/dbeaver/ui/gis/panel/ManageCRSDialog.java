                for (Integer code : crsCodes) {
                    monitor.subTask(GISMessages.panel_manage_crs_dialog_monitor_sub_task_load_crs + " " + crsID);
                CRSInfo crsInfo = (CRSInfo) element;
                } else {
        super(shell, GISMessages.panel_manage_crs_dialog_title_select_system, null);
            }

                switch (cell.getColumnIndex()) {
                } else if (parentElement instanceof String) {
            return null;
        crsTree.setLayoutData(new GridData(GridData.FILL_BOTH));
                if (parentElement == crsLoader) {
import java.util.List;
        UIUtils.createTreeColumn(crsTree, SWT.LEFT, GISMessages.panel_manage_crs_dialog_tree_column_text_srid);
            regName = regName.toUpperCase(Locale.ENGLISH);
                return ((CRSInfo) element).name;
                    String crsID = regName + ":" + code;
            @Override
                Object selElement = ((IStructuredSelection) selection).getFirstElement();
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
        }
                if (cell.getColumnIndex() == 0) {
            }
 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and
        public void update(ViewerCell cell) {
            for (CRSInfo crsInfo : crsLoader.crsMap.get(regName)) {
/*
                    monitor.worked(1);
        @Override
                        wordMatches(((CRSInfo) element).projectionName);
                        cell.setText(crsInfo.projectionName);
            } else if (element instanceof CRSInfo) {
                    return crsTree;
                return getChildren(inputElement);
            protected boolean isLeafMatch(Viewer viewer, Object element) {
}import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
                }
        }
        @Override
    @Override
                log.error("Error loading CRS list", e.getTargetException());
            CRSFactory crsFactory = GisTransformUtils.getCRSFactory();
                        cell.setText(crsInfo.coordSystemName);
            @Override
            regItem.setText(0, regName);
            String regName = GisConstants.GIS_REG_EPSG;
                        List<CRSInfo> crsInfoList = crsMap.computeIfAbsent(regName, s -> new ArrayList<>());
 * You may obtain a copy of the License at
                    case 3: {
        treeViewer.setContentProvider(new ITreeContentProvider() {
                        break;

                UIUtils.runInProgressDialog(crsLoader);
            crsLoader = new CRSLoader();
            @Override
        @Override
                    return crsInfos == null ? null : crsInfos.toArray(new Object[0]);

        String name;
    protected IDialogSettings getDialogBoundsSettings() {
            regItem.setExpanded(true);
        selectedSRID = defCRS;
        @Override
 * limitations under the License.
        UIUtils.createTreeColumn(crsTree, SWT.LEFT, GISMessages.panel_manage_crs_dialog_tree_column_text_coordinate_system);
    protected Composite createDialogArea(Composite parent) {
    private void updateButtons() {
                    return wordMatches(((CRSInfo) element).name) ||
    private int selectedSRID;
        };
import org.eclipse.jface.dialogs.IDialogConstants;
            }
/*
    }
                    return crsLoader.crsMap.keySet().toArray(new Object[0]);
                    selectedSRID = ((CRSInfo) selElement).code;
        String projectionName;
                } else {
                        wordMatches(String.valueOf(((CRSInfo) element).code)) ||
    private class CRSLoader implements DBRRunnableWithProgress {
import java.lang.reflect.InvocationTargetException;
    }
    }
                        crsInfo.code = code;
                crsItem.setText(1, String.valueOf(crsInfo.code));
    }
            }
        treeViewer.addSelectionChangedListener(event -> {
            }

            {
                    }
/**

import org.eclipse.jface.dialogs.IDialogSettings;
 *
import org.eclipse.swt.SWT;
        PatternFilter patternFilter = new PatternFilter() {
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
            TreeItem regItem = new TreeItem(crsTree, SWT.NONE);
                    }
                    case 1: {
            if (selection instanceof IStructuredSelection) {
                monitor.done();
import org.eclipse.swt.widgets.Control;
        public String getText(Object element) {
            }
                    return false;
                    try {
                    } catch (Exception e) {
        Composite dialogArea = super.createDialogArea(parent);
            return "";
                    if (monitor.isCanceled()) {

import org.eclipse.jface.viewers.*;
        UIUtils.packColumns(crsTree, true, null);
                crsItem.setText(2, crsInfo.coordSystemName);

        }

import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
import org.cts.CRSFactory;
                return element.toString();
                        log.debug("Error loading CRS " + code + ": " + e.getMessage());
        return dialogArea;
    private static final String DIALOG_ID = "DBeaver.ManageCRSDialog";//$NON-NLS-1$
 * Database select dialog
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        });
                        CoordinateReferenceSystem crs = crsFactory.getCRS(crsID);
                if (selElement instanceof CRSInfo) {
                crsItem.setData(crsInfo);
                return super.isLeafMatch(viewer, element);
            }
        UIUtils.createTreeColumn(crsTree, SWT.LEFT, GISMessages.panel_manage_crs_dialog_tree_column_text_projection);
import org.jkiss.dbeaver.ui.internal.UIActivator;

                    }
                    List<CRSInfo> crsInfos = crsLoader.crsMap.get(element);
            ISelection selection = event.getSelection();
            public Object[] getElements(Object inputElement) {
            try {
        String coordSystemName;
                List<Integer> crsCodes = GisTransformUtils.getSortedEPSGCodes();
        return contents;
                if (element instanceof String) {
                if (element == crsLoader) {
package org.jkiss.dbeaver.ui.gis.panel;
                if (element instanceof CRSInfo) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
                        cell.setText(String.valueOf(crsInfo.code));
    public int getSelectedSRID() {
        getButton(IDialogConstants.OK_ID).setEnabled(selectedSRID != 0);
    private static class CRSLabelProvider extends CellLabelProvider implements ILabelProvider {

        }
    private static final Log log = Log.getLog(ManageCRSDialog.class);


    @Override
            }
import org.eclipse.swt.graphics.Image;

    }
        private Map<String, List<CRSInfo>> crsMap = new LinkedHashMap<>();


            public Object getParent(Object element) {
        Control contents = super.createContents(parent);
        return selectedSRID;
            }
                } else if (element instanceof String) {
import org.jkiss.dbeaver.ui.UIUtils;
        Tree crsTree = treeViewer.getTree();

                } else {
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

            Object element = cell.getElement();
            @Override
                    List<CRSInfo> crsInfos = crsLoader.crsMap.get(parentElement);
                monitor.beginTask(GISMessages.panel_manage_crs_dialog_monitor_begin_task_load_crs, crsCodes.size());
                        CRSInfo crsInfo = new CRSInfo();
                }


import java.util.LinkedHashMap;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        break;

import org.jkiss.dbeaver.model.gis.GisTransformUtils;
        crsTree.setHeaderVisible(true);
import org.jkiss.dbeaver.Log;
        public Image getImage(Object element) {
        treeViewer.expandAll();
 *
                    case 2: {
        int code;
                }
        public void run(DBRProgressMonitor monitor) {
        for (String regName : crsLoader.crsMap.keySet()) {

                    cell.setText(element.toString());
                        crsInfoList.add(crsInfo);
    }
            } catch (InvocationTargetException e) {
        updateButtons();
                crsItem.setText(3, crsInfo.projectionName);
                    }
            public Object[] getChildren(Object parentElement) {
        }
                crsItem.setText(0, crsInfo.name);


                }
                }
                }
            }
                    //List<CRSInfo> crsInfo = crsLoader.crsMap.get(selElement);
 */
public class ManageCRSDialog extends BaseDialog {
                        crsInfo.name = crs.getName();

            }
    @Override
    protected Control createContents(Composite parent) {
        });
    private static CRSLoader crsLoader;
            public void dispose() {
                    return null;
*/
                    }
                    return crsInfos != null && !crsInfos.isEmpty();

            //String[] allRegistries = crsFactory.getRegistryManager().getRegistryNames();
                    return !crsLoader.crsMap.isEmpty();


        TreeViewer treeViewer = DialogUtils.createFilteredTree(dialogArea, SWT.BORDER | SWT.FULL_SELECTION, patternFilter, null);

        if (crsLoader == null) {
            @Override
                        crsInfo.coordSystemName = crs.getCoordinateSystem().toString();
        }
import org.eclipse.ui.dialogs.PatternFilter;
 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
            if (element instanceof String) {
    public ManageCRSDialog(Shell shell, int defCRS) {
                }
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            @Override
 */
                TreeItem crsItem = new TreeItem(regItem, SWT.NONE);
            public boolean hasChildren(Object element) {

                        wordMatches(((CRSInfo) element).coordSystemName) ||
import org.eclipse.swt.widgets.Tree;
                        break;
import org.eclipse.swt.layout.GridData;
import org.cts.crs.CoordinateReferenceSystem;

            @Override
        treeViewer.setInput(crsLoader);
import org.jkiss.dbeaver.model.gis.GisConstants;
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
            if (element instanceof String) {
                        cell.setText(crsInfo.name);
        return UIUtils.getSettingsSection(UIActivator.getDefault().getDialogSettings(), DIALOG_ID);


                }
    private static class CRSInfo {

                        crsInfo.projectionName = crs.getProjection() == null ? "" : crs.getProjection().getName();
                    return new Object[0];
import java.util.Map;
        UIUtils.createTreeColumn(crsTree, SWT.LEFT, GISMessages.panel_manage_crs_dialog_tree_column_text_name);
                        break;
                        break;

                    case 0: {
 *
            } else {
            }
        treeViewer.setLabelProvider(new CRSLabelProvider());
import org.eclipse.swt.widgets.Shell;
