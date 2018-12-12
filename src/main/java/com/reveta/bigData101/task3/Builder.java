//package com.reveta.bigData101.task3;
//
//import org.apache.avro.Schema;
//import org.apache.avro.generic.GenericData;
//import org.apache.commons.io.IOUtils;
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.Path;
//import org.apache.parquet.avro.AvroParquetReader;
//import org.apache.parquet.avro.AvroParquetWriter;
//import org.apache.parquet.example.data.Group;
//import org.apache.parquet.hadoop.ParquetReader;
//import org.apache.parquet.hadoop.ParquetWriter;
//import org.apache.parquet.hadoop.api.WriteSupport;
//import org.apache.parquet.hadoop.example.GroupWriteSupport;
//import org.apache.parquet.hadoop.metadata.CompressionCodecName;
//import org.apache.parquet.schema.MessageType;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Builder extends ParquetWriter.Builder<Group, Builder> {
//    private MessageType type = null;
//    private Map<String, String> extraMetaData = new HashMap<String, String>();
//
//    private Builder(Path file) {
//        super(file);
//    }
//
//    public Builder withType(MessageType type) {
//        this.type = type;
//        return this;
//    }
//
//    public Builder withExtraMetaData(Map<String, String> extraMetaData) {
//        this.extraMetaData = extraMetaData;
//        return this;
//    }
//
//    @Override
//    protected Builder self() {
//        return this;
//    }
//
//    @Override
//    protected WriteSupport<Group> getWriteSupport(Configuration conf) {
//        return new GroupWriteSupport(type, extraMetaData);
//    }
//
//}