                    String tableName = entityElem.getAttribute(ATTR_NAME);
import org.jkiss.dbeaver.Log;
/*
 *
                                    } else if (bendpoint instanceof RelativeBendpoint) {
                        elementInfoMap.put(note, info);
                relInfos.add(relationLoadInfo);
            xml.endElement();

            allElements.addAll(diagram.getEntities());
        }

        // Set relations' bends
                            break;
                        xml.addAttribute(ATTR_FQ_NAME, ((DBPQualifiedObject)table).getFullyQualifiedName(DBPEvaluationContext.UI));
import org.eclipse.jface.dialogs.IDialogConstants;
            xml.addAttribute(ATTR_ORDER, allNodeFigures.indexOf(nodePart.getFigure()));
                    if (!CommonUtils.isEmpty(attrVis)) {
                    }
                final ERDEntity sourceEntity = diagram.getEntity(info.pkTable.entity);

        }
import org.jkiss.code.NotNull;
                    }
    public static void loadDiagram(DBRProgressMonitor monitor, Document document, DBPProject projectMeta, EntityDiagram diagram) throws DBException {
        final String objectId;
                    diagram.addVisualInfo(table, info.visualInfo);
        List<? extends IFigure> allNodeFigures = diagramPart == null ? new ArrayList<>() : diagramPart.getFigure().getChildren();
            for (ERDEntity erdEntity : diagram.getEntities()) {
import org.eclipse.jface.layout.GridDataFactory;
            for (String id : ids) {
        final Element notesElem = XMLUtils.getChildElement(diagramElem, TAG_NOTES);

        XMLBuilder xml = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING, !compact);
        // Prepare DS objects map
        if (relationsElem != null) {
                        } else {
                    <!ATTLIST entity id ID #REQUIRED
                    tableInfos.add(info);
    private static void saveColorAndOrder(List<?> allNodeFigures, XMLBuilder xml, NodePart nodePart) throws IOException {
                }

                Color defFgColor = nodePart instanceof NotePart ? ERDThemeSettings.instance.noteForeground : ERDThemeSettings.instance.entityNameForeground;
        final List<int[]> bends = new ArrayList<>();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        // Check version
                final String noteText = XMLUtils.getElementBody(noteElem);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        diagram.setNeedsAutoLayout(true);
                // Get connected datasource
            if (fgColor != null) {
            updateCompletion();
                        String locY = bendElem.getAttribute(ATTR_Y);
        xml.flush();
                    log.warn("Missing datasource ID");
                    EntityPart tablePart = diagramPart == null ? null : diagramPart.getEntityPart(erdEntity);
            monitor.beginTask("Parse notes", noteElemList.size());

                    visualInfo.initBounds = new Rectangle();
                xml.addAttribute(ATTR_FONT, SharedFonts.toString(nodePart.getCustomFont()));
                    List<String> path = new ArrayList<>();
                        if (child instanceof DBSObjectContainer) {
            final Table table = viewer.getTable();
        public ChooseDataSourcesDialog(@NotNull Shell shell, @NotNull DBPProject project, @NotNull String[] ids) {
            controller.addColumn("Original data source", null, SWT.LEFT, true, true, new ColumnLabelProvider() {
                        visualInfo.bgColor = tablePart.getCustomBackgroundColor();


import org.jkiss.utils.xml.XMLBuilder;
            this.note = note;
import org.eclipse.swt.graphics.Color;
import java.util.*;
            monitor.beginTask("Parse relations", relElemList.size());
                }
            }
import org.eclipse.draw2d.IFigure;
            });
import org.jkiss.utils.xml.XMLException;
                Collection<Element> entityElemList = XMLUtils.getChildElementList(dsElem, TAG_ENTITY);
                        AssociationPart associationPart = pkInfo.nodePart.getConnectionPart(rel, false);
    private static void loadNodeVisualInfo(Element entityElem, EntityDiagram.NodeVisualInfo visualInfo) {

                     name CDATA #REQUIRED
                        dataSourceContainer.connect(monitor, true, true);
                        projectMeta,
            visualInfo.zOrder = Integer.parseInt(orderStr);

            // Parse data source
        final String name;
                @Override
        private RelationLoadInfo(String name, String type, ElementLoadInfo pkTable, ElementLoadInfo fkTable)
            table.setHeaderVisible(true);
                    if (pkInfo.nodePart != null) {
                    """
        {
                    xml.endElement();
            xml.startElement(TAG_RELATIONS);
            monitor.done();
                if (leaf != null) {
        String borderWidth = entityElem.getAttribute(ATTR_BORDER_WIDTH);
                    String tableId = entityElem.getAttribute(ATTR_ID);
                     time CDATA #REQUIRED>
                        ElementSaveInfo info = new ElementSaveInfo(note, notePart, elementCounter++);
                    DBSObjectContainer container = rootContainer;
import org.eclipse.swt.events.SelectionListener;
                }
            controller.createColumns(false);
            table.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(600, SWT.DEFAULT).create());
import org.jkiss.dbeaver.model.app.DBPProject;
                    if (!(child instanceof DBSEntity table)) {
 */
            this.name = name;
                }
        final int objectId;
                if (info.pkTable.entity == null || info.fkTable.entity == null) {
                tableList.add(info.entity);
                    return;
                    ElementLoadInfo info = new ElementLoadInfo(noteId, null, note, visualInfo);
                if (pkTable == null || fkTable == null) {
                RelationLoadInfo relationLoadInfo = new RelationLoadInfo(relName, relType, pkTable, fkTable);
                        log.debug("Cannot find table '" + tableName + "' in '" + container.getName() + "'");
        final ElementLoadInfo pkTable;
    }
        String fontStr = entityElem.getAttribute(ATTR_FONT);
        }
                        return container.getName();
        final String diagramVersion = diagramElem.getAttribute(ATTR_VERSION);
