                    String legacyValue = legacyParameterValue.toString().trim();
import org.jkiss.utils.xml.XMLException;
            for (ParameterInfo param : parameterMap.values()) {

 * You may obtain a copy of the License at
    private final Map<String, ParameterInfo> parameterMap = new LinkedHashMap<>();
                parameterMap.put(
 *
        return new ArrayList<>(parameterMap.values());
        } catch (DBException ex) {
package org.jkiss.dbeaver.model.sql.registry;
import java.util.List;
import java.nio.file.Files;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.utils.GeneralUtils;
 * you may not use this file except in compliance with the License.
            log.warn("IO error", ex);
            }

            return;
            XMLBuilder xml = new XMLBuilder(os, GeneralUtils.UTF8_ENCODING);
            try {
import java.io.IOException;
        if (!Files.exists(storeFile)) {
    }
            log.warn("IO error", ex);

            xml.endElement();
    }
        public String value;
        try (InputStream is = Files.newInputStream(storeFile)) {
                            legacyValue = "'" + legacyValue + "'";
        }
            }

 *
        Path storeFile = DBWorkbench.getPlatform().getLocalConfigurationFile(CONFIG_FILE_NAME);
    }
                    curParameterValue = legacyValue;
import org.jkiss.dbeaver.runtime.DBWorkbench;
/*

import org.jkiss.utils.xml.SAXReader;
    public ParameterInfo getParameter(String name) {
            registry = new SQLQueryParameterRegistry();
                curParameterName = null;
            registry.loadParameters();
import java.nio.file.Path;
            SAXReader parser = new SAXReader(is);
                        }
        public ParameterInfo(String name, String value) {
        }
        }
    public void save() {

    public static final String TAG_PARAMETER = "parameter";
            }
import org.jkiss.dbeaver.Log;
                    new ParameterInfo(curParameterName, curParameterValue));
    public List<ParameterInfo> getAllParameters() {
    private static SQLQueryParameterRegistry registry;
            xml.startElement("bindings");
            }
            xml.flush();
        @Override

        try (OutputStream os = Files.newOutputStream(storeFile)) {

            this.name = name;
        } catch (IOException ex) {
    public static class ParameterInfo {
 *


 * See the License for the specific language governing permissions and
        return parameterMap.get(name);
        @Override
import org.jkiss.utils.xml.XMLBuilder;
                throw new DBException("Parameters binding parse error", ex);
                parser.parse(new ParametersParser());
                xml.addAttribute("name", param.name);
                            // Quote strings

        Path storeFile = DBWorkbench.getPlatform().getLocalConfigurationFile(CONFIG_FILE_NAME);

        }
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {
        public void saxText(@NotNull SAXReader reader, @NotNull String data) {
        @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    }
        }
        parameterMap.remove(name);
    public static final String CONFIG_FILE_NAME = "parameter-bindings.xml"; //$NON-NLS-1$
                xml.addAttribute("value", param.value);
                if (curParameterValue == null) {
 * Unless required by applicable law or agreed to in writing, software
            log.warn("Can't load parameters binding from " + storeFile, ex);
            if (localName.equals(TAG_PARAMETER) && curParameterName != null) {
 */

}
                    if (!legacyValue.isEmpty()) {
        private final StringBuilder legacyParameterValue = new StringBuilder();
    }
                    curParameterName,
    public void setParameter(String name, String value) {
import org.jkiss.code.NotNull;
                legacyParameterValue.append(data);
    }
        }
                }
                xml.startElement(TAG_PARAMETER);
    public static synchronized SQLQueryParameterRegistry getInstance() {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class SQLQueryParameterRegistry {
                curParameterValue = attributes.getValue("value");
import java.util.Map;
                    }
        private String curParameterName, curParameterValue;
            this.value = value;
            } catch (XMLException ex) {
    }
                legacyParameterValue.setLength(0);
import org.jkiss.code.Nullable;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (registry == null) {
    }
                        if (Character.isLetter(legacyValue.charAt(0))) {

import org.jkiss.utils.xml.SAXListener;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (IOException ex) {
            if (curParameterName != null) {

            if (localName.equals(TAG_PARAMETER)) {
        parameterMap.put(name, new ParameterInfo(name, value));
    private static final Log log = Log.getLog(SQLQueryParameterRegistry.class);
    private SQLQueryParameterRegistry() {
                curParameterName = attributes.getValue("name");
    private class ParametersParser implements SAXListener {
    public void deleteParameter(String name) {
            xml.setBeautify(true);
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        public String name;
        return registry;
    private void loadParameters() {
import org.xml.sax.Attributes;
import java.util.LinkedHashMap;
import java.util.ArrayList;
        }
        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {
        }

import java.io.OutputStream;
                xml.endElement();

import java.io.InputStream;


