            }
        return libraryList;
    }
                for (String lib : ns) {
    private static final Log log = Log.getLog(DriverDependencies.class);
 *

                    lastError = e;
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
                }
    @Override

                    //if (node.library.isDownloadable()) {
    }
            libraryList.addAll(libMap.values());
                }
                    libMap.putAll(localLibMap);
        }
            final Map<String, DependencyNode> libMap = new LinkedHashMap<>();
                    }
                DependencyNode prevNode = libMap.get(node.library.getId());
                    dumpNode(node, 0);
        Collection<? extends DBPDriverLibrary> dependencies = ownerNode.library.getDependencies(monitor);
                for (String lib : libMap.keySet()) {

                    if (prevNode != null) {
                    String newName = lib.replaceAll(".+\\:", "");
                }
                if (prevNode == null || prevNode.depth > node.depth) {
    public void changeLibrary(DBPDriverLibrary oldLibrary, DBPDriverLibrary newLibrary) {
    public List<DependencyNode> getLibraryList() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                Set<String> ns = new TreeSet<>();
                try {
            for (DependencyNode node : ownerNode.dependencies) {

                }
        }


    }
 *
            }
                    }
        }
                    sb.append(lib).append("\n");
 *
    private final List<DependencyNode> libraryList = new ArrayList<>();

                        prevNode.duplicate = true;
    }
            dumpNode(child, level + 1);
 * limitations under the License.
        for (int i = 0; i < level; i++) System.out.print("\t");
                    ns.add(newName);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        }
                DependencyNode node = new DependencyNode(ownerNode, dep);
        if (dependencies != null && !dependencies.isEmpty()) {
                if (!node.duplicate) {
    }
/*

    public List<DependencyNode> getLibraryMap() {
                StringBuilder sb = new StringBuilder();
            throw new DBException("Error resolving dependencies", lastError);

        {
    private final List<DependencyNode> rootNodes = new ArrayList<>();
    public DriverDependencies(Collection<? extends DBPDriverLibrary> rootLibraries) {
                    localLibMap.put(node.library.getId(), node);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
            return;
*/
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
                }

    }
        IOException lastError = null;
            rootNodes.clear();
                    node.duplicate = true;
                    resolveDependencies(monitor, node, localLibMap);
 * you may not use this file except in compliance with the License.
        if (lastError != null) {

                    final Map<String, DependencyNode> localLibMap = new LinkedHashMap<>();
                DependencyNode node = new DependencyNode(null, library);
}
        if (node.duplicate) {
package org.jkiss.dbeaver.registry.driver;

                        libMap.put(node.library.getId(), node);
                        //System.out.println(123);

import java.io.IOException;
        int index = rootLibraries.indexOf(oldLibrary);

                    if (ns.contains(newName)) {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.*;
            rootLibraries.add(index, newLibrary);
            for (DBPDriverLibrary dep : dependencies) {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return rootNodes;
                    resolveDependencies(monitor, node, libMap);
                    log.error("Error resolving library '" + library.getDisplayName() + "' dependencies", e);
{
    private void resolveDependencies(DBRProgressMonitor monitor, DependencyNode ownerNode, Map<String, DependencyNode> libMap) throws IOException {
                    rootNodes.add(node);
    public void resolveDependencies(DBRProgressMonitor monitor) throws DBException {

                }
    private void dumpNode(DependencyNode node, int level) {
 * DriverDependencies
public class DriverDependencies implements DBPDriverDependencies
 * Unless required by applicable law or agreed to in writing, software
                    //}
                System.out.println("---------------------------");
                } else {
import org.jkiss.dbeaver.Log;
        if (index == -1) {
            libraryList.clear();
    @Override
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
                System.out.println(sb.toString());
    private final List<DBPDriverLibrary> rootLibraries;
            rootLibraries.add(newLibrary);
        this.rootLibraries = new ArrayList<>(rootLibraries);
                ownerNode.dependencies.add(node);
 * See the License for the specific language governing permissions and
        }
                for (DependencyNode node : rootNodes) {
/**
        }
            for (DBPDriverLibrary library : rootLibraries) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } else {
 */
 * You may obtain a copy of the License at
        System.out.println(node.library.getId() + ":" + node.library.getVersion());

            rootLibraries.remove(oldLibrary);

                } catch (IOException e) {
 */
        for (DependencyNode child : node.dependencies) {
