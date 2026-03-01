import org.eclipse.core.runtime.Status;
                updateSelectionStatistics(preferenceStore, null);
            }
        this.viewer = viewer;
        }
import org.eclipse.core.runtime.IStatus;
            }
 */
        public IStatus runInUIThread(IProgressMonitor monitor) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    }

                slText.add(NLS.bind(ResultSetMessages.result_set_stat_cells,selectionExt == null ? 0 : selectionExt.getSelectedCellCount()));

 *
class ResultSetStatListener extends ResultSetListenerAdapter {
 * you may not use this file except in compliance with the License.
            if (preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_SEL_CELLS)) {
        if (site instanceof IEditorSite) {
        }
}
            this.updateJob.schedule(100);
                IResultSetSelectionExt selectionExt = (IResultSetSelectionExt) selection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
        private void updateSelectionStatistics(@NotNull DBPPreferenceStore preferenceStore, @Nullable IResultSetSelectionExt selectionExt) {
    ResultSetStatListener(ResultSetViewer viewer) {
            if (preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_SEL_COLUMNS)) {
 * Unless required by applicable law or agreed to in writing, software
            if (preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_SEL_ROWS)) {
    }
            setSystem(true);
            setUser(false);
            }
import org.eclipse.ui.progress.UIJob;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }

    }
            DBPPreferenceStore preferenceStore = viewer.getPreferenceStore();
 * limitations under the License.
import org.eclipse.osgi.util.NLS;
    public void handleResultSetSelectionChange(SelectionChangedEvent event) {
 * DBeaver - Universal Database Manager
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        SLUpdateJob() {
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                updateSelectionStatistics(preferenceStore, selectionExt);
import org.eclipse.core.runtime.IProgressMonitor;
            viewer.setSelectionStatistics(slText.toString());
package org.jkiss.dbeaver.ui.controls.resultset;
 * See the License for the specific language governing permissions and
        }
    @Override
            IResultSetSelection selection = viewer.getSelection();

            StringJoiner slText = new StringJoiner(", ");
        IResultSetSelection selection = viewer.getSelection();
        private void updateSelectionStatistics(IResultSetSelection selection, DBPPreferenceStore preferenceStore) {
 * You may obtain a copy of the License at

                slText.add(NLS.bind(ResultSetMessages.result_set_stat_columns, selectionExt == null ? 0 : selectionExt.getSelectedColumnCount()));

/*
 *
import org.eclipse.ui.IWorkbenchPartSite;
            super("Update status line");
        @Override
            } else if (selection instanceof IResultSetSelectionExt) {
            if (this.updateJob == null) {

import java.util.StringJoiner;
            return Status.OK_STATUS;
        }


            // Use job with 100ms delay to avoid event spam
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        IWorkbenchPartSite site = viewer.getSite();
    class SLUpdateJob extends UIJob {

import org.jkiss.code.NotNull;
import org.eclipse.ui.IEditorSite;
                this.updateJob = new SLUpdateJob();

    private SLUpdateJob updateJob;
 *
            if (selection.getSelectedAttributes().isEmpty()) {
                slText.add(NLS.bind(ResultSetMessages.result_set_stat_rows, selectionExt == null ? 0 : selectionExt.getSelectedRowCount())) ;// + "/" + selExt.getSelectedColumnCount() + "/" + selExt.getSelectedCellCount();
import org.eclipse.jface.viewers.SelectionChangedEvent;
    private final ResultSetViewer viewer;
            updateSelectionStatistics(selection, preferenceStore);
