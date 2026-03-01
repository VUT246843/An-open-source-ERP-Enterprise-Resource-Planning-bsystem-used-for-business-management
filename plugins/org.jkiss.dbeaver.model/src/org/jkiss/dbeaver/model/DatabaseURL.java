        pattern = CommonUtils.replaceAll(pattern, "\\{(.*?)}", m -> "\\\\E(\\?<\\\\Q" + m.group(1) + "\\\\E>" + getPropertyRegex(m.group(1)) + ")\\\\Q");
                    configuration.setUserName(entry.getValue());
            if (optDiv1 != -1 && optDiv2 != -1 && (optDiv1c == -1 || optDiv1c < optDiv1) && (optDiv2c == -1 || optDiv2c > optDiv2)) {
                isOptional = true;
            return urlComponents;
                    break;
 * you may not use this file except in compliance with the License.
                    newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_HOST), connectionInfo.getHostName());
        }
            }
            case DBConstants.PROP_FILE:
                    break;
                case DBConstants.PROP_FILE:
                }
            case DBConstants.PROP_FOLDER:
        }
                    log.debug("Unknown property: " + entry.getKey());

                    newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_PORT), connectionInfo.getHostPort());
                case DBConstants.PROP_DATABASE:
            .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
        }
                newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_USER), CommonUtils.notEmpty(connectionInfo.getUserName()));
    public static class MetaURL {
                metaURL.requiredProperties.add(propName);
                if (!CommonUtils.isEmpty(connectionInfo.getServerName())) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            return requiredProperties;
 * DBeaver - Universal Database Manager
                if (newComponent.startsWith("[")) { //$NON-NLS-1$
    public static String generateUrlByTemplate(String urlTemplate, DBPConnectionConfiguration connectionInfo) {
        {
            if (CommonUtils.isEmptyTrimmed(urlTemplate)) {
                case DBConstants.PROP_FOLDER:
        try {
            int optDiv1 = sampleURL.lastIndexOf(URL_OPTIONAL_START, divPos);
            .filter(x -> CommonUtils.isNotEmpty(x.getSecond()))
                    newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_FILE), connectionInfo.getDatabaseName());

    @NotNull
                divPos2 = optDiv2;
                }
 *
    private static final char URL_GROUP_END = '}'; //$NON-NLS-1$
            boolean isRequired = !component.startsWith("[");
        String urlTemplate = driver.getSampleURL();
    public static MetaURL parseSampleURL(String sampleURL) throws DBException {
        pattern = CommonUtils.replaceAll(pattern, "\\[(.*?)]", m -> "\\\\E(?:\\\\Q" + m.group(1) + "\\\\E)?\\\\Q");
                return connectionInfo.getUrl();
                    }
            for (String component : metaURL.getUrlComponents()) {
        }
    }
        int offsetPos = 0;
    private static final char URL_GROUP_START = '{'; //$NON-NLS-1$
    public static final String GENERIC_URL_TEMPLATE = "[jdbc:]{driver}://[{user}:{password}@]{host}[:{port}][/{database}]";
            offsetPos = divPos2 + 1;

        }
                if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
    }
