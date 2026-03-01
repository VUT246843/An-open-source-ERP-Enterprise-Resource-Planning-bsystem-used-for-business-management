    private static final String loadingText = UINavigatorMessages.ui_navigator_loading_text_loading;
    @Override
 *
public class TreeNodeChildrenLoading extends TreeNodeSpecial {
    }
    public String getText(Object element) {

        return node;
    }
 *
    public static synchronized boolean canBeginLoading(Object parent) {
            placeHolders.put(parent, node);
    }
            node = new TreeNodeChildrenLoading(parent);
    }
            loadingFiles.put(parent, null);

        placeHolders.remove(parent);
 * See the License for the specific language governing permissions and
        loadingFiles.remove(parent);
 * you may not use this file except in compliance with the License.
 */

import org.eclipse.swt.graphics.Image;
    private static final Map<Object, Object> loadingFiles = new HashMap<>();
        return false;
    }
        if (node == null) {
        return null;
        super(parent);
    public static synchronized TreeNodeChildrenLoading createLoadingPlaceHolder(DBNNode parent) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import java.util.HashMap;
    }
import java.util.Map;
        return loadingText + ".".repeat(dotCount);
        synchronized (loadingFiles) {

    protected TreeNodeChildrenLoading(DBNNode parent) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

package org.jkiss.dbeaver.ui.navigator.database.load;
        }

        TreeNodeChildrenLoading node = placeHolders.get(parent);

        super.dispose();
    private static final Map<DBNNode, TreeNodeChildrenLoading> placeHolders = new HashMap<>();

 * You may obtain a copy of the License at
}    }
 *
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
    public static boolean isLoading() {
        viewCount++;
 * limitations under the License.
        int dotCount = (viewCount % 10);
            return true;



    private int viewCount = 0;
    public Image getImage(Object element) {
    @Override
    public void dispose(DBNNode parent) {


 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.navigator.DBNNode;

/*
            return !loadingFiles.isEmpty();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (!loadingFiles.containsKey(parent)) {
