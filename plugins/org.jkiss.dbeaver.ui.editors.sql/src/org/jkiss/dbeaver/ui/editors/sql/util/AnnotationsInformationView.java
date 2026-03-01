                IRegion visualLineRange = editor.getTextViewer().modelRange2WidgetRange(modelLineRange);

        }
import org.eclipse.jface.layout.RowLayoutFactory;
        if (command == null) {
    }
        @NotNull
        @Override
            log.error("Failed to resolve command parameters for unknown command '" + QUICK_FIX_COMMAND_ID + "'", e);
    };

                if (!hyperlinkRegion.isDeleted) {

        }
            this.message = message;

                this.lastPosition = annoPosition;
        Composite linkContainer = new Composite(groupLinksContainer, SWT.NONE);
 * you may not use this file except in compliance with the License.
    public void setLinksInformation(@NotNull AnnotationsHoverInfo hoverInfo) {
            this.severity = Math.max(this.severity, getAnnotationSeverity(anno));
            Position firstPos = this.firstPosition;
                case IMarker.SEVERITY_WARNING -> DBIcon.SMALL_WARNING;
    }
                this.oldSelection = null;
            if (textViewer != null && !this.position.isDeleted) {

    }
    }
                    globalWidgetBounds.y + globalWidgetBounds.height - widget.getHorizontalBar().getSize().y
            }
        this.quickFixCommandInfo = obtainQuickFixCommandInfo(editor.getEditorSite());
                } else {
                    DBIcon icon = annotationGroup.getIcon();
    @NotNull
                case IMarker.SEVERITY_INFO -> DBIcon.SMALL_INFO;
        public Position getLastPosition() {
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

                    int x = hasTooltipRanAway || this.tooltipAnchorRegion != null
                int y = Math.min(
        private final String message;
 */
    public record AnnotationHyperlinkInfo(@NotNull Annotation annotation, @NotNull Position position) {
                }
                }
                case IMarker.SEVERITY_ERROR -> DBIcon.SMALL_ERROR;
            String underlyingError = s.getUnderlyingErrorMessage();
        @NotNull
        public final void linkExited(@NotNull HyperlinkEvent e) {
                final int alsoLinksToShow = Math.min(alsoLinksLimit, hyperlinks.size() - 1) + 1;
                    }

        abstract void navigateLink(AnnotationHyperlinkInfo hyperlink);
        @NotNull
import org.jkiss.dbeaver.ui.UIUtils;
        public void open(@NotNull SQLEditorBase editor) {
        private static final int UNKNOWN_SEVERITY = -1;
            if (e.getHref() instanceof AnnotationHyperlinkInfo hyperlink) {
        linkContainer.setLayout(RowLayoutFactory.fillDefaults().spacing(0).create());
                StyledText widget = editor.getTextViewer().getTextWidget();
            description = CommonUtils.isNotEmpty(description) ? (description + " (" + shortcut + ")") : shortcut;
    private final IQuickAssistAssistant quickAssistAssistant;
                );

            this.linksContainer.setLayout(GridLayoutFactory.swtDefaults().spacing(0, 0).margins(0, 0).create());

        }
                );

    private final QuickFixCommandInfo quickFixCommandInfo;
            fixLink.setToolTipText(this.quickFixCommandInfo.description);
            return this.message;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                try {

    }
            UIUtils.createLabel(linkContainer, " (");
        String name;
            fixLink.setText(this.quickFixCommandInfo.name);
}

    @NotNull
                    linksGroupContainer,
        }
            if (CommonUtils.isNotEmpty(underlyingError)) {

                Rectangle globalWidgetBounds = Geometry.toDisplay(widget, widget.getBounds());
        private Point oldSelection = null;
                    return UNKNOWN_SEVERITY;
                Rectangle globalLineBounds = Geometry.toDisplay(widget, localLineBounds);
    @NotNull
            }
 * You may obtain a copy of the License at

        public final void linkEntered(@NotNull HyperlinkEvent e) {
            }
        ) {
        }
                shell.pack(true);
            AnnotationHyperlinkInfo entry = new AnnotationHyperlinkInfo(anno, annoPosition);
            if (e.getHref() instanceof AnnotationHyperlinkInfo hyperlink) {
        if ((this.tooltipAnchorLine >= 0 || this.tooltipAnchorRegion != null) && editor.getDocument() != null
            && editor.getTextViewer() != null
            }
                        groupLinksContainer,
                // nah, no way to adjust position
 *
        @NotNull String name,

        } else {
            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");

                textViewer.getTextWidget().setFocus();
            return switch (this.severity) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            try {
        String shortcut = ActionUtils.findCommandDescription(QUICK_FIX_COMMAND_ID, site, true);
import org.jkiss.dbeaver.Log;
        void navigateLink(AnnotationHyperlinkInfo hyperlink) {
                this.createHyperlinkControl(groupLinksContainer, hyperlinks.getFirst(), annotationGroup.getMessage());
                int offset = visualLineRange.getOffset();
    private final IHyperlinkListener fixHyperlinkListener = new ContextfulHyperlinkListener() {
                        AnnotationHyperlinkInfo hyperlink = hyperlinks.get(i);
    }

                    globalLineBounds.y + globalLineBounds.height,

                Rectangle adjustedBounds = new Rectangle(globalLineBounds.x, y, globalLineBounds.width, globalLineBounds.height);
        }
            log.error("Failed to resolve command by id '" + QUICK_FIX_COMMAND_ID + "'");
        this.forceAnnotationIcon = value;
        link.setText(text);
            if (!this.position.isDeleted) {
                        this.createHyperlinkControl(groupLinksContainer, hyperlink, Integer.toString(hyperlink.position().getOffset()));
                        hyperlinks.size() <= alsoLinksLimit ? ")" : (", ... " + hyperlinks.size() + " such problems in line)")
            }
        public Position getFirstPosition() {
import org.jkiss.code.NotNull;
            } catch (BadLocationException e) {
        }
        @NotNull
            return this.firstPosition;
    }
        private int severity = UNKNOWN_SEVERITY;
            this.oldSelection = null;
            if (anno instanceof MarkerAnnotation ma) {
                    UIUtils.createLabel(groupLinksContainer, " (also at position ");
                }
import java.util.List;
            if (this.oldSelection != null && editor.getTextViewer() != null) {
        }
 * Unless required by applicable law or agreed to in writing, software
                        if (i > 1) {
        @NotNull String description
        Hyperlink link = new Hyperlink(linkContainer, SWT.NONE);
            for (AnnotationsGroupInfo annotationGroup : hoverInfo.annotationsGroups()) {
                } catch (CoreException e) {
                link.setToolTipText(underlyingError);
    @Nullable
    /**

                UIUtils.asyncExec(() -> ActionUtils.runCommand(
            this.navigateLink(hyperlink);
            Position lastPos = this.lastPosition;
    private abstract class ContextfulHyperlinkListener implements IHyperlinkListener {
            hyperlink.quickFix(editor);
                this.oldSelection = editor.getTextViewer() != null ? editor.getTextViewer().getSelectedRange() : null;
 *
        return new QuickFixCommandInfo(name, description);
public class AnnotationsInformationView {
    private Composite linksContainer;

                            UIUtils.createLabel(groupLinksContainer, ", ");
            } else { // marker-less annotation
        public String getMessage() {
import org.eclipse.core.resources.IMarker;
                    linksGroupContainer = this.linksContainer;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
        @Override
            return this.lastPosition;
                int length = visualLineRange.getLength();
import org.eclipse.ui.texteditor.MarkerAnnotation;
        }

            }
        @Override
            this.linksContainer.setLayout(GridLayoutFactory.swtDefaults().create());
import org.eclipse.core.commands.Command;
        try {
        String description;
            UIUtils.createLabel(linkContainer, ")");
import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLSemanticErrorAnnotation;
        int tooltipAnchorLine
        this.tooltipAnchorRegion = hoverInfo.hoverRegion;
        private void navigateLinkInternal(AnnotationHyperlinkInfo hyperlink) {
                        }
 * DBeaver - Universal Database Manager
    ) {

    private final IHyperlinkListener hyperlinkListener = new ContextfulHyperlinkListener() {
                List<AnnotationHyperlinkInfo> hyperlinks = annotationGroup.getAnnotations();
                        ? Math.min(widget.getDisplay().getCursorLocation().x, globalLineBounds.x)
                    shell.setLocation(new Point(x, y));
                    0
                editor.getTextViewer().setSelectedRange(this.oldSelection.x, this.oldSelection.y);
    ) {
    public void show() {
        this.linksContainer = UIUtils.createComposite(parent, 1);
        }
                Shell shell = container.getShell();
            }
            Hyperlink fixLink = new Hyperlink(linkContainer, SWT.NONE);
        container.getShell().pack(true);
import org.jkiss.dbeaver.ui.ActionUtils;
        @NotNull Composite groupLinksContainer,
package org.jkiss.dbeaver.ui.editors.sql.util;
    public record AnnotationsHoverInfo(


                if (hyperlinks.size() > 2) {
        }
import org.eclipse.swt.SWT;
        @Override
import org.eclipse.jface.text.source.Annotation;

            }
            description = command.getDescription();
    private void createHyperlinkControl(
                    return ma.getMarker().getAttribute(IMarker.SEVERITY) instanceof Integer n ? n : IMarker.SEVERITY_INFO;
                                                                          : editor.getDocument().getLineInformation(this.tooltipAnchorLine);

    public Control createControl(@NotNull Composite parent) {
import org.eclipse.jface.util.Geometry;
        private static final Position MAX_POSITION = new Position(Integer.MAX_VALUE, 0);
            fixLink.setHref(hyperlink);
                IRegion modelLineRange = this.tooltipAnchorRegion != null ? this.tooltipAnchorRegion
 * Copyright (C) 2010-2025 DBeaver Corp and others
                Position hyperlinkRegion = hyperlink.position();
    private final AbstractInformationControl container;
import org.eclipse.jface.layout.GridLayoutFactory;
 * See the License for the specific language governing permissions and
            : null;

                editor.selectAndReveal(this.position.getOffset(), 0);
        if (hyperlink.annotation() instanceof SQLSemanticErrorAnnotation s) {
        this.tooltipAnchorLine = hoverInfo.tooltipAnchorLine;
    private final SQLEditorBase editor;
        this.quickAssistAssistant = this.editor.getViewer() != null
                }
                if (hoverInfo.annotationsGroups().size() > 1 || forceAnnotationIcon) {
            ? this.editor.getViewer().getQuickAssistAssistant()
                    }
        @Override
                Rectangle localLineBounds =  widget.getTextBounds(offset, offset + (length > 0 ? length - 1 : length));
import org.eclipse.swt.graphics.Point;
        @NotNull
            hyperlink.open(editor);
        public List<AnnotationHyperlinkInfo> getAnnotations() {
        }
import org.eclipse.jface.text.*;
                        UIUtils.createPlaceholder(linksGroupContainer, 1);
import org.eclipse.swt.widgets.Control;
        @NotNull

                }
    private IRegion tooltipAnchorRegion = null;

                ));
        }
        @Nullable
        link.setHref(hyperlink);
        }
                    QUICK_FIX_COMMAND_ID, editor.getSelectionProvider().getSelection(), editor.getSite()
    @Nullable
        public final void linkActivated(HyperlinkEvent e) {
        }
import org.eclipse.swt.custom.StyledText;
    private int tooltipAnchorLine = -1;
            if (firstPos.offset > annoPosition.offset) {
                        UIUtils.createLabel(linksGroupContainer, icon);
                this.navigateLinkInternal(hyperlink);
        }
        void navigateLink(AnnotationHyperlinkInfo hyperlink) {
                Composite groupLinksContainer = UIUtils.createPlaceholder(
            name = command.getName();
            this.quickAssistAssistant != null &&
        private Position firstPosition = MAX_POSITION;

            if (lastPos.offset + lastPos.length < annoPosition.offset + annoPosition.length) {

import org.eclipse.ui.services.IServiceLocator;
        @NotNull AnnotationHyperlinkInfo hyperlink,
    private boolean forceAnnotationIcon = false;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull List<AnnotationsGroupInfo> annotationsGroups,
                    UIUtils.createLabel(
    @Nullable
import org.eclipse.swt.widgets.Shell;

            this.quickAssistAssistant.canFix(hyperlink.annotation)) {
        }
        link.setUnderlined(true);
    private static final String QUICK_FIX_COMMAND_ID = "org.eclipse.jdt.ui.edit.text.java.correction.assist.proposals";
                    for (int i = 1; i < alsoLinksToShow; i++) {
        if (hoverInfo.annotationsGroups().isEmpty()) {

        private final List<AnnotationHyperlinkInfo> annotations = new ArrayList<>();

/*
                    if (icon != null) {
        public AnnotationsGroupInfo(@NotNull String message) {
    private record QuickFixCommandInfo(
    private static QuickFixCommandInfo obtainQuickFixCommandInfo(@NotNull IServiceLocator site) {
import org.jkiss.dbeaver.model.stm.STMUtils;

                textViewer.setSelectedRange(this.position.getOffset(), this.position.getLength());

            fixLink.setUnderlined(true);
        }
        Command command = ActionUtils.findCommand(QUICK_FIX_COMMAND_ID);
    public void setForceAnnotationIcon(boolean value) {
            }
        } catch (Throwable e) {
    public static class AnnotationsGroupInfo {
    };
            }
                this.firstPosition = annoPosition;

                textViewer.revealRange(this.position.getOffset(), this.position.getLength());
    public AnnotationsInformationView(@NotNull AbstractInformationControl container, @NotNull SQLEditorBase editor) {

                    editor.getTextViewer().setSelectedRange(hyperlinkRegion.getOffset(), hyperlinkRegion.getLength());
import org.jkiss.code.Nullable;
                    } else {
import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.model.DBIcon;
            return null;
        private int getAnnotationSeverity(@NotNull Annotation anno) {

        private Position lastPosition = MIN_POSITION;

        @NotNull
                    hyperlinks.size() == 1 ? 1 : (alsoLinksToShow * 2 + 1),
        }
        if (this.quickFixCommandInfo != null &&
        @NotNull
            fixLink.addHyperlinkListener(this.fixHyperlinkListener);

    }
    }
 * limitations under the License.
                return IMarker.SEVERITY_INFO;
import org.jkiss.utils.CommonUtils;
import org.eclipse.ui.forms.events.HyperlinkEvent;
    private static final Log log = Log.getLog(AnnotationsInformationView.class);
 *
        if (CommonUtils.isNotEmpty(shortcut)) {

        }

        this.container = container;
import org.eclipse.swt.widgets.Composite;
     */
        @Nullable IRegion hoverRegion,
        }
        public void add(@NotNull Annotation anno, @NotNull Position annoPosition) {
    }
import org.eclipse.swt.graphics.Rectangle;
        }
    ) {
                    log.error("Failed to obtain annotation severity icon", e);
                assert !hyperlinks.isEmpty();

        this.editor = editor;
            }
import org.eclipse.ui.forms.events.IHyperlinkListener;
                        : shell.getBounds().x;
        public void quickFix(@NotNull SQLEditorBase editor) {
                if (shell.getBounds().intersects(adjustedBounds) || hasTooltipRanAway || this.tooltipAnchorRegion != null) {
                    linksGroupContainer = UIUtils.createComposite(linksContainer, 2);
            TextViewer textViewer = editor.getTextViewer();
        return this.linksContainer;
        @NotNull String text
    @NotNull
                default -> null;
                Composite linksGroupContainer;
            STMUtils.orderedInsert(this.annotations, e -> e.position().getOffset(), entry, Integer::compare);
        private static final Position MIN_POSITION = new Position(0, 0);

import org.eclipse.ui.forms.widgets.Hyperlink;
     * Collects information for Quick Fix action link in the problem marker tooltip
            };
                final int alsoLinksLimit = 5;
import java.util.ArrayList;
        link.addHyperlinkListener(this.hyperlinkListener);
                    );
            return this.annotations;
        public DBIcon getIcon() {
                boolean hasTooltipRanAway = !globalWidgetBounds.intersects(shell.getBounds());
