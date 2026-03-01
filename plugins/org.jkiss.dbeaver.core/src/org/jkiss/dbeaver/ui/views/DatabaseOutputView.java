import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.SWT;
    }
        text.setFocus();
/*

import org.eclipse.ui.part.ViewPart;
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    public <T> T getAdapter(Class<T> adapter)

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
 * Unless required by applicable law or agreed to in writing, software
import java.util.HashMap;

    {
    }
 */
    private StyledText text;
    private Map<String, StringBuilder> outputCache = new HashMap<>();
    @Override
    public void setFocus()
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.views;
    public static final String VIEW_ID = "org.jkiss.dbeaver.core.databaseOutput";
import java.io.PrintWriter;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.

        text = new StyledText(parent, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.READ_ONLY);
import java.util.Map;
{
public class DatabaseOutputView extends ViewPart
import org.eclipse.swt.widgets.Composite;
}

 *
    public void createPartControl(Composite parent)
    {

    {

 * You may obtain a copy of the License at
 *
    @Override
    private PrintWriter writer;
 *
 * See the License for the specific language governing permissions and