import org.jkiss.utils.CommonUtils;
                xml.endElement();
                            }
                    }

            }
        List<RelationLoadInfo> relInfos = new ArrayList<>();
        String colorBg = entityElem.getAttribute(ATTR_COLOR_BG);
                    if (CommonUtils.isEmpty(locX) || CommonUtils.isEmpty(locY)) {
            this.entity = entity;
        xml.setBeautify(!compact);
            final TableViewer viewer = new TableViewer(composite, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
            int defBorderWidth = nodePart instanceof NotePart ? ERDUIConstants.DEFAULT_NOTE_BORDER_WIDTH : ERDUIConstants.DEFAULT_ENTITY_BORDER_WIDTH;
            this.containers = new LinkedHashMap<>(ids.length);
        String colorFg = entityElem.getAttribute(ATTR_COLOR_FG);
            UIUtils.createLabel(composite, "This diagram refers data sources that don't exist.\n\nPlease specify new data sources:");
    private static Map<DBPDataSourceContainer, DataSourceObjects> createDataSourceObjectMap(EntityDiagram diagram) {
            visualInfo.font = UIUtils.getSharedFonts().getFont(Display.getCurrent(), fontStr);

        if (!CommonUtils.isEmpty(borderWidth)) {
                    xml.addAttribute(ATTR_FK_REF, fkInfo.objectId);
                    if (pkInfo == null) {
        }
                    log.debug("PK (" + pkRefId + ") or FK (" + fkRefId +") table(s) not found for relation " + relName);
        }
import org.eclipse.swt.layout.GridData;
        if (!CommonUtils.isEmpty(isTransparent)) {
import org.jkiss.dbeaver.model.*;
            UIUtils.asyncExec(() -> UIUtils.packColumns(viewer.getTable(), true));
                        path.add(0, pathElem.getAttribute(ATTR_NAME));

                    final DBSEntity table = erdEntity.getObject();

                    <!DOCTYPE diagram [
                    continue;
        StringWriter out = new StringWriter(1000);
            xml.endElement();
                if (targetEntity == null) {
                    if (association instanceof ERDLogicalAssociation) {
                            xml.addAttribute(ATTR_X, noteBounds.x);
            }
                     name CDATA #IMPLIED
import org.jkiss.dbeaver.ui.DBeaverIcons;
                        return DBeaverIcons.getImage(container.getDriver().getIcon());
                     pk-ref IDREF #REQUIRED
            }

                    }

import org.jkiss.dbeaver.ui.controls.ListContentProvider;
                monitor.subTask("Load " + relName);
            for (ERDElement<?> element : allElements) {
    }
                                    if (bendpoint instanceof AbsoluteBendpoint) {
        int elementCounter = ERD_VERSION_1;
            this.objectId = objectId;
        }
                    new Class[]{DBPDataSourceContainer.class},
                DataSourceObjects desc = dsMap.computeIfAbsent(dsContainer, k -> new DataSourceObjects());
        final Element relationsElem = XMLUtils.getChildElement(diagramElem, TAG_RELATIONS);
    private static final Log log = Log.getLog(DiagramLoader.class);
    public static void load(DBRProgressMonitor monitor, DBPProject projectMeta, DiagramPart diagramPart, Reader reader)
        monitor.done();
                if (dataSourceContainer == null) {
 *
                    }
                for (Element entityElem : entityElemList) {
            visualInfo.transparent = CommonUtils.toBoolean(isTransparent);
        }
 */
                desc.entities.add(erdEntity);
import java.io.Reader;
        }

                        xml.addAttribute(ATTR_ALIAS, erdEntity.getAlias());
                }
                .filter(entry -> entry.getValue() == null)
                    String attrVis = entityElem.getAttribute(ATTR_ATTRIBUTE_VISIBILITY);
            }
                        continue;
        }


        }
                    continue;
            this.visualInfo = visualInfo;
            return composite;
        }
                    }
        String orderStr = entityElem.getAttribute(ATTR_ORDER);
            if (info.type.equals(ERDConstants.CONSTRAINT_LOGICAL_FK.getId())) {
                if (!(dataSource instanceof DBSObjectContainer)) {
            }
    private static class ChooseDataSourcesDialog extends BaseDialog {
    private static class ElementSaveInfo {
                    <!ELEMENT diagram (entities, relations, notes)>
import org.jkiss.code.Nullable;
                }
                    if (container != null) {
                    continue;
                    <!ELEMENT relation (bend*)>

            this.fkTable = fkTable;
            controller.addColumn("New data source", null, SWT.LEFT, true, true, new ColumnLabelProvider() {
        final Element entitiesElem = XMLUtils.getChildElement(diagramElem, TAG_ENTITIES);
            xml.addContent(
        final ERDNote note;
            table.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
                    <!ELEMENT data-source (entity*)>
                    }
    }
                    } catch (DBException e) {
                ElementLoadInfo fkTable = elementMap.get(fkRefId);
                    EntityDiagram.NodeVisualInfo visualInfo = new EntityDiagram.NodeVisualInfo();
                    tableInfos.add(info);
                final ERDEntity targetEntity = diagram.getEntity(info.fkTable.entity);
        final ERDElement element;
                    xml.addAttribute(ATTR_PK_REF, pkInfo.objectId);
                                }
                    return DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT);
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * limitations under the License.
                }
                        continue;
import org.jkiss.utils.xml.XMLUtils;
                        saveColorAndOrder(allNodeFigures, xml, tablePart);
                }
                String pkRefId = relElem.getAttribute(ATTR_PK_REF);
            final String[] nonExistingDataSourceIds = containers.entrySet().stream()
                    ]>
                // Parse entities
        // Fill entities
        }
        final NodePart nodePart;
                    }
                    } else {
                                    xml.addAttribute(ATTR_REF_NAME, referenceAttribute.getName());
    {

                    try {
                    String type = bendElem.getAttribute(ATTR_TYPE);
        String isTransparent = entityElem.getAttribute(ATTR_TRANSPARENT);

                    <!ATTLIST data-source id CDATA #REQUIRED>
        if (!CommonUtils.isEmpty(colorFg)) {
                // Load columns (present only in logical relations)
                    visualInfo.initBounds = new Rectangle(
                final ERDElement<?> sourceEntity = info.pkTable.entity != null ? diagram.getEntity(info.pkTable.entity) : info.pkTable.note;

        final Map<String, String> columns = new LinkedHashMap<>();
            }));
                    if (dialog.open() == IDialogConstants.OK_ID) {
            }
                    relationLoadInfo.columns.put(name, refName);
import org.eclipse.draw2d.AbsoluteBendpoint;
            throw new DBException("Diagram version not found");
        }
        }
        }
                    String locX = entityElem.getAttribute(ATTR_X);
                    // Save bends
                monitor.done();
 *

                                }
            if (bgColor != null) {
                }
                xml.endElement();
        return dsMap;
}
            this.element = element;

                    xml.addAttribute(ATTR_TYPE, association.getConstraintType().getId());
                        visualInfo.initBounds.y = Integer.parseInt(locY);
