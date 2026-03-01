        if (driver == null) {
    {
    public String getDefaultServer() {
    private String description;

    {

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * See the License for the specific language governing permissions and
/*
    {
    public String getDefaultUser() {

import java.util.ArrayList;
 */
import org.jkiss.dbeaver.model.connection.DBPDriver;
    public ImportDriverInfo(String id, String name, String sampleURL, String driverClass)
            return;
    public String getName()
    }
        this.description = description;

 * DBeaver - Universal Database Manager
    public void setDescription(String description)
        return properties;
    private List<String> libraries = new ArrayList<>();
    @Override
/**
    public void setSampleURL(String sampleURL)
    }
    }
    private String defaultPort, defaultDatabase, defaultServer, defaultUser;

    public void setDefaultDatabase(String defaultDatabase) {
    }
    }
    }
    }
    public String getDescription()
    {
 *
import org.jkiss.code.Nullable;
 *
    }

 */
    public String getDefaultPort()
}
    private String driverClass;
    public String getDefaultDatabase() {
        return defaultPort;
        properties.put(name, value);

    {

    }

        return description;
        return name + " - " + driverClass + " - " + sampleURL;
    }
            this.id = "";



    private String sampleURL;
            this.sampleURL = "";
    {

    {
        this.id = id;
        this.defaultUser = defaultUser;
    public void setDefaultPort(String defaultPort)
    {
    public void setProperty(String name, String value)
package org.jkiss.dbeaver.ui.config.migration.wizards;
        this.driverClass = driverClass;
    public void setDefaultUser(String defaultUser) {
        this.name = driver.getName();
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.HashMap;
    {
    {
    public String getId()
    }
 * You may obtain a copy of the License at
        this.defaultDatabase = defaultDatabase;
        return id;
    {
        return defaultDatabase;



        return libraries;
        this.name = name;
    {
    private Map<String, Object> properties = new HashMap<>();

import java.util.List;
        this.sampleURL = sampleURL;
    }
        libraries.add(path);
        this.driverClass = driver.getDriverClassName();
    public void setDefaultServer(String defaultServer) {
    private String name;
    }
    }

        this.id = driver.getId();
        return name;
        this.defaultServer = defaultServer;
 * Import data
 *
    public String toString()
    public ImportDriverInfo(@Nullable DBPDriver driver) {
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return sampleURL;

    }
    }
        this.sampleURL = driver.getSampleURL();
    public String getDriverClass()
    private String id;
    {
        this.sampleURL = sampleURL;

        return defaultServer;
    public void addLibrary(String path)
 * Licensed under the Apache License, Version 2.0 (the "License");
        return driverClass;
    {
    {


    public Map<String, Object> getProperties()
    }

    }
        return defaultUser;
        }
public class ImportDriverInfo {
    }



 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getSampleURL()
    }
        this.defaultPort = defaultPort;
            this.driverClass = "";

import java.util.Map;
    }
            this.name = "";
    public List<String> getLibraries()
