        }
        } else {
            } catch (IOException e) {
                        tableName = DTUtils.getTableNameFromQueryContainer(dataContainer.getDataSource(), (SQLQueryContainer) dataContainer);
import org.jkiss.code.Nullable;
                    if (dataContainer == null) {
            this.out.write(b);
                            }
    }
                case VARIABLE_DATASOURCE: {
    }
                } catch (DBException e) {
        if (processor instanceof IDocumentDataExporter) {
        // Can't rememeber why did we need this. It breaks file names in case of multiple tables export (#6911)
        return null;
        public void close() throws IOException {
            }
            }
            try {
                }
import org.jkiss.dbeaver.model.meta.DBSerializable;
        if (exportSite != null) {
        {VARIABLE_DAY, "current day"},
    private Path makeLobFileName(String suffix, String fileExt) {
                    return stripObjectName(tableName);
                    processor.processError(monitor, error, this, task, entry.getValue());
        outputFiles.add(outputFile);
    private static String getFallbackOutputFolder() {

        });
        @Override
            // Export row
                writer.flush();

            }

    }
                log.warn("Error while exporting table footer", e);
        }
            }
                case VARIABLE_DATE:
        public void write(int b) throws IOException {
            }
                log.debug(e);
                if (((IAppendableDataExporter) processor).shouldTruncateOutputFileBeforeExport()) {
    @NotNull
            outputStream = null;
            } catch (IllegalArgumentException e) {
                    processor.processEvent(monitor, IDataTransferEventProcessor.Event.FINISH, this, task, entry.getValue());
        return lobDirectory.resolve(name + fileExt); //$NON-NLS-1$ //$NON-NLS-2$
import org.jkiss.dbeaver.model.exec.DBCException;
                    // Check for binary type export
                writer.flush();


        return GeneralUtils.replaceVariables(pattern, name -> {
                case VARIABLE_TABLE: {
                Files.createDirectories(dir);
                        }
    }
    
                                writer.write(contentAfterEscaping);
            runtimeParameters.blobFileConflictPreviousChoice = response.choiceIndex;
        StringBuilder result = new StringBuilder();
                .toArray(DBDAttributeBinding[]::new);
    public static final String VARIABLE_PROJECT = "project";
    @Override
                                break;
            }
            zipStream = null;
                lastUnd = true;
                String strContents = outputBuffer.toString();
        if (settings.isUseSingleFile() && parameters.orderNumber > 0) { 
            return getObjectName();
    @Override
        @NotNull TransferParameters parameters,
            bytesWritten += b.length;
        }

    }
                        return null;
            if (fileExists && !Files.isDirectory(outputFile)) {
    
        // do nothing
    private void closeOutputStreams() {

    private Path lobDirectory;
            initExporter(session);
    public static class ObjectSerializer implements DTObjectSerializer<DBTTask, StreamTransferConsumer> {
    private ConsumerRuntimeParameters runtimeParameters;
            return outputFile;
                exportHeaderInFile(session);
    public boolean isBeforeFirstRow() {
        }
    private DataFileConflictBehavior prepareDataFileConflictBehavior(String fileName) {
    public DBPImage getObjectContainerIcon() {
        this.outputStream = new BufferedOutputStream(stream, OUT_FILE_BUFFER_SIZE);
        } else {
 * limitations under the License.
        final StreamMappingContainer mapping = settings.getDataMapping(dataContainer);
        }
            return fileName;
                return makeOutputFile(monitor, suffix, getFallbackOutputFolder());

                    default -> throw new RuntimeException("Unexpected data file conflict behavior " + behavior);
    private Path makeOutputFile(@NotNull DBRProgressMonitor monitor, @Nullable String suffix) throws IOException {
                    }
        } catch (DBException e) {
        if (behavior == BlobFileConflictBehavior.ASK) {
                        }
        }
        return true;
        } else {
    @Override
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
                        return DTConstants.DEFAULT_TABLE_NAME_EXPORT;
                            for (; ; ) {
    @Override
    @NotNull
 */

    }
        }
            try {
        }

            if (!resolveOverwriteBlobFileConflict(lobFile.getFileName().toString())) {

        openOutputStreams(monitor);
        }
                // if we still want to append but the file is non-appendable, so it should be patchnamed
            return processorProperties;
        } else {
            try {
    }

import org.jkiss.dbeaver.model.data.json.JSONUtils;

        }
            if (response.choiceIndex > 2) {
        public StreamTransferConsumer deserializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull SerializerContext serializeContext, @NotNull DBTTask objectContext, @NotNull Map<String, Object> state) throws DBException {
                    return String.valueOf(parameters.orderNumber + 1);
            } catch (DBException e) {
    private void exportFooterInFile(@NotNull DBRProgressMonitor monitor) {
            return settings == null ? StandardCharsets.UTF_8.displayName() : settings.getOutputEncoding();
        return row;
                    behavior = DataFileConflictBehavior.OVERWRITE;
        for (int i = 0; i < name.length(); i++) {
    @Override
        if (parameters.startTimestamp != null) {

    }
                            case SKIP:
                log.error("Error creating output folder", e);
                    try {
                switch (behavior) {

                            if (filename.indexOf('.') >= 0) {
                DTMessages.data_transfer_file_conflict_ask_title, NLS.bind(DTMessages.data_transfer_file_conflict_ask_message, fileName),
        //}
    public StreamTransferConsumer() {
        try {
            out.close();
        Boolean extractImages = (Boolean) processorProperties.get(StreamConsumerSettings.PROP_EXTRACT_IMAGES);
import org.jkiss.dbeaver.model.task.DBTTask;
            if (response.forAllChoiceIndex != null) {
        OutputStreamStatProxy(OutputStream outputStream) {
        Path dir;
    public static final String NODE_ID = "streamTransferConsumer";
                Files.delete(lobFile);
                                }
                                final byte[] bytes = buffer.toByteArray();
                }
        if (!parameters.isBinary && settings.isOutputClipboard() && error == null) {

    }
import org.jkiss.dbeaver.DBException;
        }
    }
    }


/**
                            case FILES:
            } else {
                    }
        }
import org.jkiss.dbeaver.utils.ContentUtils;
                    // appendable but not patchable file should be overwritten after the old data was preloaded
                    outputFile,
        try (InputStream cs = contents.getContentStream()) {
                    exportSite.flush();
            }[response.choiceIndex];
                    final SQLQueryContainer container = DBUtils.getAdapter(SQLQueryContainer.class, dataContainer);
                    exportHeaderInFile(session);
        public void flush() throws IOException {
                    IOUtils.copyStream(stream, exportSite.getOutputStream());
            columnBindings = Arrays.stream(columnBindings)
    public void setRuntimeParameters(Object runtimeParameters) {
import org.jkiss.dbeaver.model.data.*;
import java.nio.file.StandardCopyOption;
        if (Files.isRegularFile(lobFile)) {
                case VARIABLE_HOUR:
                                // Just pass content to exporter

    public String getObjectContainerName() {
        );
        }
 * You may obtain a copy of the License at
            }
            }
        }
        } catch (IOException e) {
            // Use saved timestamp (#7352)
    public Object getTargetObjectContainer() {
                    }
        @Nullable IStreamDataExporter processor,
                    exportFooterInFile(session.getProgressMonitor());
                    Files.delete(file);

                }
                            if (dataSource != null) {
                        case HEX: {
                outputFile = null;
                    if (!ContentUtils.isTextContent((DBDContent) value)) {
        private final OutputStream out;
        public void writeBinaryData(@NotNull DBDContentStorage cs) throws IOException {
        }
            translatePattern(settings.getOutputFilePattern(), null).trim()
            if (outputBuffer != null) {
        final DataTransferRegistry registry = DataTransferRegistry.getInstance();
                // Delete output file
                    DTMessages.data_transfer_file_conflict_behavior_apply_to_all_for_current_object
                    }
            this.outputStream = zipStream;
            } catch (IOException e) {
    }
    }
    }

import java.util.zip.ZipOutputStream;
                }
                        case NATIVE: {
                }
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.tools.transfer.IDataTransferEventProcessor;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                                break;
        @Override
                            byte[] readBuffer = new byte[1000];
                    if (schema != null) {
            this.writer.flush();
            }
    public List<Path> getOutputFiles() {
        if (!parameters.isBinary && settings.isOutputEncodingBOM()) {
    
        
                    DTMessages.data_transfer_file_conflict_cancel
            );
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        try {
                targetRow[i] = value;
    @Override
                    }

            columnBindings = DBUtils.injectAndFilterAttributeBindings(session.getDataSource(), dataContainer, columnMetas, true);
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.utils.Base64;
    }
        @Override
                                String content = new String(readBuffer, 0, count, cs.getCharset());
        multiFileNumber++;
    private Path outputFile;
                    if (settings.isUseSingleFile()) {

        }
                                int count = stream.read(readBuffer);

    }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            ts = parameters.startTimestamp;


    public DBPProject getProject() {
                                value = null;
                log.debug("Can't find event processor '" + entry.getKey() + "'");
    private IStreamDataExporter processor;
        if (settings.isOutputClipboard()) {
    @Override
    }
            try {
    }

    @Override
                }
                outputFiles.add(outputFile);
                    if (settings.isUseSingleFile()) {
                .filter(attr -> {
import java.nio.file.Files;
                    DBSCatalog catalog = DBUtils.getParentOfType(DBSCatalog.class, dataContainer);
            fileName += ".zip";
}
            } catch (Exception e) {
                } else {
        this.outputStream = this.statStream = new StatOutputStream(outputStream);
            if (settings.isSplitOutFiles() && !parameters.isBinary && !firstRow) {
            }
 * Stream transfer consumer
    public DBPDataSourceContainer getDataSourceContainer() {
        this.settings = settings;
                            tableName = DTConstants.DEFAULT_TABLE_NAME_EXPORT + "_" + parameters.orderNumber;
                }
    
        }
    }
            behavior = new DataFileConflictBehavior[] {
        if (!initialized) {
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI.UserChoiceResponse;
                return CommonUtils.toString(container.getQueryParameters().get(name));

                            String filename = file.getFileName().toString();
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings.DataFileConflictBehavior;
            }
    @NotNull
            }
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings.BlobFileConflictBehavior;
                        }
    @Override
    }
                        return "";

    public void close() {
            /*// For multi-streams export header only once
            throw new DBCException("IO error", e);
            UserChoiceResponse response = DBWorkbench.getPlatformUI().showUserChoice(
 *
                                if (!settings.isOutputClipboard()) {
                    log.warn("Error importing existing data for appending, data loss might occur", e);
            ContentUtils.close(outputStream);
    }
        String fileExt = (extractImages != null && extractImages) ? ".jpg" : ".data";
                runtimeParameters.blobFileConflictBehavior = behavior;

            }
            }
            DBSAttributeBase metaAttr = attribute.getMetaAttribute();
            char c = name.charAt(i);
        }
        {VARIABLE_INDEX, "index of current file (if split is used)"},
        final String value = prefs.getString(DTConstants.PREF_FALLBACK_OUTPUT_DIRECTORY);
                        return null;
    private boolean initialized = false;
                    }
        try {

    public StreamConsumerSettings getSettings() {
                    } catch (Exception e) {
    public String translatePattern(String pattern, final Path targetFile) {
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
            }
    }
                    break;
                                }
        String fileName = CommonUtils.notNull(


                                break;
            try {
                    return new SimpleDateFormat("mm").format(ts);
        return makeOutputFile(monitor, null);
    }
    private StreamExportSite exportSite;
                                writer.write(binaryString);
                result.append('_');
        }
    }
                                if (count <= 0) {
/*
    }
                }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings.ConsumerRuntimeParameters;
            try {
import org.jkiss.dbeaver.Log;
            UserChoiceResponse response = DBWorkbench.getPlatformUI().showUserChoice(
                                IOUtils.copyStream(stream, buffer);
                log.debug("Error fetching '" + metaAttr.getName() + "' value: " + e.getMessage());
        if (extension != null) {
            return writer;
                runtimeParameters.dontDropBlobFileConflictBehavior = response.forAllChoiceIndex == 0;
            }
    }
            
    @Override
                if (error == null) {
            // That's a dirty way of doing things ...
            return outputStream;
    @Override
    @Override
import org.jkiss.utils.io.ByteOrderMark;
            firstRow = false;
    public static final String VARIABLE_SCRIPT_FILE = "scriptFilename";
        }
        if (!initialized) {
        }
            }
    
                    }

        {VARIABLE_DATE, "current date"},
                    }
                }
                        return sdf.format(ts);

        public void flush() throws IOException {
    }
            dir = DBFUtils.resolvePathFromString(monitor, getProject(), outputFolder);
        public Path getOutputFile() {
    
        }
        }
        }
    public static final String VARIABLE_INDEX = "index";
                    return catalog == null ? "" : stripObjectName(catalog.getName());
        public DBDAttributeBinding[] getAttributes() {
            try {
                            tableName = DTUtils.getTargetContainersNameFromQuery((SQLQueryContainer) dataContainer);
            processor = null;
    @Override
                })
            } else {
        if (parameters.exportToStream != null) {
        }
        if (!parameters.isBinary) {
            this.runtimeParameters = crp;
            }
        {VARIABLE_SCHEMA, "source database schema"},
                    DataFileConflictBehavior.PATCHNAME.title,
                        default: {
        return translatePattern(settings.getOutputFolder(), null);
        if (!Files.exists(file)) {
            // Get values
        }
        final Path file = makeOutputFile(monitor, suffix, getOutputFolder());
    private long bytesWritten = 0;
        }
        initialized = true;
        {VARIABLE_TABLE, "source database table"},


    private void openOutputStreams(DBRProgressMonitor monitor) throws IOException {
import java.text.SimpleDateFormat;

        } else {
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
            this.out.write(b);
            this.zipStream = new ZipOutputStream(this.outputStream);
        }


    private long lobCount;
        }

                        if (file != null) {
    private static String stripObjectName(String name) {
                }

    public DBPImage getObjectIcon() {
import java.util.*;

    @Override
            try {
        return statStream == null ? 0 : statStream.getBytesWritten();
    private StatOutputStream statStream;

            throw new DBCException("Can't initialize data exporter", e);
                        case BASE64: {
        return firstRow;
                log.debug(e);
        int columnCount = attributes.length; // Column count without virtual columns
                    DataFileConflictBehavior.OVERWRITE.title,

                DataFileConflictBehavior.APPEND,
            return;
                    } else {
                outputFile = makeOutputFile(session.getProgressMonitor());
                        outputFile = makeOutputFile(monitor, "-" + System.currentTimeMillis());
        @Override
        }
                outputStream.flush();
            }
                            for (; ; ) {
        this.processor = processor;


                        return "";

                        }
import org.jkiss.dbeaver.model.*;
        return null;
    private TransferParameters parameters;
                : List.of(DTMessages.data_transfer_file_conflict_behavior_apply_to_all);
        this.dataContainer = (DBSDataContainer) sourceObject;
    }
                            break;
                                    value = saveContentToFile(session.getProgressMonitor(), (DBDContent) value);
                        return "";
            boolean outputClipboard = settings.isOutputClipboard();
        public void write(@NotNull byte[] b, int off, int len) throws IOException {
                    if (dataContainer == null) {
                    case OVERWRITE -> truncate = true;
    @Nullable
            Files.copy(cs, lobFile, StandardCopyOption.REPLACE_EXISTING);
            closeExporter();
        closeOutputStreams();
                outputStream.flush();
        

                forAllLabels, runtimeParameters.dataFileConflictPreviousChoice, 2
        }
            processor.exportHeader(session);
            }
        @Override
                    BlobFileConflictBehavior.PATCHNAME.title,
    private void createNewOutFile(DBRProgressMonitor monitor) throws IOException {
    @NotNull
                    final StreamMappingAttribute attribute = mapping.getAttribute(attr);
                    if (container != null) {
        return settings.isOutputClipboard() ? "Clipboard" : getOutputFolder();
                        tableName = DTUtils.getTableName(dataContainer.getDataSource(), dataContainer, true);
    public static Object[] fetchRow(DBCSession session, DBCResultSet resultSet, DBDAttributeBinding[] attributes) throws DBCException {
        @Nullable
            return dataContainer;
    public void initTransfer(
            this.out = outputStream;
    public static final String VARIABLE_HOUR = "hour";
        return null;
    private StringWriter outputBuffer;
                case VARIABLE_CONN_TYPE:
                    switch (settings.getLobEncoding()) {
            ((DBDFormatSettingsExt)session).setDataFormatterProfile(settings.getFormatterProfile());

    }
                log.debug("Export to the new file \"" + outputFile + "\"");
    private final List<Path> outputFiles = new ArrayList<>();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        if (CommonUtils.isEmpty(tableName)) {
                Object value = DBUtils.getAttributeValue(column, columnMetas, srcRow);
        @Nullable DBPProject project
                throw new IOException(e.getMessage(), e);
        return project;
            if (!Files.exists(lobDirectory)) {
            );

        } catch (DBException e) {
    }
            Object[] targetRow;
    private DBDAttributeBinding[] columnBindings;
            try {
            return null;
            return new StreamTransferConsumer();
    @NotNull
                try (final InputStream stream = cs.getContentStream()) {
            Object[] srcRow = fetchRow(session, resultSet, columnMetas);
            return settings.getValueFormat();
        {VARIABLE_CATALOG, "source database catalog"},
        {VARIABLE_SCRIPT_FILE, "source script filename"},
    public static final String VARIABLE_YEAR = "year";
        if (settings.getFormatterProfile() != null && session instanceof DBDFormatSettingsExt) {
            processor.init(exportSite);
                DBDAttributeBinding column = columnBindings[i];
        public DBPNamedObject getSource() {
    public String getOutputFileName() {

    @Override
                    }
    }
        @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
                DataFileConflictBehavior behavior = prepareDataFileConflictBehavior(outputFile.getFileName().toString());
        @Override
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferEventProcessorDescriptor;
        @Override
            
    public static final String VARIABLE_CATALOG = "catalog";
            behavior = new BlobFileConflictBehavior[] {
            if (processor instanceof IAppendableDataExporter) {

    public void finishTransfer(DBRProgressMonitor monitor, boolean last) {
        @Override
            if (formatProp != null) {
            runtimeParameters.outputFileNameToReuse, 
        OutputStream stream;
        bytesWritten = 0;
        DBDContentStorage contents = content.getContents(monitor);

            // Check for file split
        }
    public static final String VARIABLE_MINUTE = "minute";
                        break;
            } catch (Exception e) {
        if (settings.isUseSingleFile() && suffix != null) {
                                GeneralUtils.writeBytesAsHex(writer, buffer, 0, count);
                throw new RuntimeException("User cancel during existing file resolution for data " + fileName);
            if (monitor.isCanceled()) {
        }
                log.debug("Export to the existing file \"" + outputFile + "\"");
            } catch (IOException e) {
    }
            exportSite = new StreamExportSite();
import org.jkiss.code.NotNull;
    }
            if (!fileExists) {
            behavior = DataFileConflictBehavior.APPEND;
    private Path saveContentToFile(DBRProgressMonitor monitor, DBDContent content)

                case VARIABLE_CATALOG: {
        @Override
    public Object getTargetObject() {
        return behavior == BlobFileConflictBehavior.OVERWRITE;
        }
            if (metaAttr == null) {
            this.outputStream = new OutputStreamStatProxy(this.outputStream);
        // Prepare columns
                );
            if (response.choiceIndex < 0) {
            Object formatProp = processorProperties.get(PROP_FORMAT);
        for (Map.Entry<String, Map<String, Object>> entry : settings.getEventProcessors().entrySet()) {
                                    break;
                        truncate = false;
        {VARIABLE_YEAR, "current year"},
        }
                        final Path file = container.getScriptContext().getSourceFile();
    }
import org.eclipse.osgi.util.NLS;
    private StreamConsumerSettings settings;
        final boolean truncate;
                                // Set it it null
        @Nullable Map<String, Object> processorProperties,

                    return new SimpleDateFormat("dd").format(ts);
            }
                openOutputStreams(session.getProgressMonitor());
                    if (settings.isUseSingleFile()) {
                        return "BAD_TIMESTAMP";
        if (!last && error == null) {


        
            if (response.forAllChoiceIndex != null || settings.isUseSingleFile()) {
        // Finish zip stream
    
        if (runtimeParameters == null) {
        }
                log.error("Error executing event processor '" + entry.getKey() + "'", e);
            name += suffix;
 * DBeaver - Universal Database Manager
    }
        public DBDDisplayFormat getExportFormat() {
                            break;
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
                continue;
        if (processor != null) {
import org.jkiss.dbeaver.model.fs.DBFUtils;
        return DBFUtils.convertPathToString(makeOutputFile(monitor));
            this.writer = new PrintWriter(new OutputStreamWriter(this.outputStream, settings.getOutputEncoding()), true);
    @Nullable
import java.util.zip.ZipEntry;
    @Override
                lastUnd = false;
        {VARIABLE_TIMESTAMP, "current timestamp"},

            return DTConstants.DEFAULT_FALLBACK_OUTPUT_DIRECTORY;
                if (value instanceof DBDContent) {
        if (this.writer != null) {

                    DBPProject project = DBUtils.getObjectOwnerProject(dataContainer);
            }
                forAllLabels, runtimeParameters.blobFileConflictPreviousChoice, 1
            } else {
                    DBSCatalog catalog = DBUtils.getParentOfType(DBSCatalog.class, dataContainer);
    private int multiFileNumber;
    private void initExporter(DBCSession session) throws DBCException {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                throw new RuntimeException("User cancel during existing file resolution for blob " + fileName);

        return behavior;
            // init exporter
    public static final int OUT_FILE_BUFFER_SIZE = 100000;
                : List.of(
        }

                            return filename;
            }
    protected long getBytesWritten() {

        public String getOutputEncoding() {
                            }
            // Check for cancel
    public void startTransfer(DBRProgressMonitor monitor) {
            }[response.choiceIndex];
                            break;

    private boolean resolveOverwriteBlobFileConflict(@NotNull String fileName) {
                    return new SimpleDateFormat("yyyy").format(ts);
                    if (dataContainer instanceof SQLQueryContainer) {
            // Can be invoked multiple times in case of per-segment transfer
        }
                    // First add footer for the previous file

    private DBPProject project;
            } else {
        }
                    return attribute == null || attribute.getMappingType() == StreamMappingType.export;
        this.parameters = parameters;
        if (CommonUtils.isNotEmpty(suffix)) {
        columnMetas = DBUtils.getAttributeBindings(session, dataContainer, resultSet.getMeta());
        this.project = project;
            bytesWritten++;
                case VARIABLE_TIMESTAMP:

        } catch (Exception e) {
            // Dispose exporter
                DataFileConflictBehavior.OVERWRITE

        }
        // If we need to split files - use stream wrapper to calculate file size
    private String getOutputFileName(@Nullable String suffix) {
        return settings;
    @Override
                    return new SimpleDateFormat("MM").format(ts);
            throw new IOException(e.getMessage(), e);
                Files.createFile(file);

                break;
                        SimpleDateFormat sdf = new SimpleDateFormat(settings.getOutputTimestampPattern());
            processor.exportRow(session, resultSet, targetRow);
        {VARIABLE_PROJECT, "source database project"},
        public OutputStream getOutputStream() {
            log.debug("\tInsert BOM into output stream");
        if (CommonUtils.isEmpty(value)) {
                    log.debug(e);
                        }
        return getOutputFileName(null);
            runtimeParameters.dataFileConflictPreviousChoice = response.choiceIndex;
            throw new DBCException("Data transfer IO error", e);
    }
import java.nio.file.StandardOpenOption;
        return null;

        // if (parameters.orderNumber > 0 && !settings.isUseSingleFile()) {
        public void write(@NotNull byte[] b) throws IOException {
            try {
            }

                                    // Save content to file and pass file reference to exporter

                    }
        return lobFile;

@DBSerializable(StreamTransferConsumer.NODE_ID)
        }
                                    break;
    public static final String VARIABLE_DATE = "date";
            log.error("Error resolving output folder", e);
                }
                this.outputBuffer = new StringWriter(2048);
            // all consequent sources in a session should be appended  to the first file 
        throws IOException, DBException {
                    String tableName;
        closeOutputStreams();
        return result.toString();
        Object[] row = new Object[columnCount];
        if (!Files.exists(dir)) {
                            case INLINE:
    }
    @Override
        if (outputStream != null) {
            }
                truncate = true;
import java.nio.file.Path;
            List<String> forAllLabels = settings.isUseSingleFile()
 * Copyright (C) 2010-2025 DBeaver Corp and others

            return value;
        {VARIABLE_HOUR, "current hour"},
        }
    }
        @Override
import org.jkiss.dbeaver.tools.transfer.DTConstants;
            runtimeParameters = settings.prepareRuntimeParameters();
        if (runtimeParameters instanceof ConsumerRuntimeParameters crp) {
                processor.dispose();
    public String getObjectFullName(@NotNull DBRProgressMonitor monitor) throws IOException {
        }
            // Open output streams
                DBWorkbench.getPlatformUI().copyTextToClipboard(strContents, parameters.isHTML);
        @Override
            final SQLQueryContainer container = DBUtils.getAdapter(SQLQueryContainer.class, dataContainer);
    private class OutputStreamStatProxy extends OutputStream {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSObject;
 */
                exportSite.flush();
                            tableName = DTConstants.DEFAULT_TABLE_NAME_EXPORT;
                        switch (settings.getLobExtractType()) {
        @Override
                                String contentAfterEscaping = JSONUtils.escapeJsonString(content);
            } catch (IOException e) {

                        }
            return columnBindings;
            if (container != null) {
                BlobFileConflictBehavior.OVERWRITE
        if (CommonUtils.isNotEmpty(suffix)) {
                ? List.of(DTMessages.data_transfer_file_conflict_behavior_apply_to_all)
            }
            if (parameters.exportToStream == null && (parameters.isBinary || !outputClipboard)) {
    public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) throws DBCException {
            for (int i = 0; i < columnBindings.length; i++) {
            stream = parameters.exportToStream;
            return fileName + "." + extension;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        }
            } else {

    public static final String VARIABLE_TABLE = "table";
                    }
        if (zipStream != null) {
            if (!settings.isUseSingleFile() || parameters.orderNumber == 0) */{
            runtimeParameters.initForConsumer();
        }
import java.io.*;

        }
    }
    @NotNull
                    }
            log.debug("\tUse ZIP compression");
                throw new RuntimeException("Blob file name conflict behavior is not specified while " + fileName + " already exists");
                try {
            ts = new Date();
                                final String binaryString = dataSource.getSQLDialect().getNativeBinaryFormatter().toString(bytes, 0, bytes.length);
            }
import org.jkiss.utils.CommonUtils;
            if (Character.isLetterOrDigit(c)) {
                    if (settings.isUseSingleFile()) {
                behavior = DataFileConflictBehavior.PATCHNAME;                
import org.jkiss.dbeaver.runtime.DBWorkbench;
        //    fileName += "_" + String.valueOf(parameters.orderNumber + 1);
                            byte[] buffer = new byte[5000];
        final Date ts;
                continue;
                        return null;
                } catch (IOException e) {

                    DBSSchema schema = DBUtils.getParentOfType(DBSSchema.class, dataContainer);
            DBDAttributeBinding attribute = attributes[i];

        if (settings.isCompressResults()) {
                }
                case VARIABLE_SCHEMA: {
                        }
    }
                    case PATCHNAME -> {
                final ByteOrderMark bom = ByteOrderMark.fromCharset(settings.getOutputEncoding());

import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
    private boolean firstRow = true;
                log.debug(e);
        outputFile = makeOutputFile(monitor);
                        return stripObjectName(schema.getName());
        return settings.isOutputClipboard() ? "Clipboard" : getOutputFileName();
import java.nio.charset.StandardCharsets;
                throw new RuntimeException("Data file name conflict behavior is not specified while " + fileName + " already exists");
                    // Try catalog (#7506)
                stream = Files.newOutputStream(outputFile, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
                        }
                }
        }
    private DBSDataContainer dataContainer;
    @Override
            } else {
    public Path makeOutputFile(@NotNull DBRProgressMonitor monitor) throws IOException {
                );

                    return new SimpleDateFormat("HH").format(ts);

            }

        public Map<String, Object> getProperties() {
    }
    public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {

                result.append(c);
        }
            switch (name) {
    }
                    return catalog == null ? "" : stripObjectName(catalog.getName());
        }

        if (DBUtils.isNullValue(contents)) {
                    }
            final DataTransferEventProcessorDescriptor descriptor = registry.getEventProcessorById(entry.getKey());
    public String getObjectName() {
    public static final String VARIABLE_MONTH = "month";
    }

        }
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

            } catch (IOException e) {
    public static final String VARIABLE_SCHEMA = "schema";
            this.out.write(b, off, len);
        }
        {VARIABLE_MONTH, "current month"},


        public void serializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull DBTTask context, @NotNull StreamTransferConsumer object, @NotNull Map<String, Object> state) {

            List<String> forAllLabels = settings.isUseSingleFile()
 * See the License for the specific language governing permissions and
                outputStream.write(bom.getBytes());
        return dir.resolve(fileName);
        BlobFileConflictBehavior behavior = runtimeParameters.blobFileConflictBehavior;
        }
    private void closeExporter() {

package org.jkiss.dbeaver.tools.transfer.stream;
            return null;
            this.zipStream.putNextEntry(new ZipEntry(getOutputFileName()));
            exportFooterInFile(monitor);
            }
                lobFile = makeLobFileName("-" + System.currentTimeMillis(), fileExt);

                    final DBPDataSource dataSource = dataContainer.getDataSource();
        }
        {VARIABLE_MINUTE, "current minute"},
    private class StreamExportSite implements IStreamDataExporterSite {
                List.of(

                                ByteArrayOutputStream buffer = new ByteArrayOutputStream((int) cs.getContentLength());
        @Override
    
                outputBuffer = null;
                    if (dataContainer == null) {
        
                    // Make new file with the header
 * Unless required by applicable law or agreed to in writing, software
                log.debug(e);
                                if (count <= 0) {
        if (behavior == DataFileConflictBehavior.ASK) {
                                }
    }
        Path lobFile = makeLobFileName(null, fileExt);
        @NotNull DBSObject sourceObject,
        final DBPPreferenceStore prefs = DTActivator.getDefault().getPreferences();
            } finally {
                }
                zipStream.closeEntry();
 *
                final IDataTransferEventProcessor<StreamTransferConsumer> processor = descriptor.create();
        return settings.isOutputClipboard() ? DBIcon.TYPE_TEXT : DBIcon.TREE_FOLDER;
                case VARIABLE_DAY:
        try {
            bytesWritten += len;
                processor.exportFooter(monitor);
        String name = outputFile.getFileName().toString() + "-" + lobCount;
            try {
                log.debug("Error writing byte order mask", e);
                case VARIABLE_INDEX:
                case VARIABLE_SCRIPT_FILE: {
            boolean fileExists = Files.exists(outputFile);
        if (mapping != null && mapping.isComplete()) {
                ? List.of()
                zipStream.finish();
                log.debug(e);
                            }
                if (bytesWritten >= settings.getMaxOutFileSize()) {


            targetRow = new Object[columnBindings.length];
        if (settings.isCompressResults()) {
        return null;
    private void exportHeaderInFile(@NotNull DBCSession session) throws DBCException {

        }
                    case APPEND -> truncate = false;
                            }
        boolean lastUnd = false;
                    return stripObjectName(dataContainer.getDataSource().getContainer().getName());

            closeExporter();
                            Base64.encode(stream, cs.getContentLength(), writer);
        } catch (Throwable e) {
                BlobFileConflictBehavior.PATCHNAME,
    @NotNull
            if (outputClipboard) {
import org.jkiss.dbeaver.model.app.DBPProject;
                    createNewOutFile(session.getProgressMonitor());
            }
    public static final String VARIABLE_DAY = "day";
            fileName += "_" + (multiFileNumber + 1);
    @Override
import org.jkiss.dbeaver.tools.transfer.serialize.DTObjectSerializer;
                row[i] = attribute.getValueHandler().fetchValueObject(session, resultSet, metaAttr, attribute.getOrdinalPosition());
    }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                    DTMessages.data_transfer_file_conflict_behavior_apply_to_all,
                    (truncate ? StandardOpenOption.TRUNCATE_EXISTING : StandardOpenOption.APPEND)
        for (int i = 0 ; i < columnCount; i++) {
            if (response.choiceIndex > 1) {
                DataFileConflictBehavior.PATCHNAME,
                    }
            log.warn("Error while exporting table header", e);
    private Path makeOutputFile(@NotNull DBRProgressMonitor monitor, @Nullable String suffix, @NotNull String outputFolder) throws IOException {
    };
    public static final String VARIABLE_CONN_TYPE = "connectionType";
        }
    @Nullable
                    return dataContainer.getDataSource().getContainer().getConnectionConfiguration().getConnectionType().getId();
        if (processor != null) {
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
    public DBSObject getDatabaseObject() {
    public String getOutputFolder() {
        try {
    public static final String VARIABLE_DATASOURCE = "datasource";
            throw new IllegalStateException("Unsupported stream transfer consumer runtime parameters " + runtimeParameters);

 * you may not use this file except in compliance with the License.
                    BlobFileConflictBehavior.OVERWRITE.title,
                                int count = stream.read(buffer);
        this.processorProperties = processorProperties;
        @Nullable StreamConsumerSettings settings,
                try {
    }
                this.writer = new PrintWriter(this.outputBuffer, true);
public class StreamTransferConsumer implements IDataTransferConsumer<StreamConsumerSettings, IStreamDataExporter> {
            if (parameters.isBinary) {
        @Override
                DTMessages.data_transfer_blob_file_conflict_title, NLS.bind(DTMessages.data_transfer_file_conflict_ask_message, fileName),
            } catch (IOException e) {
        } else {
                stream = Files.newOutputStream(
    private ZipOutputStream zipStream;
        {VARIABLE_CONN_TYPE, "source database connection type"},
            }
                    StandardOpenOption.WRITE,
        } else {
    @NotNull
            }
                runtimeParameters.dataFileConflictBehavior = behavior;

                    if (CommonUtils.isEmpty(tableName)) {
            lobDirectory = DBFUtils.resolvePathFromString(monitor, getProject(), getOutputFolder()).resolve(LOB_DIRECTORY_NAME);
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;
                case VARIABLE_PROJECT: {

        return file;
                Files.createDirectory(lobDirectory);
    public static final String VARIABLE_TIMESTAMP = "timestamp";
                        log.error(e);
        }
                ),
            if (result.length() >= 64) {
    private static final Log log = Log.getLog(StreamTransferConsumer.class);
                ),
                Arrays.asList(
    }
        if (multiFileNumber > 0) {
    }
    private static final String PROP_FORMAT = "format"; //$NON-NLS-1$
            fileName += suffix;
            }
    public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
        }
        @NotNull
                    DTMessages.data_transfer_file_conflict_cancel
            if (outputStream != null) {
                        fileExists = false;

               return DBDDisplayFormat.valueOf(formatProp.toString().toUpperCase(Locale.ENGLISH));
            }
                outputStream.flush();
        // Check for BOM and write it to the stream
                    processor instanceof IAppendableDataExporter ? DataFileConflictBehavior.APPEND.title : null,
        }
        return outputFiles;
        } catch (IOException e) {
        finishTransfer(monitor, null, last);
        public PrintWriter getWriter() {
                    }
        
    private OutputStream outputStream;

            throw new DBCException("Error while exporting table row", e);
                case VARIABLE_YEAR:
            } catch (Exception e) {
            }
    }
            } else if (c == '_' || !lastUnd) {
    public void finishTransfer(@NotNull DBRProgressMonitor monitor, @Nullable Throwable error, @Nullable DBTTask task, boolean last) {
        if (lobDirectory == null) {
    public static final String[][] VARIABLES = {
                    return RuntimeUtils.getCurrentDate();
                }
            }
    private PrintWriter writer;
        DataFileConflictBehavior behavior = runtimeParameters.dataFileConflictBehavior;
                        case BINARY:
        if (behavior == DataFileConflictBehavior.APPEND) {
    private DBDAttributeBinding[] columnMetas;
                case VARIABLE_MINUTE:
    private static final String LOB_DIRECTORY_NAME = "files"; //$NON-NLS-1$
    private Map<String, Object> processorProperties;
    ) {
    public boolean isConfigurationComplete() {
        @Override
        Object extension = processorProperties == null ? null : processorProperties.get(StreamConsumerSettings.PROP_FILE_EXTENSION);
import org.jkiss.utils.IOUtils;
        log.debug("\tClose output stream");
            runtimeParameters.outputFileNameToReuse = fileName;
            if (writer != null) {
            out.flush();
            if (descriptor == null) {

            if (response.choiceIndex < 0) {
        }
 *
        }
                DBWorkbench.getPlatformUI().showError("Transfer event processor", "Error executing data transfer event processor '" + entry.getKey() + "'", e);
                case VARIABLE_MONTH:
                        if (parameters.orderNumber > 0) {
                                filename = filename.substring(0, filename.lastIndexOf('.'));
                    return project == null ? "" : project.getName();
            columnBindings = DTUtils.makeLeafAttributeBindings(session, dataContainer, resultSet);
        if (settings.isSplitOutFiles()) {
import org.jkiss.dbeaver.tools.transfer.DTUtils;
        String fileName = getOutputFileName(suffix);
            }
        }
        {VARIABLE_DATASOURCE, "source database datasource"},
                try (final InputStream stream = cs.getContentStream()) {

                        } else {
                    ((IAppendableDataExporter) processor).importData(exportSite);

                            writer.write("0x"); //$NON-NLS-1$
            throw new DBCException("IO error", e);
    @NotNull
        lobCount++;