/**
                    }
                        xml.addAttribute(ATTR_ATTRIBUTE_VISIBILITY, erdEntity.getAttributeVisibility().name());
 * Entity diagram loader/saver
                // Load bends
                public Image getImage(Object element) {
                        if (!CommonUtils.isEmpty(locX) && !CommonUtils.isEmpty(locY)) {
                                        xml.addAttribute(ATTR_Y, bendpoint.getLocation().y);
        for (RelationLoadInfo info : relInfos) {
                    String refName = columnElem.getAttribute(ATTR_REF_NAME);
                    String locY = entityElem.getAttribute(ATTR_Y);
                }
                for (ERDNote note : diagram.getNotes()) {
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
                    xml.addAttribute(ATTR_NAME, table.getName());
                if (!dataSourceContainer.isConnected()) {
    private static class ElementLoadInfo {
                    xml.addText(note.getObject());
            Collection<Element> relElemList = XMLUtils.getChildElementList(relationsElem, TAG_RELATION);
        xml.endElement();
                }
                xml.addAttribute(ATTR_ID, dsContainer.getId());
                                    }
                            container = null;
        for (RelationLoadInfo info : relInfos) {
        }
                        }
                    root,
            int borderWidth = nodePart.getCustomBorderWidth();
        @Override
        Map<DBPDataSourceContainer, DataSourceObjects> dsMap = new IdentityHashMap<>();
            Collection<Element> noteElemList = XMLUtils.getChildElementList(notesElem, TAG_NOTE);
                    }
            });
                xml.startElement(TAG_DATA_SOURCE);
                                        xml.addAttribute(ATTR_Y, bendpoint.getLocation().y);
        Map<DBPDataSourceContainer, DataSourceObjects> dsMap = createDataSourceObjectMap(diagram);
                if (!CommonUtils.equalObjects(bgColor, defBgColor)) {
                    diagram.addErrorMessage("Datasource '" + dataSourceContainer.getName() + "' entities cannot be loaded - no entity container found");
                    final DBSObject child = container.getChild(monitor, tableName);
                    containers.put(id, ((DBNDataSource) leaf).getDataSourceContainer());
                    ElementLoadInfo info = new ElementLoadInfo(tableId, table, null, visualInfo);
                                log.warn("Error getting reference attribute", e);
                }
                            xml.addAttribute(ATTR_Y, noteBounds.y);
                    xml.startElement(TAG_ENTITY);
                if (CommonUtils.isEmpty(relName) || CommonUtils.isEmpty(pkRefId) || CommonUtils.isEmpty(fkRefId)) {
        final EntityDiagram.NodeVisualInfo visualInfo;

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
                    monitor.subTask("Connect to '" + dataSourceContainer.getName() + "'");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            Color bgColor = nodePart.getCustomBackgroundColor();
/*
        if (!CommonUtils.isEmpty(fontStr)) {
        private ElementLoadInfo(String objectId, DBSEntity entity, ERDNote note, EntityDiagram.NodeVisualInfo visualInfo)
import org.w3c.dom.Document;
            this.pkTable = pkTable;
            this.project = project;
                            break;
            this.ids = ids;
                final DBNNode leaf = DBWorkbench.getPlatformUI().selectObject(
                    }
        final Element diagramElem = document.getDocumentElement();
            this.nodePart = nodePart;
import org.eclipse.swt.widgets.*;
                    "Select new data source",
                @Override
            for (Element element : dataSourceElements) {
    }
                String locY = noteElem.getAttribute(ATTR_Y);
                    if (container != null) {
                    monitor.subTask("Load " + tableName);

                    if (notePart != null) {
                    if (container == null) {
                }
                // Notes

            allElements.addAll(diagram.getNotes());


                        final DBSObject child = container.getChild(monitor, conName);
            this.type = type;

            List<ERDElement<?>> allElements = new ArrayList<>();
import java.io.IOException;
    private static class RelationLoadInfo {
                    for (DBSObject parent = table.getParentObject(); parent != null && DBUtils.getPublicObjectContainer(parent) != dsContainer; parent = parent.getParentObject()) {

        if (nodePart != null) {
                    xml.addAttribute(ATTR_COLOR_FG, StringConverter.asString(fgColor.getRGB()));
                }

                }
                    );
                            xml.startElement(TAG_COLUMN);
        // Add logical relations
                                        xml.addAttribute(ATTR_X, bendpoint.getLocation().x);
                        xml.startElement(TAG_PATH);
                        xml.addAttribute(ATTR_ID, info.objectId);
                }
            }
                    xml.addAttribute(ATTR_COLOR_BG, StringConverter.asString(bgColor.getRGB()));
                String locX = noteElem.getAttribute(ATTR_X);
                            xml.addAttribute(ATTR_W, noteBounds.width);
        diagram.fillEntities(monitor, tableList, null);
        }
                @Override
                    <!ATTLIST diagram version CDATA #REQUIRED
                            } catch (DBException e) {
        }
                        UIUtils.getActiveWorkbenchWindow().getShell(),
                    xml.endElement();
                Color defBgColor = nodePart instanceof NotePart ? ERDThemeSettings.instance.noteBackground : ERDThemeSettings.instance.entityRegularBackground;
                """

                        }
            // Relations
        {
        List<ElementLoadInfo> tableInfos = new ArrayList<>();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                final DataSourceObjects desc = dsMap.get(dsContainer);
            if (!SharedFonts.equalFonts(nodePart.getCustomFont(), Display.getCurrent().getSystemFont())) {
                .toArray(String[]::new);
        if (!diagramVersion.equals(String.valueOf(ERD_VERSION_1))) {
import org.eclipse.draw2d.geometry.Rectangle;
 * See the License for the specific language governing permissions and
                    return (String) element;
                        xml.addAttribute(ATTR_NAME, parent.getName());
                    }
        }
                }
                            if (!CommonUtils.isEmpty(bendpoints)) {
                    }
                        nonExistingDataSourceIds
                }
            Color fgColor = nodePart.getCustomForegroundColor();
                }
                @Override
                    }
                    xml.startElement(TAG_RELATION);
        Map<String, ElementLoadInfo> elementMap = new HashMap<>();
                    elementMap.put(info.objectId, info);
        loadDiagram(monitor, document, projectMeta, diagram);
            final Map<String, DBPDataSourceContainer> containers = new LinkedHashMap<>();
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                                Integer.parseInt(locY)
 * You may obtain a copy of the License at
                        Rectangle noteBounds = notePart.getBounds();





 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.part.*;
                            xml.addAttribute(ATTR_NAME, column.getAttribute().getName());
                    ElementSaveInfo info = new ElementSaveInfo(erdEntity, tablePart, elementCounter++);
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                });

                    continue;
            final Composite composite = super.createDialogArea(parent);

                    final DBPDataSourceContainer container = containers.get((String) element);
            }
            visualInfo.fgColor = UIUtils.getSharedColor(colorFg);
                public String getText(Object element) {
                    new Class[]{DBPDataSourceContainer.class},
                    for (String conName : path) {
 * you may not use this file except in compliance with the License.
                    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    <!ATTLIST relation name CDATA #REQUIRED
            }
                diagram.addInitRelationBends(sourceEntity, targetEntity, info.name, info.bends);

                        diagram.addErrorMessage("Can't connect to '" + dataSourceContainer.getName() + "': " + e.getMessage());
                    if (association instanceof DBPQualifiedObject) {
                    xml.addAttribute(ATTR_NAME, association.getName());
            // Parse relations
                ERDNote note = new ERDNote(noteText);

            }
import org.w3c.dom.Element;
                xml.addAttribute(ATTR_BORDER_WIDTH, borderWidth);
                            } );
            for (Element dsElem : dataSourceElements) {
        if (diagram != null) {

                                DBSEntityAttribute referenceAttribute = DBUtils.getReferenceAttribute(monitor, association, column.getAttribute(), false);

                containers.put(id, projectMeta.getDataSourceRegistry().getDataSource(id));
                .map(Map.Entry::getKey)
 * DBeaver - Universal Database Manager

                    }
                                for (Bendpoint bendpoint : bendpoints) {
import org.jkiss.dbeaver.DBException;
                            container = (DBSObjectContainer) child;
                    }
        final DBSEntity entity;
            this.objectId = objectId;
        if (CommonUtils.isEmpty(diagramVersion)) {

                }
import org.eclipse.draw2d.RelativeBendpoint;

                xml.addAttribute(ATTR_TRANSPARENT, true);
                EntityDiagram.NodeVisualInfo visualInfo = new EntityDiagram.NodeVisualInfo();
        throws XMLException, DBException
                    for (Element pathElem : XMLUtils.getChildElementList(entityElem, TAG_PATH)) {
                        }




                        log.error("Cannot find FK table '" + rel.getSourceEntity().getName() + "' in info map");
        protected Composite createDialogArea(Composite parent) {
                diagram.addVisualInfo(note, visualInfo);

                if (!CommonUtils.isEmpty(locX) && !CommonUtils.isEmpty(locY) && !CommonUtils.isEmpty(locW) && !CommonUtils.isEmpty(locH)) {
                            diagram.addErrorMessage("Object '" + child.getName() + "' is not a container");
        if (!CommonUtils.isEmpty(colorBg)) {
        }
                    xml.startElement(TAG_NOTE);
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.SharedFonts;
    }
                    xml.addAttribute(ATTR_ID, info.objectId);
import org.eclipse.swt.SWT;
                if (CommonUtils.isEmpty(id)) {

        private final Map<String, DBPDataSourceContainer> containers;
                    }
    private static class DataSourceObjects {
        private final String[] ids;
                    if (tablePart != null) {

                    updateCompletion();
                                        xml.addAttribute(ATTR_TYPE, BEND_RELATIVE);
                    null,
 * @author Serge Rider
                     fk-ref IDREF #REQUIRED>
        }
        for (ElementLoadInfo info : tableInfos) {
                    <!ELEMENT relations (relation*)>

            UIUtils.asyncExec(() -> {
                    getShell(),
                    if (!BEND_RELATIVE.equals(type)) {
                    elementInfoMap.put(erdEntity, info);
                        String locX = bendElem.getAttribute(ATTR_X);
            composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
                for (ERDAssociation rel : element.getReferences()) {
                                        xml.addAttribute(ATTR_TYPE, BEND_ABSOLUTE);
                UIUtils.syncExec(() -> {

                    if (fkInfo == null) {
                }
            for (Element noteElem : noteElemList) {
                        log.error("Cannot find PK table '" + rel.getTargetEntity().getName() + "' in info map");
        }
                        visualInfo.initBounds = tablePart.getBounds();
package org.jkiss.dbeaver.ui.editors.erd.model;
            if (borderWidth != defBorderWidth) {
                            final List<Bendpoint> bendpoints = associationPart.getBendpoints();
                    }
                        return "<unspecified>";
                        xml.addAttribute(ATTR_X, visualInfo.initBounds.x);
                    xml.endElement();
            // Parse relations
                if (!CommonUtils.equalObjects(fgColor, defFgColor)) {
                monitor.worked(1);
                    NotePart notePart = diagramPart == null ? null : diagramPart.getNotePart(note);
                            container = null;
import java.io.StringWriter;
                        xml.endElement();

import org.jkiss.dbeaver.model.erd.*;
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
                    continue;
    {
                    ElementSaveInfo pkInfo = elementInfoMap.get(rel.getTargetEntity());
                DBSObjectContainer rootContainer = (DBSObjectContainer)dataSource;
                }
                        visualInfo = new EntityDiagram.NodeVisualInfo();
        xml.startElement(TAG_DIAGRAM);
                if (sourceEntity != null && targetEntity != null) {
                        xml.addAttribute(ATTR_FQ_NAME, ((DBPQualifiedObject) association).getFullyQualifiedName(DBPEvaluationContext.UI));

        // Load notes
 * Unless required by applicable law or agreed to in writing, software
                        }
        final String type;
            xml.addAttribute(ATTR_NAME, diagram.getName());
        }
                );
                if (sourceEntity == null) {
                String locW = noteElem.getAttribute(ATTR_W);
            }
                    elementMap.put(info.objectId, info);
                    <!ELEMENT entity (path*)>
                final DBPDataSourceContainer dsContainer = erdEntity.getObject().getDataSource().getContainer();
        final ElementLoadInfo fkTable;
                    final ChooseDataSourcesDialog dialog = new ChooseDataSourcesDialog(
                containers.put(id, null);
                    UIUtils.syncExec(() -> loadNodeVisualInfo(entityElem, visualInfo));
                    } else {
                    log.warn("Source table " + info.pkTable.entity.getName() + " not found");

        }


                        visualInfo.attributeVisibility = ERDAttributeVisibility.valueOf(attrVis);
                    log.warn("Datasource '" + dsId + "' not found");
                        saveColorAndOrder(allNodeFigures, xml, notePart);
        Map<ERDElement<?>, ElementSaveInfo> elementInfoMap = new IdentityHashMap<>();
                String dsId = dsElem.getAttribute(ATTR_ID);
                public Image getImage(Object element) {
        private ElementSaveInfo(ERDElement element, NodePart nodePart, int objectId)
                    new Class[]{DBPDataSourceContainer.class}
            if (!CommonUtils.isEmpty(info.bends)) {

                            xml.endElement();
                }
                public String getText(Object element) {
            );
    public static String serializeDiagram(DBRProgressMonitor monitor, @Nullable DiagramPart diagramPart, final EntityDiagram diagram, boolean verbose, boolean compact)
                        visualInfo = diagram.getVisualInfo(erdEntity.getObject());
        throws IOException
                String relName = relElem.getAttribute(ATTR_NAME);
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (diagram != null) {
                    continue;
                        if (noteBounds != null) {
            xml.addAttribute(ATTR_TIME, RuntimeUtils.getCurrentTimeStamp());
                                        xml.addAttribute(ATTR_X, bendpoint.getLocation().x);
                        log.debug(e);
                String fkRefId = relElem.getAttribute(ATTR_FK_REF);
                        // Save columns
                    monitor.worked(1);
    }
                final Button button = getButton(IDialogConstants.OK_ID);
            }
                for (Element columnElem : XMLUtils.getChildElementList(relElem, TAG_COLUMN)) {
                    String name = columnElem.getAttribute(ATTR_NAME);
            }
                    if (erdEntity.getAttributeVisibility() != null) {
import org.eclipse.draw2d.Bendpoint;
            if (nonExistingDataSourceIds.length > 0) {

            // Collect data sources
            for (Element relElem : relElemList) {
            if (!CommonUtils.isEmpty(diagram.getNotes())) {
            visualInfo.bgColor = UIUtils.getSharedColor(colorBg);
                                Integer.parseInt(locX),
                            }
public class DiagramLoader extends ERDPersistedState {
            }
                    if (visualInfo != null && visualInfo.initBounds != null) {
        if (diagram != null) {
        private void updateCompletion() {
                final DBPDataSourceContainer dataSourceContainer = containers.get(dsId);

                        continue;
        if (!CommonUtils.isEmpty(orderStr)) {
            xml.startElement(TAG_ENTITIES);
                        containers.putAll(dialog.containers);
                        if (associationPart != null) {

                                if (referenceAttribute != null) {
        List<DBSEntity> tableList = new ArrayList<>();
                                    xml.startElement(TAG_BEND);
                    new ERDAssociation(targetEntity, sourceEntity, false);
                String noteId = noteElem.getAttribute(ATTR_ID);
                    if (!CommonUtils.isEmpty(erdEntity.getAlias())) {
            visualInfo.borderWidth = CommonUtils.toInt(borderWidth);

                    }
        if (entitiesElem != null) {

                final DBPDataSource dataSource = dataSourceContainer.getDataSource();
 * distributed under the License is distributed on an "AS IS" BASIS,
                        }

                diagram.addNote(note, false);
                if (CommonUtils.isEmpty(dsId)) {
        List<ERDEntity> entities = new ArrayList<>();
                if (!CommonUtils.isEmpty(noteId)) {
                String locH = noteElem.getAttribute(ATTR_H);
    }
                xml.startElement(TAG_NOTES);
        {
            // Check for missing data sources in the project

                            xml.addAttribute(ATTR_H, noteBounds.height);
                    button.setEnabled(!containers.containsValue(null));
                    if (table instanceof DBPQualifiedObject) {
        return out.toString();
        monitor.beginTask("Parse diagram", 1);
                     fq-name CDATA #REQUIRED>
                    EntityDiagram.NodeVisualInfo visualInfo;
            final ViewerColumnController<Object, Object> controller = new ViewerColumnController<>(ChooseDataSourcesDialog.class.getName(), viewer);
        private final DBPProject project;
        }

        xml.addAttribute(ATTR_VERSION, ERD_VERSION_1);
                        if (child == null) {
        // Save as XML
        final EntityDiagram diagram = diagramPart.getDiagram();
                if (button != null) {

import org.eclipse.jface.viewers.TableViewer;
    }
                    continue;
                            try {
                for (ERDEntity erdEntity : desc.entities) {
        if (compact) {
                        return DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT);
                String relType = relElem.getAttribute(ATTR_TYPE);
            if (nodePart.getCustomTransparency()) {
import org.jkiss.dbeaver.model.struct.*;
 */
                    continue;
 *     http://www.apache.org/licenses/LICENSE-2.0

            }
                    log.warn("Target table " + info.pkTable.entity.getName() + " not found");
                loadNodeVisualInfo(noteElem, visualInfo);
                final String id = ids[table.getSelectionIndex()];

            for (DBPDataSourceContainer dsContainer : dsMap.keySet()) {
                    } else {
                    }
                final String id = element.getAttribute(ATTR_ID);
        if (verbose) {

                        xml.addAttribute(ATTR_Y, visualInfo.initBounds.y);

            viewer.setInput(ids);
                }

