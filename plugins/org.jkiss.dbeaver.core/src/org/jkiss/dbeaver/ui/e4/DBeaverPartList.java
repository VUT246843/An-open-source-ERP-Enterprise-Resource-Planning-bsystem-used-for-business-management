        @NotNull EPartService partService,
    }
    }
            italicFont.dispose();
        public boolean select(Viewer viewer, Object parentElement, Object element) {
            }
public class DBeaverPartList extends BasicPartList {

        final TableViewer viewer = new TableViewer(table);
        }
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.swt.widgets.Table;
            if (isShowing(element)) {
        public Font getFont(Object element) {
    }
 * you may not use this file except in compliance with the License.
        public Font getMatchFont(@NotNull Object element) {

        @Override
import org.eclipse.swt.widgets.Shell;
            return null;
                return italicBoldFont;
        @NotNull

    }
        ColumnViewerToolTipSupport.enableFor(viewer);
            final String name = provider.getText(element);
import org.jkiss.dbeaver.Log;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull
            } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.e4.ui.model.application.ui.MUILabel;
        super(parent, shellStyle, treeStyler, partService, input, renderer, mru);

            return renderer.getToolTip((MUILabel) element);
import org.eclipse.e4.ui.workbench.renderers.swt.StackRenderer;

        @Override
        try {
            method.setAccessible(true);
        private final Font italicBoldFont;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
            }
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
    }
import org.jkiss.dbeaver.ui.SearchCellLabelProvider;
        if (matcher == null) {
        }
        boolean mru
            if (isShowing(element)) {
                return "*" + ((MUILabel) element).getLocalizedLabel();

        public Image getImage(@NotNull Object element) {
        this.renderer = renderer;

            return DBeaverPartList.this.getPattern();
        @Nullable
 * You may obtain a copy of the License at
            log.error("Error retrieving part list matcher", e);
import org.eclipse.e4.ui.internal.workbench.renderers.swt.BasicPartList;

import org.eclipse.e4.ui.workbench.swt.internal.copy.SearchPattern;
import java.lang.reflect.Method;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
        private final Font italicFont;
            this.italicFont = UIUtils.modifyFont(Display.getDefault().getSystemFont(), SWT.ITALIC);
    private SearchPattern getMatcher() {
import org.eclipse.swt.graphics.Image;
        public void dispose() {
                return ((MUILabel) element).getLocalizedLabel();
import org.eclipse.swt.layout.GridData;
    public DBeaverPartList(
        }
        }
        }
        }
        final Table table = new Table(parent, SWT.SINGLE | style & ~SWT.MULTI);
            }
            } else {
        } catch (Throwable e) {

        return viewer;
    @Nullable
            if (element instanceof MDirtyable && ((MDirtyable) element).isDirty()) {

        private boolean isShowing(@NotNull Object element) {
        }
        public String getPattern() {
        }
        }
    private static final Log log = Log.getLog(DBeaverPartList.class);
                return italicFont;
            if (pattern == null) {
        @NotNull
            } else {
        @Override
        int treeStyler,


        public CellLabelProvider() {
import org.jkiss.code.Nullable;
import org.eclipse.swt.graphics.Font;
        int shellStyle,
        // A newer version of Eclipse introduced a change so the pattern is regex-like now.

import org.jkiss.code.NotNull;
    private class CellLabelProvider extends SearchCellLabelProvider {
        @NotNull StackRenderer renderer,
        public String getToolTipText(Object element) {
            super.dispose();
        return matcher.getPattern().replaceAll("^\\*|\\*$", "");
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
 *
        @NotNull MElementContainer<?> input,
import org.jkiss.dbeaver.ui.UIUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
        // Judging by the code, it just adds leading and trailing asterisks, so remove them.
    private final StackRenderer renderer;
        public String getText(@NotNull Object element) {
    ) {

                return boldFont;
            }
        viewer.setLabelProvider(new CellLabelProvider());

        viewer.setContentProvider(ArrayContentProvider.getInstance());
    private class NamePatternFilter extends ViewerFilter {
package org.jkiss.dbeaver.ui.e4;
        @Override

    protected TableViewer createTableViewer(Composite parent, int style) {
            this.italicBoldFont = UIUtils.modifyFont(Display.getDefault().getSystemFont(), SWT.BOLD | SWT.ITALIC);
    @Override
import org.eclipse.swt.widgets.Composite;
        }
            italicBoldFont.dispose();
        @Override
}

            return (SearchPattern) method.invoke(this);
 *
            return item != null && item.isShowing();
import org.eclipse.swt.SWT;
import org.eclipse.jface.viewers.*;
    @Nullable
        @Override
 * Unless required by applicable law or agreed to in writing, software

        final SearchPattern matcher = getMatcher();
            return SearchCellLabelProvider.matches(pattern, name);
        table.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false));
            return renderer.getImage((MUILabel) element);
import org.eclipse.swt.custom.CTabItem;
            final Method method = AbstractTableInformationControl.class.getDeclaredMethod("getMatcher");

import org.eclipse.swt.widgets.Display;
        }
        @Nullable
            final CTabItem item = renderer.findItemForPart((MPart) element);
 */
            return null;
                return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
            final ILabelProvider provider = (ILabelProvider) ((ContentViewer) viewer).getLabelProvider();
import org.eclipse.e4.ui.internal.workbench.renderers.swt.AbstractTableInformationControl;
            String pattern = getPattern();
        }
        @Override


/*
        @Override
                return null;
    }
    private String getPattern() {
        @Nullable Shell parent,
 *
        viewer.addFilter(new NamePatternFilter());
 * See the License for the specific language governing permissions and
