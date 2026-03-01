            SAXParserFactory factory = SAXParserFactory.newInstance();
 *
        tipDialog.setDisplayShowOnStartup(true);
                Collections.shuffle(result);

            result.addAll(handler.getTips());

 * Licensed under the Apache License, Version 2.0 (the "License");
}

 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        ShowTipOfTheDayDialog tipDialog = new ShowTipOfTheDayDialog(window.getShell(), tips);
import org.jkiss.dbeaver.ui.UIUtils;

 */
            log.error("Error reading tips", e);
import java.util.Collections;
        }
 * See the License for the specific language governing permissions and

        return result;
    private static void showTipOfTheDayDialog(List<String> tips, IWorkbenchWindow window) {
            SAXParser saxParser = factory.newSAXParser();
        } catch (Throwable e) {
package org.jkiss.dbeaver.ui.app.standalone.tipoftheday;
import java.io.InputStream;
    static void showTipOfTheDay(IWorkbenchWindow window) {
    }
 *
public class ShowTipOfTheDayHandler extends AbstractHandler {
 * you may not use this file except in compliance with the License.
            return;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.IWorkbenchWindow;
 * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(ShowTipOfTheDayHandler.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (!result.isEmpty() && result.size() > 1) {

        if (!CommonUtils.isEmpty(tips)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.eclipse.core.commands.ExecutionEvent;
            TipsXmlHandler handler = new TipsXmlHandler();

import java.util.ArrayList;


        try (InputStream tipsInputStream = ShowTipOfTheDayHandler.class.getResourceAsStream(TIPS_XML_FILE)) {
        }
 *
            return;

import org.eclipse.ui.handlers.HandlerUtil;
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
            showTipOfTheDayDialog(tips, window);
 * DBeaver - Universal Database Manager
        }
    public Object execute(ExecutionEvent event) throws ExecutionException {
import javax.xml.parsers.SAXParser;
    private static List<String> loadTips() {

        return null;
        tipDialog.open();
        showTipOfTheDay(HandlerUtil.getActiveWorkbenchWindow(event));
            saxParser.parse(tipsInputStream, handler);
    private static final String TIPS_XML_FILE = "tips.xml";
    @Override
        List<String> result = new ArrayList<>();

import java.util.List;
 * You may obtain a copy of the License at
import javax.xml.parsers.SAXParserFactory;
        if (UIUtils.isWindowVisible(window.getShell().getDisplay(), ShowTipOfTheDayDialog.class)) {
import org.eclipse.core.commands.ExecutionException;
/*
    }
    }
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0
        List<String> tips = loadTips();
        if (tips.isEmpty()) {
    }
