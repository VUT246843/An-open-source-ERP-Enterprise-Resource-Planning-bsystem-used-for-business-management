/**
    @Override

        return DBWorkbench.isDistributed() ? HelpUtils.TE_HELP_PREFIX : HelpUtils.GLOBAL_HELP_PREFIX;

 *
    private void showHelpPage(String fileURL) {
            if (divPos != -1) {
            String topicRef = relatedTopic.getHref();
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.utils.HelpUtils;
        } catch (Exception e) {


        showHelpPage(getHelpRoot());
            if (relatedTopics == null || relatedTopics.length == 0) {
 * limitations under the License.
    public boolean isContextHelpDisplayed()
            int divPos = topicRef.indexOf('/');
import org.eclipse.help.IContext;
    {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
}
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
                topicRef = topicRef.substring(divPos + 1);
 *
    @Override
                topicRef = topicRef.substring(1);
import org.jkiss.dbeaver.ui.ShellUtils;
package org.jkiss.dbeaver.ui.help;
import org.jkiss.dbeaver.Log;
    }
            }
                return;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
    @Override
            }

    public void displayHelp() {
import org.eclipse.ui.help.AbstractHelpUI;
    }
 * you may not use this file except in compliance with the License.
 *
    {
 * Lightweight help UI
    public void displayContext(IContext context, int x, int y) {
import org.eclipse.help.IHelpResource;
        }
        showHelpPage(href);
    private String getHelpRoot() {
        displayHelp();
 * DBeaver - Universal Database Manager
        return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class GitHubWikiHelpUI extends AbstractHelpUI {

    }
            IHelpResource[] relatedTopics = context.getRelatedTopics();
    private static final Log log = Log.getLog(GitHubWikiHelpUI.class);

 * See the License for the specific language governing permissions and
            showHelpPage(getHelpRoot() + topicRef);
    public void displayHelpResource(String href)
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        ShellUtils.launchProgram(fileURL);


            IHelpResource relatedTopic = relatedTopics[0];
            while (topicRef.startsWith("/")) {


            log.error(e);
    public void displayDynamicHelp() {
/*
    }
        try {
 */
            //Cut plugin ID from href
    }

