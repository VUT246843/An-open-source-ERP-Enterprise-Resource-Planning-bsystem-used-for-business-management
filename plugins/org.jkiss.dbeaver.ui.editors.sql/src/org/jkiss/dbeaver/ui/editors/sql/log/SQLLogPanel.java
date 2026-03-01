/**

 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
}
 *     http://www.apache.org/licenses/LICENSE-2.0
{
    public SQLLogPanel(Composite parent, SQLEditor editor)
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
        super(parent, SWT.NONE);
import org.eclipse.swt.widgets.Composite;
        setLayout(gl);
    {
    }
public class SQLLogPanel extends Composite
 * DBeaver - Universal Database Manager
        gl.verticalSpacing = 0;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
package org.jkiss.dbeaver.ui.editors.sql.log;
    }
        gl.marginHeight = 0;
 */
/*
        GridLayout gl = new GridLayout(1, true);
 * Unless required by applicable law or agreed to in writing, software
 *

import org.eclipse.swt.layout.GridLayout;
    {
 * You may obtain a copy of the License at
    public QueryLogViewer getQueryLogViewer()
import org.eclipse.swt.SWT;
        return queryLogViewer;
 * Licensed under the Apache License, Version 2.0 (the "License");
        queryLogViewer = new QueryLogViewer(this, editor.getSite(), new SQLLogFilter(editor), false, true);
        gl.marginWidth = 0;
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ui.controls.querylog.QueryLogViewer;
 *
 *
    private QueryLogViewer queryLogViewer;
        gl.horizontalSpacing = 0;
 * ResultSetViewer
 * distributed under the License is distributed on an "AS IS" BASIS,

