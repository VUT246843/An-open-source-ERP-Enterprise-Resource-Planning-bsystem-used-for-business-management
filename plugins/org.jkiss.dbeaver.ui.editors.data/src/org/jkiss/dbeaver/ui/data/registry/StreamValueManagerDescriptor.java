    }

            this.supportedMime = new String[] { this.primaryMime };
        this.description = config.getAttribute("description");
 * You may obtain a copy of the License at
                supportsText = true;
    }
            try {
import org.jkiss.dbeaver.model.DBPImage;
        String supportedMimeString = config.getAttribute(ATTR_SUPPORTED_MIME);
    }

    }

                break;
        for (String mime : supportedMime) {
            String[] mimeList = supportedMimeString.split(",");
            }
 * you may not use this file except in compliance with the License.
    public DBPImage getIcon() {
import org.jkiss.utils.ArrayUtils;
            this.supportedMime = mimeList;
            catch (Exception e) {
        super(config);
        return icon;

    private final String label;
 */
/**
        return id;
import org.jkiss.dbeaver.utils.ContentUtils;

    private final String[] supportedMime;
            if (ContentUtils.isTextMime(mime)) {
                this.instance = implType.createInstance(IStreamValueManager.class);
        return label;
    public String toString() {
    }

 * DBeaver - Universal Database Manager
            if (!ArrayUtils.contains(mimeList, this.primaryMime)) {
                mimeList = ArrayUtils.add(String.class, mimeList, this.primaryMime);
        return id + " (" + label + ")";
            }
    public String getDescription() {
}    }
        return description;
                throw new IllegalStateException("Can't instantiate content value manager '" + this.id + "'", e); //$NON-NLS-1$
    private boolean supportsText;
    {
    {
 */


    @NotNull

        this.implType = new ObjectType(config.getAttribute("class"));
        return supportsText;
    private final DBPImage icon;
    private String id;
    private static final String ATTR_SUPPORTED_MIME = "supportedMime";
package org.jkiss.dbeaver.ui.data.registry;
    public String getPrimaryMime() {
        return instance;

 *
        }
import org.eclipse.core.runtime.IConfigurationElement;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private ObjectType implType;
    static final String TAG_STREAM_MANAGER = "streamManager"; //$NON-NLS-1$
    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
import org.jkiss.utils.CommonUtils;
        this.icon = iconToImage(config.getAttribute("icon"));
 *
    {
    public IStreamValueManager getInstance()

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean supportsText() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
    }
    public String[] getSupportedMime() {
 * Unless required by applicable law or agreed to in writing, software
        return supportedMime;
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

        if (CommonUtils.isEmpty(supportedMimeString)) {
        this.id = config.getAttribute("id");
 *
    public String getId()
    private IStreamValueManager instance;
            }

/*
import org.jkiss.dbeaver.ui.data.IStreamValueManager;
    @Override
        this.primaryMime = config.getAttribute(ATTR_PRIMARY_MIME);

 * StreamValueManagerDescriptor
        } else {
    private final String primaryMime;
    }
        return primaryMime;
 * Licensed under the Apache License, Version 2.0 (the "License");
    StreamValueManagerDescriptor(IConfigurationElement config)
public class StreamValueManagerDescriptor extends AbstractDescriptor
 * limitations under the License.

        if (instance == null) {
 * See the License for the specific language governing permissions and
    public String getLabel() {
import org.jkiss.code.NotNull;

    private static final String ATTR_PRIMARY_MIME = "primaryMime";
        this.label = config.getAttribute("label");
    private final String description;
{

