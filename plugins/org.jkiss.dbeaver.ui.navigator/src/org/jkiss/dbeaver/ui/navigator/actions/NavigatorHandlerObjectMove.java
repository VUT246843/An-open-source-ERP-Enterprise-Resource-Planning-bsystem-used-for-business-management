                            }
    private static int getNodePosition(@NotNull DBNNode node) {
                }
                @SuppressWarnings("unchecked")
    @Override

 *
                            } else {
        final String commandId = event.getCommand().getId();
                try {
        }
 */
                    objectReorderer.setObjectOrdinalPosition(
package org.jkiss.dbeaver.ui.navigator.actions;
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!(object instanceof DBPOrderedObject orderedObject)) {

        for (DBNNode[] partition : consecutiveNodes) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
                        object,
     * @param nodes nodes to group
     *
import org.jkiss.dbeaver.Log;
import org.eclipse.core.commands.ExecutionEvent;
                        case NavigatorCommands.CMD_OBJECT_MOVE_UP -> -1;
public class NavigatorHandlerObjectMove extends NavigatorHandlerObjectBase {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
    private static DBNNode[][] groupConsecutiveNodes(@NotNull List<DBNNode> nodes) {
                } catch (DBException e) {
    private static final Log log = Log.getLog(NavigatorHandlerObjectMove.class);
                    List<DBSObject> siblingObjects = new ArrayList<>();
import org.jkiss.utils.ArrayUtils;
        final int max = getNodePosition(nodes.get(nodes.size() - 1));
                        }
                        null, object.getClass(),
                            log.warn("Wrong sibling node type: " + siblingNode);
                            if (siblingObject.getClass() != object.getClass()) {
                range.clear();
        final DBSObject object = ((DBNDatabaseNode) node).getObject();
                            return false;
    }
import org.jkiss.dbeaver.model.DBPOrderedObject;

        return ranges.toArray(new DBNNode[0][]);
                    // Sibling objects - they are involved in reordering process
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                }
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                        node.getParentNode(),
        final List<DBNNode[]> ranges = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
                    final int shift = switch (commandId) {
                        } else {

    }
        final List<DBNNode> range = new ArrayList<>();
                        HandlerUtil.getActiveWorkbenchWindow(event),
        final int min = getNodePosition(nodes.get(0));
        return ((DBPOrderedObject) object).getOrdinalPosition();
                    if (object.isPersisted() && commandTarget.getEditor() == null) {
import org.jkiss.dbeaver.model.DBPScriptObject;
                }


                            objectReorderer.getMaximumOrdinalPosition(object) - max + partition.length - 1;
                            ObjectSaver orderer = new ObjectSaver(commandTarget.getContext(), options);
                        false);
                        commandTarget.getContext(),
    /**
import org.eclipse.ui.handlers.HandlerUtil;
                        }
        }
     * @return an array of arrays containing consecutive nodes
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

                            commandTarget.getContext().resetChanges(true);

                if (!(node.getParentNode() instanceof DBNContainer)) {
            // Objects must be moved down in reverse order to avoid overlapping
                        if (!showScript(HandlerUtil.getActiveWorkbenchWindow(event), commandTarget.getContext(), options, "Reorder script")) {
                        if (siblingNode instanceof DBNDatabaseNode) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                    };
            }
        }
                    }
                        } else {
                        case NavigatorCommands.CMD_OBJECT_MOVE_TOP -> -min + 1;
import org.jkiss.code.NotNull;
 *

                        siblingObjects,
                        case NavigatorCommands.CMD_OBJECT_MOVE_DOWN -> partition.length;
        final List<DBNNode> nodes = NavigatorUtils.getSelectedNodes(selection);
import org.jkiss.dbeaver.model.navigator.DBNNode;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.edit.DBEObjectReorderer;
                    DBWorkbench.getPlatformUI().showError("Object move", "Error during object reposition", e);
                        case NavigatorCommands.CMD_OBJECT_MOVE_BOTTOM ->
                        default -> throw new ExecutionException("Unexpected command: " + event.getCommand());
            return -1;
/*
            ArrayUtils.reverse(consecutiveNodes);
 * limitations under the License.
                                siblingObjects.add(siblingObject);
        if (!(node instanceof DBNDatabaseNode)) {
        for (int index = 1, length = nodes.size(); index <= length; index++) {
            for (DBNNode node : partition) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.navigator.DBNContainer;
                    return null;
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.DBException;
                DBEObjectReorderer<DBSObject> objectReorderer = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(object.getClass(), DBEObjectReorderer.class);
            if (index == length || getNodePosition(nodes.get(index - 1)) != getNodePosition(nodes.get(index)) - 1) {
import java.util.Map;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * See the License for the specific language governing permissions and
 *

                if (objectReorderer == null) {
                        Map<String, Object> options = DBPScriptObject.EMPTY_OPTIONS;
import org.eclipse.core.commands.ExecutionException;


    }
     * Performs grouping of a consecutive nodes.
                    return null;
            return -1;
                }
        if (downwards) {
                ranges.add(range.toArray(new DBNNode[0]));
    @NotNull
                    return null;
import java.util.List;
     */
            }
                                log.warn("Sibling object class " + siblingObject.getClass() + " differs from moving object class " + object.getClass().getName());
 * you may not use this file except in compliance with the License.
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!(object instanceof DBPOrderedObject)) {
}        }
        final DBNNode[][] consecutiveNodes = groupConsecutiveNodes(nodes);


                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            TasksJob.runTask("Change object '" + object.getName() + "' position", orderer);
                DBSObject object = ((DBNDatabaseNode) node).getObject();
                    CommandTarget commandTarget = getCommandTarget(
                            DBSObject siblingObject = ((DBNDatabaseNode) siblingNode).getObject();
 *     http://www.apache.org/licenses/LICENSE-2.0
        final boolean downwards = commandId.equals(NavigatorCommands.CMD_OBJECT_MOVE_BOTTOM) || commandId.equals(NavigatorCommands.CMD_OBJECT_MOVE_DOWN);
                        orderedObject.getOrdinalPosition() + shift);
                    return null;
        return null;

                    for (DBNNode siblingNode : ArrayUtils.safeArray(node.getParentNode().getChildren(new VoidProgressMonitor()))) {

import org.jkiss.dbeaver.runtime.TasksJob;
            range.add(nodes.get(index - 1));
import org.jkiss.dbeaver.model.struct.DBSObject;
