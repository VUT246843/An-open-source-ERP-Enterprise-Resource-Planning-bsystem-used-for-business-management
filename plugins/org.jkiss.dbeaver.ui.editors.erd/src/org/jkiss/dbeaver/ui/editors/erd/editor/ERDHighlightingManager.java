            
                    if (part instanceof ERDConnection connection) {
        if (associatingByTarget == null || associatingByTarget.isEmpty()) {
                // due to the underlying mechanics, which are out of the scope of the highlighting logic
 * distributed under the License is distributed on an "AS IS" BASIS,
            sourceEntityPart,
            erdConnection.setSelected(!erdConnection.isSelected());

                highlightings = ListNode.push(highlightings, this.highlight(attrPart.getFigure(), color));
    ) {

            };
            targetEntityPart = entityPartFromSource;
        @NotNull

                if (highlightings.isEmpty()) {
            if (connection instanceof AssociationPart associationPart
                refresh();
        for (Object connection : entityPart.getSourceConnections()) {
        }
            if (associationPart.getAssociation().getSourceAttributes().contains(attributePart.getAttribute()) ||
            this.originalColor = part instanceof Connection ? part.getForegroundColor() : part.getBackgroundColor();
                    highlighting.release();
            }
            this.part = part;
        @NotNull AssociationPart associationPart,
    private static final Log log = Log.getLog(ERDHighlightingManager.class);

            }
    }
    private List<AttributePart> getEntityAttributes(@NotNull EntityPart source, @NotNull List<ERDEntityAttribute> columns) {
    public ListNode<ERDHighlightingHandle> highlightAssociation(
                highlightings = ListNode.push(highlightings, this.highlight(associationPart.getFigure(), color));
        private final Color originalColor;
        } else if (associationPart.getSource().getParent() instanceof EntityPart entityPartFromParent) {
        List<AttributePart> sourcePartAttributes = getEntityAttributes(
                associationPart.getAssociation().getTargetAttributes().contains(attributePart.getAttribute())) {
                        part.setBackgroundColor(highlightings.getLast().color);

                associationPart.getAssociation().getTargetAttributes().contains(attributePart.getAttribute())) {

                    if (part instanceof ERDConnection connection) {
     * The method highlight association by AssociationPart
            if (attributePart.getParent() instanceof EntityPart entityPart) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull
        for (AssociationPart associationPart : attributePart.getAssociatingBySource()) {
     * @param color - {@code Color}
        List<AttributePart> targetPartAttributes = getEntityAttributes(
public class ERDHighlightingManager {
        
        }
 * limitations under the License.

        for (Object connection : entityPart.getTargetConnections()) {
    public ListNode<ERDHighlightingHandle> highlightAssociation(
        @NotNull Color color
                    highlightedParts.remove(part);
        }
            sourceEntityPart = entityPartFromSource;
        }
    @NotNull
                if (this.highlightings.isEmpty()) {
            if (associationPart.getAssociation().getSourceAttributes().contains(attributePart.getAttribute()) ||
 */
            associationPart.getAssociation().getSourceAttributes());

                    } else {
import org.jkiss.dbeaver.utils.ListNode;
            this.originalOpaque = part.isOpaque();
        public PartHighlighter(@NotNull IFigure part) {
import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;
        EntityPart sourceEntityPart = null;
    /**
        public ERDHighlightingHandle highlight(@NotNull Color color) {
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;
        }
                result.add((AttributePart) attrPart);
        }
        }
            }

        private final IFigure part;
            if (attributePart.getParent() instanceof EntityPart entityPart) {
        ListNode<ERDHighlightingHandle> highlightings = null;
                highlightings = ListNode.push(highlightings, this.highlight(attrPart.getFigure(), color));
    private final Map<IFigure, PartHighlighter> highlightedParts = new HashMap<>();

            for (AttributePart attrPart : getEntityAttributes(entityPart, associationPart.getAssociation().getTargetAttributes())) {
 * Unless required by applicable law or agreed to in writing, software
        if (associationPart.getSource() instanceof EntityPart entityPartFromSource) {
     *
        @NotNull

            }
    private final class PartHighlighter {

import java.util.*;
                        connection.setSelected(true);
     * @param associationPart - {@code AssociationPart}
     * @return - {@code ListNode<ERDHighlightingHandle>}
        for (AttributePart attrPart : targetPartAttributes) {
    
        for (AssociationPart associationPart : associatingBySource) {
                highlightings = ListNode.join(highlightings, highlightRelatedAttributes(associationPart, color));
                associationPart.getAssociation().getTargetAttributes().contains(attributePart.getAttribute()))) {
    ) {

    /**
     * @return - {@code ListNode<ERDHighlightingHandle>} 
                log.warn("Inconsistent highlighting management detected during figure props refresh.", ex);
        List<AssociationPart> associatingByTarget = attributePart.getAssociatingByTarget();
    public ERDHighlightingHandle highlight(@NotNull IFigure part, @NotNull Color color) {

        EntityPart targetEntityPart = null;
                highlightings = ListNode.push(highlightings, this.highlight(associationPart.getFigure(), color));
     *
 * See the License for the specific language governing permissions and
            this.refresh();
        @NotNull AssociationPart associationPart,
            }
        if (associationPart.getTarget() instanceof EntityPart entityPartFromSource) {
        private final LinkedList<HighlightingEntry> highlightings = new LinkedList<>();
                associationPart.getAssociation().getTargetAttributes().contains(attributePart.getAttribute())) {
                associationPart.getAssociation().getTargetAttributes().contains(attributePart.getAttribute())) {
                        connection.setSelected(false);
            this.color = color;
        @Nullable ListNode<ERDHighlightingHandle> highlightings,
    public ListNode<ERDHighlightingHandle> highlightRelatedAttributes(
            highlightings.addLast(entry);
        }
                highlightings = ListNode.join(highlightings, highlightRelatedAttributes(associationPart, color));
                } else {

    /**
    @Nullable
            }
                }

import org.eclipse.draw2d.Connection;
        }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
            }
        }
        }
    private static final class HighlightingEntry {
     * The method highlight association and attributes 
        }
            for (AttributePart attrPart : getEntityAttributes(entityPart, associationPart.getAssociation().getSourceAttributes())) {
                highlightings.remove(entry);
        private void refresh() {
                part.repaint();
        return result;
        }
        }
    public ListNode<ERDHighlightingHandle> highlightRelatedAttributes(
        }
            try {

        }
        if (!(attributePart.getParent() instanceof EntityPart entityPart)) {
 * You may obtain a copy of the License at
        @NotNull Color color
            highlightings = ListNode.push(highlightings, highlight(attrPart.getFigure(), color));
    @NotNull
        for (AssociationPart associationPart : associatingByTarget) {
        List<AttributePart> result = new ArrayList<>(columns.size());
                && (associationPart.getAssociation().getSourceAttributes().contains(attributePart.getAttribute()) ||
    @NotNull
    }
                highlightings = ListNode.join(highlightings, highlightRelatedAttributes(associationPart, color));
     * @param associationPart - {@code AssociationPart}
        public final Color color;
            return () -> {
                        part.setForegroundColor(originalColor);
     * @param color - {@code Color}
        ListNode<ERDHighlightingHandle> highlightings = null;
import org.jkiss.dbeaver.model.erd.ERDEntityAttribute;
    ) {
        for (AttributePart attrPart : sourcePartAttributes) {
        return highlightings;
                highlightings = ListNode.join(highlightings, highlightRelatedAttributes(associationPart, color));
            if (associationPart.getAssociation().getSourceAttributes().contains(attributePart.getAttribute()) ||
import org.jkiss.code.Nullable;
        }
            return null;
    }
                // any of the figure setters may internally use repaint(), and any of them could use
        @NotNull Color color
        if (highlightings == null) {
    @Nullable
            }
    }
            targetEntityPart,
                    part.setOpaque(true);
        List<AssociationPart> associatingBySource = attributePart.getAssociatingBySource();

                associationPart.getAssociation().getTargetAttributes().contains(attributePart.getAttribute()))) {
    }
        highlightings = ListNode.push(highlightings, this.highlight(associationPart.getFigure(), color));
        }
 *
    @Nullable
                    }
     * @param color - {@code Color}
        }
            }
            associationPart.getAssociation().getTargetAttributes());
            }
                        part.setBackgroundColor(originalColor);
                associatingBySource = (List<AssociationPart>) entityPart.getSourceConnections();
            }

        for (Object attrPart : source.getChildren()) {
        private final boolean originalOpaque;
            } catch (Throwable ex) {
            if (associationPart.getAssociation().getSourceAttributes().contains(attributePart.getAttribute()) ||
     *

            sourceEntityPart = entityPartFromParent;
        } else if (associationPart.getTarget().getParent() instanceof EntityPart entityPartFromParent) {
        @NotNull AttributePart attributePart,
                associatingByTarget = (List<AssociationPart>) entityPart.getTargetConnections();


import org.eclipse.draw2d.IFigure;
        public HighlightingEntry(@NotNull Color color) {
 *
    public ERDHighlightingHandle makeHighlightingGroupHandle(@Nullable ListNode<ERDHighlightingHandle> highlightings) {

/*
}
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return highlightings;
import org.eclipse.swt.graphics.Color;
 * DBeaver - Universal Database Manager
 *
        @Nullable ListNode<ERDHighlightingHandle> highlightings,
                    }
    @Nullable
     */
            }
        if (associationPart.getSource() instanceof EntityPart entityPart) {

                for (ERDHighlightingHandle highlighting: highlightings) {
    // we are removing entry somewhere in the middle of the highlighting stack, so reference identity is required,
    }

            HighlightingEntry entry = new HighlightingEntry(color);
        return highlightedParts.computeIfAbsent(part, PartHighlighter::new).highlight(color);
     * The method highlight association by AttributePart
    }
 * you may not use this file except in compliance with the License.
        return highlightings;
                }
        @NotNull Color color
            if (attrPart instanceof AttributePart && columns.contains(((AttributePart) attrPart).getAttribute())) {
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
     * @return - {@code ListNode<ERDHighlightingHandle>}
        }
            return () -> {
package org.jkiss.dbeaver.ui.editors.erd.editor;
            if (connection instanceof AssociationPart associationPart
                }
        @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull AttributePart attributePart, 
    }
import org.jkiss.dbeaver.ui.editors.erd.connector.ERDConnection;
    }
            targetEntityPart = entityPartFromParent;
        if (associationPart.getTarget() instanceof EntityPart entityPart) {
                    } else {
            highlightings = ListNode.push(highlightings, highlight(attrPart.getFigure(), color));
            }; 
    ) {
        if (associatingBySource == null || associatingBySource.isEmpty()) {
    // which Color class does not follow, as it supports by-value equivalence
    @Nullable
        } else {
                    part.setOpaque(originalOpaque);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
                // internal object model infrastructure of the Eclipse Graphics Editor, which might be partially invalidated
     */
     * @param attributePart - {@code AttributePart}
        for (AssociationPart associationPart : attributePart.getAssociatingByTarget()) {
        if (associationPart.getConnectionFigure() instanceof ERDConnection erdConnection) {
        return highlightings;
                        part.setForegroundColor(highlightings.getLast().color);
        }
            return null;
                && (associationPart.getAssociation().getSourceAttributes().contains(attributePart.getAttribute()) ||
