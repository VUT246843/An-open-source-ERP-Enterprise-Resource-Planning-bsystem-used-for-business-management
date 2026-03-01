            text.append(" - ").append(vars[i][1]).append("\n");
                        }
        }



                return new MultiStatus(

import java.math.BigDecimal;
            }
        return workspaceFolder.resolve(DBPWorkspace.METADATA_FOLDER);
            }
     */
                }
    }
            }
        if (allowActivation) {


        IStatus prev = null;

    }
import java.text.ParseException;
            String forbiddenExplain = forbiddenSymbols.chars()
            int c = strValue.charAt(i) & 255;
        } catch (Exception e) {
                log.debug(e);
        return getProductName() + " " + getPlainVersion();
    @Nullable
    // Adapters
            return string;
        return metaDir;
    public static String extractVariableName(@NotNull String variablePattern) {
                return Short.valueOf(normalizeIntegerString(value));
    }
        }
                .mapToObj(c -> Character.toString((char) c))
            try {
        }
     *
            } else {
        return Platform.getProduct().getProperty("earlyAccessURL");
                    0,
        String[] varPatterns = new String[vars.length];
    }
    /**
    @NotNull
            return varValue;
    }
    }
        return null;
        if (cause == null && nextError == null) {
    public static IStatus makeErrorStatus(@NotNull String message) {
                os.writeObject(object);
        while (st < len && isWhitespaceExt(str.charAt(len - 1))) {
                }
                    ModelPreferences.PLUGIN_ID,
    public static Version getProductVersion() {
        }
        return localizedMessage;
                    ModelPreferences.PLUGIN_ID,
        if (CommonUtils.isEmpty(localizedMessage)) {
    public static <T extends Throwable> T findNestedException(@NotNull Throwable ex, @NotNull Class<T> theClass) {
            consoleEncoding = System.getProperty(StandardConstants.ENV_FILE_ENCODING);
import java.util.stream.Collectors;
            if (prev == null) {
        final String releaseDate = headers.get("Bundle-Release-Date");
        } else if (error instanceof NullPointerException) {
        "(\\$\\{([\\w\\.\\-]+)(\\:[^\\$\\{\\}]+)?\\})", Pattern.CASE_INSENSITIVE);
            result = adapterManager.getAdapter(sourceObject, adapterId);
    @NotNull
    public static String getFirstMessage(@Nullable Throwable ex) {
    }
                return value;
                log.debug(e);
                return Arrays.toString((byte[]) object);
        int end
        if (releaseDate != null) {
 * limitations under the License.
            while (matcher.find(pos)) {
            } else if (valueType == Float.class) {
            } else if (valueType == Long.TYPE) {
        return str.replaceAll("\r\n|\r|\n", getDefaultLineSeparator());
    public static final char[] nibbleToHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

            ModelPreferences.PLUGIN_ID,
            return null;
        for (int i = 0; i < vars.length; i++) {
            return "Class definition not found: " + ncdf.getMessage();
    @NotNull
                }
        if (bytes.length < 16) {
    }
                return Long.valueOf(normalizeIntegerString(value));
        final Calendar calendar = Calendar.getInstance();
    }

    }
            // Indent
            else if (eClass == float[].class)
public class GeneralUtils {
            return new Status(
    @NotNull
import org.jkiss.utils.StandardConstants;
        calendar.set(Calendar.MONTH, 0);
        if (matcher.start() == 0 && matcher.end() >= string.length() - 1) {
    }
    /**
            log.warn("Error matching regex", e);
        if (buildTime != null) {

    @NotNull
            return string.substring(0, matcher.start()) + varValue + string.substring(matcher.end());
    @NotNull
    public static String getProductEarlyAccessURL() {
import java.net.URI;
    public static final String PROP_TRUST_STORE_TYPE = "javax.net.ssl.trustStoreType"; //$NON-NLS-1$
            } catch (IOException e) {
            consoleEncoding = getDefaultFileEncoding();
import java.nio.file.Path;
                if (varValue == null) {
        return text.toString();

import org.jkiss.dbeaver.Log;
        }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static String normalizeIntegerString(@NotNull String value) {
                    }
            } else if (valueType == Byte.TYPE) {
            return e.getClass().getName();
    }
    }
     * Validates the resource name, only if the application is running in desktop mode.
        final IProduct product = Platform.getProduct();
    @NotNull
        } catch (Exception e) {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
    @Nullable
        for (int i = 0; i < vars.length; i++) {
            return new Date();
        return divPos == -1 ? value : value.substring(0, divPos);
    public static String getMajorVersion() {
        return new UUID(target.getLong(), target.getLong());
            }
                pos = matcher.end();
    /**
            try {
        return replaceVariables(string, System::getProperty);
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                return Arrays.toString((short[]) object);
                }
    }
        if (CommonUtils.isNotEmpty(forbiddenSymbols)) {
    }
        }
                    ModelPreferences.PLUGIN_ID,
                return new BigInteger(normalizeIntegerString(value));
            return makeStandardErrorMessage(ex);
            } catch (ParseException e) {

     * Validates the resource name unconditionally.
    }
        if (product == null) {
        return new Status(
            } else if (valueType == Short.class) {
                return Arrays.deepToString((Object[]) object);
    }
            patternMaxLength = Math.max(patternMaxLength, varPatterns[i].length());
            }
        }
            result = adapterManager.loadAdapter(sourceObject, adapterId);
     */
    public static Object queryAdapterManager(@NotNull Object sourceObject, @NotNull String adapterId, boolean allowActivation) {
            T result = adaptable.getAdapter(adapter);
            }
        }

        if (buildTime != null) {
        while (matcher.find()) {
        try {
        }
        for (Throwable exception : exceptions) {
            return null;
                variables.add(new VariableEntryInfo(varName, matcher.start(), matcher.end()));
    @NotNull
        for (int i = offset; i < offset + length; i++) {
    public static Date getProductBuildTime() {
            return product.getName();
        }
    @NotNull
        }
            return "";
    @NotNull
                    message,
                return new SimpleDateFormat(DEFAULT_TIMESTAMP_PATTERN).parse(buildTime);

        if (exceptions.isEmpty()) {
            putShort(source.getShort()).
                // Pass null exception to avoid dups in error message.
            }
    public static IStatus makeExceptionStatus(@Nullable String message, @NotNull Throwable ex) {
            int pos = 0;
    public static IStatus makeExceptionStatus(@NotNull Throwable ex) {
    public static String normalizeLineEndings(@NotNull String text) {
            return adapter.cast(result);
            return status;
                    plainPath = plainPath.substring(1);
            if (result != null) {
    public static IStatus transformExceptionsToStatus(@NotNull List<Throwable> exceptions) {
                    if (varValue != null) {
     * macOS ({@code \r}) line endings to Unix ({@code \n}) line endings.
        return System.getProperty(StandardConstants.ENV_LINE_SEPARATOR, "\n");
    /**
        if (ex instanceof SQLException sqlException) {
import org.osgi.framework.Version;
            message,
            else if (eClass == int[].class)
                Files.createDirectories(metaDir);



            definingBundle = application.getContributorBundle();
     *
        int len = str.length();
        String name = null;
            nextError = sqlException.getNextException();

            return value;
            try {


                // Trim leading slashes on Windows
    private static IStatus makeExceptionStatus(int severity, @NotNull Throwable ex, boolean nested) {
            try {
        } else {
            } else {
        ApplicationDescriptor application = ApplicationRegistry.getInstance().getApplication();
    public static Date getProductReleaseDate() {
                    + " that is not an instance of " + adapter.getName()); //$NON-NLS-1$
        }
            } else if (valueType == Boolean.class || valueType == Boolean.TYPE) {
    @NotNull

            ModelPreferences.PLUGIN_ID,
                return Arrays.toString((long[]) object);
                ModelPreferences.PLUGIN_ID,
            return null;
        }
    }
    }

            throw new IllegalArgumentException("UUID length must be at least 16 bytes (actual length = " + bytes.length + ")");
        } else {
import java.math.BigInteger;
                varValue = resolver.get(varName);
    public static Object convertString(@Nullable String value, @Nullable Class<?> valueType) {
                exceptionMessageSet.add(message);

    private static final char[] HEX_CHAR_TABLE = {
    }

            }
        if (children == null || children.length == 0) {
                throw new IllegalStateException("Can't parse workspace location URL", e);
        }
            return "";
        if (application != null) {
        calendar.set(Calendar.YEAR, 2017);
    public record VariableEntryInfo(
                return theClass.cast(e);
import org.jkiss.code.Nullable;
     * @return the normalized text
            String message = makeStandardErrorMessage(e);
        String localizedMessage = error.getLocalizedMessage();

            }
    public static String serializeObject(@NotNull Object object) {
            new IStatus[]{makeExceptionStatus(severity, ex)},
                        resolvedVars.put(varName, varValue);
        String message = e.getMessage();
        if (application != null) {
        }
    public static String getExpressionParseMessage(@NotNull Exception e) {
        } else {
                .collect(Collectors.joining(" "));
    }
            }
import java.nio.channels.UnresolvedAddressException;
    }
                    !nested ? null : ex);

    }
import java.text.SimpleDateFormat;
        Path metaDir = getMetadataFolder(workspacePath);
                return Integer.parseInt(normalizeIntegerString(value));
                definingBundle = product.getDefiningBundle();
    @NotNull
                return Arrays.toString((float[]) object);
    public static List<VariableEntryInfo> findAllVariableEntries(@NotNull String string) {
import java.sql.SQLException;

                return Byte.parseByte(normalizeIntegerString(value));
        }
        }
        final IProduct product = Platform.getProduct();
        if (ex instanceof CoreException ce) {
    public static String getPlainVersion() {
        byte[] bytes = new byte[length];
        Path workspacePath;
            final byte[] bytes = Base64.decode(text);
     * @param name resource name to validate
     * Default encoding (UTF-8)
            Matcher matcher = GeneralUtils.VAR_PATTERN.matcher(string);
    }
import org.jkiss.dbeaver.bundle.ModelActivator;
        } catch (Exception e) {
            while (matcher.find(pos)) {
        return "${" + name + "}";

    public static void validateResourceNameUnconditionally(@NotNull String name) throws DBException {

            return ex.toString();
            log.warn("Error deserializing object [" + text + "]", e);

     *
    private static final Pattern VAR_PATTERN = Pattern.compile(
     * Returns information about all variable entries in the provided text
        }
        }
                return Float.parseFloat(value);
        int length = strValue.length();
    public static final String[] byteToHex = new String[256];
        for (Throwable e = ex; e != null; e = e.getCause()) {
        return makeExceptionStatus(severity, ex, false);
    public static Object makeDisplayString(@Nullable Object object) {
        '4', '5', '6', '7',
        } catch (Throwable e) {
        Version version = getProductVersion();
            if (eClass == byte[].class)
            return adapter.cast(sourceObject);
        return adapt(sourceObject, adapter, true);
    public static final String DEFAULT_DATE_PATTERN = "yyyyMMdd";
    }
    @Nullable
                    }


            log.error("Error converting value", e);
            } catch (ParseException e) {
        try {
import java.util.*;
    public static boolean isVariablePattern(@NotNull String pattern) {

        return null;
            } else if (valueType == Double.class) {
                    pos = 0;
    /**
            return Collections.emptyList();
    public static final String DEFAULT_ENCODING = UTF8_ENCODING;
    }
        }
        return result;
        for (int i = 0; i < length; i++) {
    public static String getProductTitle() {
        return getProductName() + " " + getProductVersion();
    public static <T> T adapt(@Nullable Object sourceObject, @NotNull Class<T> adapter, boolean allowActivation) {
    public static <T> T adapt(@Nullable Object sourceObject, @NotNull Class<T> adapter) {
        return product.getDefiningBundle().getVersion();
    @Nullable
            return null;
     * Converts string to byte array.
import java.io.*;
    }
                log.debug(e);
    public static UUID getUUIDFromBytes(@NotNull byte[] bytes) throws IllegalArgumentException {
                        string = substituteVariable(string, matcher, varValue);

    public static Path getMetadataFolder(@NotNull Path workspaceFolder) {
                return Double.parseDouble(value);
        }
    }
                List<IStatus> errorChain = new ArrayList<>();

                return result;
        // If the source object is a platform object then it's already tried calling AdapterManager.getAdapter,
    @NotNull
        } catch (RuntimeException e) {
        }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return pattern.startsWith("${") && pattern.endsWith("}");
            else if (eClass == double[].class)
            } else if (valueType == Float.TYPE) {
        final String buildTime = headers.get("Build-Time");
        return "DBeaver";
    /**
            Matcher matcher = VAR_PATTERN.matcher(string);
    }
            DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
    public static IStatus getRootStatus(@NotNull IStatus status) {
                definingBundle = product.getDefiningBundle();
            if (RuntimeUtils.isWindows()) {
            for (IStatus child : children) {
            // Sanity-check
 *
        StringBuilder text = new StringBuilder();
            else if (eClass == short[].class)
        }
    public static final String EMPTY_ENV_VARIABLE_VALUE = "''";
                return null;
 * you may not use this file except in compliance with the License.
     **/
            try (ObjectOutputStream os = new ObjectOutputStream(baos)) {
/**
        return ((st > 0) || (len < str.length() )) ?
            }
        return calendar.getTime();
    public static final String DEFAULT_TIMESTAMP_PATTERN = "yyyyMMddHHmm";
            message,
                workspacePath = RuntimeUtils.getLocalPathFromURL(Platform.getInstanceLocation().getURL());
     */
        int divPos = message.indexOf('@');
                        matcher = VAR_PATTERN.matcher(string);
    }
    public static final String VALUE_TRUST_STORE_TYPE_WINDOWS = "WINDOWS-ROOT"; //$NON-NLS-1$
    /**

            }
                return Arrays.toString((boolean[]) object);
        Bundle definingBundle = null;
            else if (eClass == boolean[].class)
     * @throws DBException if resource name is invalid
                return Arrays.toString((int[]) object);
import org.jkiss.dbeaver.runtime.IVariableResolver;
        if (eClass.isArray()) {
            Version version = new Version(versionStr);
            if (workspace == null) {
    }
            chars[i - offset] = (char) b;
    }
        }
            }
                // Real exception stacktrace will be passed in the root cause
        return version.getMajor() + "." + version.getMinor() + "." + version.getMicro();
    @Nullable
                    message,

        if (sourceObject == null) {
    @NotNull
    @NotNull
        }
            message,
                }
 */
                        pos = 0;
 */
        }
    public static IStatus makeInfoStatus(@NotNull String message) {
    public static String getDefaultLineSeparator() {
            name = matcher.group(2);
                // Sanity-check
    public static final String RESOURCE_NAME_FORBIDDEN_SYMBOLS_REGEX = "(?U)[^/:'\"\\\\<>|?*]+";
    }
     */
            }
                    IStatus.ERROR,
                        continue;
    }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            text.append(" ".repeat(Math.max(0, patternMaxLength - varPatterns[i].length())));
import org.jkiss.utils.Base64;
        // We save resolved vars here to avoid resolve recursive cycles
    }
            }
            message,

            definingBundle = application.getContributorBundle();
    public static URI makeURIFromFilePath(@NotNull String path) throws URISyntaxException {
        try {
        }

            ex = ex.getCause();
            log.debug("Platform not initialized: metadata folder may be not set");
    }


        }
        }
    @NotNull
     */

        Matcher matcher = URI_SCHEMA_PATTERN.matcher(path);

        } else {
            final IProduct product = Platform.getProduct();
            varPatterns[i] = GeneralUtils.variablePattern(vars[i][0]);
            } else if (valueType == BigDecimal.class) {
                return Double.valueOf(value);
    public static Path getMetadataFolder() {
            }

        }
    public static final String DEFAULT_TIME_PATTERN = "HHmmss";
            } else {
import java.util.regex.Pattern;
                    workspacePath = RuntimeUtils.getLocalPathFromURL(Platform.getInstanceLocation().getURL());
        if (result != null) {
     */
                    null);
            }
                    errorChain.toArray(new IStatus[0]),
        }
        int start,
    }
        // Skip chain of nested DBExceptions. Show only last message
        // Failed to get valid date from product bundle
        try {
            if (!adapter.isInstance(result)) {
        }
    @NotNull
            return versionStr;
                    errorChain.add(new Status(
                    throw new AssertionFailedException(adaptable.getClass().getName() + ".getAdapter(" + adapter.getName() + ".class) returned " //$NON-NLS-1$//$NON-NLS-2$
    public static String getPlainVersion(String versionStr) {

    public static String replaceSystemPropertyVariables(@Nullable String string) {
                        severity,
        return new String(chars);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        }
        if (CommonUtils.isEmpty(consoleEncoding)) {
    @NotNull
            log.warn("Error serializing object [" + object + "]", e);
    public static String getExceptionMessage(@NotNull Throwable ex) {
        SQLException nextError = null;
        }
        } else if (error instanceof NoClassDefFoundError ncdf) {
            return null;
    public static byte[] getBytesFromUUID(@NotNull UUID uuid) {
        validateResourceNameUnconditionally(name.trim());
                return is.readObject();
        }
        ApplicationDescriptor application = ApplicationRegistry.getInstance().getApplication();
        if (sourceObject instanceof IAdaptable adaptable) {
        return bytes;
    @Nullable

        return object;
                    varValue = matcher.group(3);
    public static IStatus makeExceptionStatus(int severity, @NotNull Throwable ex) {
package org.jkiss.dbeaver.utils;
                    if (varValue != null && varValue.startsWith(":")) {
            order(ByteOrder.BIG_ENDIAN).
    }
import org.jkiss.dbeaver.model.app.DBPWorkspace;
            IStatus.ERROR,
            putLong(source.getLong());
        return Path.of(path).toUri();
import org.jkiss.dbeaver.runtime.DBWorkbench;
            null);

        return null;
        } else {
            else if (eClass == long[].class)
    @NotNull
                    matcher = VAR_PATTERN.matcher(string);
        try {
            int pos = 0;
        char[] chars = new char[length];
import org.osgi.framework.Bundle;
    public static String getDefaultConsoleEncoding() {

            int b = bytes[i];

        return new Status(
import java.text.NumberFormat;
            return;
/*
            try (ObjectInputStream is = new ObjectInputStream(bais)) {
 * DBeaver - Universal Database Manager
    }
                            varValue = "";
import org.eclipse.core.internal.runtime.AdapterManager;
        Set<String> exceptionMessageSet = new HashSet<>();
                return Long.parseLong(normalizeIntegerString(value));
                    varValue = resolvedVars.get(varName);
        for (Throwable e = ex; e != null; e = e.getCause()) {
        bb.putLong(uuid.getLeastSignificantBits());
                return new SimpleDateFormat(DEFAULT_DATE_PATTERN).parse(releaseDate);
                if (!adapter.isInstance(result)) {
        }
                c = -(c - 127);
                return Short.parseShort(normalizeIntegerString(value));
            return getRootStatus(children[0]);
    public static UUID getMixedEndianUUIDFromBytes(@NotNull byte[] bytes) {
                return Float.valueOf(value);
                log.debug("Metadata is read before workspace initialization");
    public static String replaceVariables(@NotNull String string, @NotNull IVariableResolver resolver, boolean isUpperCaseVarName) {
                while (plainPath.startsWith("/") && plainPath.indexOf(':') >= 0)
                        getExceptionMessage(error)));

            throw new DBException("Resource name '" + name + "' can't start with dot");
        if (CommonUtils.isEmpty(string)) {
        int patternMaxLength = 0;
                return new BigDecimal(value);
import org.jkiss.code.NotNull;
        while (st < len && isWhitespaceExt(str.charAt(st))) {
        if (ex instanceof InvocationTargetException ite) {
        if (object == null) {
            final IProduct product = Platform.getProduct();
        return new Status(
                }

        if (definingBundle == null) {
            s = substituteVariable(s, matcher, "");
                return new SimpleDateFormat(DEFAULT_TIMESTAMP_PATTERN).parse(buildTime);
    }
        if (length == 0) {

        }

 *

        }
        if (adapter.isInstance(sourceObject)) {
            return ModelActivator.getInstance().getBundle().getVersion();
        if (!DBWorkbench.isPlatformStarted()) {
import java.nio.charset.StandardCharsets;
            if (c > 127) {
    @NotNull
     */
        }

                throw new AssertionFailedException("An adapter factory for " //$NON-NLS-1$
        return replaceVariables(string, resolver, false);
        return divPos == -1 ? message : message.substring(divPos + 1);
    };
     * Returns first non-null and non-empty message from this exception or it's cause
            if (CommonUtils.isEmpty(value)) {
    }
                return Platform.getLogFileLocation().toFile().toPath();
            } else if (valueType == Short.TYPE) {

        Throwable cause = ex.getCause();
            ModelPreferences.PLUGIN_ID,
                String varName = matcher.group(2);
    ) {
        final Dictionary<String, String> headers = definingBundle.getHeaders();

    @NotNull

        if (object instanceof Number) {
            int v = b & 0xFF;
                getExceptionMessage(ex),
            IStatus.INFO,
                if (resolvedVars != null) {
        String adapterId = adapter.getName();
            } catch (IOException e) {
        Map<String, String> resolvedVars = null;
        if (CommonUtils.equalObjects(message, ex.getMessage())) {
            return Base64.encode(baos.toByteArray());
    /**
    public static String getDefaultFileEncoding() {
                    }
                if (exceptionMessageSet.contains(message)) {

            if (valueType == null || CharSequence.class.isAssignableFrom(valueType)) {
    }
    }
    }
            st++;
            log.warn("Error matching regex", e);
}
        // so there's no need to try it again.
        }
        return bb.array();
        if (name.startsWith(".")) {
        '8', '9', 'a', 'b',
    }
    public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;
                        varValue = varValue.substring(1);
        }
        if (!DBWorkbench.isDistributed() && !DBWorkbench.getPlatform().getApplication().isMultiuser()) {
            return "Class not found: " + cnfe.getMessage();

        Object result = queryAdapterManager(sourceObject, adapterId, allowActivation);
            throw new DBException("Resource name '" + name + "' contains illegal characters:  " + forbiddenExplain);
        IStatus[] children = status.getChildren();
            }
        } catch (NoSuchMethodException e) {
        }

            IStatus.ERROR,
            try {
import java.nio.ByteBuffer;

    // and we can't parse it as file (because of file:/ prefix - it fail on Windows at least)
                return new MultiStatus(
    @NotNull
            return ce.getStatus();
                    0,
    }
    private static final Log log = Log.getLog(GeneralUtils.class);
    @NotNull

            if (b < 0) b = 256 + b;
    public static boolean isWhitespaceExt(char c) {
            bytes[i] = (byte) c;
        } else if (cause instanceof SQLException sqlException) {
        }
                severity,
        return version.getMajor() + "." + version.getMinor();
        return consoleEncoding;
            return "Cannot resolve target address " + CommonUtils.notEmpty(error.getMessage());
        String s = variablePattern;
            null);
    }
                    if (resolvedVars == null) {
     * recursively iterates through all variables and returns root
        }

import java.nio.charset.Charset;
            return new Status(IStatus.ERROR, (Class<?>) null, "Empty exceptions list");
        if (name.endsWith(".")) {
                        resolvedVars = new HashMap<>();
        }
    public interface IParameterHandler {
        if (CommonUtils.isEmpty(consoleEncoding)) {
import java.net.UnknownHostException;
    @NotNull
            putInt(source.getInt()).
                    new IStatus[]{makeExceptionStatus(severity, cause, true)},
    @Nullable
        if (application != null) {
        return text.toString();
    @NotNull
        return prev;
                String matchedName = matcher.group(2);
        }
 * General non-ui utility methods
            else { // element is an array of object references
        }

        } else {
    @NotNull
                return Integer.valueOf(normalizeIntegerString(value));
    @NotNull
                String varName = isUpperCaseVarName ? matchedName.toUpperCase(Locale.ENGLISH) : matchedName;
        }
                    + sourceObject.getClass().getName() + " returned " + result.getClass().getName() //$NON-NLS-1$
        ApplicationDescriptor application = ApplicationRegistry.getInstance().getApplication();
    public static String variablePattern(@NotNull String name) {

    @NotNull
        Matcher matcher = VAR_PATTERN.matcher(variablePattern);
                } catch (IOException e) {
    public static String generateVariablesLegend(@NotNull String[][] vars) {
 * You may obtain a copy of the License at
            return string;
        boolean setParameter(String name, String value);
        final Dictionary<String, String> headers = definingBundle.getHeaders();
    @NotNull
        for (int i = 0; i < len; i++) {
        for (int i = 0; i < 256; ++i) {
            ModelPreferences.PLUGIN_ID,
        ByteBuffer source = ByteBuffer.wrap(bytes);
            } catch (ParseException e) {
import org.eclipse.core.runtime.*;
        IStatus[] children = status.getChildren();
            ex.getClass().getDeclaredMethod("toString");
        calendar.set(Calendar.DAY_OF_MONTH, 1);
                if (varValue != null) {

    }
            0,
    /////////////////////////////////////////////////////////////////////////
    @Nullable
import java.net.URISyntaxException;
            if (b < 32 || (b >= 0x7F && b <= 0xA0)) b = 32;
                    continue;

                }
    @NotNull
        try {
import org.jkiss.dbeaver.model.impl.app.ApplicationDescriptor;
    static {
        Version version = getProductVersion();
            if (product != null) {
        }
    public static String trimAllWhitespaces(@NotNull String str) {
        return new MultiStatus(
    @NotNull
        Bundle definingBundle = null;
                ex);
        }
                    throw new IllegalStateException("Can't parse workspace location URL", e);
                pos = matcher.end();
        }
    }
    }
            matcher = VAR_PATTERN.matcher(s);
    @NotNull
            } else if (valueType == BigInteger.class) {
        if (definingBundle == null) {
                return Arrays.toString((double[]) object);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
        } else if (error instanceof UnresolvedAddressException) {
        while (ex.getCause() != null && ex.getMessage() != null && ex.getMessage().equals(ex.getCause().getMessage())) {

    public static void writeBytesAsHex(@NotNull Writer out, @NotNull byte[] buf, int off, int len) throws IOException {
        List<VariableEntryInfo> variables = new LinkedList<>();
    }
 *
    public static final Pattern URI_SCHEMA_PATTERN = Pattern.compile("([a-zA-Z0-9-_]+:).+");
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
        Object result;
                    null);
import org.jkiss.dbeaver.ModelPreferences;
import java.lang.reflect.InvocationTargetException;
            null);
        AdapterManager adapterManager = AdapterManager.getDefault();
                        + result.getClass().getName() + " that is not an instance the requested type"); //$NON-NLS-1$
                        if (EMPTY_ENV_VARIABLE_VALUE.equals(varValue)) {
            nextError = sqlException.getNextException();
            String plainPath = path.substring(matcher.end(1));
                }
    }
    @NotNull
            return ""; //$NON-NLS-1$
    @Nullable
        }
                    getExceptionMessage(ex),
        if (!Files.exists(metaDir)) {
     * @param name the resource name to validate
    /**
    }
            order(ByteOrder.LITTLE_ENDIAN).
        if (string == null) {
                workspacePath = workspace.getAbsolutePath();
        }
                text.append("\n").append(getStatusText(child));
                        ModelPreferences.PLUGIN_ID,
            throw new DBException("Resource name '" + name + "' can't end with dot");
        Class<?> eClass = object.getClass();
    private static String substituteVariable(@NotNull String string, @NotNull Matcher matcher, @NotNull String varValue) {
     * Replaces all line separators with system line separators

            len--;
            }
            } else if (valueType == Byte.class) {
    // So we remove schema prefix if present and convert path to URI.
        if (CommonUtils.isEmpty(string)) {
            if (!CommonUtils.isEmpty(message)) {
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    public static String makeStandardErrorMessage(@NotNull Throwable error) {
        return null;
                try {

    public static IStatus makeErrorStatus(String message, Throwable e) {
            return "Unknown host " + CommonUtils.notEmpty(error.getMessage());
    public static Object deserializeObject(@NotNull String text) {

        ApplicationDescriptor application = ApplicationRegistry.getInstance().getApplication();
        if (children != null) {
    }
        }
            str.substring(st, len) : str;
        }
            return string;
    // Copy-pasted from org.eclipse.core.runtime.Adapters to support Eclipse Mars (#46667)
    @NotNull
                return Boolean.valueOf(value);
        }
                    ex);
    public static String getLongProductTitle() {
                return message;
        if (message == null) {
    }
     * @param text the text to normalize
            }
                return Arrays.toString((char[]) object);
                prev = new Status(
        if (adapterManager == null) {
    public static final Charset DEFAULT_FILE_CHARSET = UTF8_CHARSET;
        return UTF8_ENCODING;

        } else if (error instanceof ClassNotFoundException cnfe) {
            String message = exception.getMessage();
import java.util.regex.Matcher;
        }
    @NotNull
    @NotNull
    }
        bb.putLong(uuid.getMostSignificantBits());
    }

                prev = new MultiStatus(ModelPreferences.PLUGIN_ID,
        return text.replaceAll("(\r\n)|\r", "\n");
        }
    }
        return makeExceptionStatus(IStatus.ERROR, message, ex);
                    new IStatus[]{prev},

            }
        String consoleEncoding = System.getProperty(StandardConstants.ENV_CONSOLE_ENCODING);
                return Byte.valueOf(normalizeIntegerString(value));


            } else if (valueType == Integer.TYPE) {
        StringBuilder text = new StringBuilder(status.getMessage());
            return Path.of(plainPath).toUri();
            out.write(HEX_CHAR_TABLE[v >>> 4]);
    @NotNull
        'c', 'd', 'e', 'f'
import org.jkiss.utils.CommonUtils;
    // Workaround for broken URLs.
            } else if (valueType == Long.class) {
            putShort(source.getShort()).
    public static String getProductName() {
        @NotNull String name,
            ex = ite.getTargetException();
    }
        } else {
        }
                for (SQLException error = nextError; error != null; error = error.getNextException()) {
                return value;
            } else {

        '0', '1', '2', '3',
import java.nio.ByteOrder;
            } else if (valueType == Double.TYPE) {
            out.write(HEX_CHAR_TABLE[v & 0xF]);
     */
            if (theClass.isInstance(e)) {
        ByteBuffer target = ByteBuffer.allocate(16).
    }
            return error.getClass().getSimpleName();
        }
    public static byte[] convertToBytes(@NotNull String strValue) {
    public static String normalizeLineSeparators(@NotNull String str) {


            return makeExceptionStatus(severity, ex);
        return variables;
    }
    @NotNull
        target.rewind();

        }
        }

import org.jkiss.dbeaver.DBException;
        return makeExceptionStatus(IStatus.ERROR, ex);
            }
    @NotNull
        return name;
        final String buildTime = headers.get("Build-Time");
        }
    @NotNull
            return null;
    public static void validateResourceName(@NotNull String name) throws DBException {
     * Normalizes line endings by converting Windows ({@code \\r\n}) and
                    errorChain.add(makeExceptionStatus(severity, cause, true));
            text.append(varPatterns[i]);
    @NotNull
import org.jkiss.dbeaver.model.impl.app.ApplicationRegistry;
                    string = substituteVariable(string, matcher, varValue);
import java.nio.file.Files;
            return ApplicationRegistry.getInstance().getApplication().getName();
            else if (eClass == char[].class)
     * @throws DBException if the resource name is invalid
            e);
        String forbiddenSymbols = name.replaceAll(RESOURCE_NAME_FORBIDDEN_SYMBOLS_REGEX, "");
        return c <= ' ' || c == 0x160;
        if (product != null) {
            return "Internal error (NPE)";

    public static String convertToString(@NotNull byte[] bytes, int offset, int length) {
    public static String replaceVariables(@NotNull String string, @NotNull IVariableResolver resolver) {
                    getExceptionMessage(ex),
            } else if (valueType == Integer.class) {
            byteToHex[i] = Character.toString(nibbleToHex[i >>> 4]) + nibbleToHex[i & 0x0f];
    public static final String PROP_TRUST_STORE = "javax.net.ssl.trustStore"; //$NON-NLS-1$
            byte b = buf[off + i];
            }
    public static final String UTF8_ENCODING = StandardCharsets.UTF_8.name();
            if (nextError != null) {
            return version.getMajor() + "." + version.getMinor() + "." + version.getMicro();
    // Thus we can't parse it as URL or URI (because of spaces and special characters)
        if (error instanceof UnknownHostException) {

        int st = 0;
        try {
        } catch (Throwable e) {
        if ((sourceObject instanceof PlatformObject) && !allowActivation) {
        int divPos = value.lastIndexOf('.');
     * This is loosy algorithm because it gets only first byte from each char.
    }
    // In some cases we get file path from URI and it looks like file:/c:/path with spaces/
            return application.getContributorBundle().getVersion();
        // Compose byte to hex map

        if (matcher.matches()) {
            }
            return NumberFormat.getInstance().format(object);
    @Nullable
    }
                if (cause != null) {
                    0,
        if (application != null) {
 * Unless required by applicable law or agreed to in writing, software
        }
            if (product != null) {
    public static String getStatusText(@NotNull IStatus status) {
                String varValue;
    @NotNull
        }

    public static IStatus makeExceptionStatus(int severity, @Nullable String message, @NotNull Throwable ex) {
