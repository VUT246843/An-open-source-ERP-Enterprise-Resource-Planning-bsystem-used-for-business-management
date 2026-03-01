

        }
 */
 * Unless required by applicable law or agreed to in writing, software
        }
 * DBeaver - Universal Database Manager
 *
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        private static final String TYPE_NAME = "Dashboard.Item.Config Transfer" + System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$
package org.jkiss.dbeaver.ui.dashboard.view;
        @Override
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
 *     http://www.apache.org/licenses/LICENSE-2.0

            return new int[] { TYPEID };
import org.jkiss.dbeaver.ui.dnd.LocalObjectTransfer;
        protected int[] getTypeIds() {
        @Override
public final class DashboardItemConfigurationTransfer extends LocalObjectTransfer<DashboardItemConfiguration> {
        private DashboardItemConfigurationTransfer() {
 * you may not use this file except in compliance with the License.
/*
        private static final int TYPEID = registerType(TYPE_NAME);
        protected String[] getTypeNames() {
 *
        }
        public static final DashboardItemConfigurationTransfer INSTANCE = new DashboardItemConfigurationTransfer();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,


            return new String[] { TYPE_NAME };
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
