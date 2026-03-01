    @Override
public class TiDBConnectionPage extends MySQLConnectionPage {
        UIUtils.dispose(LOGO_TIDB);
package org.jkiss.dbeaver.ext.tidb.ui.views;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ext.mysql.ui.views.MySQLConnectionPage;

    public Image getImage() {
 *
 * you may not use this file except in compliance with the License.
        super.dispose();
 * limitations under the License.
/**
    {
 */
    public TiDBConnectionPage() {
    }
/*
}
 * Copyright (C) 2010-2022 DBeaver Corp and others
    @Override

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final Image LOGO_TIDB;
        LOGO_TIDB = createImage("icons/tidb_logo.png");
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *
 * You may obtain a copy of the License at
import org.eclipse.swt.graphics.Image;
 *

 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void dispose()
 * See the License for the specific language governing permissions and
 * TiDBConnectionPage
        return LOGO_TIDB;

 *     http://www.apache.org/licenses/LICENSE-2.0
