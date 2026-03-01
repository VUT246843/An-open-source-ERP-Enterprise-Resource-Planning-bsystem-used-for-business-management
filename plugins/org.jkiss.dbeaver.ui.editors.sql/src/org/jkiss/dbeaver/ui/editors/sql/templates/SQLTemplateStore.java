    private boolean validateTemplate(Template template) {
 *     Stephan Wahlbrink <stephan.wahlbrink@walware.de> - [templates] improve logging when reading templates into SQLTemplateStore - https://bugs.eclipse.org/bugs/show_bug.cgi?id=212252
 * <p>

    }
                    URL bundleURL = FileLocator.find(plugin, org.eclipse.core.runtime.Path.fromOSString(translations), null);

     * Returns <code>true</code> if a context type id specifies a valid context type
 * Clients may instantiate but not subclass this class.
import java.util.stream.Stream;
    @Override
            if (url != null) {
import org.jkiss.dbeaver.model.rm.RMConstants;
    @Override
        lock().execWriting(o -> super.save());
                        if (data.isCustom()) {
    private void readIncludedTemplates(
                    setValue(PREF_STORE_KEY, content);
    public static final String PREF_STORE_KEY = "org.jkiss.dbeaver.core.sql_templates";
    /**
        });
    @Override
    public void add(TemplatePersistenceData data) {

import org.eclipse.jface.text.templates.Template;
                } finally {
    public void delete(TemplatePersistenceData data) {
            String templatesConfig = getString(PREF_STORE_KEY);
     * type registry. Returns always <code>true</code> if no registry is
 *
     */
        }
                    ContentUtils.close(stream);
    }
        });
        super(registry, new PreferenceStoreDelegate(customTemplatesStore), PREF_STORE_KEY); //$NON-NLS-1$
    }

                }

        // Read templates for DS providers
import org.eclipse.jface.text.templates.TemplateException;
     */
        return true;

                getRegistry().getContextType(contextTypeId).validate(template.getPattern());
 *******************************************************************************/
            templates,
                templates,
            URL url = FileLocator.find(plugin, org.eclipse.core.runtime.Path.fromOSString(file), null);
                log.warn("The user has no permission to save sql templates configuration");
        Collection<TemplatePersistenceData> templates,
    @Override
    }
    }
import org.eclipse.core.runtime.Platform;
        return lock().computeReading(o ->  super.getTemplates(contextTypeId));
        lock().execWriting(o -> super.restoreDefaults());
import org.eclipse.jface.text.templates.persistence.TemplateStore;
    public Template[] getTemplates() {

        lock().execWriting(o -> super.restoreDeleted());
    @Override
            customTemplatesStore.loadTemplatesConfig();
    public void reload() throws IOException {
    }
    public static final String TEMPLATES_CONFIG_XML = "templates.xml";
     * Returns set of custom sql templates declared in custom templates store
    }
    }
 * </p>
     */

import org.jkiss.dbeaver.utils.ContentUtils;

            }
