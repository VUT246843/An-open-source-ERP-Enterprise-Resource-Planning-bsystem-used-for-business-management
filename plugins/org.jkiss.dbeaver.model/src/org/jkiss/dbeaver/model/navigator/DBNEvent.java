    public Object getSource()
 * DBeaver - Universal Database Manager

        this.nodeChange = nodeChange;
        REFRESH,
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBNEvent(Object source, Action action, @NotNull DBNNode node)
 */
    public DBNEvent(Object source, Action action, NodeChange nodeChange, @NotNull DBNNode node)
    }
    public enum Action
        LOAD,
        return node;
    {
}
        return action + ":" + nodeChange + ":" + node;
        this(source, action, NodeChange.REFRESH, node);

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.navigator;
    }
    }
 */
        SELECT,
        UNLOAD,
 * Unless required by applicable law or agreed to in writing, software
        AFTER_LOAD,
/*
        UPDATE,
    private Object source;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public enum NodeChange {
        UNLOCK,
public class DBNEvent {
    }
    private Action action;
 * limitations under the License.
    {
 * Navigator model event
    {
 *
        this.action = action;
    public Action getAction()
 * See the License for the specific language governing permissions and
    @Override

import org.jkiss.code.NotNull;
 *

    {
        this.node = node;
        BEFORE_LOAD,
/**
        STRUCT_REFRESH,


    {

    public NodeChange getNodeChange()
    public static final Object UPDATE_ON_SAVE = new Object();
    {
        this.action = action;
 * You may obtain a copy of the License at
    }
    private NodeChange nodeChange;
    public String toString() {

    @NotNull
    }



    }
    {
 * you may not use this file except in compliance with the License.
        return nodeChange;
 *
        LOCK,
 *     http://www.apache.org/licenses/LICENSE-2.0
        REMOVE,
        this.source = source;
        this.node = node;
    public DBNNode getNode()
    public static final Object FORCE_REFRESH = new Object();
    private DBNNode node;
        return action;
    @NotNull

        ADD,

        return source;
