                return element instanceof EditorReference
import org.eclipse.ui.internal.WorkbookEditorsHandler;
                return ((WorkbenchPartReference) element).getTitleImage();
    protected void setMatcherString(String pattern) {
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
            }

            @Override
 * limitations under the License.
            @Override
/*
                    && pattern != null
 * See the License for the specific language governing permissions and
    }
 * You may obtain a copy of the License at
        this.pattern = pattern;

    }
 */
import org.eclipse.ui.internal.EditorReference;
}

        return new ViewerFilter() {

            }

import org.eclipse.jface.viewers.TableViewerColumn;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
                return getWorkbenchPartReferenceText((WorkbenchPartReference) element);

        });
            }
package org.jkiss.dbeaver.ui;
import org.eclipse.jface.viewers.Viewer;
        };
    private String pattern;
            @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return pattern;
            public String getPattern() {
import org.eclipse.ui.internal.WorkbenchPartReference;
                    && SearchCellLabelProvider.matches(pattern, ((EditorReference) element).getTitle());
            public String getText(@NotNull Object element) {
public class CustomWorkbookEditorsHandler extends WorkbookEditorsHandler {
    @Override

    }
            @Override
            public Image getImage(@NotNull Object element) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @Override
 * DBeaver - Universal Database Manager
 *
 * you may not use this file except in compliance with the License.
        ColumnViewerToolTipSupport.enableFor(column.getViewer());
        column.setLabelProvider(new SearchCellLabelProvider() {
import org.eclipse.swt.graphics.Image;
            }
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
    protected void setLabelProvider(TableViewerColumn column) {
                return ((WorkbenchPartReference) element).getTitleToolTip();
            @NotNull
            @Nullable
    protected ViewerFilter getFilter() {
            public String getToolTipText(@NotNull Object element) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            }

import org.eclipse.jface.viewers.ViewerFilter;
import org.jkiss.code.NotNull;


            @Override
 * Unless required by applicable law or agreed to in writing, software
 *
