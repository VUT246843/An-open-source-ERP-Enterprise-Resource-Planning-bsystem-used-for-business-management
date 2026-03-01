 * DBeaver - Universal Database Manager

 */
    @Nullable
import org.jkiss.utils.CommonUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return false;
        if (this.handledMarkerTypes == null) {
import org.eclipse.ui.IWorkbenchSite;
    @Nullable
import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.Log;
    }
    @Override
                .map(e -> e.getAttribute("id"))
    public boolean handlesAnnotation(@NotNull Annotation annotation) {
import org.jkiss.code.NotNull;
            return true;
        this.enabledWhen = getEnablementExpression(config);
    }
    }
                .collect(Collectors.toUnmodifiableSet());
        return implClass.createInstance(IQuickAssistProcessor.class);
import java.util.stream.Collectors;
import org.eclipse.ui.texteditor.MarkerAnnotation;
    @NotNull


        return isExpressionTrue(this.enabledWhen, site);
 *
    public Set<String> getHandledMarkerTypes() {
import org.jkiss.dbeaver.DBException;
 *
                IMarker marker = markerAnnotation.getMarker();
        super(config);
        this.implClass = new ObjectType(config.getAttribute("class"));
            : Arrays.stream(handledMarkerTypes)
 * See the License for the specific language governing permissions and
            }
            try {
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    public IQuickAssistProcessor createInstance() throws DBException {
    private final Expression enabledWhen;
/*
 * You may obtain a copy of the License at
            } catch (CoreException e) {
        return "SQLEditorQuickFixProcessorDescriptor[id: " + id + ", class: " + implClass.getImplName() + "]"; //$NON-NLS-1$

                return false;
    SQLEditorQuickFixProcessorDescriptor(IConfigurationElement config) {
import org.jkiss.code.Nullable;
}
import org.eclipse.core.resources.IMarker;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
package org.jkiss.dbeaver.ui.editors.sql.addins;
 * limitations under the License.
                .filter(CommonUtils::isNotEmpty)
 * you may not use this file except in compliance with the License.
    }
        this.id = config.getAttribute("id");

                    } catch (CoreException e) {
    }
public class SQLEditorQuickFixProcessorDescriptor extends AbstractDescriptor {
    private final String id;
                    }

    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getId() {
    @NotNull
import java.util.Set;
    }
                log.error(e);
import org.eclipse.core.expressions.Expression;
                        log.error(e);

                    try {
                        return marker.isSubtypeOf(t);
import java.util.Arrays;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String toString() {

 * Unless required by applicable law or agreed to in writing, software
                    return true;
                });
import org.jkiss.utils.ArrayUtils;

    }
        return this.handledMarkerTypes;
        return id;
                if (this.handledMarkerTypes.contains(marker.getType())) {
    public boolean isEnabled(@NotNull IWorkbenchSite site) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final ObjectType implClass;
                }
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
    private static final Log log = Log.getLog(SQLEditorQuickAssistProcessor.class);
        this.handledMarkerTypes = ArrayUtils.isEmpty(handledMarkerTypes)
        return false;
                return this.handledMarkerTypes.stream().anyMatch(t -> {


        IConfigurationElement[] handledMarkerTypes = config.getChildren("handledMarkerTypes");

import org.eclipse.jface.text.source.Annotation;
            ? null
    private final Set<String> handledMarkerTypes;
        }
    @NotNull
    @NotNull
        } else if (annotation instanceof MarkerAnnotation markerAnnotation) {
import org.eclipse.core.runtime.IConfigurationElement;
