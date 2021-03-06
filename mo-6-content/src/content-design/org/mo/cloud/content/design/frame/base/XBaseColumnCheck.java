package org.mo.cloud.content.design.frame.base;

import org.mo.cloud.content.design.configuration.AContentField;
import org.mo.cloud.content.design.configuration.EContentData;
import org.mo.cloud.content.design.configuration.FContentField;
import org.mo.cloud.content.design.configuration.XContentObject;
import org.mo.com.lang.face.AName;

//============================================================
// <T>表格复选列对象的内容基类。</T>
//
// @author autosource
//============================================================
public abstract class XBaseColumnCheck
      extends XContentObject
{
   // 类名称
   public static final String CONTENT_NAME = "ColumnCheck";

   // 类型的定义
   @AContentField
   public final static FContentField TYPE = new FContentField("type", "type", EContentData.String, "", "", "", "YYNY");

   // 名称的定义
   @AContentField
   public final static FContentField NAME = new FContentField("name", "name", EContentData.String, "", "", "", "YYNY");

   // 有效性的定义
   @AContentField
   public final static FContentField VALID = new FContentField("valid", "valid", EContentData.Boolean, "", "", "", "YYNY");

   // 标签的定义
   @AContentField
   public final static FContentField LABEL = new FContentField("label", "label", EContentData.String, "", "", "", "YYNY");

   // 属性集合的定义
   @AContentField
   public final static FContentField ATTRIBUTES = new FContentField("attributes", "attributes", EContentData.String, "", "", "", "YYNY");

   // 位置的定义
   @AContentField
   public final static FContentField LOCATION = new FContentField("location", "location", EContentData.String, "", "", "", "YYNY");

   // 尺寸的定义
   @AContentField
   public final static FContentField SIZE = new FContentField("size", "size", EContentData.String, "", "", "", "YYNY");

   // 内空白的定义
   @AContentField
   public final static FContentField PADDING = new FContentField("padding", "padding", EContentData.String, "", "", "", "YYNY");

   // 外空白的定义
   @AContentField
   public final static FContentField MARGIN = new FContentField("margin", "margin", EContentData.String, "", "", "", "YYNY");

   // 关联属性的定义
   @AContentField
   public final static FContentField LINKER = new FContentField("linker", "linker", EContentData.String, "", "", "", "YYNY");

   // 提示信息的定义
   @AContentField
   public final static FContentField HINT = new FContentField("hint", "hint", EContentData.String, "", "", "", "YYNY");

   // 显示模式的定义
   @AContentField
   public final static FContentField DISPLAY_MODE = new FContentField("displayMode", "display_mode", EContentData.String, "", "", "", "NYNN");

   // 查看显示的定义
   @AContentField
   public final static FContentField DISPLAY_VIEW = new FContentField("displayView", "display_view", EContentData.Boolean, "display_mode", "V", "Y", "YNNY");

   // 新建显示的定义
   @AContentField
   public final static FContentField DISPLAY_INSERT = new FContentField("displayInsert", "display_insert", EContentData.Boolean, "display_mode", "I", "Y", "YNNY");

   // 更新显示的定义
   @AContentField
   public final static FContentField DISPLAY_UPDATE = new FContentField("displayUpdate", "display_update", EContentData.Boolean, "display_mode", "U", "Y", "YNNY");

   // 删除显示的定义
   @AContentField
   public final static FContentField DISPLAY_DELETE = new FContentField("displayDelete", "display_delete", EContentData.Boolean, "display_mode", "D", "Y", "YNNY");

   // 编辑模式的定义
   @AContentField
   public final static FContentField EDIT_MODE = new FContentField("editMode", "edit_mode", EContentData.String, "", "", "", "NYNN");

   // 查看编辑的定义
   @AContentField
   public final static FContentField EDIT_VIEW = new FContentField("editView", "edit_view", EContentData.Boolean, "edit_mode", "V", "Y", "YNNY");

   // 新建编辑的定义
   @AContentField
   public final static FContentField EDIT_INSERT = new FContentField("editInsert", "edit_insert", EContentData.Boolean, "edit_mode", "I", "Y", "YNNY");

   // 更新编辑的定义
   @AContentField
   public final static FContentField EDIT_UPDATE = new FContentField("editUpdate", "edit_update", EContentData.Boolean, "edit_mode", "U", "Y", "YNNY");

   // 删除编辑的定义
   @AContentField
   public final static FContentField EDIT_DELETE = new FContentField("editDelete", "edit_delete", EContentData.Boolean, "edit_mode", "D", "Y", "YNNY");

   // 校验模式的定义
   @AContentField
   public final static FContentField VERIFY_MODE = new FContentField("verifyMode", "verify_mode", EContentData.String, "", "", "", "NYNN");

   // 新建检查的定义
   @AContentField
   public final static FContentField VERIFY_INSERT = new FContentField("verifyInsert", "verify_insert", EContentData.Boolean, "verify_mode", "I", "Y", "YNNY");

   // 编辑检查的定义
   @AContentField
   public final static FContentField VERIFY_UPDATE = new FContentField("verifyUpdate", "verify_update", EContentData.Boolean, "verify_mode", "U", "Y", "YNNY");

   // 删除检查的定义
   @AContentField
   public final static FContentField VERIFY_DELETE = new FContentField("verifyDelete", "verify_delete", EContentData.Boolean, "verify_mode", "D", "Y", "YNNY");

   // 标签对齐的定义
   @AContentField
   public final static FContentField LABEL_ALIGN_CD = new FContentField("labelAlignCd", "label_align_cd", EContentData.String, "", "", "", "YYNY");

   // 标签尺寸的定义
   @AContentField
   public final static FContentField LABEL_SIZE = new FContentField("labelSize", "label_size", EContentData.String, "", "", "", "YYNY");

   // 数据名称的定义
   @AContentField
   public final static FContentField DATA_NAME = new FContentField("dataName", "data_name", EContentData.String, "", "", "", "YYNY");

   // 数据类型的定义
   @AContentField
   public final static FContentField DATA_TYPE_CD = new FContentField("dataTypeCd", "data_type_cd", EContentData.String, "", "", "", "YYNY");

   // 真值的定义
   @AContentField
   public final static FContentField VALUE_TRUE = new FContentField("valueTrue", "value_true", EContentData.String, "", "", "", "YYNY");

   // 假值的定义
   @AContentField
   public final static FContentField VALUE_FALSE = new FContentField("valueFalse", "value_false", EContentData.String, "", "", "", "YYNY");

   //============================================================
   // <T>判断是否指定实例。</T>
   //
   // @param name 名称
   //============================================================
   public static boolean isInstance(String name){
      return NAME.equals(name);
   }

   //============================================================
   // <T>判断是否指定实例。</T>
   //
   // @param xinstance 实例
   //============================================================
   public static boolean isInstance(XContentObject xinstance){
      return NAME.equals(xinstance.contentClass().name());
   }

   // 类型
   @AName("type")
   protected String _type;

   // 名称
   @AName("name")
   protected String _name;

   // 有效性
   @AName("valid")
   protected boolean _valid;

   // 标签
   @AName("label")
   protected String _label;

   // 属性集合
   @AName("attributes")
   protected String _attributes;

   // 位置
   @AName("location")
   protected String _location;

   // 尺寸
   @AName("size")
   protected String _size;

   // 内空白
   @AName("padding")
   protected String _padding;

   // 外空白
   @AName("margin")
   protected String _margin;

   // 关联属性
   @AName("linker")
   protected String _linker;

   // 提示信息
   @AName("hint")
   protected String _hint;

   // 显示模式
   @AName("display_mode")
   protected String _displayMode;

   // 查看显示
   @AName("display_view")
   protected boolean _displayView;

   // 新建显示
   @AName("display_insert")
   protected boolean _displayInsert;

   // 更新显示
   @AName("display_update")
   protected boolean _displayUpdate;

   // 删除显示
   @AName("display_delete")
   protected boolean _displayDelete;

   // 编辑模式
   @AName("edit_mode")
   protected String _editMode;

   // 查看编辑
   @AName("edit_view")
   protected boolean _editView;

   // 新建编辑
   @AName("edit_insert")
   protected boolean _editInsert;

   // 更新编辑
   @AName("edit_update")
   protected boolean _editUpdate;

   // 删除编辑
   @AName("edit_delete")
   protected boolean _editDelete;

   // 校验模式
   @AName("verify_mode")
   protected String _verifyMode;

   // 新建检查
   @AName("verify_insert")
   protected boolean _verifyInsert;

   // 编辑检查
   @AName("verify_update")
   protected boolean _verifyUpdate;

   // 删除检查
   @AName("verify_delete")
   protected boolean _verifyDelete;

   // 标签对齐
   @AName("label_align_cd")
   protected String _labelAlignCd;

   // 标签尺寸
   @AName("label_size")
   protected String _labelSize;

   // 数据名称
   @AName("data_name")
   protected String _dataName;

   // 数据类型
   @AName("data_type_cd")
   protected String _dataTypeCd;

   // 真值
   @AName("value_true")
   protected String _valueTrue;

   // 假值
   @AName("value_false")
   protected String _valueFalse;

   //============================================================
   // <T>获得类型的内容。</T>
   //
   // @return 类型
   //============================================================
   public String getType(){
      return _type;
   }

   //============================================================
   // <T>设置类型的内容。</T>
   //
   // @param value 类型
   //============================================================
   public void setType(String value){
      _type = value;
   }

   //============================================================
   // <T>获得名称的内容。</T>
   //
   // @return 名称
   //============================================================
   public String getName(){
      return _name;
   }

   //============================================================
   // <T>设置名称的内容。</T>
   //
   // @param value 名称
   //============================================================
   public void setName(String value){
      _name = value;
   }

   //============================================================
   // <T>获得有效性的内容。</T>
   //
   // @return 有效性
   //============================================================
   public Boolean getValid(){
      return _valid;
   }

   //============================================================
   // <T>设置有效性的内容。</T>
   //
   // @param value 有效性
   //============================================================
   public void setValid(Boolean value){
      _valid = value;
   }

   //============================================================
   // <T>获得标签的内容。</T>
   //
   // @return 标签
   //============================================================
   public String getLabel(){
      return _label;
   }

   //============================================================
   // <T>设置标签的内容。</T>
   //
   // @param value 标签
   //============================================================
   public void setLabel(String value){
      _label = value;
   }

   //============================================================
   // <T>获得属性集合的内容。</T>
   //
   // @return 属性集合
   //============================================================
   public String getAttributes(){
      return _attributes;
   }

   //============================================================
   // <T>设置属性集合的内容。</T>
   //
   // @param value 属性集合
   //============================================================
   public void setAttributes(String value){
      _attributes = value;
   }

   //============================================================
   // <T>获得位置的内容。</T>
   //
   // @return 位置
   //============================================================
   public String getLocation(){
      return _location;
   }

   //============================================================
   // <T>设置位置的内容。</T>
   //
   // @param value 位置
   //============================================================
   public void setLocation(String value){
      _location = value;
   }

   //============================================================
   // <T>获得尺寸的内容。</T>
   //
   // @return 尺寸
   //============================================================
   public String getSize(){
      return _size;
   }

   //============================================================
   // <T>设置尺寸的内容。</T>
   //
   // @param value 尺寸
   //============================================================
   public void setSize(String value){
      _size = value;
   }

   //============================================================
   // <T>获得内空白的内容。</T>
   //
   // @return 内空白
   //============================================================
   public String getPadding(){
      return _padding;
   }

   //============================================================
   // <T>设置内空白的内容。</T>
   //
   // @param value 内空白
   //============================================================
   public void setPadding(String value){
      _padding = value;
   }

   //============================================================
   // <T>获得外空白的内容。</T>
   //
   // @return 外空白
   //============================================================
   public String getMargin(){
      return _margin;
   }

   //============================================================
   // <T>设置外空白的内容。</T>
   //
   // @param value 外空白
   //============================================================
   public void setMargin(String value){
      _margin = value;
   }

   //============================================================
   // <T>获得关联属性的内容。</T>
   //
   // @return 关联属性
   //============================================================
   public String getLinker(){
      return _linker;
   }

   //============================================================
   // <T>设置关联属性的内容。</T>
   //
   // @param value 关联属性
   //============================================================
   public void setLinker(String value){
      _linker = value;
   }

   //============================================================
   // <T>获得提示信息的内容。</T>
   //
   // @return 提示信息
   //============================================================
   public String getHint(){
      return _hint;
   }

   //============================================================
   // <T>设置提示信息的内容。</T>
   //
   // @param value 提示信息
   //============================================================
   public void setHint(String value){
      _hint = value;
   }

   //============================================================
   // <T>获得显示模式的内容。</T>
   //
   // @return 显示模式
   //============================================================
   public String getDisplayMode(){
      return _displayMode;
   }

   //============================================================
   // <T>设置显示模式的内容。</T>
   //
   // @param value 显示模式
   //============================================================
   public void setDisplayMode(String value){
      _displayMode = value;
   }

   //============================================================
   // <T>获得查看显示的内容。</T>
   //
   // @return 查看显示
   //============================================================
   public Boolean getDisplayView(){
      return _displayView;
   }

   //============================================================
   // <T>设置查看显示的内容。</T>
   //
   // @param value 查看显示
   //============================================================
   public void setDisplayView(Boolean value){
      _displayView = value;
   }

   //============================================================
   // <T>获得新建显示的内容。</T>
   //
   // @return 新建显示
   //============================================================
   public Boolean getDisplayInsert(){
      return _displayInsert;
   }

   //============================================================
   // <T>设置新建显示的内容。</T>
   //
   // @param value 新建显示
   //============================================================
   public void setDisplayInsert(Boolean value){
      _displayInsert = value;
   }

   //============================================================
   // <T>获得更新显示的内容。</T>
   //
   // @return 更新显示
   //============================================================
   public Boolean getDisplayUpdate(){
      return _displayUpdate;
   }

   //============================================================
   // <T>设置更新显示的内容。</T>
   //
   // @param value 更新显示
   //============================================================
   public void setDisplayUpdate(Boolean value){
      _displayUpdate = value;
   }

   //============================================================
   // <T>获得删除显示的内容。</T>
   //
   // @return 删除显示
   //============================================================
   public Boolean getDisplayDelete(){
      return _displayDelete;
   }

   //============================================================
   // <T>设置删除显示的内容。</T>
   //
   // @param value 删除显示
   //============================================================
   public void setDisplayDelete(Boolean value){
      _displayDelete = value;
   }

   //============================================================
   // <T>获得编辑模式的内容。</T>
   //
   // @return 编辑模式
   //============================================================
   public String getEditMode(){
      return _editMode;
   }

   //============================================================
   // <T>设置编辑模式的内容。</T>
   //
   // @param value 编辑模式
   //============================================================
   public void setEditMode(String value){
      _editMode = value;
   }

   //============================================================
   // <T>获得查看编辑的内容。</T>
   //
   // @return 查看编辑
   //============================================================
   public Boolean getEditView(){
      return _editView;
   }

   //============================================================
   // <T>设置查看编辑的内容。</T>
   //
   // @param value 查看编辑
   //============================================================
   public void setEditView(Boolean value){
      _editView = value;
   }

   //============================================================
   // <T>获得新建编辑的内容。</T>
   //
   // @return 新建编辑
   //============================================================
   public Boolean getEditInsert(){
      return _editInsert;
   }

   //============================================================
   // <T>设置新建编辑的内容。</T>
   //
   // @param value 新建编辑
   //============================================================
   public void setEditInsert(Boolean value){
      _editInsert = value;
   }

   //============================================================
   // <T>获得更新编辑的内容。</T>
   //
   // @return 更新编辑
   //============================================================
   public Boolean getEditUpdate(){
      return _editUpdate;
   }

   //============================================================
   // <T>设置更新编辑的内容。</T>
   //
   // @param value 更新编辑
   //============================================================
   public void setEditUpdate(Boolean value){
      _editUpdate = value;
   }

   //============================================================
   // <T>获得删除编辑的内容。</T>
   //
   // @return 删除编辑
   //============================================================
   public Boolean getEditDelete(){
      return _editDelete;
   }

   //============================================================
   // <T>设置删除编辑的内容。</T>
   //
   // @param value 删除编辑
   //============================================================
   public void setEditDelete(Boolean value){
      _editDelete = value;
   }

   //============================================================
   // <T>获得校验模式的内容。</T>
   //
   // @return 校验模式
   //============================================================
   public String getVerifyMode(){
      return _verifyMode;
   }

   //============================================================
   // <T>设置校验模式的内容。</T>
   //
   // @param value 校验模式
   //============================================================
   public void setVerifyMode(String value){
      _verifyMode = value;
   }

   //============================================================
   // <T>获得新建检查的内容。</T>
   //
   // @return 新建检查
   //============================================================
   public Boolean getVerifyInsert(){
      return _verifyInsert;
   }

   //============================================================
   // <T>设置新建检查的内容。</T>
   //
   // @param value 新建检查
   //============================================================
   public void setVerifyInsert(Boolean value){
      _verifyInsert = value;
   }

   //============================================================
   // <T>获得编辑检查的内容。</T>
   //
   // @return 编辑检查
   //============================================================
   public Boolean getVerifyUpdate(){
      return _verifyUpdate;
   }

   //============================================================
   // <T>设置编辑检查的内容。</T>
   //
   // @param value 编辑检查
   //============================================================
   public void setVerifyUpdate(Boolean value){
      _verifyUpdate = value;
   }

   //============================================================
   // <T>获得删除检查的内容。</T>
   //
   // @return 删除检查
   //============================================================
   public Boolean getVerifyDelete(){
      return _verifyDelete;
   }

   //============================================================
   // <T>设置删除检查的内容。</T>
   //
   // @param value 删除检查
   //============================================================
   public void setVerifyDelete(Boolean value){
      _verifyDelete = value;
   }

   //============================================================
   // <T>获得标签对齐的内容。</T>
   //
   // @return 标签对齐
   //============================================================
   public String getLabelAlignCd(){
      return _labelAlignCd;
   }

   //============================================================
   // <T>设置标签对齐的内容。</T>
   //
   // @param value 标签对齐
   //============================================================
   public void setLabelAlignCd(String value){
      _labelAlignCd = value;
   }

   //============================================================
   // <T>获得标签尺寸的内容。</T>
   //
   // @return 标签尺寸
   //============================================================
   public String getLabelSize(){
      return _labelSize;
   }

   //============================================================
   // <T>设置标签尺寸的内容。</T>
   //
   // @param value 标签尺寸
   //============================================================
   public void setLabelSize(String value){
      _labelSize = value;
   }

   //============================================================
   // <T>获得数据名称的内容。</T>
   //
   // @return 数据名称
   //============================================================
   public String getDataName(){
      return _dataName;
   }

   //============================================================
   // <T>设置数据名称的内容。</T>
   //
   // @param value 数据名称
   //============================================================
   public void setDataName(String value){
      _dataName = value;
   }

   //============================================================
   // <T>获得数据类型的内容。</T>
   //
   // @return 数据类型
   //============================================================
   public String getDataTypeCd(){
      return _dataTypeCd;
   }

   //============================================================
   // <T>设置数据类型的内容。</T>
   //
   // @param value 数据类型
   //============================================================
   public void setDataTypeCd(String value){
      _dataTypeCd = value;
   }

   //============================================================
   // <T>获得真值的内容。</T>
   //
   // @return 真值
   //============================================================
   public String getValueTrue(){
      return _valueTrue;
   }

   //============================================================
   // <T>设置真值的内容。</T>
   //
   // @param value 真值
   //============================================================
   public void setValueTrue(String value){
      _valueTrue = value;
   }

   //============================================================
   // <T>获得假值的内容。</T>
   //
   // @return 假值
   //============================================================
   public String getValueFalse(){
      return _valueFalse;
   }

   //============================================================
   // <T>设置假值的内容。</T>
   //
   // @param value 假值
   //============================================================
   public void setValueFalse(String value){
      _valueFalse = value;
   }

}
