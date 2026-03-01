    {

        try {

 * DBeaver - Universal Database Manager
    @Override
        return null;
    public <T extends Source> T getSource(Class<T> sourceClass) throws SQLException
 * you may not use this file except in compliance with the License.
import java.sql.SQLException;

 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Throwable e) {
            throw new SQLException("Can't close XMLType", e);
 * You may obtain a copy of the License at
    @Override
package org.jkiss.dbeaver.ext.oracle.data;
    }
                throw (SQLException)e.getTargetException();
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        } catch (Throwable e) {
    }
 * Oracle XML wrapper.

    }
    public void free() throws SQLException
    {
import java.io.Writer;
            return (String) BeanUtils.invokeObjectMethod(xmlType, "getStringVal", null, null);
/*
        } catch (InvocationTargetException e) {
    {
 */
    {

    public Reader getCharacterStream() throws SQLException
        throw new SQLException("Function not supported");
import javax.xml.transform.Source;
            if (e.getTargetException() instanceof SQLException) {
                throw (SQLException)e.getTargetException();
}

        throw new SQLException("Function not supported");
    @Override
            throw new SQLException(e);
        }
            throw new SQLException(e);
        throw new SQLException("Function not supported");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (e.getTargetException() instanceof SQLException) {
        try {
 *
public class OracleXMLWrapper implements SQLXML {
        try {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }


    public <T extends Result> T setResult(Class<T> resultClass) throws SQLException

            if (e.getTargetException() instanceof SQLException) {

    public String getString() throws SQLException
    {
        throw new SQLException("Function not supported");
        } catch (InvocationTargetException e) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        }
import java.io.OutputStream;
import javax.xml.transform.Result;
import java.sql.SQLXML;

            BeanUtils.invokeObjectMethod(xmlType, "close", null, null);
            throw new SQLException(e);
    }
    {
            }
    public OutputStream setBinaryStream() throws SQLException
        } catch (Throwable e) {
            return (InputStream) BeanUtils.invokeObjectMethod(xmlType, "getInputStream", null, null);
    }
        } catch (Throwable e) {
 * Actual type of xmlType object is oracle.xdb.XMLType
            throw new SQLException(e);
        } catch (InvocationTargetException e) {
                throw (SQLException)e.getTargetException();
    private final Object xmlType;
 * Unless required by applicable law or agreed to in writing, software
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
            }
    public Writer setCharacterStream() throws SQLException
    public void setString(String value) throws SQLException
    @Override
    public InputStream getBinaryStream() throws SQLException
import org.jkiss.utils.BeanUtils;
        }
    {
    @Override
    }
            throw new SQLException(e);
    {
        try {
    }
 * limitations under the License.
            Object clobVal = BeanUtils.invokeObjectMethod(xmlType, "getClobVal", null, null);
    }
        this.xmlType = xmlType;
/**
    @Override
            throw new SQLException(e);
    @Override

    }

    {
    @Override

            return (Reader) BeanUtils.invokeObjectMethod(clobVal, "getCharacterStream", null, null);

    }
import java.io.Reader;
    @Override
    public OracleXMLWrapper(Object xmlType)
 */
 *
