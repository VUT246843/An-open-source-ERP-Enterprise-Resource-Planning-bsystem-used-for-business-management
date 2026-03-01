

 * you may not use this file except in compliance with the License.
            }


        }
                }
                    DBSObjectType[] objectTypes = structureAssistant.getHyperlinkObjectTypes();

            }
                DBPEventListener dbpEventListener = new DBPEventListener() {
 * Unless required by applicable law or agreed to in writing, software
            contextCache.put(fullName, tlc);

                if (wordDetector.isQuoted(tableName)) {
            return;
                }
{
import org.eclipse.swt.widgets.Display;
    private static class ObjectLookupCache {
            }
                                    List<DBSObjectReference> objReferences = structureAssistant.findObjectsByMask(monitor, executionContext, params);
                                    params.setGlobalSearch(true);
            }
            }
        private final boolean caseSensitive;
            this.objectName = objectName;
    }
                            if (childContainer == null && structureAssistant != null) {
            this.cache = cache;
            return true;
        ITextViewer textViewer = editor.getTextViewer();
import java.util.*;
                        DBSObject childContainer = dsContainer.getChild(monitor, containerNames[0]);
    private List<DBSObjectReference> objectReferences;
import org.eclipse.core.runtime.IStatus;
    private static final Log log = Log.getLog(SQLContextInformer.class);
        if (dataSource == null) {
                            childContainer = null;
    private DBPKeywordType keywordType;
        @Override
                    if (unquotedName.equals(tableName)) {
        private final String objectName;
        if (wordRegion.word.isEmpty()) {
                objectReferences = tlc.references;
            setSystem(true);
                        if (!DBStructUtils.isConnectedContainer(childContainer)) {
    private String[] keywords;
                LINKS_CACHE.remove(dataSource.getContainer().getId());
                for (int i = 0; i < containerNames.length; i++) {
 * DBeaver - Universal Database Manager
        return !CommonUtils.isEmpty(objectReferences);
        }
/**
        this.keywords = new String[0];
        }
    private SQLSyntaxManager syntaxManager;
                                container = (DBSObjectContainer) childContainer;
            boolean[] result = new boolean[1];
            super("Find object '" + objectName + "'", executionContext);
                LINKS_CACHE.put(container.getId(), cacheMap);
                                DBCExecutionContext executionContext = editor.getExecutionContext();
        if (region == null || textViewer == null || executionContext == null) {
                    break;
                        params.setCaseSensitive(caseSensitive);
import org.eclipse.jface.text.IRegion;
                return Status.CANCEL_STATUS;
                    @Override
                if (!tlc.loading) {
        }
                }
    }
            // It is a keyword = let's use whole selection
                tableName = parts[parts.length - 1];
                        for (int i = 1; i < containerNames.length; i++) {
                        if (childContainer == null) {
public class SQLContextInformer


        }

                            }
import org.jkiss.dbeaver.model.struct.*;

            Map<String, ObjectLookupCache> cacheMap = LINKS_CACHE.get(container.getId());
                                // Container is not direct child of schema/catalog. Let's try struct assistant
                // Full name could be quoted

                                    }
                        containerNames[i] = DBUtils.getUnQuotedIdentifier(containerNames[i], syntaxManager.getIdentifierQuoteStrings());
                editor.getEditorControl().addDisposeListener(e -> registry.removeDataSourceListener(dbpEventListener));
import org.jkiss.code.Nullable;

                    if (dsContainer != null) {

                            // Yep - this is it
        DBPDataSource dataSource = this.editor.getDataSource();
                    final String fixedName = DBObjectNameCaseTransformer.transformName(getExecutionContext().getDataSource(), objectName);
            try {
                monitor.done();
import org.eclipse.jface.text.ITextViewer;

        this.syntaxManager = syntaxManager;
                        DBCExecutionContextDefaults<?,?> contextDefaults = getExecutionContext().getContextDefaults();
                }
                             if (contextDefaults != null) {
        return objectReferences;
                        params.setMaxResults(10);
        if (contextCache == null) {
            }
                                    // We still can find it, unless search for schema_name.table_name doesn't work
                if (wordDetector.isQuoted(fullName)) {
import org.jkiss.dbeaver.model.impl.struct.DirectObjectReference;
        if (tlc.loading) {
                        }
                try {
            return;
            cache.references = new ArrayList<>();
 */
                        }
    public DBPKeywordType getKeywordType() {
/*
            for (int i = 0; i < 20; i++) {
        }
        if (!CommonUtils.equalObjects(fullName, tableName)) {
            }
    }
        keywordType = dialect.getKeywordType(fullName);
                    DBSObjectContainer dsContainer = DBUtils.getAdapter(DBSObjectContainer.class, getExecutionContext().getDataSource());
                        // and schema name is the same as catalog name.
 */
                                 if (contextDefaults.getDefaultCatalog() != null) {

                                registry.removeDataSourceListener(this);

            TablesFinderJob job = new TablesFinderJob(executionContext, structureAssistant, containerNames, tableName, caseSensitive, tlc);
        private boolean findTables(DBRProgressMonitor monitor) throws DBException {
}
                    if (wordDetector.isQuoted(containerNames[i])) {
                Display.getCurrent().readAndDispatch();
        IDocument document = textViewer.getDocument();

                DBSObjectContainer container = null;
    public void searchInformation(@Nullable IRegion region) {

import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        if (!tlc.loading) {
        wordRegion = wordDetector.extractIdentifier(document, region, editor.getRuleManager());
                            container = objectContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    result[0] = findTables(monitor);
                                            structureAssistant.getAutoCompleteObjectTypes(),
    public synchronized boolean hasObjects() {
    public synchronized List<DBSObjectReference> getObjectReferences() {

            try {
                            DBSObject childContainer = container.getChild(monitor, containerNames[i]);
            if (!result[0]) {
                if (!ArrayUtils.isEmpty(containerNames)) {
    public SQLEditorBase getEditor() {
                                    DBSStructureAssistant.ObjectsSearchParams params = new DBSStructureAssistant.ObjectsSearchParams(
                                    //     return false;
                    if (containerNames.length > 1) {
            int divPos = fullName.indexOf(syntaxManager.getStructSeparator());
                                     childContainer = contextDefaults.getDefaultCatalog().getChild(monitor, containerNames[0]);
                } else if (structureAssistant != null) {
        List<DBSObjectReference> references;
                    if (executionContext != null && executionContext.getDataSource().getContainer().isExtraMetadataReadEnabled()) {
                    }

        private final DBSStructureAssistant structureAssistant;
        this.editor = editor;
                            // Check in selected object
        private final String[] containerNames;
            DBSStructureAssistant<?> structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, editor.getDataSource());
        }
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        SQLWordPartDetector wordDetector = new SQLWordPartDetector(document, syntaxManager, region.getOffset());
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                }
        protected IStatus run(@NotNull DBRProgressMonitor monitor)
                        }
import org.eclipse.core.runtime.Status;
import org.jkiss.utils.CommonUtils;
            return cacheMap;
            } catch (BadLocationException e) {
                                        childContainer = objReferences.get(0).resolveObject(monitor);
 *
import org.jkiss.dbeaver.Log;
        final SQLDialect dialect = syntaxManager.getDialect();
import org.jkiss.utils.ArrayUtils;
            // Skip keywords
            // Transform container name case
        return keywordType;
                                if (executionContext != null) {
                        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return wordRegion;
        if (dataSource != null) {
    private final SQLEditorBase editor;
            return Status.OK_STATUS;

            this.containerNames = containerNames;
 * limitations under the License.
                                break;
        DBPDataSource dataSource = editor.getDataSource();
        }
        if (wordDetector.isQuoted(tableName)) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                    }
            tableName = DBUtils.getUnQuotedIdentifier(tableName, syntaxManager.getIdentifierQuoteStrings());
                }
                        // So let's try to get nested container because we always need the deepest one.
        this.objectReferences = Collections.emptyList();

            } catch (DBException e) {


                }
                log.warn(e);
                        if (childContainer instanceof DBSObjectContainer objectContainer) {
                });
            return;
                    }
                            }
        ObjectLookupCache tlc = contextCache.get(fullName);
                    }
        {
            synchronized (this) {
                DBSObject targetObject = null;
                        DBSStructureAssistant.ObjectsSearchParams params = new DBSStructureAssistant.ObjectsSearchParams(objectTypes, objectName);
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
        return editor;
                    // interrupted - just go further
                    tableName = DBUtils.getUnQuotedIdentifier(tableName, syntaxManager.getIdentifierQuoteStrings());
        if (keywordType == DBPKeywordType.KEYWORD && region.getLength() > 1) {
            } else {
                             }
                    if (fixedName != null) {
                if (targetObject != null) {
                };
            try {
                DBPDataSourceRegistry registry = container.getRegistry();
    public String[] getKeywords() {

                    }
        String fullName = wordRegion.identifier;
        }
        if (tlc == null) {

import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

                    DBCExecutionContext executionContext = editor.getExecutionContext();
                    }
    public void refresh(SQLSyntaxManager syntaxManager) {
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
                    cache.references.add(new DirectObjectReference(container, null, targetObject));
                fullName = document.get(region.getOffset(), region.getLength());
        @NotNull
        }
package org.jkiss.dbeaver.ui.editors.sql.syntax;
                                 }
                        targetObject = container.getChild(monitor, fixedName);
                            synchronized (LINKS_CACHE) {
            }
                        }
        if (keywordType == DBPKeywordType.KEYWORD || keywordType == DBPKeywordType.FUNCTION) {
                cacheMap = new HashMap<>();
                            container = (DBSObjectContainer) childContainer;
 *
                        // this may happen if database supports multiple nested containers (catalog+schema+?)
 *
 * See the License for the specific language governing permissions and
        }

                                LINKS_CACHE.remove(container.getId());
                DBExecUtils.tryExecuteRecover(monitor, getExecutionContext().getDataSource(), param -> {
                        if (!CommonUtils.isEmpty(objects)) {
                        // We have multiple containers. They MUST combine a unique
            job.schedule();
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    }
                                            containerNames[0]
    public SQLIdentifierDetector.WordRegion getWordRegion() {

    private static final Map<String, Map<String, ObjectLookupCache>> LINKS_CACHE = new HashMap<>();

                } catch (InterruptedException e) {
                }
                if (container != null) {
                registry.addDataSourceListener(dbpEventListener);
                                    );
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
                // Register disconnect listener
            monitor.beginTask("Read metadata information", 1);
            setUser(false);
                                container = (DBSObjectContainer) childContainer;
                            if (childContainer instanceof DBSObjectContainer) {

                                    params.setMaxResults(1);
    {
                cache.loading = false;
        String[] containerNames = null;
        this.syntaxManager = syntaxManager;
            // Start new word finder job
 * SQLContextInformer
        protected TablesFinderJob(@NotNull DBCExecutionContext executionContext, @Nullable DBSStructureAssistant structureAssistant, @Nullable String[] containerNames, @NotNull String objectName, boolean caseSensitive, @NotNull ObjectLookupCache cache)
    }
                    public void handleDataSourceEvent(@NotNull DBPEvent event) {
        if (document == null) {
                                    if (objReferences.size() == 1) {
import org.eclipse.jface.text.BadLocationException;
        final Map<String, ObjectLookupCache> contextCache = getLinksCache();
import org.jkiss.code.NotNull;
                log.warn(e);

    }
            caseSensitive = true;
        String tableName = wordRegion.word;
                }
        boolean caseSensitive = false;
        }
        boolean loading = true;
                            } else {
        synchronized (LINKS_CACHE) {

            }

                            cache.references.addAll(objects);
        private final ObjectLookupCache cache;
import org.jkiss.dbeaver.model.*;
                    Thread.sleep(50);
            synchronized (LINKS_CACHE) {
    private class TablesFinderJob extends DataSourceJob {
                        params.setParentObject(container);
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.structureAssistant = structureAssistant;
                        if (event.getAction() == DBPEvent.Action.OBJECT_UPDATE && Boolean.FALSE.equals(event.getEnabled())) {
                return Status.CANCEL_STATUS;
            return;

                                }
                        // We have a container. But maybe it is a wrong one -
            return;
    }
                        } else {
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;
            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
                containerNames = ArrayUtils.remove(String.class, parts, parts.length - 1);
        final DBCExecutionContext executionContext = editor.getExecutionContext();
            if (divPos != -1) {
                            }
            // Wait for 1000ms maximum
                    } else {
                        }
                            }
                    containerNames[i] = DBObjectNameCaseTransformer.transformName(editor.getDataSource(), containerNames[i]);
    }
                        }
                        if (childContainer instanceof DBSObjectContainer) {
        }
    public SQLContextInformer(SQLEditorBase editor, SQLSyntaxManager syntaxManager)
                String[] parts = wordDetector.splitIdentifier(fullName);
                        DBSObject childContainer = container.getChild(monitor, containerNames[0]);

        }
            finally {
import org.jkiss.dbeaver.DBException;

    private Map<String, ObjectLookupCache> getLinksCache() {
        }
    }
        }
                    break;
                if (container != null) {
                    String unquotedName = DBUtils.getUnQuotedIdentifier(tableName, syntaxManager.getIdentifierQuoteStrings());
        final DBPDataSourceContainer container = dataSource.getContainer();
                                    // if (childContainer == null) {
                        // path to the object
            tlc = new ObjectLookupCache();
    }

    private SQLIdentifierDetector.WordRegion wordRegion;
            }
        return keywords;
                        caseSensitive = true;
                                    // }
    }
                            if (childContainer instanceof DBSObjectContainer) {
                        Collection<DBSObjectReference> objects = structureAssistant.findObjectsByMask(monitor, executionContext, params);
import org.eclipse.jface.text.IDocument;
        keywords = new String[] { fullName };
            if (cacheMap == null) {

import org.jkiss.dbeaver.model.sql.SQLDialect;
            this.caseSensitive = caseSensitive;
        {
                    }