import java.util.List;
            final List<Element> dataSourceElements = XMLUtils.getChildElementList(entitiesElem, TAG_DATA_SOURCE);
        final Document document = XMLUtils.parseDocument(reader);
import org.eclipse.jface.resource.StringConverter;
                    log.warn("Missing relation ID");
            super(shell, "Missing data sources", null);

            if (info.entity != null) {
import org.eclipse.jface.viewers.ColumnLabelProvider;

            }
                for (Element bendElem : XMLUtils.getChildElementList(relElem, TAG_BEND)) {
                        continue;
            throw new DBException("Unsupported diagram version: " + diagramVersion);
                    }
                if (table.getSelectionIndex() < 0) {
                        continue;
                        }
                        for (DBSEntityAttributeRef column : ((ERDLogicalAssociation) association).getAttributeReferences(new VoidProgressMonitor())) {
                final ERDElement<?> targetEntity = info.fkTable.entity != null ? diagram.getEntity(info.fkTable.entity) : info.fkTable.note;
                }
        if (notesElem != null) {
            }
                    ElementSaveInfo fkInfo = elementInfoMap.get(rel.getSourceEntity());
        }
                    final DBPDataSourceContainer container = containers.get((String) element);
                                    xml.endElement();
                }
                final DBNNode root = project.getNavigatorModel().getRoot().getProjectNode(project);
                    continue;
                    viewer.refresh();
                    DBSEntityAssociation association = rel.getObject();
                    }
                        visualInfo.initBounds.x = Integer.parseInt(locX);
                        diagram.setDirty(true);
                    } else {
                }
                    <!ELEMENT entities (data-source*)>

                diagram.addInitRelationBends(sourceEntity, targetEntity, info.name, info.bends);
 * Created on Jul 13, 2004
                            relationLoadInfo.bends.add(new int[] {
import org.eclipse.swt.graphics.Image;
                        Integer.parseInt(locX), Integer.parseInt(locY), Integer.parseInt(locW), Integer.parseInt(locH));
                     fq-name CDATA #REQUIRED
            });
    }
            viewer.setContentProvider(new ListContentProvider());
import org.jkiss.dbeaver.model.navigator.DBNNode;
                monitor.beginTask("Parse entities", entityElemList.size());
                    // Logical connection with notes or something
                }
    }
                ElementLoadInfo pkTable = elementMap.get(pkRefId);
                            diagram.addErrorMessage("Container '" + conName + "' not found within '" + container.getName() + "'. Skip table '" + tableName + "'.");
