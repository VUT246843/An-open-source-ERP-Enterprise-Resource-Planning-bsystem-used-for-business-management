                {
                xml.startElement("y:Fill");
    private static String getHtmlColor(Color color) {
            xml.startElement("y:LineStyle");
                xml.endElement();
                    xml.endElement();
public class ERDExportGraphML implements ERDExportFormatHandler
                        xml.addAttribute("transparent", "false");
                // Fill
                    xml.addAttribute("hasLineColor", "false");
        for (ERDEntityAttribute attr : entity.getAttributes()) {
                    xml.endElement();
        final EntityFigure entityFigure = entityPart.getFigure();
    }
            xml.addAttribute("width", "1.0");
                xml.addAttribute("height", partBounds.height);
                        xml.addAttribute("x", noteBounds.x());
                xml.addAttribute("xmlns:y", "http://www.yworks.com/xml/graphml");
                    xml.addAttribute("modelPosition", "t");
                        xml.addAttribute("height", noteBounds.height);
        for (ERDAssociation association : node.getAssociations()) {

            xml.endElement();
import java.io.OutputStreamWriter;

                xml.addAttribute("xmlns:java", "http://www.yworks.com/xml/yfiles-common/1.0/java");
                    .collect(Collectors.toList());
                    xml.addAttribute("fontFamily", "Courier");
            xml.startElement("y:Path"); // sx="0.0" sy="0.0" tx="0.0" ty="0.0"/>
                    xml.addAttribute("height", attrsBounds.height);
            xml.startElement("data");
                    Rectangle nameBounds = entityFigure.getNameLabel().getBounds();
            xml.addAttribute("sx", 0.0);
                        xml.addAttribute("modelPosition", "t");
                    xml.addAttribute("textColor", "#FFFFFF");
                        xml.addAttribute("type", "line");
                        xml.addAttribute("width", "1.0");
            if (attributeLength > maxLength) {

                        exportEdge(index, element, diagramPart.getEntityPart((ERDEntity) element), associations, xml);
                }
            xml.endElement();
                    }
        xml.endElement();
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }

                    xml.addAttribute("x", 0);
        }

                    xml.addAttribute("visible", "true");
    private static String getHexColor(int value) {
                        xml.addAttribute("iconTextGap", "4");
            xml.addAttribute("target", "circle");
                    .concat(
                    xml.addAttribute("height", nameBounds.height);
            int attributeLength = (ERDUIUtils.getFullAttributeLabel(diagram, attr, true)).length();
    }
            // Graph data
                        xml.addAttribute("fontFamily", "Courier");
            xml.addAttribute("source", sourceStyle);
            maxLength = 0;
 * You may obtain a copy of the License at

                        diagram.getNotes().stream().map(x -> new Pair<>(x, diagram.getVisualInfo(x))))
                        attrsString.append(ERDUIUtils.getFullAttributeLabel(diagram, attr, true));
                    xml.addAttribute("backgroundColor", getHtmlColor(entityFigure.getNameLabel().getBackgroundColor()));
    private static final Log log = Log.getLog(ERDExportGraphML.class);
                    xml.endElement();
                    {
        final String noteId = "note" + index;
                    .map(Pair::getFirst)
                        xml.addAttribute("fontStyle", "plain");
        }
            xml.startElement("y:Arrows");
                    }
                continue;
                    xml.addAttribute("autoSizePolicy", "content");
                    xml.addAttribute("hasLineColor", "false");
        if (maxLength < 18) { // basic table size is enough
                    xml.addAttribute("width", attrsBounds.width);
            }
                xml.endElement();
                    xml.addAttribute("configuration", "com.yworks.entityRelationship.label.name");
 *
                xml.endElement();
            xml.startElement("data");
                        xml.addText(note.getObject());

        final Rectangle noteBounds = notePart.getBounds();

                    xml.addAttribute("fontFamily", "Courier");
    private static final int fontSize = 12;

                xml.addAttribute("width", partBounds.width + getExtraTableLength(diagram, entity));
                xml.startElement("key");
                xml.addAttribute("id", "nodegraph");
                xml.addAttribute("width", "1.0");
        }
            }
                for (int index = 0; index < elements.size(); index++) {
import org.jkiss.dbeaver.ui.editors.erd.part.*;
            maxLength = entity.getName().length();
import java.util.Comparator;
                    xml.addAttribute("y", 31.66796875);
                xml.addAttribute("configuration", "com.yworks.entityRelationship.big_entity");
            xml.addAttribute("type", !identifying || association.isLogical() ? "dashed" : "line");
                    xml.addAttribute("width", nameBounds.width);
                        xml.addAttribute("color", getHtmlColor(noteFigure.getForegroundColor()));
import org.jkiss.utils.xml.XMLBuilder;
                xml.addAttribute("x", partBounds.x());

import java.util.List;
                    xml.endElement();
                        xml.addAttribute("width", noteBounds.width);
                    } else {
            xml.addAttribute("tx", 0.0);
                    {
            xml.addAttribute("smoothed", "false");
        } catch (Exception e) {
        }
        return "#" + getHexColor(color.getRed()) + getHexColor(color.getGreen()) + getHexColor(color.getBlue());
        if (entity.getName().length() > maxLength){

                xml.addAttribute("xmlns:yed", "http://www.yworks.com/xml/yed/3");
                }
                xml.addAttribute("y", partBounds.y());
                xml.addAttribute("xmlns:sys", "http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0");
                    xml.endElement();
                    xml.addAttribute("alignment", "center");
                        diagram.getEntities().stream().map(x -> new Pair<>(x, diagram.getVisualInfo(x.getObject()))),
                    } else {

                    if (element instanceof ERDEntity) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    final ERDElement<?> element = elements.get(index);
                    xml.addAttribute("iconTextGap", "4");
                    xml.addAttribute("fontStyle", "plain");
    }

                        xml.addAttribute("hasLineColor", "false");

            xml.addAttribute("key", "edgegraph");
                        xml.addAttribute("backgroundColor", getHtmlColor(noteFigure.getBackgroundColor()));
                        log.debug("Unsupported ERD element: " + element);
