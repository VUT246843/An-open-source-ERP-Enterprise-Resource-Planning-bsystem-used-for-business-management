			this.target.removeTargetEdge(this);
 * Unless required by applicable law or agreed to in writing, software
	public void setTarget(LockGraphNode newTarget) {
public class LockGraphEdge {
}
		}
		if (this.target != null) {
		return this.source;
		this.target = newTarget;
		if (this.target != null) {



			this.source.removeSourceEdge(this);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

	}
 * distributed under the License is distributed on an "AS IS" BASIS,
	}
		if (this.source != null) {
			this.target.addTargetEdge(this);
		}
	public void setSource(LockGraphNode newSource) {
		}
		this.source = newSource;
 * you may not use this file except in compliance with the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
	}

		return this.target;
 */
	private LockGraphNode source;
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com)
	public LockGraphNode getTarget() {
 * See the License for the specific language governing permissions and

		if (this.source != null) {
package org.jkiss.dbeaver.model.impl.admin.locks;
 *
			this.source.addSourceEdge(this);
 * DBeaver - Universal Database Manager
	public LockGraphNode getSource() {
 *
 * You may obtain a copy of the License at
	private LockGraphNode target;
		}

 * limitations under the License.
/*
