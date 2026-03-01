 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com)

	}

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
	public int getMaxWidth() {
		this.selection = null;
package org.jkiss.dbeaver.model.impl.admin.locks;
		return lockRoot;
 */
		return lockManagerViewer;
		this.lockRoot = lockRoot;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
	public LockManagerViewer getLockManagerViewer() {
	}

	}
		return selection;
 *

	public LockGraph(DBAServerLock lockRoot) {
	}
	private List<LockGraphNode> nodes = new ArrayList<>();
	private LockGraphNode selection;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

	}
	public void setLockManagerViewer(LockManagerViewer lockManagerViewer) {
	private final DBAServerLock lockRoot;
	}

 * limitations under the License.
	public DBAServerLock getLockRoot() {
		return this.nodes;
		this.selection = selection;
 * you may not use this file except in compliance with the License.
}

public class LockGraph {
 *     http://www.apache.org/licenses/LICENSE-2.0
		this.lockManagerViewer = lockManagerViewer;
/*
	}
	
/*


	private int maxWidth = 0;
	}
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
		return maxWidth;
	public List<LockGraphNode> getNodes() {
	public void setSelection(LockGraphNode selection) {
	}

		this.maxWidth = maxWidth;
	public void setMaxWidth(int maxWidth) {
	//private LockManagerViewer lockManagerViewer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.ArrayList;
 *



 * DBeaver - Universal Database Manager

	public LockGraphNode getSelection() {

import java.util.List;
*/
 *

