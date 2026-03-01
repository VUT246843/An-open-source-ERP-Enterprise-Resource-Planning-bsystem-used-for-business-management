        for (DBNDatabaseNode node : nodes) {
                    }
                if (settings.isSkipSystemObjects() && DBUtils.isSystemObject(child.getObject())) {
                if (childIndexes[i] == -1) {
                                continue;

    private volatile IStatus initializeError;
    private void compareProperties(DBRProgressMonitor monitor, List<DBNDatabaseNode> nodes) throws DBException, InterruptedException
            public void onTaskFinished(IStatus status)
    private void compareChildren(DBRProgressMonitor monitor, List<DBNDatabaseNode> nodes) throws DBException, InterruptedException
    private static final Log log = Log.getLog(CompareObjectsExecutor.class);
        return initializeError;
                if (children != null) {
            }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
        } finally {
        DBPDataSource dataSource = node.getDataSourceContainer().getDataSource();
                DBNDatabaseNode[] children = node.getChildren(subMonitor);
                if (monitor.isCanceled()) {

                }
        if (onlyStruct && !compareScripts) {

    {
                    if (childList != null) {

        boolean compareLazyProperties = false;
                    }
                            // Only DBPScriptObject methods
    private void reportObjectsCompareBegin(List<DBNDatabaseNode> objects)
        }
            return;

        }
                    if (child.getNodeDisplayName().equals(childName)) {
        for (ObjectPropertyDescriptor prop : properties) {

                Object propertyValue = propertySource.getPropertyValue(monitor, databaseObject, prop, true);
    public CompareObjectsExecutor(CompareObjectsSettings settings)
 * you may not use this file except in compliance with the License.
        reportLines.clear();
        for (DBNDatabaseNode[] childList : allChildren) {

        }
        for (ObjectPropertyDescriptor prop : properties) {


        // Initialize nodes
        for (DBNDatabaseNode node : lastLine.nodes) {

        }
                allChildren.add(null);
            for (DBNDatabaseNode node : objects) {
        PropertiesContributor.getInstance().addLazyListener(lazyPropertyLoadListener);
                }
        for (int i = 0; i < lastLine.nodes.length; i++) {
        };

import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
            }
            @Override
                break;
            {
        this.initializeError = null;
                        if (compareScripts) {

    }
import org.jkiss.dbeaver.runtime.properties.*;

            }
            for (int i = 0; i < nodeCount; i++) {
                            break;
    private void reportPropertyCompare(ObjectPropertyDescriptor property)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBUtils;
        this.settings = settings;
            }
                        } else {
                childIndexes[i] = -1;
        lastLine.nodes = new DBNDatabaseNode[rootNodes.size()];
                }
            Map<DBPPropertyDescriptor, Object> valueMap = propertyValues.get(node.getObject());
        throws DBException, InterruptedException
                    if (objectProps != null) {
public class CompareObjectsExecutor {
        PropertiesContributor.getInstance().removeLazyListener(lazyPropertyLoadListener);
 * DBeaver - Universal Database Manager
        reportObjectsCompareBegin(nodes);
        for (int i = 1; i < rootNodes.size(); i++) {
        this.propertyValues.clear();
        // Use submonitor to avoid huge number of tasks
                    lastLine.nodes[i] = node;
            }
 *
                    if (prop.isHidden()) {
            monitor.worked(1);
                DBNDatabaseNode[] childList = allChildren.get(i);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * Unless required by applicable law or agreed to in writing, software
    private int reportDepth = 0;
import org.jkiss.dbeaver.DBException;
            getDataSourceFilter(firstNode), null);
                        continue;
                allChildNames.add(child.getNodeDisplayName());
                    continue;
        monitor.subTask("Compare " + title.toString());
        StringBuilder title = new StringBuilder();
        }
            DBNDatabaseNode node = nodes.get(i);
        boolean compareScripts = compareLazyProperties && settings.isCompareScripts();
                if (initializeError != null) {

                if (meta.isVirtual()) {
            if (valueMap != null) {
                    if (!compareLazyProperties) {
                for (int k = 0; k < childList.length; k++) {
        return filter;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 */
import org.jkiss.dbeaver.Log;
            @Override
                if (!status.isOK()) {
        // Clear compare singletons
    }

        initializeFinisher = new DBRProgressListener() {
            int[] childIndexes = new int[nodeCount];
                }
    }
                lastLine.hasDifference = true;
                ((DBSObjectContainer) node.getObject()).cacheStructure(subMonitor, DBSObjectContainer.STRUCT_ALL);
            public void handlePropertyLoad(Object object, DBPPropertyDescriptor property, Object propertyValue, boolean completed)
    }
    }
        }
                    DBNDatabaseNode child = childList[k];
            if (!CompareUtils.equalPropertyValues(reportProperty.values[i], firstValue)) {
 * limitations under the License.

                    allChildren.add(children);
    private final Map<DBPDataSource, DataSourcePropertyFilter> dataSourceFilters = new IdentityHashMap<>();
import org.jkiss.dbeaver.model.runtime.SubTaskProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSource;

                }
        lastLine.structure = objects.get(0);
    {
                    }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            for (DBNDatabaseNode node : nodes) {
        }
    private DataSourcePropertyFilter getDataSourceFilter(DBNDatabaseNode node)
        CompareReportProperty reportProperty = new CompareReportProperty(property);
        }
                    for (int k = 0; k < nodeCount; k++) {
    {
                            if (!isScriptProperty) {


                }
        this.initializedCount = 0;
                Thread.sleep(50);
    public void dispose()
                    }
import org.jkiss.dbeaver.model.DBPNamedObject;
                }
            }
            PropertyCollector propertySource = new PropertyCollector(databaseObject, compareLazyProperties || compareScripts);
                    Map<DBPPropertyDescriptor, Object> objectProps = propertyValues.get(object);
                if (childList == null) continue;
        if (dataSource == null) {
                title.append(node.getNodeFullName());
    }
            }
/*
                    if (propertyValue instanceof DBPNamedObject) {

                        break;

            if (monitor.isCanceled()) {
                synchronized (propertyValues) {
            dataSourceFilters.put(dataSource, filter);
    private final Map<Object, Map<DBPPropertyDescriptor, Object>> propertyValues = new IdentityHashMap<>();
        for (String childName : allChildNames) {
                }
                break;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
                    initializedCount++;
        DataSourcePropertyFilter filter = dataSourceFilters.get(dataSource);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
                    }
        if (lastLine.properties == null) {
        }
                reportProperty.values[i] = valueMap.get(property);
    {
                } else {
                continue;
    private final DBRProgressListener initializeFinisher;
        }
        lazyPropertyLoadListener = new ILazyPropertyLoadListener() {
                    break;
                        if (k != i && childIndexes[k] != childIndexes[i]) {
        }


            }
        reportLines.add(lastLine);
                        nodesToCompare.add(childList[childIndexes[i]]);

            if (nodeProperties == null) {

        // Load all properties
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
                compareLazyProperties = true;
                    }

    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
            Map<DBPPropertyDescriptor, Object> nodeProperties = propertyValues.get(databaseObject);
                if (prop.isLazy()) {

        for (int i = 0; i < rootNodes.size(); i++) {
            monitor.subTask("Initialize nodes");
                }
                } else {
            // Compare children recursively
        reportDepth++;
                    // Skip virtual nodes
        reportDepth--;
        int nodeCount = nodes.size();

                throw new InterruptedException();
 * See the License for the specific language governing permissions and
                    compareProperties(monitor, nodes);
    public IStatus getInitializeError()
                compareChildren(monitor, nodes);
    {
                }
        try {
    private volatile int initializedCount = 0;
    }
                        }
                // Go deeper only if we have more than one node
        // Compare children

                    nodeProperties.put(prop, propertyValue);
        List<DBNDatabaseNode[]> allChildren = new ArrayList<>(nodeCount);
    }
                if (node == rootNodes.get(i) || node.isChildOf(rootNodes.get(i))) {
                    initializeError = status;
                        childIndexes[i] = k;
            if (childList == null) continue;
        compareNodes(monitor, nodes);
        List<ObjectPropertyDescriptor> properties = ObjectPropertyDescriptor.extractAnnotations(
        reportProperty.values = new Object[rootNodes.size()];
 *
                if (title.length() > 0) title.append(", ");
                } else {
                    final DBNDatabaseNode[] childList = allChildren.get(i);
        lastLine = null;

            if (nodes.size() > 1) {
            lastLine.properties = new ArrayList<>();
        }
            DBSObject databaseObject = node.getObject();
    {

    private final List<DBNDatabaseNode> rootNodes;
            List<DBNDatabaseNode> nodesToCompare = new ArrayList<>(nodeCount);
        if (filter == null) {
                log.warn("Error reading child nodes for compare", e);
    {
    {
        lastLine = new CompareReportLine();
    private void reportObjectsCompareEnd()

            }
        };
        DBRProgressMonitor subMonitor = new SubTaskProgressMonitor(monitor);
    }
        }
    {
    private final List<CompareReportLine> reportLines = new ArrayList<>();
            for (DBNDatabaseNode child : childList) {
        Object firstValue = reportProperty.values[0];
import org.jkiss.dbeaver.model.DBConstants;
                boolean isScriptProperty = prop.getId().equals(DBConstants.PARAM_OBJECT_DEFINITION_TEXT) || prop.getId().equals(DBConstants.PARAM_EXTENDED_DEFINITION_TEXT);
            compareNodes(monitor, nodesToCompare);
                    continue;
            for (int i = 0; i < nodeCount; i++) {
    private final Object PROPS_LOCK = new Object();
            if (prop.isLazy()) {
                        }
                            continue;
    private CompareObjectsSettings settings;
        lastLine.properties.add(reportProperty);
            }

            DBNDatabaseNode node = lastLine.nodes[i];
            // Cache structure if possible
    private void compareNodes(DBRProgressMonitor monitor, List<DBNDatabaseNode> nodes)
        lastLine.depth = reportDepth;
            }
            if (node.getObject() instanceof DBSObjectContainer) {
                synchronized (PROPS_LOCK) {
                        objectProps.put(property, propertyValue);
                monitor.worked(1);
                propertyValues.put(databaseObject, nodeProperties);
        boolean onlyStruct = settings.isCompareOnlyStructure();
                        propertyValue = ((DBPNamedObject) propertyValue).getName();
                break;
                }
            reportPropertyCompare(prop);
        throws DBException, InterruptedException
            while (initializedCount != nodes.size()) {
                lastLine.hasDifference = true;
            null,
            return null;
 * You may obtain a copy of the License at
            filter = new DataSourcePropertyFilter(dataSource);
            } catch (Exception e) {
                }
        // Compare properties
 *

                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            {
        this.rootNodes = settings.getNodes();
                            }
package org.jkiss.dbeaver.tools.compare.simple;
        return new CompareReport(rootNodes, reportLines);
                if (!(nodes.get(0) instanceof DBNDatabaseFolder)) {
            }
    private final ILazyPropertyLoadListener lazyPropertyLoadListener;
            }
        {
                    throw new DBException(initializeError.getMessage());
            reportObjectsCompareEnd();

        for (int i = 0; i < nodeCount; i++) {
                DBXTreeNode meta = child.getMeta();
    {
            }
        DBNDatabaseNode firstNode = nodes.get(0);
            }
            }
    private CompareReportLine lastLine;
            }
            for (ObjectPropertyDescriptor prop : properties) {
                            // Wrong index - add to report
                    }
                }
                node.initializeNode(null, initializeFinisher);
            try {
        Set<String> allChildNames = new LinkedHashSet<>();
                nodeProperties = new IdentityHashMap<>();
                    // Missing
                    throw new InterruptedException();
}            }
                    continue;
            if (node == null) {
import org.eclipse.core.runtime.IStatus;
                if (onlyStruct && !isScriptProperty) {
            ObjectPropertyDescriptor.getObjectClass(firstNode.getObject()),

                    // Skip system objects
    public CompareReport compareObjects(DBRProgressMonitor monitor, List<DBNDatabaseNode> nodes)
import java.util.*;
        }
            }
    }
            if (node == null) {
        compareLazyProperties = compareLazyProperties && settings.isCompareLazyProperties();
                        // Compare just object names
