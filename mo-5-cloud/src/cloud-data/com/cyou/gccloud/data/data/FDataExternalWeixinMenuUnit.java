package com.cyou.gccloud.data.data;

import java.util.Map;
import org.mo.com.collections.FRow;
import org.mo.com.lang.IStringPair;
import org.mo.com.lang.RBoolean;
import org.mo.com.lang.RInteger;
import org.mo.com.lang.RLong;
import org.mo.com.lang.RString;
import org.mo.com.lang.type.TDateTime;
import org.mo.core.aop.face.ASourceMachine;
import org.mo.data.logic.FLogicUnit;

//============================================================
// <T>微信菜单逻辑单元。</T>
//============================================================
@ASourceMachine
public class FDataExternalWeixinMenuUnit
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

   // 存储字段父菜单编码的定义。
   private long __parentId;

   // 字段父菜单编码的定义。
   protected long _parentId;

   // 存储字段菜单名称的定义。
   private String __label;

   // 字段菜单名称的定义。
   protected String _label;

   // 存储字段关键字编号的定义。
   private long __keywordId;

   // 字段关键字编号的定义。
   protected long _keywordId;

   // 存储字段关联类型的定义。
   private int __linkCd;

   // 字段关联类型的定义。
   protected int _linkCd;

   // 存储字段连接地址的定义。
   private String __linkUrl;

   // 字段连接地址的定义。
   protected String _linkUrl;

   // 存储字段排序值的定义。
   private int __displayOrder;

   // 字段排序值的定义。
   protected int _displayOrder;

   // 存储字段查看次数的定义。
   private int __viewCount;

   // 字段查看次数的定义。
   protected int _viewCount;

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
   // <T>构造微信菜单逻辑单元。</T>
   //============================================================
   public FDataExternalWeixinMenuUnit(){
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
   // <T>判断父菜单编码的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParentIdChanged(){
      return __parentId != _parentId;
   }

   //============================================================
   // <T>获得父菜单编码的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long parentId(){
      return _parentId;
   }

   //============================================================
   // <T>获得父菜单编码的数据单元。</T>
   //
   // @return 数据内容
   //============================================================
   public FDataExternalWeixinMenuUnit parent(){
      FDataExternalWeixinMenuLogic logic = _logicContext.findLogic(FDataExternalWeixinMenuLogic.class);
      FDataExternalWeixinMenuUnit unit = logic.find(_parentId);
      return unit;
   }

   //============================================================
   // <T>设置父菜单编码的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParentId(long value){
      _parentId = value;
   }

   //============================================================
   // <T>判断菜单名称的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isLabelChanged(){
      return !RString.equals(__label, _label);
   }

   //============================================================
   // <T>获得菜单名称的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public String label(){
      return _label;
   }

   //============================================================
   // <T>设置菜单名称的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setLabel(String value){
      _label = value;
   }

   //============================================================
   // <T>判断关键字编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isKeywordIdChanged(){
      return __keywordId != _keywordId;
   }

   //============================================================
   // <T>获得关键字编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long keywordId(){
      return _keywordId;
   }

   //============================================================
   // <T>获得关键字编号的数据单元。</T>
   //
   // @return 数据内容
   //============================================================
   public FDataExternalWeixinKeywordUnit keyword(){
      FDataExternalWeixinKeywordLogic logic = _logicContext.findLogic(FDataExternalWeixinKeywordLogic.class);
      FDataExternalWeixinKeywordUnit unit = logic.find(_keywordId);
      return unit;
   }

   //============================================================
   // <T>设置关键字编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setKeywordId(long value){
      _keywordId = value;
   }

   //============================================================
   // <T>判断关联类型的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isLinkCdChanged(){
      return __linkCd != _linkCd;
   }

   //============================================================
   // <T>获得关联类型的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int linkCd(){
      return _linkCd;
   }

   //============================================================
   // <T>设置关联类型的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setLinkCd(int value){
      _linkCd = value;
   }

   //============================================================
   // <T>判断连接地址的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isLinkUrlChanged(){
      return !RString.equals(__linkUrl, _linkUrl);
   }

   //============================================================
   // <T>获得连接地址的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public String linkUrl(){
      return _linkUrl;
   }

   //============================================================
   // <T>设置连接地址的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setLinkUrl(String value){
      _linkUrl = value;
   }

   //============================================================
   // <T>判断排序值的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isDisplayOrderChanged(){
      return __displayOrder != _displayOrder;
   }

   //============================================================
   // <T>获得排序值的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int displayOrder(){
      return _displayOrder;
   }

   //============================================================
   // <T>设置排序值的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setDisplayOrder(int value){
      _displayOrder = value;
   }

   //============================================================
   // <T>判断查看次数的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isViewCountChanged(){
      return __viewCount != _viewCount;
   }

   //============================================================
   // <T>获得查看次数的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int viewCount(){
      return _viewCount;
   }

   //============================================================
   // <T>设置查看次数的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setViewCount(int value){
      _viewCount = value;
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
         case "parent_id":
            return Long.toString(_parentId);
         case "label":
            return _label;
         case "keyword_id":
            return Long.toString(_keywordId);
         case "link_cd":
            return RInteger.toString(_linkCd);
         case "link_url":
            return _linkUrl;
         case "display_order":
            return RInteger.toString(_displayOrder);
         case "view_count":
            return RInteger.toString(_viewCount);
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
         case "parent_id":
            _parentId = RLong.parse(value);
            break;
         case "label":
            _label = value;
            break;
         case "keyword_id":
            _keywordId = RLong.parse(value);
            break;
         case "link_cd":
            _linkCd = RInteger.parse(value);
            break;
         case "link_url":
            _linkUrl = value;
            break;
         case "display_order":
            _displayOrder = RInteger.parse(value);
            break;
         case "view_count":
            _viewCount = RInteger.parse(value);
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
            case "parent_id":
               __parentId = RLong.parse(value);
               _parentId = __parentId;
               break;
            case "label":
               __label = value;
               _label = __label;
               break;
            case "keyword_id":
               __keywordId = RLong.parse(value);
               _keywordId = __keywordId;
               break;
            case "link_cd":
               __linkCd = RInteger.parse(value);
               _linkCd = __linkCd;
               break;
            case "link_url":
               __linkUrl = value;
               _linkUrl = __linkUrl;
               break;
            case "display_order":
               __displayOrder = RInteger.parse(value);
               _displayOrder = __displayOrder;
               break;
            case "view_count":
               __viewCount = RInteger.parse(value);
               _viewCount = __viewCount;
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
      row.set("parentId", _parentId);
      row.set("label", _label);
      row.set("keywordId", _keywordId);
      row.set("linkCd", _linkCd);
      row.set("linkUrl", _linkUrl);
      row.set("displayOrder", _displayOrder);
      row.set("viewCount", _viewCount);
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
      map.put("parentId", RLong.toString(_parentId));
      map.put("label", _label);
      map.put("keywordId", RLong.toString(_keywordId));
      map.put("linkCd", RInteger.toString(_linkCd));
      map.put("linkUrl", _linkUrl);
      map.put("displayOrder", RInteger.toString(_displayOrder));
      map.put("viewCount", RInteger.toString(_viewCount));
      map.put("createUserId", RLong.toString(_createUserId));
      map.put("createDate", _createDate.format("YYYY-MM-DD HH24:MI:SS"));
      map.put("updateUserId", RLong.toString(_updateUserId));
      map.put("updateDate", _updateDate.format("YYYY-MM-DD HH24:MI:SS"));
   }
}
