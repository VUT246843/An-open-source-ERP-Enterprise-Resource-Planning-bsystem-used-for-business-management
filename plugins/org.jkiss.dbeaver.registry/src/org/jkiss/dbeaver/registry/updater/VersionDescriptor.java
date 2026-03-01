 * DBeaver - Universal Database Manager
            private StringBuilder textBuffer = new StringBuilder();
        throws IOException {


    }
    public VersionDescriptor(DBPPlatform platform, String fileAddr)
        SAXListener dsp = new SAXListener() {
 */
                        downloadURL = text;
package org.jkiss.dbeaver.registry.updater;
    public String getBaseURL() {
 * you may not use this file except in compliance with the License.
    private String updateTime;
        return baseURL;
        parser.parse(dsp);
        }

                        break;
    }
            public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) throws XMLException {
public class VersionDescriptor {
                textBuffer.setLength(0);

    private final List<DistributionDescriptor> distributions = new ArrayList<>();
/*
import org.jkiss.code.Nullable;

import java.text.ParseException;
        return programVersion.getMajor() + "." + programVersion.getMinor() + "." + programVersion.getMicro();
    }
    }
 * You may obtain a copy of the License at
import org.jkiss.utils.xml.SAXListener;
    public Version getProgramVersion() {

import org.osgi.framework.Version;
                        programVersion = Version.parseVersion(text);

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        try (InputStream inputStream = WebUtils.openConnection(fileAddr, platform.getWorkspace().getWorkspaceId()).getInputStream()) {
    }
import java.text.SimpleDateFormat;
            parseVersionInfo(inputStream);
    private void parseVersionInfo(InputStream inputStream) throws IOException, XMLException {
        this.updateTime = updateTime;
        };
        return releaseNotes;
    public String getPlainVersion() {

                    case "date":
                    case "number":
        return updateTime;
                    case "release-notes":
import java.io.InputStream;
 * limitations under the License.
    private final List<UpdateSiteDescriptor> updateSites = new ArrayList<>();
 * See the License for the specific language governing permissions and
import java.util.ArrayList;
                        break;
import org.jkiss.dbeaver.runtime.WebUtils;
            @Override
import java.util.List;
        return programName;
    }
    }
                    case "download-url":
        } catch (XMLException e) {
    public String getReleaseNotes() {
 */
                        break;

        } catch (ParseException e) {
            public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) throws XMLException {
    public void setUpdateTime(String updateTime) {
            @Override
                        releaseNotes = text;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
        }
    private String programName;
            return new Date();

import org.jkiss.utils.xml.XMLException;
import java.util.Collection;
                        break;
            @Override
    public String getProgramName() {

 * Unless required by applicable law or agreed to in writing, software

    private String downloadURL;
 *



                lastTag = localName;

                    case "base-url":
        return distributions;

        return updateSites;
        SAXReader parser = new SAXReader(inputStream);
        return programVersion;
        this.programVersion = programVersion;
        try {
import org.jkiss.utils.xml.SAXReader;
    }
            private String lastTag;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setProgramVersion(Version programVersion) {
    }
                        break;
import java.io.IOException;

            }
import org.xml.sax.Attributes;
import org.jkiss.code.NotNull;

                        programName = text;

                textBuffer.append(data);
            }
}
            return new SimpleDateFormat("dd.MM.yyyy").parse(updateTime);
    public Date getVersionReleaseTimestamp() {
                        baseURL = text;
    }
    }
    }

                final String text = textBuffer.toString();

 * Copyright (C) 2010-2025 DBeaver Corp and others
    private String baseURL;
import org.jkiss.dbeaver.model.app.DBPPlatform;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public String getUpdateTime() {
import java.util.Date;
                }
    private Version programVersion;
                        updateTime = text;
    }

    public Collection<UpdateSiteDescriptor> getUpdateSites() {
 * Version descriptor
 *
            public void saxText(@NotNull SAXReader reader, @NotNull String data) throws XMLException {
                textBuffer.setLength(0);
    public Collection<DistributionDescriptor> getDistributions() {
 *
            throw new IOException("XML parse error", e);
    public String getDownloadURL() {
                switch (lastTag) {
                    case "name":
    private String releaseNotes;
        return downloadURL;
                        break;
