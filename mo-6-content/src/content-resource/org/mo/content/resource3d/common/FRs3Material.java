package org.mo.content.resource3d.common;

import com.cyou.gccloud.data.data.FDataResource3dMaterialUnit;
import org.mo.com.io.IDataOutput;
import org.mo.com.lang.FObjects;
import org.mo.com.lang.RUuid;
import org.mo.com.xml.FXmlDocument;
import org.mo.com.xml.FXmlNode;

//============================================================
// <T>资源模型。</T>
//============================================================
public class FRs3Material
      extends FRs3Object
{
   // 主题
   protected FRs3Theme _theme;

   // 分组唯一代码
   protected String _groupGuid;

   // 效果代码
   protected String _effectCode;

   // 配置深度
   protected boolean _optionDepth = true;

   // 配置双面
   protected boolean _optionDouble = false;

   // 配置法线反向
   protected boolean _optionNormalInvert = false;

   // 配置阴影
   protected boolean _optionShadow = true;

   // 配置自阴影
   protected boolean _optionShadowSelf = true;

   // 配置颜色
   protected boolean _optionColor = true;

   // 颜色最小
   protected float _colorMin = 0.0f;

   // 颜色最大
   protected float _colorMax = 1.0f;

   // 颜色比率
   protected float _colorRate = 1.0f;

   // 颜色融合
   protected float _colorMerge = 0.5f;

   // 配置透明
   protected boolean _optionAlpha = false;

   // 透明基础
   protected float _alphaBase;

   // 透明比率
   protected float _alphaRate;

   // 配置环境
   protected boolean _optionAmbient = true;

   // 环境颜色
   protected SFloatColor4 _ambientColor = new SFloatColor4();

   // 配置散射
   protected boolean _optionDiffuse = true;

   // 散射颜色
   protected SFloatColor4 _diffuseColor = new SFloatColor4();

   // 配置散射视角
   protected boolean _optionDiffuseView = false;

   // 散射视角颜色
   protected SFloatColor4 _diffuseViewColor = new SFloatColor4();

   // 配置高光
   protected boolean _optionSpecular = true;

   // 高光颜色
   protected SFloatColor4 _specularColor = new SFloatColor4();

   // 高光基础
   protected float _specularBase;

   // 高光级别
   protected float _specularLevel;

   // 配置视角高光
   protected boolean _optionSpecularView = false;

   // 高光视角颜色
   protected SFloatColor4 _specularViewColor = new SFloatColor4();

   // 高光视角基础
   protected float _specularViewBase;

   // 高光视角级别
   protected float _specularViewLevel;

   // 配置反射
   protected boolean _optionReflect = true;

   // 反射颜色
   protected SFloatColor4 _reflectColor = new SFloatColor4();

   // 反射融合
   protected float _reflectMerge;

   // 配置折射
   protected boolean _optionRefract = true;

   // 前折射颜色
   protected SFloatColor4 _refractFrontColor = new SFloatColor4();

   // 后折射颜色
   protected SFloatColor4 _refractBackColor = new SFloatColor4();

   // 配置不透明
   protected boolean _optionOpacity = false;

   // 不透明颜色
   protected SFloatColor4 _opacityColor = new SFloatColor4();

   // 不透明比率
   protected float _opacityRate;

   // 不透明透过度
   protected float _opacityAlpha;

   // 不透明深度
   protected float _opacityDepth;

   // 不透明度
   protected float _opacityTransmittance;

   // 配置发光
   protected boolean _optionEmissive = false;

   // 发光颜色
   protected SFloatColor4 _emissiveColor = new SFloatColor4();

   // 网格集合
   protected FObjects<FRs3MaterialBitmap> _bitmaps = new FObjects<FRs3MaterialBitmap>(FRs3MaterialBitmap.class);

   // 网格集合
   protected FObjects<FRs3MaterialTexture> _textures = new FObjects<FRs3MaterialTexture>(FRs3MaterialTexture.class);

   //============================================================
   // <T>构造资源模型。</T>
   //============================================================
   public FRs3Material(){
      _guid = RUuid.makeUniqueId();
   }

   //============================================================
   // <T>获得主题。</T>
   //
   // @return 主题
   //============================================================
   public FRs3Theme theme(){
      return _theme;
   }

   //============================================================
   // <T>设置主题。</T>
   //
   // @param theme 主题
   //============================================================
   public void setTheme(FRs3Theme theme){
      _theme = theme;
   }

   //============================================================
   // <T>获得全代码。</T>
   //
   // @return 全代码
   //============================================================
   @Override
   public String fullCode(){
      return _theme.code() + "|" + _code;
   }

   //============================================================
   // <T>获得分组唯一代码。</T>
   //
   // @return 分组唯一代码
   //============================================================
   public String groupGuid(){
      return _groupGuid;
   }

   //============================================================
   // <T>设置分组唯一代码。</T>
   //
   // @param groupGuid 分组唯一代码
   //============================================================
   public void setGroupGuid(String groupGuid){
      _groupGuid = groupGuid;
   }

   //============================================================
   // <T>获得透明基础。</T>
   //
   // @return 透明基础
   //============================================================
   public float alphaBase(){
      return _alphaBase;
   }

   //============================================================
   // <T>设置透明基础。</T>
   //
   // @param alphaBase 透明基础
   //============================================================
   public void setAlphaBase(float alphaBase){
      _alphaBase = alphaBase;
   }

   //============================================================
   // <T>获得透明比率。</T>
   //
   // @return 透明比率
   //============================================================
   public float alphaRate(){
      return _alphaRate;
   }

   //============================================================
   // <T>设置透明比率。</T>
   //
   // @param alphaRate 透明比率
   //============================================================
   public void setAlphaRate(float alphaRate){
      _alphaRate = alphaRate;
   }

   //============================================================
   // <T>获得环境颜色。</T>
   //
   // @return 环境颜色
   //============================================================
   public SFloatColor4 ambientColor(){
      return _ambientColor;
   }

   //============================================================
   // <T>获得散射颜色。</T>
   //
   // @return 散射颜色
   //============================================================
   public SFloatColor4 diffuseColor(){
      return _diffuseColor;
   }

   //============================================================
   // <T>获得高光颜色。</T>
   //
   // @return 高光颜色
   //============================================================
   public SFloatColor4 specularColor(){
      return _specularColor;
   }

   //============================================================
   // <T>获得高光基础。</T>
   //
   // @return 高光基础
   //============================================================
   public float specularBase(){
      return _specularBase;
   }

   //============================================================
   // <T>设置高光基础。</T>
   //
   // @param specularBase 高光基础
   //============================================================
   public void setSpecularBase(float specularBase){
      _specularBase = specularBase;
   }

   //============================================================
   // <T>获得高光级别。</T>
   //
   // @return 高光级别
   //============================================================
   public float specularLevel(){
      return _specularLevel;
   }

   //============================================================
   // <T>设置高光级别。</T>
   //
   // @param specularLevel 高光级别
   //============================================================
   public void setSpecularLevel(float specularLevel){
      _specularLevel = specularLevel;
   }

   //============================================================
   // <T>获得反射颜色。</T>
   //
   // @return 反射颜色
   //============================================================
   public SFloatColor4 reflectColor(){
      return _reflectColor;
   }

   //============================================================
   // <T>获得反射合并。</T>
   //
   // @return 反射合并
   //============================================================
   public float reflectMerge(){
      return _reflectMerge;
   }

   //============================================================
   // <T>设置反射合并。</T>
   //
   // @param reflectMerge 反射合并
   //============================================================
   public void setReflectMerge(float reflectMerge){
      _reflectMerge = reflectMerge;
   }

   //============================================================
   // <T>获得折射前颜色。</T>
   //
   // @return 折射前颜色
   //============================================================
   public SFloatColor4 refractFrontColor(){
      return _refractFrontColor;
   }

   //============================================================
   // <T>获得折射后颜色。</T>
   //
   // @return 折射后颜色
   //============================================================
   public SFloatColor4 refractBackColor(){
      return _refractBackColor;
   }

   //============================================================
   // <T>获得发光颜色。</T>
   //
   // @return 发光颜色
   //============================================================
   public SFloatColor4 emissiveColor(){
      return _emissiveColor;
   }

   //============================================================
   // <T>获得网格集合。</T>
   //
   // @return 网格集合
   //============================================================
   public FObjects<FRs3MaterialBitmap> bitmaps(){
      return _bitmaps;
   }

   //============================================================
   // <T>获得纹理集合。</T>
   //
   // @return 纹理集合
   //============================================================
   public FObjects<FRs3MaterialTexture> textures(){
      return _textures;
   }

   //============================================================
   // <T>序列化数据到输出流。</T>
   //
   // @param output 输出流
   //============================================================
   @Override
   public void serialize(IDataOutput output){
      super.serialize(output);
      output.writeString(_groupGuid);
      // 输出属性
      output.writeString(_effectCode);
      // 输出配置
      output.writeBoolean(_optionDepth);
      output.writeBoolean(_optionDouble);
      output.writeBoolean(_optionNormalInvert);
      output.writeBoolean(_optionShadow);
      output.writeBoolean(_optionShadowSelf);
      // 输出透明
      output.writeBoolean(_optionAlpha);
      output.writeFloat(_alphaBase);
      output.writeFloat(_alphaRate);
      // 输出颜色
      output.writeBoolean(_optionColor);
      output.writeFloat(_colorMin);
      output.writeFloat(_colorMax);
      output.writeFloat(_colorRate);
      output.writeFloat(_colorMerge);
      // 输出颜色
      output.writeBoolean(_optionAmbient);
      _ambientColor.serialize(output);
      // 输出颜色
      output.writeBoolean(_optionDiffuse);
      _diffuseColor.serialize(output);
      output.writeBoolean(_optionDiffuseView);
      _diffuseViewColor.serialize(output);
      // 输出颜色
      output.writeBoolean(_optionSpecular);
      _specularColor.serialize(output);
      output.writeFloat(_specularBase);
      output.writeFloat(_specularLevel);
      output.writeBoolean(_optionSpecularView);
      _specularViewColor.serialize(output);
      output.writeFloat(_specularViewBase);
      output.writeFloat(_specularViewLevel);
      // 输出颜色
      output.writeBoolean(_optionReflect);
      _reflectColor.serialize(output);
      output.writeFloat(_reflectMerge);
      // 输出颜色
      output.writeBoolean(_optionRefract);
      _refractFrontColor.serialize(output);
      _refractBackColor.serialize(output);
      // 输出不透明度
      output.writeBoolean(_optionOpacity);
      _opacityColor.serialize(output);
      output.writeFloat(_opacityRate);
      output.writeFloat(_opacityAlpha);
      output.writeFloat(_opacityDepth);
      output.writeFloat(_opacityTransmittance);
      // 输出颜色
      output.writeBoolean(_optionEmissive);
      _emissiveColor.serialize(output);
      // 输出纹理集合
      int textureCount = _textures.count();
      output.writeInt16((short)textureCount);
      for(int i = 0; i < textureCount; i++){
         FRs3MaterialTexture texture = _textures.get(i);
         texture.serialize(output);
      }
   }

   //============================================================
   // <T>从配置信息中加载配置。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   public void loadConfigInfo(FXmlNode xconfig){
      // 加载配置
      _optionDepth = xconfig.getBoolean("option_depth", _optionDepth);
      _optionAlpha = xconfig.getBoolean("option_alpha", _optionAlpha);
      _optionDouble = xconfig.getBoolean("option_double", _optionDouble);
      _optionNormalInvert = xconfig.getBoolean("option_normal_invert", _optionNormalInvert);
      _optionShadow = xconfig.getBoolean("option_shadow", _optionShadow);
      _optionShadowSelf = xconfig.getBoolean("option_shadow_self", _optionShadowSelf);
      // 加载节点
      for(FXmlNode xnode : xconfig){
         if(xnode.isName("Alpha")){
            _optionAlpha = xnode.getBoolean("valid", _optionAlpha);
            _alphaBase = xnode.getFloat("base", 0.1f);
            _alphaRate = xnode.getFloat("rate", 1.0f);
         }else if(xnode.isName("Color")){
            _optionColor = xnode.getBoolean("valid", _optionColor);
            _colorMin = xnode.getFloat("min", 0.0f);
            _colorMax = xnode.getFloat("max", 1.0f);
            _colorRate = xnode.getFloat("rate", 2.0f);
            _colorMerge = xnode.getFloat("merge", 0.5f);
         }else if(xnode.isName("Ambient")){
            _optionAmbient = xnode.getBoolean("valid", _optionAmbient);
            _ambientColor.loadConfig(xnode);
         }else if(xnode.isName("Diffuse")){
            _optionDiffuse = xnode.getBoolean("valid", _optionDiffuse);
            _diffuseColor.loadConfig(xnode);
         }else if(xnode.isName("DiffuseView")){
            _optionDiffuseView = xnode.getBoolean("valid", _optionDiffuseView);
            _diffuseViewColor.loadConfig(xnode);
         }else if(xnode.isName("Specular")){
            _optionSpecular = xnode.getBoolean("valid", _optionSpecular);
            _specularColor.loadConfig(xnode);
            _specularBase = xnode.getFloat("base", 0.0f);
            _specularLevel = xnode.getFloat("level", 16.0f);
         }else if(xnode.isName("SpecularView")){
            _optionSpecularView = xnode.getBoolean("valid", _optionSpecularView);
            _specularViewColor.loadConfig(xnode);
            _specularViewBase = xnode.getFloat("base", 0.0f);
            _specularViewLevel = xnode.getFloat("level", 16.0f);
         }else if(xnode.isName("Reflect")){
            _optionReflect = xnode.getBoolean("valid", _optionReflect);
            _reflectColor.loadConfig(xnode);
            _reflectMerge = xnode.getFloat("merge", _reflectMerge);
         }else if(xnode.isName("Refract")){
            _optionRefract = xnode.getBoolean("valid", _optionRefract);
            FXmlNode xfront = xnode.findNode("Front");
            if(xfront != null){
               _refractFrontColor.loadConfig(xfront);
            }
            FXmlNode xback = xnode.findNode("Back");
            if(xback != null){
               _refractBackColor.loadConfig(xback);
            }
         }else if(xnode.isName("Opacity")){
            _optionOpacity = xnode.getBoolean("valid", _optionOpacity);
            _opacityColor.loadConfig(xnode);
            _opacityRate = xnode.getFloat("rate", _opacityRate);
            _opacityAlpha = xnode.getFloat("alpha", _opacityAlpha);
            _opacityDepth = xnode.getFloat("depth", _opacityDepth);
            _opacityTransmittance = xnode.getFloat("transmittance", _opacityTransmittance);
         }else if(xnode.isName("Emissive")){
            _optionEmissive = xnode.getBoolean("valid", _optionEmissive);
            _emissiveColor.loadConfig(xnode);
         }
      }
   }

   //============================================================
   // <T>从配置信息中加载配置。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   @Override
   public void loadConfig(FXmlNode xconfig){
      super.loadConfig(xconfig);
      // 读取属性
      _groupGuid = xconfig.get("group_guid");
      _effectCode = xconfig.get("effect_code");
      // 处理所有节点
      loadConfigInfo(xconfig);
   }

   //============================================================
   // <T>从配置节点中合并数据信息。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   @Override
   public void mergeConfig(FXmlNode xconfig){
      super.mergeConfig(xconfig);
      // 读取属性
      _effectCode = xconfig.get("effect_code");
      // 处理所有节点
      loadConfigInfo(xconfig);
   }

   //============================================================
   // <T>存储数据信息到配置节点中。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   @Override
   public void saveConfig(FXmlNode xconfig){
      super.saveConfig(xconfig);
      // 存储属性
      xconfig.set("group_guid", _groupGuid);
      xconfig.set("effect_code", _effectCode);
      // 存储配置
      xconfig.set("option_depth", _optionDepth);
      xconfig.set("option_double", _optionDouble);
      xconfig.set("option_normal_invert", _optionNormalInvert);
      xconfig.set("option_shadow", _optionShadow);
      xconfig.set("option_shadow_self", _optionShadowSelf);
      // 存储透明
      FXmlNode xalpha = xconfig.createNode("Alpha");
      xalpha.set("valid", _optionAlpha);
      xalpha.set("base", _alphaBase);
      xalpha.set("rate", _alphaRate);
      // 存储颜色
      FXmlNode xcolor = xconfig.createNode("Color");
      xcolor.set("valid", _optionColor);
      xcolor.set("min", _colorMin);
      xcolor.set("max", _colorMax);
      xcolor.set("rate", _colorRate);
      xcolor.set("merge", _colorMerge);
      // 存储环境
      FXmlNode xambient = xconfig.createNode("Ambient");
      xambient.set("valid", _optionAmbient);
      _ambientColor.saveConfig(xambient);
      // 存储散射
      FXmlNode xdiffuse = xconfig.createNode("Diffuse");
      xdiffuse.set("valid", _optionDiffuse);
      _diffuseColor.saveConfig(xdiffuse);
      // 存储散射视角
      FXmlNode xdiffuseView = xconfig.createNode("DiffuseView");
      xdiffuseView.set("valid", _optionDiffuseView);
      _diffuseViewColor.saveConfig(xdiffuseView);
      // 存储高光
      FXmlNode xspecular = xconfig.createNode("Specular");
      xspecular.set("valid", _optionSpecular);
      _specularColor.saveConfig(xspecular);
      xspecular.set("base", _specularBase);
      xspecular.set("level", _specularLevel);
      // 存储高光视角
      FXmlNode xspecularView = xconfig.createNode("SpecularView");
      xspecularView.set("valid", _optionSpecularView);
      _specularViewColor.saveConfig(xspecularView);
      xspecularView.set("base", _specularViewBase);
      xspecularView.set("level", _specularViewLevel);
      // 存储反射
      FXmlNode xreflect = xconfig.createNode("Reflect");
      xreflect.set("valid", _optionReflect);
      _reflectColor.saveConfig(xreflect);
      xreflect.set("merge", _reflectMerge);
      // 存储折射
      FXmlNode xrefract = xconfig.createNode("Refract");
      xrefract.set("valid", _optionRefract);
      FXmlNode xrefractFront = xrefract.createNode("Front");
      _refractFrontColor.saveConfig(xrefractFront);
      FXmlNode xrefractBack = xrefract.createNode("Back");
      _refractBackColor.saveConfig(xrefractBack);
      // 存储不透明
      FXmlNode xopacity = xconfig.createNode("Opacity");
      xopacity.set("valid", _optionOpacity);
      _opacityColor.saveConfig(xopacity);
      xopacity.set("rate", _opacityRate);
      xopacity.set("alpha", _opacityAlpha);
      xopacity.set("depth", _opacityDepth);
      xopacity.set("transmittance", _opacityTransmittance);
      // 存储发光
      FXmlNode xemissive = xconfig.createNode("Emissive");
      xemissive.set("valid", _optionEmissive);
      _emissiveColor.saveConfig(xemissive);
   }

   //============================================================
   // <T>从配置信息中导入配置。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   public String toXml(){
      FXmlNode xconfig = new FXmlNode("Material");
      saveConfig(xconfig);
      return xconfig.xml().toString();
   }

   //============================================================
   // <T>从数据单元中导入配置。</T>
   //
   // @param unit 数据单元
   //============================================================
   public void loadUnit(FDataResource3dMaterialUnit unit){
      // 加载配置
      FXmlDocument xdocument = new FXmlDocument();
      xdocument.loadString(unit.content());
      this.loadConfig(xdocument.root());
      // 加载属性
      _ouid = unit.ouid();
      _guid = unit.guid();
      _code = unit.code();
      _label = unit.label();
   }

   //============================================================
   // <T>将配置信息存入数据单元中。</T>
   //
   // @param unit 数据单元
   //============================================================
   public void saveUnit(FDataResource3dMaterialUnit unit){
      unit.setCode(_code);
      unit.setLabel(_label);
      unit.setContent(toXml());
   }

   //============================================================
   // <T>从配置信息中导入配置。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   public void importConfig(FXmlNode xconfig){
      // 读取属性
      _code = xconfig.get("code");
      _label = xconfig.get("label");
      _effectCode = xconfig.get("effect_code");
      _optionDouble = xconfig.getBoolean("option_double", false);
      // 处理所有节点
      for(FXmlNode xnode : xconfig){
         if(xnode.isName("Alpha")){
            _alphaBase = xnode.getFloat("base");
            _alphaRate = xnode.getFloat("rate");
         }else if(xnode.isName("Color")){
            _colorMin = xnode.getFloat("min");
            _colorMax = xnode.getFloat("max");
            _colorRate = xnode.getFloat("rate");
            _colorMerge = xnode.getFloat("merge");
         }else if(xnode.isName("Ambient")){
            _ambientColor.importConfig(xnode);
         }else if(xnode.isName("Diffuse")){
            _diffuseColor.importConfig(xnode);
         }else if(xnode.isName("DiffuseView")){
            _diffuseViewColor.importConfig(xnode);
         }else if(xnode.isName("Specular")){
            _specularColor.importConfig(xnode);
            _specularBase = xnode.getFloat("base", 0.1f);
            _specularLevel = xnode.getFloat("level");
         }else if(xnode.isName("SpecularView")){
            _specularViewColor.importConfig(xnode);
            _specularViewBase = xnode.getFloat("base", 0.1f);
            _specularViewLevel = xnode.getFloat("level");
         }else if(xnode.isName("Reflect")){
            _reflectColor.importConfig(xnode);
            _reflectMerge = xnode.getFloat("merge");
         }else if(xnode.isName("RefractFront")){
            _refractFrontColor.importConfig(xnode);
         }else if(xnode.isName("RefractBack")){
            _refractBackColor.importConfig(xnode);
         }else if(xnode.isName("Emissive")){
            _emissiveColor.importConfig(xnode);
         }else if(xnode.isName("TextureCollection")){
            for(FXmlNode xchild : xnode){
               if(xchild.isName("Texture")){
                  FRs3MaterialTexture texture = new FRs3MaterialTexture();
                  texture.setMaterial(this);
                  texture.importConfig(xchild);
                  _textures.push(texture);
               }
            }
         }
      }
   }
}
