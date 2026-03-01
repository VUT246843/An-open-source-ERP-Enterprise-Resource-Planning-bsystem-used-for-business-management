        return null;
        if (context != null) {
    @Nullable

}                                return symbolEntry.getName();
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolByDbObjectDefinition;
                            }
                        new EntityHyperlink(
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                    final IRegion defRegion = new Region(interval.a + context.getLastAccessedScriptElementOffset(), interval.length());
                
 * you may not use this file except in compliance with the License.
import org.antlr.v4.runtime.misc.Interval;
import org.jkiss.dbeaver.model.sql.semantics.SQLDocumentSyntaxContext;
 * DBeaver - Universal Database Manager
        if (!this.contextInformer.hasObjects() || this.contextInformer.getKeywordType() == DBPKeywordType.KEYWORD) {
                        )
        }
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
package org.jkiss.dbeaver.ui.editors.sql.syntax;

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
                            }
            } catch (BadLocationException e) {
            final IRegion hlRegion = new Region(wordRegion.identStart, wordRegion.identEnd - wordRegion.identStart);
                                    textViewer.revealRange(defRegion.getOffset(), defRegion.getLength());
 *
            IHyperlink[] links = new IHyperlink[references.size()];
    
    }
                                    textViewer.setSelectedRange(defRegion.getOffset(), defRegion.getLength());
                        ? tab.getName().parts.getLast()
                    return new IHyperlink[] {
            // Long task - just return no links for now
import org.jkiss.dbeaver.model.DBPKeywordType;
                                }
 * limitations under the License.
                if (symbolEntry != null) {
    public synchronized IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {
import org.jkiss.dbeaver.model.impl.struct.DirectObjectReference;
                    Interval interval = symbolEntry.getInterval();

import java.util.List;
            // Create hyperlinks based on references
                SQLQuerySymbolEntry symbolEntry = token.getDefinition() instanceof SQLQuerySymbolEntry def
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            SQLQuerySymbolEntry token = context.findToken(offset);
    private final SQLContextInformer contextInformer;
        this.contextInformer.searchInformation(region);
/*
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        final SQLIdentifierDetector.WordRegion wordRegion = this.contextInformer.getWordRegion();
                            @Override
                            public void open() {

            try {
        SQLEditorBase editor = contextInformer.getEditor();
                            }
import org.jkiss.dbeaver.ui.editors.entity.EntityHyperlink;
            }
                    : token.getDefinition() instanceof SQLQueryRowsTableDataModel tab && tab.getTable() != null && tab.getName() != null
        super.dispose();
                                return refRegion;
        this.contextInformer = contextInformer;
                            @Override
                    return contextInformer.getEditor().getDocument().get(hlRegion.getOffset(), hlRegion.getLength());
import org.eclipse.jface.text.*;
        IHyperlink[] localScopeRefs = findLocalScopeReference(region.getOffset());
 */
            final List<DBSObjectReference> references = this.contextInformer.getObjectReferences();
 * SQLHyperlinkDetector
    }
                    };
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
                            public String getHyperlinkText() {
            final SQLIdentifierDetector.WordRegion wordRegion = this.contextInformer.getWordRegion();
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
                            public String getTypeLabel() {

            for (int i = 0, objectsSize = references.size(); i < objectsSize; i++) {
                        }
        if (localScopeRefs != null) {
            return null;
        }
                            }
import org.eclipse.jface.text.hyperlink.IHyperlink;
                                if (textViewer != null) {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }

            final IRegion hlRegion = new Region(wordRegion.identStart, wordRegion.identEnd - wordRegion.identStart);
                links[i] = new EntityHyperlink(contextInformer.getEditor().getSite(), references.get(i), hlRegion);
    @Override

    }
        }
                } else if (token.getDefinition() instanceof SQLQuerySymbolByDbObjectDefinition def
                IDocument document = contextInformer.getEditor().getDocument();
    @Override
                        new IHyperlink() {
                            editor.getSite(),
                            public IRegion getHyperlinkRegion() {
        if (wordRegion != null) {
                                return null;
                            new DirectObjectReference(def.getDbObject().getParentObject(), null, def.getDbObject()),
            return localScopeRefs;

import org.jkiss.code.Nullable;

                final IRegion refRegion = new Region(context.getLastAccessedTokenOffset(), token.getInterval().length());

    private IHyperlink[] findLocalScopeReference(int offset) {
                                TextViewer textViewer = editor.getTextViewer();

                }
        
    public void dispose() {
    public String getLastKeyword() {
                ) {
            if (token != null) {
                    ? def
            }
        SQLDocumentSyntaxContext context = editor.getSyntaxContext();
            return links;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public SQLHyperlinkDetector(SQLContextInformer contextInformer) {
 * You may obtain a copy of the License at
                            @Override
                            @Override
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    return new IHyperlink[] {
                    // TODO consider multiple definitions
 * See the License for the specific language governing permissions and
        } else {
public class SQLHyperlinkDetector extends AbstractHyperlinkDetector {
        return null;
                log.error(e);

    }
                    && def.getDbObject().getDataSource().getContainer() != null
    }
                            refRegion
        }
                    };
/**

    static protected final Log log = Log.getLog(SQLHyperlinkDetector.class);
                        : null;
                if (document != null) {
            }
