/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class GetMetricsTResponse implements org.apache.thrift.TBase<GetMetricsTResponse, GetMetricsTResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetMetricsTResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetMetricsTResponse");

  private static final org.apache.thrift.protocol.TField METRICS_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("metricsMap", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetMetricsTResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetMetricsTResponseTupleSchemeFactory());
  }

  private Map<String,MetricValue> metricsMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METRICS_MAP((short)1, "metricsMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METRICS_MAP
          return METRICS_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRICS_MAP, new org.apache.thrift.meta_data.FieldMetaData("metricsMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "MetricValue"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetMetricsTResponse.class, metaDataMap);
  }

  public GetMetricsTResponse() {
  }

  public GetMetricsTResponse(
    Map<String,MetricValue> metricsMap)
  {
    this();
    this.metricsMap = metricsMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetMetricsTResponse(GetMetricsTResponse other) {
    if (other.isSetMetricsMap()) {
      Map<String,MetricValue> __this__metricsMap = new HashMap<String,MetricValue>(other.metricsMap.size());
      for (Map.Entry<String, MetricValue> other_element : other.metricsMap.entrySet()) {

        String other_element_key = other_element.getKey();
        MetricValue other_element_value = other_element.getValue();

        String __this__metricsMap_copy_key = other_element_key;

        MetricValue __this__metricsMap_copy_value = other_element_value;

        __this__metricsMap.put(__this__metricsMap_copy_key, __this__metricsMap_copy_value);
      }
      this.metricsMap = __this__metricsMap;
    }
  }

  public GetMetricsTResponse deepCopy() {
    return new GetMetricsTResponse(this);
  }

  @Override
  public void clear() {
    this.metricsMap = null;
  }

  public int getMetricsMapSize() {
    return (this.metricsMap == null) ? 0 : this.metricsMap.size();
  }

  public void putToMetricsMap(String key, MetricValue val) {
    if (this.metricsMap == null) {
      this.metricsMap = new HashMap<String,MetricValue>();
    }
    this.metricsMap.put(key, val);
  }

  public Map<String,MetricValue> getMetricsMap() {
    return this.metricsMap;
  }

  public GetMetricsTResponse setMetricsMap(Map<String,MetricValue> metricsMap) {
    this.metricsMap = metricsMap;
    return this;
  }

  public void unsetMetricsMap() {
    this.metricsMap = null;
  }

  /** Returns true if field metricsMap is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricsMap() {
    return this.metricsMap != null;
  }

  public void setMetricsMapIsSet(boolean value) {
    if (!value) {
      this.metricsMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRICS_MAP:
      if (value == null) {
        unsetMetricsMap();
      } else {
        setMetricsMap((Map<String,MetricValue>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRICS_MAP:
      return getMetricsMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRICS_MAP:
      return isSetMetricsMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetMetricsTResponse)
      return this.equals((GetMetricsTResponse)that);
    return false;
  }

  public boolean equals(GetMetricsTResponse that) {
    if (that == null)
      return false;

    boolean this_present_metricsMap = true && this.isSetMetricsMap();
    boolean that_present_metricsMap = true && that.isSetMetricsMap();
    if (this_present_metricsMap || that_present_metricsMap) {
      if (!(this_present_metricsMap && that_present_metricsMap))
        return false;
      if (!this.metricsMap.equals(that.metricsMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metricsMap = true && (isSetMetricsMap());
    list.add(present_metricsMap);
    if (present_metricsMap)
      list.add(metricsMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetMetricsTResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetricsMap()).compareTo(other.isSetMetricsMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricsMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metricsMap, other.metricsMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetMetricsTResponse(");
    boolean first = true;

    sb.append("metricsMap:");
    if (this.metricsMap == null) {
      sb.append("null");
    } else {
      sb.append(this.metricsMap);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetMetricsTResponseStandardSchemeFactory implements SchemeFactory {
    public GetMetricsTResponseStandardScheme getScheme() {
      return new GetMetricsTResponseStandardScheme();
    }
  }

  private static class GetMetricsTResponseStandardScheme extends StandardScheme<GetMetricsTResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetMetricsTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRICS_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map40 = iprot.readMapBegin();
                struct.metricsMap = new HashMap<String,MetricValue>(2*_map40.size);
                String _key41;
                MetricValue _val42;
                for (int _i43 = 0; _i43 < _map40.size; ++_i43)
                {
                  _key41 = iprot.readString();
                  _val42 = new MetricValue();
                  _val42.read(iprot);
                  struct.metricsMap.put(_key41, _val42);
                }
                iprot.readMapEnd();
              }
              struct.setMetricsMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetMetricsTResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metricsMap != null) {
        oprot.writeFieldBegin(METRICS_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.metricsMap.size()));
          for (Map.Entry<String, MetricValue> _iter44 : struct.metricsMap.entrySet())
          {
            oprot.writeString(_iter44.getKey());
            _iter44.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetMetricsTResponseTupleSchemeFactory implements SchemeFactory {
    public GetMetricsTResponseTupleScheme getScheme() {
      return new GetMetricsTResponseTupleScheme();
    }
  }

  private static class GetMetricsTResponseTupleScheme extends TupleScheme<GetMetricsTResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetMetricsTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetricsMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMetricsMap()) {
        {
          oprot.writeI32(struct.metricsMap.size());
          for (Map.Entry<String, MetricValue> _iter45 : struct.metricsMap.entrySet())
          {
            oprot.writeString(_iter45.getKey());
            _iter45.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetMetricsTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map46 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.metricsMap = new HashMap<String,MetricValue>(2*_map46.size);
          String _key47;
          MetricValue _val48;
          for (int _i49 = 0; _i49 < _map46.size; ++_i49)
          {
            _key47 = iprot.readString();
            _val48 = new MetricValue();
            _val48.read(iprot);
            struct.metricsMap.put(_key47, _val48);
          }
        }
        struct.setMetricsMapIsSet(true);
      }
    }
  }

}

