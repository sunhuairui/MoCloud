package org.mo.content.resource3d.scene;

import com.cyou.gccloud.data.data.FDataResource3dSceneThemeUnit;
import com.cyou.gccloud.data.data.FDataResource3dSceneUnit;
import org.mo.com.io.IDataInput;
import org.mo.com.io.IDataOutput;
import org.mo.com.lang.FDictionary;
import org.mo.com.lang.FFatalError;
import org.mo.com.lang.FObjects;
import org.mo.com.lang.INamePair;
import org.mo.com.lang.RString;
import org.mo.com.xml.FXmlDocument;
import org.mo.com.xml.FXmlNode;
import org.mo.content.resource3d.common.FRs3Resource;
import org.mo.content.resource3d.template.FRs3Template;
import org.mo.content.resource3d.texture.FRs3Texture;

//============================================================
// <T>场景。</T>
//============================================================
public class FRs3Scene
      extends FRs3Resource
{
   // 主题唯一编号
   protected String _themeGuid;

   // 主题代码
   protected String _themeCode;

   // 场景技术
   protected FRs3SceneTechnique _technique = new FRs3SceneTechnique();

   // 场景区域
   protected FRs3Region _region = new FRs3Region();

   // 纹理集合
   protected FDictionary<FRs3Texture> _textures = new FDictionary<FRs3Texture>(FRs3Texture.class);

   // 模型集合
   protected FDictionary<FRs3Template> _templates = new FDictionary<FRs3Template>(FRs3Template.class);

   // 场景层集合
   protected FObjects<FRs3SceneLayer> _layers = new FObjects<FRs3SceneLayer>(FRs3SceneLayer.class);

   //============================================================
   // <T>构造场景。</T>
   //============================================================
   public FRs3Scene(){
   }

   //============================================================
   // <T>获得主题唯一编号。</T>
   //
   // @return 主题唯一编号
   //============================================================
   public String themeGuid(){
      return _themeGuid;
   }

   //============================================================
   // <T>设置主题唯一编号。</T>
   //
   // @param guid 主题唯一编号
   //============================================================
   public void setThemeGuid(String themeGuid){
      _themeGuid = themeGuid;
   }

   //============================================================
   // <T>获得场景技术。</T>
   //
   // @return 场景技术
   //============================================================
   public FRs3SceneTechnique technique(){
      return _technique;
   }

   //============================================================
   // <T>获得场景区域。</T>
   //
   // @return 场景区域
   //============================================================
   public FRs3Region region(){
      return _region;
   }

   //============================================================
   // <T>根据唯一编号查找场景层。</T>
   //
   // @param guid 唯一编号
   // @return 场景层
   //============================================================
   public FRs3SceneLayer findLayerByGuid(String guid){
      if(!RString.isEmpty(guid)){
         for(FRs3SceneLayer layer : _layers){
            if(guid.equals(layer.guid())){
               return layer;
            }
         }
      }
      return null;
   }

   //============================================================
   // <T>获得纹理集合。</T>
   //
   // @return 纹理集合
   //============================================================
   public FDictionary<FRs3Texture> textures(){
      return _textures;
   }

   //============================================================
   // <T>获得模板集合。</T>
   //
   // @return 模板集合
   //============================================================
   public FDictionary<FRs3Template> templates(){
      return _templates;
   }

   //============================================================
   // <T>获得场景层集合。</T>
   //
   // @return 场景层集合
   //============================================================
   public FObjects<FRs3SceneLayer> layers(){
      return _layers;
   }

   //============================================================
   // <T>获得场景显示集合。</T>
   //
   // @return 场景显示集合
   //============================================================
   public FObjects<FRs3SceneDisplay> filterDisplays(){
      FObjects<FRs3SceneDisplay> displays = new FObjects<FRs3SceneDisplay>(FRs3SceneDisplay.class);
      if(_layers != null){
         for(FRs3SceneLayer layer : _layers){
            layer.filterDisplays(displays);
         }
      }
      return displays;
   }

   //============================================================
   // <T>序列化数据到输出流。</T>
   //
   // @param output 输出流
   //============================================================
   @Override
   public void serialize(IDataOutput output){
      super.serialize(output);
      // 存储属性
      output.writeString(_themeGuid);
      output.writeString(_themeCode);
      _technique.serialize(output);
      _region.serialize(output);
      // 存储纹理定义集合
      if(_textures != null){
         int count = _textures.count();
         output.writeInt16((short)count);
         for(INamePair<FRs3Texture> pair : _textures){
            byte[] data = pair.value().data();
            output.write(data, 0, data.length);
         }
      }else{
         output.writeInt16((short)0);
      }
      // 存储模板定义集合
      if(_templates != null){
         int count = _templates.count();
         output.writeInt16((short)count);
         for(INamePair<FRs3Template> pair : _templates){
            pair.value().serialize(output);
         }
      }else{
         output.writeInt16((short)0);
      }
      // 存储场景层集合
      if(_layers != null){
         int count = _layers.count();
         output.writeInt16((short)count);
         for(FRs3SceneLayer layer : _layers){
            layer.serialize(output);
         }
      }else{
         output.writeInt16((short)0);
      }
   }

   //============================================================
   // <T>从配置信息中加载配置。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   @Override
   public void loadConfig(FXmlNode xconfig){
      // 读取属性
      _code = xconfig.get("code");
      _fullCode = xconfig.get("full_code");
      _label = xconfig.get("label");
      _keywords = xconfig.get("keywords");
      // 读取节点集合
      for(FXmlNode xnode : xconfig){
         if(xnode.isName("Technique")){
            // 读取技术
            _technique.loadConfig(xnode);
         }else if(xnode.isName("Region")){
            // 读取区域
            _region.loadConfig(xnode);
         }else if(xnode.isName("LayerCollection")){
            // 读取层集合
            for(FXmlNode xlayer : xnode){
               FRs3SceneLayer layer = new FRs3SceneLayer();
               layer.loadConfig(xlayer);
               _layers.push(layer);
            }
         }else{
            throw new FFatalError("Invalid config node.");
         }
      }
   }

   //============================================================
   // <T>从配置节点中合并数据信息。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   @Override
   public void mergeConfig(FXmlNode xconfig){
      // 读取属性
      //_code = xconfig.get("code");
      _label = xconfig.get("label");
      // 读取节点集合
      for(FXmlNode xnode : xconfig){
         if(xnode.isName("Technique")){
            // 读取技术
            _technique.mergeConfig(xnode);
         }else if(xnode.isName("Region")){
            // 读取区域
            _region.mergeConfig(xnode);
         }else if(xnode.isName("LayerCollection")){
            // 读取层集合
            for(FXmlNode xlayer : xnode){
               String layerGuid = xlayer.get("guid");
               FRs3SceneLayer layer = findLayerByGuid(layerGuid);
               layer.mergeConfig(xlayer);
            }
         }
      }
   }

   //============================================================
   // <T>存储数据信息到配置节点中。</T>
   //
   // @param xconfig 配置信息
   //============================================================
   @Override
   public void saveConfig(FXmlNode xconfig){
      // 存储属性
      xconfig.set("guid", _guid);
      xconfig.set("code", _code);
      xconfig.set("full_code", _fullCode);
      xconfig.set("label", _label);
      xconfig.set("keywords", _keywords);
      // 存储技术
      _technique.saveConfig(xconfig.createNode("Technique"));
      // 存储区域
      _region.saveConfig(xconfig.createNode("Region"));
      // 存储层集合
      if(_layers != null){
         FXmlNode xlayers = xconfig.createNode("LayerCollection");
         for(FRs3SceneLayer layer : _layers){
            layer.saveConfig(xlayers.createNode("Layer"));
         }
      }
   }

   //============================================================
   // <T>从输入流反序列化数据。</T>
   //
   // @param input 输入流
   //============================================================
   @Override
   public void importData(IDataInput input){
      // 读取属性
      _code = input.readString();
      _fullCode = input.readString();
      _label = input.readString();
      _keywords = input.readString();
      _themeCode = input.readString();
      // 导入技术
      _technique.importData(input);
      // 导入区域
      _region.importData(input);
      // 读取层集合
      FRs3SceneLayer skyLayer = new FRs3SceneLayer();
      skyLayer.importData(input);
      _layers.push(skyLayer);
      FRs3SceneLayer mapLayer = new FRs3SceneLayer();
      mapLayer.importData(input);
      _layers.push(mapLayer);
      FRs3SceneLayer spaceLayer = new FRs3SceneLayer();
      spaceLayer.importData(input);
      _layers.push(spaceLayer);
   }

   //============================================================
   // <T>从数据单元中导入配置。</T>
   //
   // @param unit 数据单元
   //============================================================
   public void loadSceneUnit(FDataResource3dSceneUnit unit){
      // 加载属性
      _ouid = unit.ouid();
      _guid = unit.guid();
      _code = unit.code();
      _label = unit.label();
   }

   //============================================================
   // <T>从数据单元中导入配置。</T>
   //
   // @param unit 数据单元
   //============================================================
   public void loadThemeUnit(FDataResource3dSceneThemeUnit unit){
      // 加载属性
      _themeGuid = unit.guid();
      _themeCode = unit.code();
      // 读取配置
      FXmlDocument xdocument = new FXmlDocument();
      xdocument.loadString(unit.content());
      loadConfig(xdocument.root());
   }

   //============================================================
   // <T>将配置信息存入数据单元中。</T>
   //
   // @param unit 数据单元
   //============================================================
   public void saveThemeUnit(FDataResource3dSceneThemeUnit unit){
      // 存储属性
      //unit.setCode(_code);
      //unit.setFullCode(_fullCode);
      unit.setLabel(_label);
      //unit.setKeywords(_keywords);
      // 存储配置
      FXmlNode xconfig = new FXmlNode("Scene");
      saveConfig(xconfig);
      unit.setContent(xconfig.xml().toString());
   }
}
