            xml.addAttribute(ATTR_DESCRIPTION, description);
        this.dataSourceId = dataSourceId;
import org.w3c.dom.Element;
        return title;
        this.title = file.getFullPath().removeFileExtension().lastSegment();
            throw new DBException("Error reading bookmarks storage", e);
import java.io.ByteArrayInputStream;

        xml.flush();
import java.io.ByteArrayOutputStream;
import org.jkiss.dbeaver.DBException;

                        loader.load(new ByteArrayInputStream(imgBytes))[0]);
        xml.endElement();
    public void setTitle(String title) {
        xml.startElement(TAG_BOOKMARK);


        }
import java.util.List;
 * limitations under the License.
    public DBPImage getImage() {
        this.image = image;
import org.eclipse.swt.graphics.ImageData;
import org.jkiss.dbeaver.ui.DBIconBinary;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(5000);
        if (image != null) {

            xml.addText(path);
        return image;
                this.dataSourcePath.add(XMLUtils.getElementBody(elem));
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.core.runtime.CoreException;
                        dataSourcePath.toString(),
    }
/*
    private List<String> dataSourcePath;
            Image realImage = DBeaverIcons.getImage(this.image);
        return dataSourceId;

    public List<String> getDataSourcePath() {
        return dataSourcePath;
import org.eclipse.swt.SWT;

            ImageLoader loader = new ImageLoader();
            throw new DBException("IO Error reading bookmarks storage", e);
    public BookmarkStorage(IFile file, boolean loadImage) throws DBException, CoreException {

        XMLBuilder xml = new XMLBuilder(buffer, GeneralUtils.getDefaultFileEncoding());
        try (InputStream contents = file.getContents(true)) {
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.DBPImage;
    public static final String ATTR_TITLE = "title"; //NON-NLS-1
        xml.addAttribute(ATTR_TITLE, title);
            if (dataSourceId == null) {
import org.eclipse.core.resources.IFile;
                    String imgString = XMLUtils.getElementBody(imgElement);
        }
            if (loadImage) {
    BookmarkStorage(String title, String description, DBPImage image, String dataSourceId, List<String> dataSourcePath) {
            xml.startElement(TAG_PATH);
    }
 * Bookmark storage
import org.jkiss.utils.xml.XMLUtils;

 *
            image.dispose();
        } catch (IOException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    public ByteArrayInputStream serialize() throws IOException {
 */
    public void dispose() {
            final Document document = XMLUtils.parseDocument(contents);
    }

    public static final String TAG_PATH = "path"; //NON-NLS-1
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String title;
            this.title = root.getAttribute(ATTR_TITLE);
            for (Element elem : XMLUtils.getChildElementList(root, TAG_PATH)) {

        this.description = description;
                    final byte[] imgBytes = Base64.decode(imgString);
    public static final String TAG_IMAGE = "image"; //NON-NLS-1
                    this.image = new DBIconBinary(
 * You may obtain a copy of the License at

        }
        {
 * See the License for the specific language governing permissions and
    }
                throw new DBException("Data source ID missing in bookmark definition");

            }
        this.image = image;
            ByteArrayOutputStream imageBuffer = new ByteArrayOutputStream(5000);
    public String getDescription() {
                    ImageLoader loader = new ImageLoader();
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import java.io.InputStream;
import java.util.ArrayList;
    private String dataSourceId;
            loader.data = new ImageData[]{realImage.getImageData()};
    }
package org.jkiss.dbeaver.ui.resources.bookmarks;

            xml.startElement(TAG_IMAGE);

        return description;
    }

import java.io.IOException;

    public String getDataSourceId() {
    public static final String TAG_BOOKMARK = "bookmark"; //NON-NLS-1
            final Element root = document.getDocumentElement();
                }
 *
 * you may not use this file except in compliance with the License.
    public String getTitle() {
    public static final String ATTR_DATA_SOURCE = "data-source"; //NON-NLS-1
            loader.save(imageBuffer, SWT.IMAGE_PNG);
        if (description != null) {
            this.description = root.getAttribute(ATTR_DESCRIPTION);
import org.jkiss.utils.xml.XMLBuilder;
import org.jkiss.utils.xml.XMLException;
            xml.endElement();
            this.dataSourcePath = new ArrayList<>();
                Element imgElement = XMLUtils.getChildElement(root, TAG_IMAGE);
}
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        for (String path : dataSourcePath) {
import org.w3c.dom.Document;
        }
    private String description;
import org.jkiss.utils.Base64;
 * DBeaver - Universal Database Manager
        } catch (XMLException e) {
        this.dataSourcePath = dataSourcePath;

    private DBPImage image;
            xml.endElement();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.DBeaverIcons;
public class BookmarkStorage {
    public static final String ATTR_DESCRIPTION = "description"; //NON-NLS-1
        this.title = title;
    }
        xml.addAttribute(ATTR_DATA_SOURCE, dataSourceId);
    }
    }
            xml.addText(Base64.encode(imageBuffer.toByteArray()));
        return new ByteArrayInputStream(buffer.toByteArray());
import org.eclipse.swt.graphics.Image;
            }
                if (imgElement != null) {
    public void setImage(DBPImage image) {

            this.dataSourceId = root.getAttribute(ATTR_DATA_SOURCE);
            }
        this.title = title;
    }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
