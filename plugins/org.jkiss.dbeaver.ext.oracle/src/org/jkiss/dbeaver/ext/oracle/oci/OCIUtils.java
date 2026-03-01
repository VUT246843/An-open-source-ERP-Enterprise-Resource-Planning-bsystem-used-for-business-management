        }
     */
        // read system environment variables
        return oraHomes.isEmpty() ? null : oraHomes.get(0);
        } else {
            String tnsAdmin = System.getenv(OracleConstants.VAR_TNS_ADMIN);
        boolean contains = false;
                                    } catch (DBException ex) {
    public static OracleHomeDescriptor getOraHomeByName(String oraHomeName) {
    {

    public static final String TNSNAMES_FILE_NAME = "tnsnames.ora";
                            log.warn("Wrong Oracle client home " + oraHome, ex);
                log.warn("Wrong Oracle client home " + oraHome, ex);

    public static String getFullOraVersion(String oraHome, boolean isInstantClient)
                // do nothing
        Map<String, String> aliases = new TreeMap<>();
            } catch (DBException ex) {
        }
                        final String alias = line.substring(0, divPos);
    public static OracleHomeDescriptor getDefaultOraHome() {
package org.jkiss.dbeaver.ext.oracle.oci;

                break;
            // file name case insensitivity on Windows platform
        }
        if (CommonUtils.isEmpty(oraHome)) {
        return null;
        }
                    String line;
                String line;
    private static final Log log = Log.getLog(OCIUtils.class);
 * DBeaver - Universal Database Manager
    }

                                aliases.put(curAlias, getPlainTnsDescription(tnsDescription.toString()));
    {
            } catch (Exception e) {
                while ((line = reader.readLine()) != null) {
                            aliases.putAll(parseTnsNames(extFile));
            } catch (Exception e) {
                    }
    }
        if (oraHome != null) {
    }
            oraHomes.add(0, homeDescriptor);
            if (tnsAdmin != null) {
     */
        checkOraHomes();

                if (registry.registryKeyExists("HKEY_LOCAL_MACHINE", WIN_REG_ORACLE)) {
                                extFile = new File(tnsnamesOra.getParent(), filePath);
    public static File findTnsNamesFile(@Nullable File oraHome, boolean checkTnsAdmin)
                        if (line.startsWith("SQL*Plus: Release ")) {
            }
 * You may obtain a copy of the License at
        String sqlplus = ociBinPath + "sqlplus -version";
        if (RuntimeUtils.isWindows()) {
/*
                }
                try {
                BufferedReader reader = new BufferedReader(new FileReader(tnsnamesOra));
                            }
                            curAlias = alias.trim();
                        }
    public static final String TNSNAMES_FILE_PATH = "network/admin/";
    }
     */
                    if (!line.startsWith(" ") && !line.startsWith("\t") && !line.startsWith("(") && line.contains("=")) {
        String path = System.getenv(OracleConstants.VAR_PATH);
    static {
}
        }
        File root = new File(System.mapLibraryName(CommonUtils.makeDirectoryName(oraHome) + "oci"));
                    String[] oracleKeys = registry.registryGetKeys("HKEY_LOCAL_MACHINE", WIN_REG_ORACLE);
            return null;
                            for (String key : valuesMap.keySet()) {
            return tnsNamesFile;
                                    try {
        catch (Exception ex) {
/*
            }
import org.jkiss.code.Nullable;
                log.debug(e);

                if (curAlias != null) {
                    aliases.put(curAlias, getPlainTnsDescription(tnsDescription.toString()));
        }
                                String home = registry.registryGetStringValue("HKEY_LOCAL_MACHINE", keyName, WIN_REG_ORA_HOME);
            try {
    {
                                        log.warn("Wrong Oracle client home " + oraHome, ex);
                                        addOraHome(oraHome);
                        for (String oracleKey : oracleKeys) {
                        if (curAlias != null) {
{

            return null;
                        final int divPos = line.indexOf("=");
            return file1.equalsIgnoreCase(file2);

                }
                }
                        }
        }
        return !oraHomes.isEmpty();
                            String filePath = line.substring(divPos + 1).trim();
    {
        String ociBinPath = isInstantClient ? CommonUtils.makeDirectoryName(oraHome) : CommonUtils.makeDirectoryName(oraHome) + "bin/";

                            }
    /**
                        } else {
        }

            oraHomesSearched = true;
        } else {
                contains = true;
                p.destroy();

                        }
                    }
    private static void findOraHomes()
                log.warn("Error reading Windows registry", e);
    public static final String WIN_REG_ORACLE = "SOFTWARE\\ORACLE";
 *     http://www.apache.org/licenses/LICENSE-2.0
            try {
                        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static File getDefaultOraHomePath() {
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Returns an installed Oracle client full version
                    IOUtils.close(input);
        for (OracleHomeDescriptor home : oraHomes) {
        OracleHomeDescriptor defaultOraHome = getDefaultOraHome();
    /**
     * A list of Oracle client homes found in the system.
        return aliases;
            }
                tnsNamesFile = new File (tnsAdmin, TNSNAMES_FILE_NAME);
                        }
     */
     * @return oracle version
                } finally {
        if (CommonUtils.isEmpty(oraHome) || !checkOraHomes()) {
                    } else {
                }
                log.warn("Error reading Windows registry", e);
            }
                    }
    private static String getPlainTnsDescription(String line) {
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
    @Nullable
            try {
 *
 */
                    }
        }
                                    return registry.registryGetStringValue("HKEY_LOCAL_MACHINE", keyName, name);
                            tnsDescription.append(line.substring(divPos + 1));

        findOraHomes();
                                }
        if (tnsNamesFile != null && tnsNamesFile.exists()) {
    private static boolean oraHomesSearched = false;
    //public static final String DRIVER_NAME_OCI = "oracle_oci";
            OracleHomeDescriptor homeDescriptor = new OracleHomeDescriptor(oraHome);
            }

                        if (alias.equalsIgnoreCase("IFILE")) {
import org.jkiss.dbeaver.DBException;
 *
    {

        return null;
            try {
    
                LocalSystemRegistry.Registry registry = LocalSystemRegistry.getInstance();
                String curAlias = null;
    }
        }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.IOUtils;
            Process p = Runtime.getRuntime().exec(sqlplus);
    {
    }
        if ((tnsNamesFile == null || !tnsNamesFile.exists()) && oraHome != null) {
                            String keyName = WIN_REG_ORACLE + "\\" + oracleKey;
import java.io.*;
                            if (curAlias != null) {
        File bin = new File(System.mapLibraryName(CommonUtils.makeDirectoryName(oraHome) + "bin/" + "oci"));

                            }
    }
                if (token.toLowerCase().contains("oracle")) {
    /** 
        File tnsNamesFile = findTnsNamesFile(oraHome, checkTnsAdmin);

        return oraHomes;
                                    }
import org.jkiss.utils.CommonUtils;
    }
            } finally {
            return null;

    public static boolean isInstantClient(String oraHome)

        File tnsNamesFile = null;
    {
        return null;
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
        if (RuntimeUtils.isWindows()) {
    }
        return root.exists() && !bin.exists();
    public static OracleHomeDescriptor getOraHome(String oraHome) {
        if (RuntimeUtils.isWindows()) {

        }

    /**
            }
        List<OracleHomeDescriptor> oraHomes = getOraHomes();
        return defaultOraHome == null ? null : defaultOraHome.getPath();
*/
                        } catch (DBException ex) {
    public static boolean isOciDriver(DBPDriver driver)
    private static final List<OracleHomeDescriptor> oraHomes = new ArrayList<>();
            for (String token : path.split(System.getProperty(StandardConstants.ENV_PATH_SEPARATOR))) {
/*
        if (tnsNamesFile != null) {
                                if (oraHome.equals(home)) {
     * Reads TNS names from a specified file.
            if (equalsFileName(home.getName(), oraHome)) {
        }
 * you may not use this file except in compliance with the License.
    }
        }
                        }
                    token = CommonUtils.removeTrailingSlash(token);
        return CommonUtils.compactWhiteSpaces(line.trim());
                        if (divPos < 0) {
                        continue;
                    if (oracleKeys != null) {
    @Nullable
        }
            oraHome = System.getenv(OracleConstants.VAR_ORACLE_HOME);
                                }
                            tnsDescription.append(line);
        if (checkTnsAdmin) {
        return DRIVER_NAME_OCI.equals(driver.getId());
                                        oraHome = CommonUtils.toString(valuesMap.get(key));
import java.util.*;
        try {
    {

        if (!oraHomesSearched) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    /**
                }
     */
        // find Oracle homes in Windows registry
                            Map<String, Object> valuesMap = registry.registryGetValues("HKEY_LOCAL_MACHINE", WIN_REG_ORACLE + "\\" + oracleKey);
    public static List<OracleHomeDescriptor> getOraHomes()

    }
            }
        }
    private static Map<String, String> parseTnsNames(File tnsnamesOra)
        if (oraHome == null) {
        }
                LocalSystemRegistry.Registry registry = LocalSystemRegistry.getInstance();
            log.warn("Error reading Oracle client version from " + sqlplus, ex);
            // file name case insensitivity on Windows platform
    public static OracleHomeDescriptor addOraHome(String oraHome) throws DBException
                    String[] oracleKeys = registry.registryGetKeys("HKEY_LOCAL_MACHINE", WIN_REG_ORACLE);

        for (OracleHomeDescriptor home : oraHomes) {
public class OCIUtils
        }
        else {
                return home;

     * Reads TNS names from a specified Oracle home or system variable TNS_ADMIN.
            }

                        }
            findOraHomes();
                    if (token.toLowerCase().endsWith("bin")) {
     * The first one is always a current Oracle home (from PATH) 
                        for (String oracleKey : oracleKeys) {
    }
        for (OracleHomeDescriptor home : oraHomes) {
            return parseTnsNames(tnsNamesFile);
    public static final String WIN_REG_ORA_HOME_NAME = "ORACLE_HOME_NAME";
                                    break;
     * Return path to first element of oraHomes, or null
        }
                StringBuilder tnsDescription = new StringBuilder();
    private static boolean equalsFileName(String file1, String file2) {
import org.jkiss.dbeaver.Log;
            if (equalsFileName(home.getName(), oraHome)) {
    }
     * Searches Oracle home locations.
                tnsNamesFile = new File (oraHome, TNSNAMES_FILE_NAME);
                            tnsDescription.setLength(0);
    public static final String WIN_REG_ORA_HOME = "ORACLE_HOME";
            log.debug("TNS names file '" + tnsnamesOra + "' doesn't exist");

            // file name case insensitivity on Windows platform
    /**
        if (!contains) {
 * limitations under the License.
                    final String trimmedLine = line.trim();
            }
import org.jkiss.utils.StandardConstants;
                if (registry.registryKeyExists("HKEY_LOCAL_MACHINE", WIN_REG_ORACLE)) {
        oraHome = CommonUtils.removeTrailingSlash(oraHome);
                    }
            if (equalsFileName(home.getDisplayName(), oraHomeName)) {
            if (!tnsNamesFile.exists()) {
     * Return first element of oraHomes, or null
            tnsNamesFile = new File (oraHome, TNSNAMES_FILE_PATH + TNSNAMES_FILE_NAME);
                                if (WIN_REG_ORA_HOME.equals(key)) {
        return null;
            return homeDescriptor;
        if (tnsnamesOra.exists()) {
        } else {
                addOraHome(oraHome);
            try {
    }
     */
                            }
        if (CommonUtils.isEmpty(oraHomeName) || !checkOraHomes()) {
        if (path != null) {
    }
 *
    public static Map<String, String> readTnsNames(@Nullable File oraHome, boolean checkTnsAdmin)
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
                }
            return file1.equals(file2);
                    if (oracleKeys != null) {
    }
     */
*/
    /** 
            return Collections.emptyMap();
import org.jkiss.dbeaver.registry.LocalSystemRegistry;
                    while ((line = input.readLine()) != null) {
                        String oraHome = token.substring(0, token.length() - 3);
    
                    if (trimmedLine.isEmpty() || trimmedLine.startsWith("#") ) {
 * See the License for the specific language governing permissions and
        }
            }
                            addOraHome(oraHome);
    private static boolean checkOraHomes() {
                            if (!extFile.exists()) {
                    }
    public static String readWinRegistry(String oraHome, String name) {
            } catch (IOException e) {
        return null;
                            return line.substring(18, line.indexOf(" ", 19));
    {

        }
        String oraHome = System.getenv(OracleConstants.VAR_ORA_HOME);
                            continue;
        }
            }
                        try {
                            File extFile = new File(filePath);
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
                return home;
                            if (registry.registryValueExists("HKEY_LOCAL_MACHINE", keyName, WIN_REG_ORA_HOME)) {
    @Nullable