import org.jkiss.utils.Pair;
    private static List<String> getProperties(@NotNull String sampleUrl) {
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
            int optDiv2c = sampleURL.indexOf(URL_OPTIONAL_START, divPos2);
                case DBConstants.PROP_USER:
        final Matcher matcher = Pattern.compile("\\{(.*?)}").matcher(sampleUrl);
        return DatabaseURL.generateUrlByTemplate(urlTemplate, connectionInfo);
        return Pattern.compile(pattern);
import org.jkiss.dbeaver.model.connection.DBPDriver;
                        requiredProperties.add(propName);
    }

        return metaURL;
    private static String getPropertyRegex(@NotNull String property) {
        return properties;
    public static String generateUrlByTemplate(DBPDriver driver, DBPConnectionConfiguration connectionInfo) {
                throw new DBException("Bad sample URL: " + sampleURL);
            .map(x -> new Pair<>(x, matcher.group(x)))
    private static final Log log = Log.getLog(DatabaseURL.class);
        if (!matcher.find()) {

            return connectionInfo.getUrl();
                if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
        if (properties.isEmpty()) {
        }
        switch (property) {
        public Set<String> getAvailableProperties() {

            metaURL.urlComponents.add(sampleURL.substring(divPos, divPos2 + 1));
            return null;
        pattern = "^\\Q" + pattern + "\\E";
 * JDBCUtils
            switch (entry.getKey()) {
    }
                    newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_DATABASE), connectionInfo.getDatabaseName());
            }
    }
            StringBuilder url = new StringBuilder();
    @Nullable
            }
                return "[\\\\w\\\\-_.~]+";
            }
            }
    {
 *
/*
                }
                        url.append(newComponent.substring(1, newComponent.length() - 1));
    public static Pattern getPattern(@NotNull String sampleUrl) {

                String newComponent = component;
 * You may obtain a copy of the License at
                }
        }
                    String propName = component.substring(divPos + 1, divPos2);

                //newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_PASSWORD), CommonUtils.notEmpty(connectionInfo.getUserPassword()));
        private List<String> urlComponents = new ArrayList<>();


                    configuration.setUserPassword(entry.getValue());
        public List<String> getUrlComponents() {
            metaURL.availableProperties.add(propName);

        }
import org.jkiss.code.NotNull;
                return ".+?";
            metaURL.urlComponents.add(sampleURL.substring(offsetPos));
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
            String propName = sampleURL.substring(divPos + 1, divPos2);
            if (divPos > offsetPos) {
        return configuration;

        }
            if (!isOptional) {
import java.util.*;

                    break;
            if (divPos == -1) {
        final Map<String, String> properties = getProperties(sampleUrl).stream()
}
                    url.append(newComponent);
                    if (!newComponent.equals(component)) {


                    configuration.setServerName(entry.getValue());
                break;
        if (!CommonUtils.isEmpty(connectionInfo.getUrl()) &&
 * Unless required by applicable law or agreed to in writing, software
                    availableProperties.add(propName);
        for (; ; ) {
                    configuration.setHostName(entry.getValue());
                metaURL.urlComponents.add(sampleURL.substring(offsetPos, divPos));
                    configuration.setDatabaseName(entry.getValue());
        final DBPConnectionConfiguration configuration = new DBPConnectionConfiguration();
                case DBConstants.PROP_PASSWORD:
 * limitations under the License.
    }
        while (matcher.find()) {
public class DatabaseURL {
                    break;
        }
                    configuration.setHostPort(entry.getValue());
            CommonUtils.isEmpty(connectionInfo.getHostPort()) &&
    private static final char URL_OPTIONAL_START = '['; //$NON-NLS-1$
            return null;
                default:
            }
import java.util.regex.Pattern;
            boolean isOptional = false;
                } else {
                    break;
                int divPos2 = component.indexOf('}', divPos);
    public static DBPConnectionConfiguration extractConfigurationFromUrl(@NotNull String sampleUrl, @NotNull String targetUrl) {
            int divPos = sampleURL.indexOf(URL_GROUP_START, offsetPos);
                    newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_SERVER), connectionInfo.getServerName());
                case DBConstants.PROP_PORT:
                    }
            if (divPos2 == -1) {
            return availableProperties;
import org.jkiss.dbeaver.Log;
            int optDiv2 = sampleURL.indexOf(URL_OPTIONAL_END, divPos2);
        } catch (DBException e) {
        private Set<String> requiredProperties = new HashSet<>();
            return url.toString();

                    newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_FOLDER), connectionInfo.getDatabaseName());
import java.util.regex.Matcher;
 * See the License for the specific language governing permissions and
        if (offsetPos < sampleURL.length()) {
            int optDiv1c = sampleURL.lastIndexOf(URL_OPTIONAL_END, divPos);
        private Set<String> availableProperties = new HashSet<>();

            int divPos2 = sampleURL.indexOf(URL_GROUP_END, divPos);
                    break;
/*
                if (divPos2 != -1) {
                    if (isRequired) {
            CommonUtils.isEmpty(connectionInfo.getDatabaseName()))
        }

            properties.add(matcher.group(1));
            CommonUtils.isEmpty(connectionInfo.getHostName()) &&
                case DBConstants.PROP_SERVER:
import java.util.stream.Collectors;
 *
            return null;
            CommonUtils.isEmpty(connectionInfo.getServerName()) &&
            // No parameters, just URL - so URL it is
                    break;
        }
    }
                case DBConstants.PROP_HOST:
            log.error(e);
package org.jkiss.dbeaver.model;
                // support of {password} pattern was removed for security reasons (see dbeaver/pro#1888)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static String makePropPattern(String prop)
        return "{" + prop + "}"; //$NON-NLS-1$ //$NON-NLS-2$
        for (String component : urlComponents) {
        public Set<String> getRequiredProperties() {

        // Check for required parts

                }
        final List<String> properties = new ArrayList<>();
import org.jkiss.utils.CommonUtils;
        String pattern = sampleUrl;
 */
*/
            default:
            }
    @NotNull

                }
            }
    }
    private static final char URL_OPTIONAL_END = ']'; //$NON-NLS-1$

        }
/**
        MetaURL metaURL = new MetaURL();
        final Matcher matcher = getPattern(sampleUrl).matcher(targetUrl);
            int divPos = component.indexOf('{');
 */
                divPos = optDiv1;
            if (divPos != -1) {
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
            MetaURL metaURL = parseSampleURL(urlTemplate);
                if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
