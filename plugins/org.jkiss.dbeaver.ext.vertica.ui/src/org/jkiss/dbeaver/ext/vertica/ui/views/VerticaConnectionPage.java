

        logoImage = createImage("icons/vertica_logo.png"); //$NON-NLS-1$
 */
package org.jkiss.dbeaver.ext.vertica.ui.views;
            new DriverPropertiesDialogPage(this)
    }
            new VerticaConnectionPageAdvanced(),
 * limitations under the License.
public class VerticaConnectionPage extends GenericConnectionPage {
    private final Image logoImage;
 *
        UIUtils.dispose(logoImage);

 * distributed under the License is distributed on an "AS IS" BASIS,
        super.dispose();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
 * See the License for the specific language governing permissions and
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
import org.eclipse.swt.graphics.Image;
        return logoImage;
        return new IDialogPage[] {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    public Image getImage() {
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
    public void dispose() {
 * DBeaver - Universal Database Manager
 *

        };

/*
    }
 * Unless required by applicable law or agreed to in writing, software

    }
    @Override
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.IDialogPage;
import org.jkiss.dbeaver.ext.generic.views.GenericConnectionPage;
    }
    public VerticaConnectionPage() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

}
