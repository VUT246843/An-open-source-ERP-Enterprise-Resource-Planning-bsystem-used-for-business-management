	private TreeNodeTransfer() {
    public static Collection<DBNNode> getFromClipboard()
 * Used to move DBNNode around in a database navigator.
		return INSTANCE;
 *
	/**
	 * Returns the singleton instance.
	public static TreeNodeTransfer getInstance() {
            clipboard.dispose();
        try {
	}
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

	/**
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
	@Override
    {
 * DBeaver - Universal Database Manager

	@Override
		return new int[] { TYPEID };
 */
 */
	 *
    protected String[] getTypeNames() {

        }
}
package org.jkiss.dbeaver.ui.dnd;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
	 * @see org.eclipse.swt.dnd.Transfer#getTypeNames()

        } finally {
import org.eclipse.swt.widgets.Display;
	}
	private static final TreeNodeTransfer INSTANCE = new TreeNodeTransfer();
		return new String[] { TYPE_NAME };
public final class TreeNodeTransfer extends LocalObjectTransfer<Collection<DBNNode>> {
 *
/**

	 */
 *
import java.util.Collection;
	 * @return The singleton instance
	/**
			+ System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$
        Clipboard clipboard = new Clipboard(Display.getDefault());
	 * @see org.eclipse.swt.dnd.Transfer#getTypeIds()

 * Unless required by applicable law or agreed to in writing, software

            return (Collection<DBNNode>) clipboard.getContents(TreeNodeTransfer.getInstance());
	}
    protected int[] getTypeIds() {
import org.jkiss.dbeaver.model.navigator.DBNNode;
	}

import org.eclipse.swt.dnd.Clipboard;
 * limitations under the License.
	private static final String TYPE_NAME = "DBNNode Transfer"//$NON-NLS-1$
/*
 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
	 */
	private static final int TYPEID = registerType(TYPE_NAME);
	 */
