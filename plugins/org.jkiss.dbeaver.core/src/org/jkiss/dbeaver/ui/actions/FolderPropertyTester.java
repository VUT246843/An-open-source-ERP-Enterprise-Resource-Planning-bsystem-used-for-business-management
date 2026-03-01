 * you may not use this file except in compliance with the License.
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.core.expressions.PropertyTester;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (!(receiver instanceof DBNLocalFolder)) {

 *
package org.jkiss.dbeaver.ui.actions;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*

 *
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
 * DBeaver - Universal Database Manager
public class FolderPropertyTester extends PropertyTester {
	static protected final Log log = Log.getLog(FolderPropertyTester.class);
        }
            return false;
 * limitations under the License.
        	log.info(String.format("%s cannot be used with %s type", this.getClass().getName(), receiver.getClass().getName()));
import org.jkiss.dbeaver.Log;
 *
        DBNLocalFolder localFolder = (DBNLocalFolder) receiver;
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        return localFolder.hasConnected();
    @Override
    }

 */
