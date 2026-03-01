        }
    public ResultSetPanelDescriptor getPanel(String panelId) {

    }
    private ResultSetPresentationRegistry(IExtensionRegistry registry)
        for (ResultSetPanelDescriptor panel : panels) {
 */
        }
            }
    public List<ResultSetPanelDescriptor> getAllPanels() {
        return null;
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelDescriptor;
    public List<ResultSetPresentationDescriptor> getAvailablePresentations(DBCResultSet resultSet, IResultSetContext context)
    public List<ResultSetPanelDescriptor> getSupportedPanels(IResultSetContext context, DBPDataSource dataSource, String presentationId, IResultSetPresentation.PresentationType presentationType) {
    private static ResultSetPresentationRegistry instance;
        }

import java.util.ArrayList;
        return result;
    {
        return panels;
    public ResultSetPresentationDescriptor getPresentation(String id)
package org.jkiss.dbeaver.ui.controls.resultset;
/*
    private static final String TAG_PANEL = "panel"; //NON-NLS-1
import org.eclipse.core.runtime.Platform;
            }

 * Unless required by applicable law or agreed to in writing, software

            if (TAG_PRESENTATION.equals(ext.getName())) {
            }
                presentations.add(descriptor);
    }

    }
 * limitations under the License.
 *
    {
        if (instance == null) {
/**
    {
        // Load panel descriptors
}

 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final String TAG_PRESENTATION = "presentation"; //NON-NLS-1
        for (ResultSetPresentationDescriptor descriptor : presentations) {
            }
    private List<ResultSetPresentationDescriptor> presentations = new ArrayList<>();
 * you may not use this file except in compliance with the License.
                ResultSetPresentationDescriptor descriptor = new ResultSetPresentationDescriptor(ext);
                return panel;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ResultSetPresentationDescriptor.EXTENSION_ID);
 * Copyright (C) 2010-2024 DBeaver Corp and others


        IConfigurationElement[] panelElements = registry.getConfigurationElementsFor(ResultSetPanelDescriptor.EXTENSION_ID);
        return null;
        for (ResultSetPresentationDescriptor descriptor : presentations) {
    }
import java.util.Comparator;
                result.add(panel);
 * You may obtain a copy of the License at

        return instance;

            if (descriptor.getId().equals(id)) {
            if (TAG_PANEL.equals(ext.getName())) {

        for (ResultSetPanelDescriptor panel : panels) {

        for (IConfigurationElement ext : panelElements) {
        for (ResultSetPresentationDescriptor descriptor : presentations) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return presentations;
        List<ResultSetPresentationDescriptor> result = new ArrayList<>();
        }
        for (IConfigurationElement ext : extElements) {
import java.util.List;
        return result;

    {

        }
    public List<ResultSetPresentationDescriptor> getAllPresentations()
                return descriptor;
        return null;
                panels.add(descriptor);
            if (panel.getId().equals(panelId)) {
    }
        }
 * DBeaver - Universal Database Manager

 *
    private static final String TAG_OPEN_WITH = "openWith"; //NON-NLS-1
 * See the License for the specific language governing permissions and
    }
        presentations.sort(Comparator.comparingInt(ResultSetPresentationDescriptor::getOrder));
                ResultSetPanelDescriptor descriptor = new ResultSetPanelDescriptor(ext);
 *
            if (descriptor.matches(implType)) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private List<ResultSetPanelDescriptor> panels = new ArrayList<>();
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    }
        // Load presentation descriptors
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        result.sort(Comparator.comparing(ResultSetPanelDescriptor::getLabel));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
            instance = new ResultSetPresentationRegistry(Platform.getExtensionRegistry());

public class ResultSetPresentationRegistry {
    }
            if (descriptor.supportedBy(resultSet, context)) {
import org.eclipse.core.runtime.IExtensionRegistry;
                return descriptor;
    public synchronized static ResultSetPresentationRegistry getInstance() {
            }
        List<ResultSetPanelDescriptor> result = new ArrayList<>();
            if (panel.supportedBy(context, dataSource, presentationId, presentationType)) {
            }
 */
import org.eclipse.core.runtime.IConfigurationElement;
                result.add(descriptor);
 * ResultSetPresentationRegistry
            }

    {
    public ResultSetPresentationDescriptor getPresentation(Class<? extends IResultSetPresentation> implType)
