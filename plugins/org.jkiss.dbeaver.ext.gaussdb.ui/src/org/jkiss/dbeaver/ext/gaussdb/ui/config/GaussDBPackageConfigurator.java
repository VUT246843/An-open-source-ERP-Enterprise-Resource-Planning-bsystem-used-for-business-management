/*
                    return null;
 */

    public static final DBSEntityType PACKAGE = new DBSEntityType("package", "Package", DBIcon.TREE_PACKAGE, true);
        }.execute();
                }
 *
                    "CREATE OR REPLACE PACKAGE " + packName + "\n" + "AS\n" + "-- Package header\n" + "END " + packName + ";");
 * you may not use this file except in compliance with the License.
                String packName = editPage.getEntityName();

import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
                gaussdbPackage.setObjectDefinitionText(
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.edit.DBECommandContext;
}
        return new UITask<GaussDBPackage>() {


                return gaussdbPackage;

public class GaussDBPackageConfigurator implements DBEObjectConfigurator<GaussDBPackage> {
    @Override
 * limitations under the License.
                gaussdbPackage.setExtendedDefinitionText(
                gaussdbPackage.setName(packName);
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 *
                    "CREATE OR REPLACE PACKAGE BODY " + packName + "\n" + "AS\n" + "-- Package body\n" + "END " + packName + ";");
            @Override
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSEntityType;
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.gaussdb.ui.config;
                if (!editPage.edit()) {
                EntityEditPage editPage = new EntityEditPage(gaussdbPackage.getDataSource(), PACKAGE);
import org.jkiss.dbeaver.DBException;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBPackage;
            protected GaussDBPackage runTask() throws DBException {
import org.jkiss.dbeaver.ui.UITask;
        GaussDBPackage gaussdbPackage, Map<String, Object> options) {
    public GaussDBPackage configureObject(DBRProgressMonitor monitor, DBECommandContext commandContext, Object container,
 *
