                if (part != null && !iconURI.getNodeValue().equals(part.icon())) {
            return path.resolve(".metadata/.plugins/org.eclipse.e4.workbench/workbench.xmi"); //$NON-NLS-1$
            log.debug("Error parsing editor memento", e);
                    elementId = extractCompatibilityEditorId(child);

    private static boolean isContributedByDBeaver(@NotNull IExtension extension) {
                transformer.transform(source, result);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static Stream<IExtension> getExtensions(@NotNull String namespace, @NotNull String extensionPointName) {
            }

    public static void patchWorkbenchXmi(@NotNull Location instance) {

        Set<String> placeholders = modelService.findElements(workbench.getApplication(), null, MPlaceholder.class).stream()
 *
    @Nullable
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
public final class WorkbenchPatcher {
            // view.id
import java.io.StringReader;
        return Arrays.stream(point.getExtensions());
    }
        var transformed = patchPartIconsRecursively(document, collectContributedParts());

        }
import org.w3c.dom.Attr;
                var result = new StreamResult(os);
    }
    @NotNull
        return null;
     * references available via the extension registry.
        }
        @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,
        var views = getExtensions(PlatformUI.PLUGIN_ID, IWorkbenchRegistryConstants.PL_VIEWS)
        NodeList children = node.getChildNodes();
import java.nio.file.StandardCopyOption;
                }
            return false;

import org.eclipse.ui.internal.menus.MenuHelper;
            modified |= patchPartIconsRecursively(child, parts);

import org.jkiss.utils.xml.XMLException;
import org.jkiss.dbeaver.Log;

    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
                if (elementId.equals(CompatibilityEditor.MODEL_ELEMENT_ID)) {
        // For explanation behind this logic, see org.eclipse.ui.internal.EditorReference#EditorReference
            if (!(children.item(i) instanceof Element child)) {
    }
            .toList();
     * @param instance workbench location
     * A missing view reference may cause the view to appear in a wrong
            var path = RuntimeUtils.getLocalPathFromURL(instance.getURL());
     * parts' icons to their actual values taken directly from contributed
        var document = XMLUtils.parseDocument(workbenchXmi);
import java.util.stream.Stream;
import org.eclipse.ui.IWorkbenchPage;
                (a, b) -> b
            try (OutputStream os = Files.newOutputStream(workbenchXmiPatch)) {
            .map(MApplicationElement::getElementId)
            log.error("Unable to resolve workbench save location: " + instance.getURL(), e);
                var source = new DOMSource(document);
    }
        }
                    // See org.eclipse.ui.internal.WorkbenchPage.createEditorReferenceForPart
            if (editor.getTagName().equals("editor") && editor.hasAttribute("id")) {
                String elementId = child.getAttribute("elementId");
        boolean modified = false;
 * See the License for the specific language governing permissions and
            var transformerFactory = TransformerFactory.newInstance();

        return contributor.startsWith("org.jkiss.dbeaver") || contributor.startsWith("com.dbeaver");

            }
        var editors = getExtensions(PlatformUI.PLUGIN_ID, IWorkbenchRegistryConstants.PL_EDITOR)
    }
