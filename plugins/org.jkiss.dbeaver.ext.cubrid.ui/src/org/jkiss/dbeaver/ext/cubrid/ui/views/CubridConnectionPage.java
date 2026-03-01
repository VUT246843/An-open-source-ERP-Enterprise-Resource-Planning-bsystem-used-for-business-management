import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
package org.jkiss.dbeaver.ext.cubrid.ui.views;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            new DriverPropertiesDialogPage(this)
 *
        return new IDialogPage[] {
/*
}
 * DBeaver - Universal Database Manager
    @Override

 */
import org.eclipse.jface.dialogs.IDialogPage;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
            new CubridConnectionExtraPage(),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.generic.views.GenericConnectionPage;
    }
public class CubridConnectionPage extends GenericConnectionPage {
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        };
