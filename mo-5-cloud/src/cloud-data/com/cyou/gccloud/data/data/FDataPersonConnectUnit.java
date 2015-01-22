package com.cyou.gccloud.data.data;

import java.util.Map;
import org.mo.com.collections.FRow;
import org.mo.com.lang.IStringPair;
import org.mo.com.lang.RBoolean;
import org.mo.com.lang.RDouble;
import org.mo.com.lang.RInteger;
import org.mo.com.lang.RLong;
import org.mo.com.lang.RString;
import org.mo.com.lang.type.TDateTime;
import org.mo.core.aop.face.ASourceMachine;
import org.mo.data.logic.FLogicUnit;

//============================================================
// <T>用户连接表逻辑单元。</T>
//============================================================
@ASourceMachine
public class FDataPersonConnectUnit
      extends FLogicUnit
{
   // 存储字段对象标识的定义。
   private long __ouid;

   // 字段对象标识的定义。
   protected long _ouid;

   // 存储字段有效性的定义。
   private boolean __ovld;

   // 字段有效性的定义。
   protected boolean _ovld;

   // 存储字段对象唯一标识的定义。
   private String __guid;

   // 字段对象唯一标识的定义。
   protected String _guid;

   // 存储字段项目编号的定义。
   private long __projectId;

   // 字段项目编号的定义。
   protected long _projectId;

   // 存储字段鉴定代码的定义。
   private String __tokenCode;

   // 字段鉴定代码的定义。
   protected String _tokenCode;

   // 存储字段用户编号的定义。
   private long __userId;

   // 字段用户编号的定义。
   protected long _userId;

   // 存储字段激活类型的定义。
   private int __activeCd;

   // 字段激活类型的定义。
   protected int _activeCd;

   // 存储字段设备编号的定义。
   private long __deviceId;

   // 字段设备编号的定义。
   protected long _deviceId;

   // 存储字段GPS纬度的定义。
   private double __gpsLatitude;

   // 字段GPS纬度的定义。
   protected double _gpsLatitude;

   // 存储字段GPS经度的定义。
   private double __gpsLongitude;

   // 字段GPS经度的定义。
   protected double _gpsLongitude;

   // 存储字段打包信息的定义。
   private String __infoPack;

   // 字段打包信息的定义。
   protected String _infoPack;

   // 存储字段创建用户标识的定义。
   private long __createUserId;

   // 字段创建用户标识的定义。
   protected long _createUserId;

   // 存储字段创建日期的定义。
   private TDateTime __createDate = new TDateTime();

   // 字段创建日期的定义。
   protected TDateTime _createDate = new TDateTime();

   // 存储字段更新者标识的定义。
   private long __updateUserId;

   // 字段更新者标识的定义。
   protected long _updateUserId;

   // 存储字段更新时间的定义。
   private TDateTime __updateDate = new TDateTime();

   // 字段更新时间的定义。
   protected TDateTime _updateDate = new TDateTime();

   //============================================================
   // <T>构造用户连接表逻辑单元。</T>
   //============================================================
   public FDataPersonConnectUnit(){
   }

   //============================================================
   // <T>判断对象标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOuidChanged(){
      return __ouid != _ouid;
   }

   //============================================================
   // <T>获得对象标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long ouid(){
      return _ouid;
   }

   //============================================================
   // <T>设置对象标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOuid(long value){
      _ouid = value;
   }

   //============================================================
   // <T>判断有效性的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOvldChanged(){
      return __ovld != _ovld;
   }

   //============================================================
   // <T>获得有效性的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean ovld(){
      return _ovld;
   }

   //============================================================
   // <T>设置有效性的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOvld(boolean value){
      _ovld = value;
   }

   //============================================================
   // <T>判断对象唯一标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isGuidChanged(){
      return !RString.equals(__guid, _guid);
   }

   //============================================================
   // <T>获得对象唯一标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public String guid(){
      return _guid;
   }

   //============================================================
   // <T>设置对象唯一标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setGuid(String value){
      _guid = value;
   }

   //============================================================
   // <T>判断项目编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isProjectIdChanged(){
      return __projectId != _projectId;
   }

   //============================================================
   // <T>获得项目编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long projectId(){
      return _projectId;
   }

   //============================================================
   // <T>获得项目编号的数据单元。</T>
   //
   // @return 数据内容
   //============================================================
   public FDataSystemProjectUnit project(){
      FDataSystemProjectLogic logic = _logicContext.findLogic(FDataSystemProjectLogic.class);
      FDataSystemProjectUnit unit = logic.find(_projectId);
      return unit;
   }

   //============================================================
   // <T>设置项目编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setProjectId(long value){
      _projectId = value;
   }

   //============================================================
   // <T>判断鉴定代码的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isTokenCodeChanged(){
      return !RString.equals(__tokenCode, _tokenCode);
   }

   //============================================================
   // <T>获得鉴定代码的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public String tokenCode(){
      return _tokenCode;
   }

   //============================================================
   // <T>设置鉴定代码的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setTokenCode(String value){
      _tokenCode = value;
   }

   //============================================================
   // <T>判断用户编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isUserIdChanged(){
      return __userId != _userId;
   }

   //============================================================
   // <T>获得用户编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long userId(){
      return _userId;
   }

   //============================================================
   // <T>获得用户编号的数据单元。</T>
   //
   // @return 数据内容
   //============================================================
   public FDataPersonUserUnit user(){
      FDataPersonUserLogic logic = _logicContext.findLogic(FDataPersonUserLogic.class);
      FDataPersonUserUnit unit = logic.find(_userId);
      return unit;
   }

   //============================================================
   // <T>设置用户编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setUserId(long value){
      _userId = value;
   }

   //============================================================
   // <T>判断激活类型的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isActiveCdChanged(){
      return __activeCd != _activeCd;
   }

   //============================================================
   // <T>获得激活类型的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int activeCd(){
      return _activeCd;
   }

   //============================================================
   // <T>设置激活类型的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setActiveCd(int value){
      _activeCd = value;
   }

   //============================================================
   // <T>判断设备编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isDeviceIdChanged(){
      return __deviceId != _deviceId;
   }

   //============================================================
   // <T>获得设备编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long deviceId(){
      return _deviceId;
   }

   //============================================================
   // <T>获得设备编号的数据单元。</T>
   //
   // @return 数据内容
   //============================================================
   public FDataCommonDeviceUnit device(){
      FDataCommonDeviceLogic logic = _logicContext.findLogic(FDataCommonDeviceLogic.class);
      FDataCommonDeviceUnit unit = logic.find(_deviceId);
      return unit;
   }

   //============================================================
   // <T>设置设备编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setDeviceId(long value){
      _deviceId = value;
   }

   //============================================================
   // <T>判断GPS纬度的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isGpsLatitudeChanged(){
      return __gpsLatitude != _gpsLatitude;
   }

   //============================================================
   // <T>获得GPS纬度的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public double gpsLatitude(){
      return _gpsLatitude;
   }

   //============================================================
   // <T>设置GPS纬度的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setGpsLatitude(double value){
      _gpsLatitude = value;
   }

   //============================================================
   // <T>判断GPS经度的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isGpsLongitudeChanged(){
      return __gpsLongitude != _gpsLongitude;
   }

   //============================================================
   // <T>获得GPS经度的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public double gpsLongitude(){
      return _gpsLongitude;
   }

   //============================================================
   // <T>设置GPS经度的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setGpsLongitude(double value){
      _gpsLongitude = value;
   }

   //============================================================
   // <T>判断打包信息的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isInfoPackChanged(){
      return !RString.equals(__infoPack, _infoPack);
   }

   //============================================================
   // <T>获得打包信息的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public String infoPack(){
      return _infoPack;
   }

   //============================================================
   // <T>设置打包信息的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setInfoPack(String value){
      _infoPack = value;
   }

   //============================================================
   // <T>判断创建用户标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isCreateUserIdChanged(){
      return __createUserId != _createUserId;
   }

   //============================================================
   // <T>获得创建用户标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long createUserId(){
      return _createUserId;
   }

   //============================================================
   // <T>设置创建用户标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setCreateUserId(long value){
      _createUserId = value;
   }

   //============================================================
   // <T>判断创建日期的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isCreateDateChanged(){
      return !__createDate.equals(_createDate);
   }

   //============================================================
   // <T>获得创建日期的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public TDateTime createDate(){
      return _createDate;
   }

   //============================================================
   // <T>设置创建日期的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setCreateDate(TDateTime value){
      _createDate = value;
   }

   //============================================================
   // <T>判断更新者标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isUpdateUserIdChanged(){
      return __updateUserId != _updateUserId;
   }

   //============================================================
   // <T>获得更新者标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long updateUserId(){
      return _updateUserId;
   }

   //============================================================
   // <T>设置更新者标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setUpdateUserId(long value){
      _updateUserId = value;
   }

   //============================================================
   // <T>判断更新时间的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isUpdateDateChanged(){
      return !__updateDate.equals(_updateDate);
   }

   //============================================================
   // <T>获得更新时间的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public TDateTime updateDate(){
      return _updateDate;
   }

   //============================================================
   // <T>设置更新时间的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setUpdateDate(TDateTime value){
      _updateDate = value;
   }

   //============================================================
   // <T>根据名称获得内容。</T>
   //
   // @param name 名称
   // @return 内容
   //============================================================
   @Override
   public String get(String name){
      switch(name){
         case "ouid":
            return Long.toString(_ouid);
         case "ovld":
            return RBoolean.toString(_ovld);
         case "guid":
            return _guid;
         case "project_id":
            return Long.toString(_projectId);
         case "token_code":
            return _tokenCode;
         case "user_id":
            return Long.toString(_userId);
         case "active_cd":
            return RInteger.toString(_activeCd);
         case "device_id":
            return Long.toString(_deviceId);
         case "gps_latitude":
            return RDouble.toString(_gpsLatitude);
         case "gps_longitude":
            return RDouble.toString(_gpsLongitude);
         case "info_pack":
            return _infoPack;
         case "create_user_id":
            return Long.toString(_createUserId);
         case "create_date":
            return _createDate.toString();
         case "update_user_id":
            return Long.toString(_updateUserId);
         case "update_date":
            return _updateDate.toString();
      }
      return null;
   }

   //============================================================
   // <T>根据名称设置内容。</T>
   //
   // @param name 名称
   // @param value 内容
   //============================================================
   @Override
   public void set(String name,
                   String value){
      switch(name){
         case "ouid":
            _ouid = RLong.parse(value);
            break;
         case "ovld":
            _ovld = RBoolean.parse(value);
            break;
         case "guid":
            _guid = value;
            break;
         case "project_id":
            _projectId = RLong.parse(value);
            break;
         case "token_code":
            _tokenCode = value;
            break;
         case "user_id":
            _userId = RLong.parse(value);
            break;
         case "active_cd":
            _activeCd = RInteger.parse(value);
            break;
         case "device_id":
            _deviceId = RLong.parse(value);
            break;
         case "gps_latitude":
            _gpsLatitude = RDouble.parse(value);
            break;
         case "gps_longitude":
            _gpsLongitude = RDouble.parse(value);
            break;
         case "info_pack":
            _infoPack = value;
            break;
         case "create_user_id":
            _createUserId = RLong.parse(value);
            break;
         case "create_date":
            _createDate.parse(value);
            break;
         case "update_user_id":
            _updateUserId = RLong.parse(value);
            break;
         case "update_date":
            _updateDate.parse(value);
            break;
      }
   }

   //============================================================
   // <T>加载行记录。</T>
   //
   // @param row 行记录
   //============================================================
   @Override
   public void load(FRow row){
      super.load(row);
      for(IStringPair pair : row){
         String name = pair.name();
         String value = pair.value();
         switch(name){
            case "ouid":
               __ouid = RLong.parse(value);
               _ouid = __ouid;
               break;
            case "ovld":
               __ovld = RBoolean.parse(value);
               _ovld = __ovld;
               break;
            case "guid":
               __guid = value;
               _guid = __guid;
               break;
            case "project_id":
               __projectId = RLong.parse(value);
               _projectId = __projectId;
               break;
            case "token_code":
               __tokenCode = value;
               _tokenCode = __tokenCode;
               break;
            case "user_id":
               __userId = RLong.parse(value);
               _userId = __userId;
               break;
            case "active_cd":
               __activeCd = RInteger.parse(value);
               _activeCd = __activeCd;
               break;
            case "device_id":
               __deviceId = RLong.parse(value);
               _deviceId = __deviceId;
               break;
            case "gps_latitude":
               __gpsLatitude = RDouble.parse(value);
               _gpsLatitude = __gpsLatitude;
               break;
            case "gps_longitude":
               __gpsLongitude = RDouble.parse(value);
               _gpsLongitude = __gpsLongitude;
               break;
            case "info_pack":
               __infoPack = value;
               _infoPack = __infoPack;
               break;
            case "create_user_id":
               __createUserId = RLong.parse(value);
               _createUserId = __createUserId;
               break;
            case "create_date":
               __createDate.parse(value);
               _createDate.assign(__createDate);
               break;
            case "update_user_id":
               __updateUserId = RLong.parse(value);
               _updateUserId = __updateUserId;
               break;
            case "update_date":
               __updateDate.parse(value);
               _updateDate.assign(__updateDate);
               break;
         }
      }
   }

   //============================================================
   // <T>存储行记录。</T>
   //
   // @param row 行记录
   //============================================================
   @Override
   public void save(FRow row){
      super.load(row);
      row.set("ouid", _ouid);
      row.set("ovld", _ovld);
      row.set("guid", _guid);
      row.set("projectId", _projectId);
      row.set("tokenCode", _tokenCode);
      row.set("userId", _userId);
      row.set("activeCd", _activeCd);
      row.set("deviceId", _deviceId);
      row.set("gpsLatitude", _gpsLatitude);
      row.set("gpsLongitude", _gpsLongitude);
      row.set("infoPack", _infoPack);
      row.set("createUserId", _createUserId);
      row.set("createDate", _createDate);
      row.set("updateUserId", _updateUserId);
      row.set("updateDate", _updateDate);
   }

   //============================================================
   // <T>保存对照表。</T>
   //
   // @param map 对照表
   //============================================================
   @Override
   public void saveMap(Map<String, String> map){
      super.saveMap(map);
      map.put("ouid", RLong.toString(_ouid));
      map.put("ovld", RBoolean.toString(_ovld));
      map.put("guid", _guid);
      map.put("projectId", RLong.toString(_projectId));
      map.put("tokenCode", _tokenCode);
      map.put("userId", RLong.toString(_userId));
      map.put("activeCd", RInteger.toString(_activeCd));
      map.put("deviceId", RLong.toString(_deviceId));
      map.put("gpsLatitude", RDouble.toString(_gpsLatitude));
      map.put("gpsLongitude", RDouble.toString(_gpsLongitude));
      map.put("infoPack", _infoPack);
      map.put("createUserId", RLong.toString(_createUserId));
      map.put("createDate", _createDate.format("YYYY-MM-DD HH24:MI:SS"));
      map.put("updateUserId", RLong.toString(_updateUserId));
      map.put("updateDate", _updateDate.format("YYYY-MM-DD HH24:MI:SS"));
   }
}