import org.jkiss.utils.xml.XMLUtils;
        }
    private WorkbenchPatcher() {
        return !placeholders.containsAll(views);
        for (int i = 0; i < children.getLength(); i++) {
 */

    private record PartDescriptor(@NotNull IConfigurationElement element, @NotNull String id, @NotNull String icon) {
import org.w3c.dom.Node;
            .map(IExtension::getConfigurationElements).flatMap(Stream::of)
 *
import java.nio.file.Files;
    private static String extractCompatibilityEditorId(@NotNull Element element) {
    @NotNull
     * extensions.
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
     * @return {@code true} if the perspective must be reset, {@code false} otherwise
    }

        String key = persistedState.getAttribute("key");

    @Nullable
            .collect(Collectors.toMap(
 * You may obtain a copy of the License at
        }
     * location in the workbench, as the workbench doesn't know where
            // extension.forEach(perspectiveExtension)
import java.io.OutputStream;
            Files.move(workbenchXmiPatch, workbenchXmi, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);

        } catch (Throwable e) {


     * Patches the {@code workbench.xmi} file, updating all view and editor
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.PlatformUI;
     */
import org.jkiss.code.Nullable;
 * limitations under the License.
import java.io.IOException;
    }
                Attr iconURI = child.getAttributeNode("iconURI");
     *
            var memento = XMLUtils.parseDocument(new StringReader(value));


import org.eclipse.e4.ui.model.application.MApplicationElement;

     * If this method returns {@code true}, it's advised to call {@link IWorkbenchPage#resetPerspective()}.
    }
        static PartDescriptor of(@NotNull IConfigurationElement element) {
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
        // Collect all view placeholders the model knows about
import org.eclipse.ui.internal.Workbench;
        IExtensionPoint point = registry.getExtensionPoint(namespace, extensionPointName);
        if (transformed) {

            .filter(WorkbenchPatcher::isContributedByDBeaver)
                    // CompatibilityEditor is not an editor itself
    private static Map<String, PartDescriptor> collectContributedParts() {
            .map(PartDescriptor::of)
        Element persistedState = XMLUtils.getChildElement(element, "persistedState");
        if (persistedState == null) {
            return;
import org.eclipse.osgi.service.datalocation.Location;

                PartDescriptor part = parts.get(elementId);
            return new PartDescriptor(element, id, icon);

            }
            return null;
            var transformer = transformerFactory.newTransformer();
import javax.xml.transform.OutputKeys;
     * @param workbench the workbench
     * <p>
                }

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.e4.ui.workbench.modeling.EModelService;
}
            String icon = MenuHelper.getIconURI(element, IWorkbenchRegistryConstants.ATT_ICON);

                continue;
            }
    }

            log.debug("Failed to patch workbench state file: " + path, e);
        }
        String contributor = extension.getContributor().getName();
                PartDescriptor::id,
                    log.debug("Replacing icon for part '" + part.id() + "' with '" + part.icon() + "'");
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor;
import java.nio.file.Path;
        } catch (XMLException e) {

            Path workbenchXmiPatch = workbenchXmi.resolveSibling(workbenchXmi.getFileName() + ".patch");

                return editor.getAttribute("id");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
     * <p>
        // Collect a set of registered views via perspective extensions contributed by DBeaver
 *
    private static Path getWorkbenchSaveLocation(@NotNull Location instance) {
                    modified = true;
/*
        IExtensionRegistry registry = Platform.getExtensionRegistry();
import javax.xml.transform.TransformerFactory;
            .map(x -> x.getAttribute(IWorkbenchRegistryConstants.ATT_ID))
        String value = persistedState.getAttribute("value");
    }
        try {
     */
        if (path == null || !Files.exists(path)) {
            .toList();
     * Checks whether the workbench model is missing any view
     *
import java.util.Set;
            .map(IExtension::getConfigurationElements).flatMap(Stream::of)
            .map(PartDescriptor::of)
    private static void patchWorkbenchXmi(@NotNull Path workbenchXmi) throws Exception {
        EModelService modelService = workbench.getService(EModelService.class);
    private static final Log log = Log.getLog(WorkbenchPatcher.class);
package org.jkiss.dbeaver.ui.app.standalone.internal;
            String id = element.getAttribute("id");
                    iconURI.setNodeValue(part.icon());
        try {
            .collect(Collectors.toSet());
    /**
import org.eclipse.core.runtime.*;

        }
    }
import javax.xml.transform.dom.DOMSource;
            // Write to a temporary file first

import org.w3c.dom.Element;
import javax.xml.transform.stream.StreamResult;
import java.util.stream.Collectors;
            .filter(e -> e.getName().equals("view") && e.getAttribute("icon") != null)
    private static boolean patchPartIconsRecursively(@NotNull Node node, @NotNull Map<String, PartDescriptor> parts) {
import java.util.Map;
            ));

        if (modelService == null) {
        Path path = getWorkbenchSaveLocation(instance);
        }
            return null;

import java.util.Arrays;
            .collect(Collectors.toSet());
            return null;
            .filter(e -> e.getName().equals(IWorkbenchRegistryConstants.TAG_PERSPECTIVE_EXTENSION))
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.internal.registry.IWorkbenchRegistryConstants;
        } catch (IOException e) {
     * <p>
        Set<String> views = getExtensions(PlatformUI.PLUGIN_ID, IWorkbenchRegistryConstants.PL_PERSPECTIVE_EXTENSIONS)

        }
            .map(IConfigurationElement::getChildren).flatMap(Stream::of)
        return modified;
import java.util.function.Function;
            patchWorkbenchXmi(path);
        return Stream.concat(views.stream(), editors.stream())
            .map(IExtension::getConfigurationElements).flatMap(Stream::of)
            // perspectiveExtension.forEach(view)
    public static boolean needsPerspectiveReset(@NotNull Workbench workbench) {

        try {
            if (child.hasAttribute("elementId") && child.hasAttribute("iconURI")) {
        if (!"memento".equals(key)) {

            // Then replace the original file with the patched one
 * DBeaver - Universal Database Manager

                Function.identity(),
            .filter(e -> e.getName().equals("editor") && e.getAttribute("icon") != null)
import org.w3c.dom.NodeList;
     * Does not update the file if no changes were made.
            var editor = memento.getDocumentElement();
     * it should be placed.
            .filter(e -> e.getName().equals(IWorkbenchRegistryConstants.TAG_VIEW))
import org.jkiss.code.NotNull;
