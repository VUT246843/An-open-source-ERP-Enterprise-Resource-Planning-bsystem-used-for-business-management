		this.targetEdges = new ArrayList<>();
import java.util.ArrayList;
	}
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
		return span;
		this.lock = lock;
	private LevelPosition levelPosition;
 * See the License for the specific language governing permissions and
		this.targetEdges.remove(targetEdge);
		
 * Unless required by applicable law or agreed to in writing, software
		this.sourceEdges = new ArrayList<>();

	public List<LockGraphEdge> getSourceEdges() {

		this.title = lock.getTitle();

 *
	public DBAServerLock getLock() {
 *     http://www.apache.org/licenses/LICENSE-2.0
	public void addSourceEdge(LockGraphEdge sourceEdge) {
	
	}
	public void removeTargetEdge(LockGraphEdge targetEdge) {
	}
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
		return this.level;

package org.jkiss.dbeaver.model.impl.admin.locks;
		this.span = 0;

	}



 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com)
	}
		this.sourceEdges.remove(sourceEdge);
 * distributed under the License is distributed on an "AS IS" BASIS,
	
	}
	public String getTitle() {
	public LockGraphNode(DBAServerLock lock){
		this.levelPosition = LevelPosition.CENTER;
		this.level = level;
	}

		return lock;

		this.level = 0;
	}
 * DBeaver - Universal Database Manager
	public LockGraphNode(String title,int level,int span) {
		
		this.level = level;
public class LockGraphNode  {
	private List<LockGraphEdge> sourceEdges;
		this.sourceEdges.add(sourceEdge);
		this.span = span;

 * you may not use this file except in compliance with the License.
		return title;
}

		this.targetEdges = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		this.levelPosition = levelPosition;
	
 *
	
	public void setLevelPosition(LevelPosition levelPosition) {
	}  
	public List<LockGraphEdge> getTargetEdges() {
		this.targetEdges.add(targetEdge);

	}

	}
	public void addTargetEdge(LockGraphEdge targetEdge) {
	}

	public LevelPosition getLevelPosition() {
	public void setSpan(int span) {
	private int level;
		return levelPosition;

	public int getLevel() {
	}
		return this.targetEdges;
		this.sourceEdges = new ArrayList<>();
	}
/*
 * You may obtain a copy of the License at

	}
		this.span = span;
	
	}

	private List<LockGraphEdge> targetEdges;
	public enum LevelPosition { LEFT, CENTER, RIGHT};	
	private String title;

	public void setLevel(int level) {
	
	private DBAServerLock lock;
import java.util.List;
 */

		return this.sourceEdges;

	

	public int getSpan() {
	public void removeSourceEdge(LockGraphEdge sourceEdge) {
		

		this.title = title;
 * Licensed under the Apache License, Version 2.0 (the "License");
	
	private int span;
