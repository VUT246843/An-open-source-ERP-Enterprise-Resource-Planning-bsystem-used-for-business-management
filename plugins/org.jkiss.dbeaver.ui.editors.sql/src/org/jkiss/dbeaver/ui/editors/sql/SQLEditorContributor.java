                editMenu.add(contentFormatProposal);
        if (!isNestedEditor()) {
        contentAssistProposal.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
                super.contributeToCoolBar(manager);
    public void dispose()
            }
import org.eclipse.ui.editors.text.TextEditorActionContributor;
    {
                super.contributeToMenu(manager);
import org.eclipse.ui.*;
                navMenu.add(ActionUtils.makeCommandContribution(window, IWorkbenchCommandConstants.NAVIGATE_PREVIOUS));
                log.debug("Error contributing base SQL actions", e);
    {
    {
    private final StatusLineContributionItem STATUS_FIELD_SELECTION_STATE
        if (activeEditorPart != null) {
    }
        return false;
    static final String ACTION_CONTENT_ASSIST_TIP = "ContentAssistTip"; //$NON-NLS-1$
import org.eclipse.jface.action.*;
        }

            try {
            }
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

        // Init custom actions
            contentFormatProposal.setAction(getAction(activeEditorPart, ACTION_CONTENT_FORMAT_PROPOSAL)); //$NON-NLS-1$
            }

                }
    @Override
        contentAssistInformation.setActionDefinitionId(ITextEditorActionDefinitionIds.SHOW_INFORMATION);
            activeEditorPart = (SQLEditorBase)targetEditor;
    {

public class SQLEditorContributor extends TextEditorActionContributor
package org.jkiss.dbeaver.ui.editors.sql;
                if (ActionUtils.findCommand(SQLEditorCommands.CMD_AI_SUGGESTION) != null) {
 * See the License for the specific language governing permissions and
            }
 * DBeaver - Universal Database Manager
        statusLineManager.add(STATUS_FIELD_SELECTION_STATE);
                navMenu.add(new Separator());


    }

 * SQL Editor contributor
                super.contributeToStatusLine(statusLineManager);

 *
    protected boolean isNestedEditor()
                activeEditorPart.setStatusField(STATUS_FIELD_SELECTION_STATE, SQLEditorBase.STATS_CATEGORY_SELECTION_STATE);
                activeEditorPart.setStatusField(STATUS_FIELD_TRANSACTION_TIMEOUT, SQLEditor.STATS_CATEGORY_TRANSACTION_TIMEOUT);
    public void setActiveEditor(IEditorPart targetEditor)
