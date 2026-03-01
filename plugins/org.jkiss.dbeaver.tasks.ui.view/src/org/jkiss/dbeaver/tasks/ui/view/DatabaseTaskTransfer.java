	private static final int TYPEID = registerType(TYPE_NAME);
		return INSTANCE;
/*
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
			return tasks;
            clipboard.dispose();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			+ System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$

		return new String[] { TYPE_NAME };
/**
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    protected String[] getTypeNames() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.task.DBTTask;
	}
	}
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
		private Control sourceControl;
 * See the License for the specific language governing permissions and

 *
	}
 * Used to move DBTTask around
	}

 * you may not use this file except in compliance with the License.
	private static final String TYPE_NAME = "DBTTask Transfer"//$NON-NLS-1$
	@Override
	private static final DatabaseTaskTransfer INSTANCE = new DatabaseTaskTransfer();
		}
			this.tasks = tasks;


		private List<DBTTask> tasks;
 */
	}

            return (List<DBTTask>) clipboard.getContents(DatabaseTaskTransfer.getInstance());
 *
 */
        }


	public static class Data {


		public List<DBTTask> getTasks() {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
			this.sourceControl = sourceControl;
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } finally {
    protected int[] getTypeIds() {
package org.jkiss.dbeaver.tasks.ui.view;
	private DatabaseTaskTransfer() {
		return new int[] { TYPEID };
import org.jkiss.dbeaver.ui.dnd.LocalObjectTransfer;
import java.util.List;
 * limitations under the License.
    }
		public Data(Control sourceControl, List<DBTTask> tasks) {
			return sourceControl;
public final class DatabaseTaskTransfer extends LocalObjectTransfer<List<DBTTask>> {
	@Override
		}

}

    public static List<DBTTask> getFromClipboard()
        Clipboard clipboard = new Clipboard(Display.getDefault());

import org.eclipse.swt.dnd.Clipboard;
 * DBeaver - Universal Database Manager
		}

		public Control getSourceControl() {
	public static DatabaseTaskTransfer getInstance() {
