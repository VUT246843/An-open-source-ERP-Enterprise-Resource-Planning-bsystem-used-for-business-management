package org.jkiss.dbeaver.ui.navigator.dnd;
                        .map(NavigatorTransferInfo::getName)
/*
                    event.data = info.values().stream()

import org.jkiss.utils.StandardConstants;
                nodeObject = object;
                        }
                    throw new InvocationTargetException(e);


    public void dragFinished(DragSourceEvent event) {
import java.nio.file.Path;
        } else if (FileTransfer.getInstance().isSupportedType(event.dataType)) {
    }
                nodeName = node.getNodeTargetName();
 *
    @Nullable
import org.jkiss.utils.CommonUtils;
            try {
            event.data = new EditorInputTransfer.EditorInputData[0];
                    continue;
                } else if (DatabaseObjectTransfer.getInstance().isSupportedType(event.dataType)) {
            event.data = Collections.emptyList();
    }
import java.io.InputStream;
                } catch (Exception e) {

            event.data = Collections.emptyList();
    public void dragSetData(DragSourceEvent event) {
                && (EditorInputTransfer.getInstance().isSupportedType(event.dataType)
                        try (OutputStream out = Files.newOutputStream(tmpFile)) {
import org.jkiss.dbeaver.model.navigator.DBNStreamData;
import org.eclipse.swt.dnd.DragSourceListener;
 * Licensed under the Apache License, Version 2.0 (the "License");
            info.put(node, new NavigatorTransferInfo(nodeName, node, nodeObject));
                }
import java.util.Objects;
        }

                } else if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
                    event.data = info.values().stream()
    @Override
                    try (InputStream is = streamData.openInputStream()) {
            final Map<DBNNode, NavigatorTransferInfo> info = collectNodesInfo(event);
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.LinkedHashMap;
                return null;
                if (object == null) {
import java.util.stream.Collectors;
            } else if (nextSelected instanceof DBNStreamData streamData && streamData.supportsStreamData()
import org.jkiss.code.NotNull;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.IStructuredSelection;
                tempFolder = DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), "dnd-files");

import org.eclipse.swt.dnd.TextTransfer;
            }
 * Unless required by applicable law or agreed to in writing, software
                        .toArray(EditorInputTransfer.EditorInputData[]::new);
            String nodeName;
        }
 *
                        .map(NavigatorTransferInfo::getObject)
    }
        }
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ui.dnd.DatabaseObjectTransfer;
    }
        if (!selection.isEmpty()) {
            event.data = "";
            UIUtils.runInProgressService(monitor -> {
                        .filter(Objects::nonNull)
            if (nextSelected instanceof DBNDatabaseNode && !(nextSelected instanceof DBNDataSource)) {
            event.data = new String[0];
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                        .collect(Collectors.joining(CommonUtils.getLineSeparator()));
                    }
import org.eclipse.swt.dnd.DragSourceEvent;
    }
            } catch (IOException e) {

 *
                            ContentUtils.copyStreams(is, streamSize, out, monitor);
                    try {
                return;
        if (tempFolder == null) {
    private Path tempFolder;
                        continue;
        // Delete temporary files if needed
                } catch (Exception e) {
                }
            } else {

    private final Viewer viewer;
    }
        return info;
 * limitations under the License.
            if (!info.isEmpty()) {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at

                        Files.delete(tmpFile);
            }
                continue;
import org.jkiss.dbeaver.ui.dnd.TreeNodeTransfer;
import org.eclipse.swt.dnd.FileTransfer;
import org.jkiss.code.Nullable;
                try {
                Files.createFile(tmpFile);
                        .map(NavigatorTransferInfo::getName)
 */
import java.io.OutputStream;
 * See the License for the specific language governing permissions and
                }
            } else if (nextSelected instanceof DBNDataSource) {
                    if (tmpFile == null) {
                if (TreeNodeTransfer.getInstance().isSupportedType(event.dataType)) {
    public void dragStart(DragSourceEvent event) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

            }
        if (TreeNodeTransfer.getInstance().isSupportedType(event.dataType)) {
        selection = null;
    public NavigatorDragSourceListener(Viewer viewer) {
        } else if (EditorInputTransfer.getInstance().isSupportedType(event.dataType)) {
                    } catch (IOException ex) {
    @NotNull
                    event.data = info.keySet();
    private synchronized Path getTempFolder() {
        selection = (IStructuredSelection) viewer.getSelection();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import java.util.Map;
            // Start writing to stream and lock it
import org.jkiss.dbeaver.ui.UIUtils;
import java.lang.reflect.InvocationTargetException;
            Object nodeObject = null;
    private static final Log log = Log.getLog(NavigatorDragSourceListener.class);

                        .collect(Collectors.toList());
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private Map<DBNNode, NavigatorTransferInfo> collectNodesInfo(DragSourceEvent event) {
                        .toArray(String[]::new);

        final Map<DBNNode, NavigatorTransferInfo> info = new LinkedHashMap<>();
                tempFolder = Path.of(System.getProperty(StandardConstants.ENV_TMP_DIR));
                nodeObject = object;
                DBPDataSourceContainer object = ((DBNDataSource) nextSelected).getDataSourceContainer();
                        .map(NavigatorTransferInfo::createEditorInputData)
 * you may not use this file except in compliance with the License.
                    }
                }
import org.jkiss.dbeaver.utils.ContentUtils;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            if (!(nextSelected instanceof DBNNode node)) {
        } else if (DatabaseObjectTransfer.getInstance().isSupportedType(event.dataType)) {
        Path tmpFile = getTempFolder().resolve(CommonUtils.escapeFileName(fileName));
                    long streamSize = streamData.getStreamSize();
        }
            }
    private IStructuredSelection selection;
import java.io.IOException;
}
        this.viewer = viewer;
                    || FileTransfer.getInstance().isSupportedType(event.dataType))) {
                    nodeObject = tmpFile;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.navigator.DBNNode;
            });
public class NavigatorDragSourceListener implements DragSourceListener {
                        .filter(Objects::nonNull)
                    nodeName = tmpFile.toAbsolutePath().toString();
                log.error("Can't create new file" + tmpFile.toAbsolutePath(), e);

                    event.data = info.values().stream()
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        .filter(name -> Files.exists(Path.of(name)))


                } else if (FileTransfer.getInstance().isSupportedType(event.dataType)) {
import java.util.Collections;
                DBSObject object = ((DBNDatabaseNode) nextSelected).getObject();
                try {
                    log.error(e.getMessage());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                } else if (EditorInputTransfer.getInstance().isSupportedType(event.dataType)) {
        return tmpFile;
        setEmptyData(event);
        } else if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
            try {
                log.error(e);

                    continue;
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
                nodeName = DBUtils.getObjectFullName(object, DBPEvaluationContext.UI);
                String fileName = node.getNodeDisplayName();
                    event.data = info.values().stream()
import java.nio.file.Files;

        if (!Files.exists(tmpFile)) {
        return tempFolder;
    private void setEmptyData(DragSourceEvent event) {
import org.eclipse.ui.part.EditorInputTransfer;
    @Override
                        log.error("Error deleting temp file " + tmpFile.toAbsolutePath(), e);
                nodeName = object.getName();
    }
    private Path copyStreamToTempFile(DBNStreamData streamData, String fileName) throws InvocationTargetException, InterruptedException {
import org.jkiss.dbeaver.Log;
            } catch (IOException e) {
        for (Object nextSelected : selection) {
    }
    @Override
            }
                    Path tmpFile = copyStreamToTempFile(streamData, fileName);
