	@Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected int[] getTypeIds() {
	 */
package org.jkiss.dbeaver.ui.dnd;
import java.util.Collection;
 * distributed under the License is distributed on an "AS IS" BASIS,
		return new String[] { TYPE_NAME };
        }
	private static final String TYPE_NAME = "DBSObject Transfer"//$NON-NLS-1$
	 *
		return new int[] { TYPEID };
        } finally {
    public static Collection<DBPNamedObject> getFromClipboard()
	public static DatabaseObjectTransfer getInstance() {
    {
/*
	/**

	/**

 * you may not use this file except in compliance with the License.
	/**
 * See the License for the specific language governing permissions and
	 * @return The singleton instance
import org.eclipse.swt.dnd.Clipboard;
	 * @see org.eclipse.swt.dnd.Transfer#getTypeIds()
            clipboard.dispose();
	}
 * Unless required by applicable law or agreed to in writing, software
	 * @see org.eclipse.swt.dnd.Transfer#getTypeNames()
	 */
 */
	 */
 *
			+ System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

	}
import org.eclipse.swt.widgets.Display;
public final class DatabaseObjectTransfer extends LocalObjectTransfer<Collection<DBPNamedObject>> {
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
		return INSTANCE;
 */

	}
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
	}
 * Used to move DBSObject around in a database navigator.
            return (Collection<DBPNamedObject>) clipboard.getContents(DatabaseObjectTransfer.getInstance());
        Clipboard clipboard = new Clipboard(Display.getDefault());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



	private static final int TYPEID = registerType(TYPE_NAME);
    protected String[] getTypeNames() {
}
	private DatabaseObjectTransfer() {
	 * Returns the singleton instance.
 *
 * DBeaver - Universal Database Manager
	private static final DatabaseObjectTransfer INSTANCE = new DatabaseObjectTransfer();
/**



        try {
	@Override