import org.jkiss.dbeaver.DBException;
                DBWorkbench.getPlatform()
    protected void internalAdd(TemplatePersistenceData data) {
    @Override
                            bundle = new PropertyResourceBundle(bundleStream);
    public void save() throws IOException {
                if (translations != null) {
 * All rights reserved. This program and the accompanying materials
    @NotNull
     * @return <code>true</code> if the context type specified by the id
            if (pref != null && !pref.trim().isEmpty()) {
        return templates;
    }
        lock().execWriting(o -> {
        }
                        }
    private ReaderWriterLock<?> lock() {
    }
    /////////////////////////////////////////////////////////////////////////////////////
                provider.getPluginId(),
            Bundle plugin = Platform.getBundle(contributorId);
        }
            return false;
        lock().execWriting(o -> super.internalAdd(data));
public class SQLTemplateStore extends TemplateStore {
                        } else if (validateTemplate(data.getTemplate())) {
        log.error(x);
        

     * is present in the context type registry, or if no registry is
            try {
     * specified
import org.jkiss.utils.ReaderWriterLock;
    public void delete(org.eclipse.text.templates.TemplatePersistenceData data) {
            String pref = lock().computeReading(o -> customTemplatesStore.getString(PREF_STORE_KEY));
    }
            // Save templates
    /**
    public void add(org.eclipse.text.templates.TemplatePersistenceData data) {

    @Override
    }
        public void loadTemplatesConfig() {
                            else
    }
                "templates/" + provider.getId() + "-templates.xml",

    @NotNull
    }
    public Template findTemplate(String name) {
        for (DBPDataSourceProviderDescriptor provider : DBWorkbench.getPlatform().getDataSourceProviderRegistry().getDataSourceProviders()) {
            if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
 * user-defined (or overridden) templates stored in the preferences.
                internalAdd(data);
    private SQLTemplateStore(ContextTypeRegistry registry, CustomTemplatesStore customTemplatesStore) {
import org.jkiss.dbeaver.runtime.DBWorkbench;

                }
    
    public TemplatePersistenceData[] getTemplateData(boolean includeDeleted) {
        private CustomTemplatesStore() {
     * @param template the template to validate
import org.jkiss.code.NotNull;
                            templates.add(data);
     */
     * @throws java.io.IOException {@inheritDoc}
        lock().execWriting(o -> super.delete(data));
            "$nl$/templates/default-templates.properties");
            }
            super(DBWorkbench.getPlatform().getPreferenceStore());            
    }

    @Override
            readIncludedTemplates(
        }
    public void load() throws IOException {
        return lock().computeReading(o -> super.getTemplateData(id));
    public void restoreDefaults() {
    }
     */
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
        lock().execWriting(o -> {
    
        }
            }

        lock().execWriting(o -> super.add(data));

import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
    public void restoreDeleted() {

import org.osgi.framework.Bundle;
    protected void handleException(IOException x) {
import java.util.stream.Collectors;

import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;


    }
        lock().execWriting(o -> super.delete(data));
import java.io.*;
        return lock().computeReading(o -> super.findTemplateById(id));
        String file,
    public Set<String> getCustomTemplateNames() {
    }
     *

        return Collections.emptySet();

            loadTemplatesConfig();
    public Template findTemplate(String name, String contextTypeId) {
    private boolean contextExists(String contextTypeId) {
                InputStream stream = new BufferedInputStream(url.openStream());
                    if (bundleURL != null) {
        public void save() throws IOException {
                            ContentUtils.close(bundleStream);
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
            }
        lock().execWriting(o -> super.restoreDefaults(doSave));

    private static final Log log = Log.getLog(SQLTemplateStore.class);
                        try {
        String contributorId,
            log.error("Failed to load custom template names", ex);
            SQLEditorActivator.PLUGIN_ID,
    @Override
    public static SQLTemplateStore createInstance(@NotNull ContextTypeRegistry registry) {
                return Stream.of(reader.read(input)).map(t -> t.getTemplate().getName()).collect(Collectors.toSet());
     * Validates a template against the context type registered in the context
     *
import org.eclipse.jface.text.templates.ContextTypeRegistry;
     * or if no context type registry is present.
    

    }
        Collection<TemplatePersistenceData> templates = new ArrayList<>();
        
            "templates/default-templates.xml",
        String contextTypeId = template.getContextTypeId();
        @Override
    @Override
    private final ReaderWriterLock<?> rwLock = new ReaderWriterLock<>(() -> null);
    }
        return contextTypeId != null && (getRegistry() == null || getRegistry().getContextType(contextTypeId) != null);
        this.customTemplatesStore = customTemplatesStore;

                return;
    
                if (CommonUtils.isNotEmpty(content)) {
                    }
                        }
        if (!contextExists(contextTypeId))

     * present.
        return lock().computeReading(o ->  super.findTemplate(name));
}
    }
        } catch (IOException ex) {
        if (file != null) {
        return rwLock;
            Collection<TemplatePersistenceData> contributed = readContributedTemplates();

import org.eclipse.core.runtime.FileLocator;
            try {

    }
     * Creates SQLTemplateStore instance by the specified template context registry
            } catch (TemplateException e) {
 * Copyright (c) 2000, 2008 IBM Corporation and others.
    }
    public void restoreDefaults(boolean doSave) {
        }
     * @param contextTypeId the context type id to look for
            super.load();
    }
        try {
    
        } 

import org.jkiss.dbeaver.Log;
    }
                TemplateReaderWriter reader = new TemplateReaderWriter();
     *

                try {
    @Override
            }
                    .getProductConfigurationController()
        readIncludedTemplates(
                            if (data.getId() == null)
        return lock().computeReading(o ->  super.findTemplate(name, contextTypeId));
     */
    @Override
                    TemplatePersistenceData[] datas = reader.read(stream, bundle);
            try {
            } catch (DBException e) {
 * Manages templates. Handles reading default templates contributed via XML and
 * are made available under the terms of the Eclipse Public License v1.0
    @Override
 *     IBM Corporation - initial API and implementation
        
import java.net.URL;
        lock().execWriting(o -> super.add(data));
                    .saveConfigurationFile(TEMPLATES_CONFIG_XML, templatesConfig);
     * Loads the templates contributed via the templates extension point.
                log.warn("Can't save template configuration", e);
        return new SQLTemplateStore(registry, new CustomTemplatesStore());

    }
     * @return <code>true</code> if validation is successful or no context
    protected void loadContributedTemplates() throws IOException {
                return false;
        lock().execWriting(o -> super.internalAdd(data));
 * http://www.eclipse.org/legal/epl-v10.html
            for (TemplatePersistenceData data : contributed) {
                }
    private static class CustomTemplatesStore extends SimplePreferenceStore {
     * Partially copied from eclipse sources
                    TemplateReaderWriter reader = new TemplateReaderWriter();
                String content = DBWorkbench.getPlatform().getProductConfigurationController().loadConfigurationFile(TEMPLATES_CONFIG_XML);
        if (getRegistry() != null) {
/**
 * Contributors:
    @Override
import java.util.*;
/*******************************************************************************
    public Template findTemplateById(String id) {
                    for (TemplatePersistenceData data : datas) {
     * fails
package org.jkiss.dbeaver.ui.editors.sql.templates;
    @Override

 */
import org.eclipse.jface.text.templates.persistence.TemplateReaderWriter;
        lock().execWriting(o -> super.load());
    protected void internalAdd(org.eclipse.text.templates.TemplatePersistenceData data) {
                        InputStream bundleStream = bundleURL.openStream();
    @Override
                Reader input = new StringReader(pref);
                ResourceBundle bundle = null;
                    }
import org.jkiss.utils.CommonUtils;
    /////////////////////////////////////////////////////////////////////////////////////
    @Override
        return lock().computeReading(o -> super.getTemplates());
                log.error(e);

                                log.error("No template id specified");
     * type registry is specified, <code>false</code> if validation
                "$nl$/templates/" + provider.getId() + "-templates.properties");



        
    }
    @Override
    /**
     * Reload templates configuration
                        } finally {
    public TemplatePersistenceData getTemplateData(String id) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorActivator;
                clear();
        String translations) throws IOException {
    /**
            } 
        return lock().computeReading(o -> super.getTemplateData(includeDeleted));

            }
    /**
                                log.error("Template " + data.getTemplate().getName() + " deleted");
    }
    }
    public Template[] getTemplates(String contextTypeId) {
    }
    private final CustomTemplatesStore customTemplatesStore;
            } catch (DBException e) {
    /**

 * which accompanies this distribution, and is available at
                log.error("Template '" + template.getName() + "' validation failed", e);
    private Collection<TemplatePersistenceData> readContributedTemplates() throws IOException {
