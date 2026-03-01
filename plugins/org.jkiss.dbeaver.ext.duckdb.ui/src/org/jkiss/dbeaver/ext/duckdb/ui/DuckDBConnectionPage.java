 */
            };
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.dialogs.IDialogPage;
 * DuckDBConnectionPage
        return new IDialogPage[] {
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
/**
 * See the License for the specific language governing permissions and
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
                new DuckDBConnectionPageAdvanced()
    }
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;

public class DuckDBConnectionPage extends GenericConnectionPage {
        if (extrasOnly) {
import org.jkiss.dbeaver.ext.generic.views.GenericConnectionPage;

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
            return new IDialogPage[] {
        }
 *
package org.jkiss.dbeaver.ext.duckdb.ui;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
}
 */
            new DuckDBConnectionPageAdvanced(), new DriverPropertiesDialogPage(this)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * You may obtain a copy of the License at
        };
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