import org.jkiss.dbeaver.model.erd.*;
                xml.endElement();
                //xml.addAttribute("color2", partBounds.width);
import org.eclipse.draw2d.geometry.Rectangle;
            }

            }

            xml.startElement("y:BendStyle");
    }
import java.util.HashMap;
                xml.startElement("y:Geometry");
                    } else if (element instanceof ERDNote) {
                xml.addAttribute("edgedefault", "directed");
                    xml.addAttribute("fontStyle", "plain");
                    xml.addAttribute("modelName", "custom");
            xml.endElement();
                    xml.addAttribute("horizontalTextPosition", "center");
                xml.startElement("y:ShapeNode");

                }
                    StringBuilder attrsString = new StringBuilder();
    @Override
                            attrsString.append("\n");

                    for (ERDEntityAttribute attr : entity.getAttributes()) {
                // A list of diagram elements sorted according to their z-order
                        xml.addAttribute("textColor", getHtmlColor(noteFigure.getForegroundColor()));
                xml.addAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
                        xml.addAttribute("fontSize", fontSize);

                    xml.addAttribute("modelPosition", "t");
                xml.addAttribute("x", bp.getLocation().x);
                    xml.endElement();
                xml.addAttribute("xsi:schemaLocation", "http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd");
                xml.addAttribute("id", "G");
                // Geometry
import org.jkiss.dbeaver.Log;
                osw.flush();
                    xml.addAttribute("configuration", "com.yworks.entityRelationship.label.attributes");
    private static void exportEdge(int index, ERDElement<?> node, NodePart nodePart, Map<ERDElement<?>, String> associations, XMLBuilder xml) throws IOException {
            {
                        xml.addAttribute("autoSizePolicy", "content");
import org.eclipse.swt.graphics.Color;

                xml.setBeautify(true);
                xml.endElement();
        int associationIndex = 0;
            xml.endElement();

/**

                    }
                    xml.startElement("y:BorderStyle");
                    AttributeListFigure columnsFigure = entityFigure.getColumnsFigure();

            xml.addAttribute("id", noteId);
                // Border
                xml.flush();

            xml.endElement();
 */

                xml.endElement();
        xml.addAttribute("id", entityId);
                        log.debug("Unsupported ERD element: " + element);
                xml.addAttribute("yfiles.type", "nodegraphics");
                    xml.startElement("y:ErdAttributesNodeLabelModel");
 * DBeaver - Universal Database Manager
            xml.addAttribute("id", "edge" + index + "-" + (associationIndex++));
                xml.addAttribute("id", "edgegraph");
                    xml.endElement();
                xml.addAttribute("xmlns", "http://graphml.graphdrawing.org/xmlns");
                xml.addAttribute("yfiles.type", "edgegraphics");
                    xml.startElement("y:ModelParameter");
 */
import java.io.File;
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
                xml.startElement("y:Point");
import org.eclipse.draw2d.IFigure;
                    }
                    xml.startElement("y:Geometry");

            DBWorkbench.getPlatformUI().showError("Save ERD as GraphML", null, e);
                xml.addAttribute("for", "node");
        }
{
                    xml.addAttribute("alignment", "left");
                    xml.addAttribute("iconTextGap", "4");
        int maxLength = 0;
                xml.endElement();
            xml.endElement();
                        }
                    xml.addAttribute("visible", "true");

                {
                }
            String sourceStyle = !identifying ? "white_diamond" : "none";
                    xml.startElement("y:NodeLabel");
            }

                    // Entity Name
        {

    public void exportDiagram(EntityDiagram diagram, IFigure figure, DiagramPart diagramPart, File targetFile) {
                final Map<ERDElement<?>, String> associations = new HashMap<>();

                xml.addAttribute("for", "edge");

                        xml.addAttribute("alignment", "left");

                for (int index = 0; index < elements.size(); index++) {
 * See the License for the specific language governing permissions and
                // Export edges using collected associations
/*
                    xml.addAttribute("modelName", "internal");
import java.io.FileOutputStream;
        String hex = Integer.toHexString(value).toUpperCase();
                    {
        }

        return (maxLength * (fontSize * 0.12));
    private static double getExtraTableLength(EntityDiagram diagram, ERDEntity entity) {
package org.jkiss.dbeaver.ui.editors.erd.export;
        associations.put(entity, entityId);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        xml.addAttribute("visible", "true");
                xml.addAttribute("key", "nodegraph");
                    }
 * GraphML exporter
import org.jkiss.dbeaver.ui.editors.erd.ERDUIUtils;
                    xml.addText(entity.getName());
            xml.addAttribute("target", associations.get(association.getTargetEntity()));
                    xml.addAttribute("fontSize", fontSize);

            if (associationPart == null) {
 * Unless required by applicable law or agreed to in writing, software
                xml.endElement();
import org.jkiss.dbeaver.ui.editors.erd.figures.AttributeListFigure;
                XMLBuilder xml = new XMLBuilder(osw, GeneralUtils.UTF8_ENCODING);
    private static void exportNote(int index, ERDNote note, NotePart notePart, Map<ERDElement<?>, String> associations, XMLBuilder xml) throws IOException {
            xml.addAttribute("key", "nodegraph");
                        xml.addAttribute("y", noteBounds.y());
        final String entityId = "entity" + index;
                    final ERDElement<?> element = elements.get(index);
                xml.addAttribute("type", "line");
                log.debug("Association part not found");
 *
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
        final IFigure noteFigure = notePart.getFigure();
                    xml.startElement("y:NodeLabel");
            }
                xml.startElement("y:GenericNode");
            try (final OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(targetFile), GeneralUtils.UTF8_CHARSET)) {
                    xml.addAttribute("autoSizePolicy", "content");
                    xml.addAttribute("horizontalTextPosition", "center");
                        xml.addAttribute("modelName", "custom");

                    xml.addAttribute("x", 2); //numbers from yEd Graph Editor
import java.util.stream.Stream;
                        exportEntity(index, (ERDEntity) element, diagramPart.getEntityPart((ERDEntity) element), diagram, associations, xml);
                    if (element instanceof ERDEntity) {
                        xml.addAttribute("x", 2);
                        xml.addAttribute("y", 2);
                        xml.addAttribute("color", getHtmlColor(noteFigure.getBackgroundColor()));
    private static void exportEntity(int index, ERDEntity entity, EntityPart entityPart, EntityDiagram diagram, Map<ERDElement<?>, String> associations, XMLBuilder xml) throws IOException {
                    .sorted(Comparator.comparing(x -> x.getSecond() == null ? 0 : x.getSecond().zOrder))
                    xml.startElement("y:Fill");
 *
import java.util.Map;
        try {
                xml.addAttribute("transparent", "false");
                    xml.addText(attrsString.toString());
                    Rectangle attrsBounds = columnsFigure.getBounds();
            xml.endElement();
import org.jkiss.utils.Pair;
                    // Attributes
                xml.addAttribute("color", getHtmlColor(entityFigure.getForegroundColor()));

import org.eclipse.draw2d.Bendpoint;
                xml.addAttribute("y", bp.getLocation().y);

            xml.addAttribute("sy", 0.0);
            xml.startElement("edge");

        xml.startElement("node");


                        exportNote(index, (ERDNote) element, diagramPart.getNotePart((ERDNote) element), associations, xml);
        xml.startElement("node");
 * limitations under the License.
            xml.addAttribute("color", "#000000");
                        if (attrsString.length() > 0) {
}

                xml.addAttribute("xmlns:x", "http://www.yworks.com/xml/yfiles-common/markup/2.0");

        return hex.length() < 2 ? "0" + hex : hex;
import java.io.IOException;
                    xml.addAttribute("y", 4);
                    xml.startElement("y:ErdAttributesNodeLabelModelParameter");

                    xml.endElement();

 * you may not use this file except in compliance with the License.
                        exportEdge(index, element, diagramPart.getNotePart((ERDNote) element), associations, xml);

                xml.startElement("graph");
                    xml.endElement();
                    xml.addAttribute("fontSize", fontSize);

                // Generic node
            xml.addAttribute("ty", 0.0);
            {

                        xml.addAttribute("height", noteBounds.height);
            xml.endElement();
                final List<ERDElement<?>> elements = Stream
                xml.startElement("key");
                xml.addAttribute("color", getHtmlColor(entityFigure.getBackgroundColor()));
        final Rectangle partBounds = entityPart.getBounds();

                // Export elements and collect their associations
                    xml.startElement("y:NodeLabel");
            xml.startElement("data");
            AssociationPart associationPart = nodePart.getConnectionPart(association, true);
            xml.startElement("y:PolyLineEdge");

 * Copyright (C) 2010-2025 DBeaver Corp and others
                maxLength = attributeLength;
                    xml.endElement();
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        xml.endElement();

                    } else if (element instanceof ERDNote) {


            xml.endElement();
                xml.endElement();

                    xml.addAttribute("backgroundColor", getHtmlColor(columnsFigure.getBackgroundColor()));
                xml.startElement("y:BorderStyle");
        associations.put(note, noteId);
                        xml.addAttribute("width", noteBounds.width);

        // node
                xml.endElement();

        {
            for (Bendpoint bp : associationPart.getBendpoints()) {
                }
                    }
                    xml.addAttribute("textColor", getHtmlColor(columnsFigure.getForegroundColor()));
                {
                    {
            xml.addAttribute("source", associations.get(node));
                xml.startElement("graphml");
        }
import java.util.stream.Collectors;
            boolean identifying = ERDUtils.isIdentifyingAssociation(association);
import org.jkiss.dbeaver.ui.editors.erd.figures.EntityFigure;

                    xml.startElement("y:LabelModel");
    }
