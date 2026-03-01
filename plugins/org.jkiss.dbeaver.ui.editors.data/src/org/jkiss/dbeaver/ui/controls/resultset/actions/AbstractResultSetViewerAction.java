    }
import org.jkiss.dbeaver.model.DBPImage;
    private final ResultSetViewer resultSetViewer;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public AbstractResultSetViewerAction(ResultSetViewer resultSetViewer, String text, DBPImage icon) {
 * See the License for the specific language governing permissions and
    public AbstractResultSetViewerAction(ResultSetViewer resultSetViewer, String text) {
import org.eclipse.jface.action.Action;
        super(text, DBeaverIcons.getImageDescriptor(icon));
    public AbstractResultSetViewerAction(ResultSetViewer resultSetViewer, String text, int style) {
 *
 * limitations under the License.
        this.resultSetViewer = resultSetViewer;
 * DBeaver - Universal Database Manager
 *
    }
        super(text);
 */
        this.resultSetViewer = resultSetViewer;
 * Unless required by applicable law or agreed to in writing, software


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public ResultSetViewer getResultSetViewer() {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
public abstract class AbstractResultSetViewerAction extends Action {

}
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
/*
 *
        return resultSetViewer;
    }

        super(text, style);
        this.resultSetViewer = resultSetViewer;

package org.jkiss.dbeaver.ui.controls.resultset.actions;
