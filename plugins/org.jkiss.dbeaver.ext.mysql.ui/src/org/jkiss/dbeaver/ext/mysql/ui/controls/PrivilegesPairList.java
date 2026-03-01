 * You may obtain a copy of the License at

/*
        super(parent, SWT.NONE, "Available", "Granted");

            }
/**

 *
        List<String> grantedPrivs = new ArrayList<>();
 */
    }
import org.jkiss.dbeaver.ui.controls.PairListControl;
            if (priv.getValue()) {
}
                availPrivs.add(priv.getKey());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.SWT;
import java.util.List;
    public void setModel(Map<String, Boolean> privs)
    public PrivilegesPairList(Composite parent) {
package org.jkiss.dbeaver.ext.mysql.ui.controls;
 *
 * PrivilegesPairList
import java.util.Map;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 */
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        super.setModel(availPrivs, grantedPrivs);

 * distributed under the License is distributed on an "AS IS" BASIS,
public class PrivilegesPairList extends PairListControl<String> {

 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (Map.Entry<String,Boolean> priv : privs.entrySet()) {
import java.util.ArrayList;
 * Unless required by applicable law or agreed to in writing, software
        List<String> availPrivs = new ArrayList<>();
            } else {

                grantedPrivs.add(priv.getKey());
        }
 *
