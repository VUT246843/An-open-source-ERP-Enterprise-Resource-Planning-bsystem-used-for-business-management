 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
    protected String[] getTypeNames() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.dnd.LocalObjectTransfer;
 * DBeaver - Universal Database Manager
    }
}
        return new String[]{TYPE_NAME};


    public static final DashboardItemTransfer INSTANCE = new DashboardItemTransfer();
    }
 * limitations under the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
public final class DashboardItemTransfer extends LocalObjectTransfer<List<Object>> {
    private DashboardItemTransfer() {
 * You may obtain a copy of the License at
 *
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
    private static final int TYPEID = registerType(TYPE_NAME);
 */
 * you may not use this file except in compliance with the License.
    private static final String TYPE_NAME = "DashboardTransfer.Item Transfer" + System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$
    protected int[] getTypeIds() {
import java.util.List;

package org.jkiss.dbeaver.ui.dashboard.view;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,



        return new int[]{TYPEID};