import org.jkiss.dbeaver.ui.ActionUtils;
            // Update editor actions
            IMenuManager navMenu = manager.findMenuUsingPath(IWorkbenchActionConstants.M_NAVIGATE);
            IMenuManager editMenu = manager.findMenuUsingPath(IWorkbenchActionConstants.M_EDIT);
        /*if (!isNestedEditor()) */{
    private RetargetTextEditorAction contentAssistTip;

            if (editMenu != null) {
                editMenu.add(contentAssistTip);
        contentFormatProposal.setActionDefinitionId(BaseTextEditorCommands.CMD_CONTENT_FORMAT);
            try {
            {
                log.debug("Error contributing to base SQL status line", e);
            IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
        if (targetEditor instanceof SQLEditorBase) {
 * limitations under the License.
                activeEditorPart.setStatusField(null, SQLEditorBase.STATS_CATEGORY_SELECTION_STATE);
    public void init(IActionBars bars)
        if (activeEditorPart != null) {
import org.eclipse.ui.texteditor.RetargetTextEditorAction;
            contentAssistInformation.setAction(getAction(activeEditorPart, ACTION_CONTENT_ASSIST_INFORMATION)); //$NON-NLS-1$
}

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        }
    public void contributeToCoolBar(ICoolBarManager manager)
    @Override
    public void contributeToMenu(IMenuManager manager)

/**
{
    @Override
    static String getActionResourcePrefix(String actionId)
    {
        statusLineManager.add(STATUS_FIELD_TRANSACTION_TIMEOUT);
    static final String ACTION_CONTENT_ASSIST_INFORMATION = "ContentAssistInfo"; //$NON-NLS-1$
            }
        if (activeEditorPart == targetEditor) {
 *
        super.setActiveEditor(targetEditor);
    private static final Log log = Log.getLog(SQLEditorContributor.class);
        }
 * you may not use this file except in compliance with the License.

        contentAssistProposal = new RetargetTextEditorAction(bundle, getActionResourcePrefix(ACTION_CONTENT_ASSIST_PROPOSAL));
    }
    public void contributeToStatusLine(IStatusLineManager statusLineManager)
    private RetargetTextEditorAction contentAssistInformation;

                navMenu.add(ActionUtils.makeCommandContribution(window, SQLEditorCommands.CMD_SQL_SELECT_TO_MATCHING_BRACKET));
        super.dispose();

                editMenu.insertAfter(IWorkbenchActionConstants.MB_ADDITIONS, ActionUtils.makeCommandContribution(window, ITextEditorActionDefinitionIds.BLOCK_SELECTION_MODE));
    }
        createActions();
        }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.BaseTextEditorCommands;
        contentAssistTip.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
            activeEditorPart = null;
            } catch (Exception e) {
            }
                navMenu.add(ActionUtils.makeCommandContribution(window, SQLEditorCommands.CMD_SQL_QUERY_PREV));
        // Contribute to status line always (#4355)
    }
        = new StatusLineContributionItem(SQLEditorBase.STATS_CATEGORY_SELECTION_STATE, true, 12);
    public void contributeToToolBar(IToolBarManager manager)
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import java.util.ResourceBundle;
            try {
            activeEditorPart.setStatusField(null, SQLEditorBase.STATS_CATEGORY_SELECTION_STATE);
    private void createActions()
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return "actions_" + actionId + "_";//$NON-NLS-1$
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
        }
            contentAssistProposal.setAction(getAction(activeEditorPart, ACTION_CONTENT_ASSIST_PROPOSAL)); //$NON-NLS-1$
    // It cannot be static! Otherwise item state cache become corrupted (I guess)
    @Override
    {

        if (!isNestedEditor()) {
                editMenu.add(contentAssistInformation);
    @Override

 * Unless required by applicable law or agreed to in writing, software

    {
                editMenu.add(contentAssistProposal);
    {

import org.eclipse.ui.texteditor.StatusLineContributionItem;
    @Override
    static final String ACTION_CONTENT_ASSIST_PROPOSAL = "ContentAssistProposal"; //$NON-NLS-1$
    private SQLEditorBase activeEditorPart;
        }

        if (!isNestedEditor()) {
 */
            return;
                log.debug("Error contributing to base SQL cool bar", e);
        super.init(bars);
    public SQLEditorContributor()

                navMenu.add(ActionUtils.makeCommandContribution(window, IWorkbenchCommandConstants.NAVIGATE_NEXT));
                navMenu.add(ActionUtils.makeCommandContribution(window, SQLEditorCommands.CMD_SQL_QUERY_NEXT));
        // Nothing here. All contributions moved to editor side bar

                navMenu.add(new Separator());
 *

        super();
        ResourceBundle bundle = ResourceBundle.getBundle(SQLEditorMessages.BUNDLE_NAME);
                    editMenu.add(ActionUtils.makeCommandContribution(window, SQLEditorCommands.CMD_AI_SUGGESTION));
        contentFormatProposal = new RetargetTextEditorAction(bundle, getActionResourcePrefix(ACTION_CONTENT_FORMAT_PROPOSAL));
            contentAssistTip.setAction(getAction(activeEditorPart, ACTION_CONTENT_ASSIST_TIP)); //$NON-NLS-1$


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

            if (navMenu != null) {
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
    private RetargetTextEditorAction contentAssistProposal;
        contentAssistTip = new RetargetTextEditorAction(bundle, getActionResourcePrefix(ACTION_CONTENT_ASSIST_TIP));
        = new StatusLineContributionItem(SQLEditor.STATS_CATEGORY_TRANSACTION_TIMEOUT, true, 25);
    private final StatusLineContributionItem STATUS_FIELD_TRANSACTION_TIMEOUT
        contentAssistInformation = new RetargetTextEditorAction(bundle, getActionResourcePrefix(ACTION_CONTENT_ASSIST_INFORMATION));
            if (activeEditorPart != null) {
                navMenu.add(ActionUtils.makeCommandContribution(window, SQLEditorCommands.CMD_SQL_GOTO_MATCHING_BRACKET));
    }
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    {

        activeEditorPart = null;
    static final String ACTION_CONTENT_FORMAT_PROPOSAL = "ContentFormatProposal"; //$NON-NLS-1$
        }

/*
    private RetargetTextEditorAction contentFormatProposal;
            }
    }

import org.jkiss.dbeaver.Log;
            } catch (Exception e) {
        } else {
            } catch (Exception e) {
    }
    }
