        xml.addAttribute("cellspacing", 0);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (showOnlyDifferences && !line.hasDifference) {
        }

                        xml.endElement();
        this.xml = new XMLBuilder(outputStream, GeneralUtils.UTF8_ENCODING, true);
        xml.addText(styles.toString(), false);

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            xml.endElement();
                            break;
                        CompareReportLine prevNode = reportLines.get(k);
            xml.addText(node.getNodeFullName());
                            differs = true;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.utils.GeneralUtils;
            boolean onlyStructure = line.structure instanceof DBNDatabaseFolder && !line.hasDifference;
        styles.append(".missing {color:red;} .differs {color:blue;}"); //visibility!
import org.jkiss.utils.CommonUtils;
        xml.endElement();
                        if (reportProperty.values[k] != null) {
                    } else {
            }
                continue;
    {
                            prevNode.hasDifference = true;

 * limitations under the License.
                    xml.startElement("tr");

            xml.endElement();
                xml.endElement();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        }
package org.jkiss.dbeaver.tools.compare.simple;
        xml.endElement();
                    boolean hasValue = false;
        this.report = report;
                    boolean differs = false;
        xml.startElement("tr");
                if (reportLines.get(i).hasDifference) {
import org.jkiss.utils.HttpConstants;
                            hasValue = true;
        int objectCount = report.getNodes().size();
                    if (showOnlyDifferences && !differs) {
                        xml.startElement("td");
            xml.startElement("td");
            xml.addAttribute("valign", "top");
    private void renderBody(DBRProgressMonitor monitor) throws IOException
                        xml.addText(line.nodes[k].getName());
                            stringValue = reportProperty.values[k].toString();
    }
            if (onlyStructure && (i >= reportLinesSize - 1 || reportLines.get(i + 1).depth <= line.depth)) {
        styles.append("td,th {word-break: break-word; max-width: 0; white-space: normal !important;}");
        xml.startElement("head");
                        String stringValue = "";
 * Licensed under the Apache License, Version 2.0 (the "License");
    private XMLBuilder xml;
        xml.addText("" + reportLines.size() + " objects compared");
                    for (int k = i - 1; k >= 0; k--) {
                                firstValue = value;
                    xml.addAttribute("valign", "top");
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (DBNDatabaseNode node : report.getNodes()) {
    private CompareObjectsSettings settings;
                            if (prevNode.hasDifference) {
    {
                    xml.startElement("td");
        // Table footer
                        }
                    }
        xml.startElement("html");
 */
                    }
                    }
        boolean showOnlyDifferences = settings.isShowOnlyDifferences();
                    Object firstValue = null;
    {

        }
                        if (line.nodes[k] == null) {
            List<CompareReportLine> reportLines = report.getReportLines();
                    }

    }
                }
        this.xml.flush();
        // Table body
        styles.append(".object td,th {border-top:solid 1px; border-right:solid 1px; border-color: black; white-space:nowrap;} ");
 *
        xml.endElement();
        //styles.append(".missing {color:red;} .differs {color:red;} ");


        xml.addContent(
        xml.endElement();
        xml.endElement();
                for (int k = 0; k < objectCount; k++) {

//        styles.append(".property:first-child {border:none; } ");
                        xml.addText("N/A");
        xml.addAttribute("http-equiv", HttpConstants.HEADER_CONTENT_TYPE);

            }
        List<CompareReportLine> reportLines = report.getReportLines();
        StringBuilder styles = new StringBuilder();
                            if (firstValue == null) {
                        } else {
            "     PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n" +
public class CompareReportRenderer {
        styles.append("td:hover { background-color: #f2f2f2;}");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        //xml.addAttribute("border", "1");
    }

        xml.startElement("body");
        styles.append("table {font-family:\"Lucida Sans Unicode\", \"Lucida Grande\", Sans-Serif;font-size:12px;text-align:left;} ");
                        }
                        xml.addAttribute("class", "missing");
        renderBody(monitor);

            "<!DOCTYPE html \n" +

 * See the License for the specific language governing permissions and
        for (CompareReportLine line : report.getReportLines()) {
        xml.addText("Structure");
                    xml.endElement();
/*
        this.xml.setBeautify(true);

                        }
        renderHeader();
        for (int i = 0; i < reportLinesSize; i++) {
                            xml.addText("&nbsp;", false);
                    if (line.nodes[k] == null) {
 *
        int reportLinesSize = reportLines.size();
                continue;
                    }
                        if (value != null) {
import org.jkiss.utils.xml.XMLBuilder;
        xml.startElement("td");
            // Skip empty folders
        xml.endElement();
        xml.addAttribute("class", "object");
 * Unless required by applicable law or agreed to in writing, software
        maxLevel++;
            // Mark differences on tree nodes
        xml.startElement("table");
        xml.startElement("tr");
                for (CompareReportProperty reportProperty : line.properties) {
                    xml.endElement();
       //For readability, and avoiding bovine view
            monitor.worked(1);
            if (onlyStructure) {
 * DBeaver - Universal Database Manager
            }
        xml.addAttribute("colspan", report.getNodes().size() + 1);
                        continue;
        styles.append(".struct {border-top:none; !important } ");
}
    private void renderHeader() throws IOException
        for (int i = 1; i <= maxLevel; i++) {
        int maxLevel = 0;
            xml.addText(line.structure.getNodeType());

        xml.endElement();
                        Object value = reportProperty.values[k];
                }
                        }
                        }
                            }
        if (settings.isShowOnlyDifferences()) {
                    for (int k = 0; k < objectCount; k++) {
                            continue;
                        if (!CompareUtils.equalPropertyValues(value, firstValue)) {
                                break;
                    xml.endElement();

            if (line.properties != null) {
                            // Ignore properties of missing objects
        styles.append(".property td,th {border-top:dashed 1px; border-right:solid 1px; border-color: black; white-space:pre; } ");

        xml.addText("Compare report");
            if (line.depth > maxLevel) {
                xml.startElement("td");
                xml.addAttribute("colspan", line.nodes.length);
            } else {
                maxLevel = line.depth;
            }
        xml.endElement();
            xml.endElement();
                    xml.addAttribute("class", "property level" + (line.depth + 1) + (differs ? " differs" : ""));
            CompareReportLine line = reportLines.get(i);
        }
 *
                    }
                            }
import java.io.IOException;
                    if (!hasValue) {
            }
        // Table head
        xml.addAttribute("content", "text/html; charset=utf-8");
                        if (CommonUtils.isEmpty(stringValue)) {
                        // Skip[ properties when nobody have it's value

import java.io.OutputStream;
        xml.endElement();
//        styles.append(".object:first-child {border:none; } ");
                            depth = prevNode.depth;
        xml.startElement("title");
                xml.addText("&nbsp;", false);
        this.settings = settings;
                            xml.addText(stringValue);
                    for (int k = 0; k < reportProperty.values.length; k++) {
            xml.startElement("th");
                    int depth = reportLines.get(i).depth;

            xml.addAttribute("class", "object level" + line.depth);

        }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
                    xml.startElement("td");
        xml.endElement();
                }
        //Hovering!
            styles.append(".level").append(i).append(" td,th { text-align:left; padding-left:").append(20 * i).append("px; } ");
    public void renderReport(DBRProgressMonitor monitor, CompareReport report, CompareObjectsSettings settings, OutputStream outputStream) throws IOException
import java.util.List;
        xml.startElement("style");
            int reportLinesSize = reportLines.size();
    private CompareReport report;
                        if (prevNode.depth < depth) {
        xml.endElement();
        xml.addAttribute("cellpadding", 0);
            "    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
            }
            xml.startElement("tr");

 * you may not use this file except in compliance with the License.
        }
        xml.startElement("th");
            for (int i = 0; i < reportLinesSize; i++) {
                        continue;
        xml.addAttribute("width", "100%");
                                // Already set
                    xml.addText(reportProperty.property.getDisplayName());
        xml.startElement("meta");
