
        } catch (IOException e) {
public class JDBCSQLXMLImpl implements SQLXML {
 * DBeaver - Universal Database Manager

    {

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * you may not use this file except in compliance with the License.
            throw new SQLException("IO error reading string value");
    {
        throw new SQLException("Function not supported");
    {
        this.storage = storage;
    }
    }
        StringWriter out = new StringWriter();
    public Writer setCharacterStream() throws SQLException
    public String getString() throws SQLException
    public JDBCSQLXMLImpl(DBDContentStorage storage) {
 * See the License for the specific language governing permissions and
            return storage.getContentStream();
    public <T extends Result> T setResult(Class<T> resultClass) throws SQLException

    @Override
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    public InputStream getBinaryStream() throws SQLException
    private final DBDContentStorage storage;
    @Override
    {
        throw new SQLException("Function not supported");
    @Override


        throw new SQLException("Function not supported");
 * Unless required by applicable law or agreed to in writing, software


        try {
        }
 * Base XML wrapper.
 *
    @Override
    }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
            return storage.getContentReader();
    @Override
        try {

            IOUtils.copyText(getCharacterStream(), out);
        return null;
/*
    @Override
        }
import javax.xml.transform.Source;

import javax.xml.transform.Result;
import java.io.*;

    public void setString(String value) throws SQLException
        try {
            throw new SQLException("IO error", e);
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    {
    {
        } catch (IOException e) {
    }
    public <T extends Source> T getSource(Class<T> sourceClass) throws SQLException
        return out.toString();
 *
        throw new SQLException("Function not supported");
    public OutputStream setBinaryStream() throws SQLException
    }
 * limitations under the License.
}

    public Reader getCharacterStream() throws SQLException

    {
    {
package org.jkiss.dbeaver.model.impl.jdbc.data;
    {
        storage.release();
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override
import java.sql.SQLException;
 *

        } catch (IOException e) {
    }
    public void free() throws SQLException
        }
    }
            throw new SQLException("IO error", e);
import java.sql.SQLXML;

    @Override
import org.jkiss.utils.IOUtils;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
