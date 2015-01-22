//============================================================
// <T>逻辑升级消息定义。</T>
//
// @version 1.0
// @auto 代码器管理的代码，如需修改请在手动修改标出的地方修改。
//============================================================
package com.cyou.gccloud.define.message.logicupgrade;

import com.cyou.gccloud.common.INetObject;
import com.cyou.gccloud.common.message.ENetMessageGroup;
import com.cyou.gccloud.common.message.ENetMessageType;
import com.cyou.gccloud.common.message.FNetMessage;
import org.mo.com.xml.FXmlNode;

//============================================================
// <T>版本查询应答消息。</T>
//============================================================
public class FLguVersionQueryResponse
      extends FNetMessage
      implements
         INetObject
{
   // 名称
   public final static String NAME = "LguVersionQueryResponse";

   // 类型
   public final static int TYPE = ENetMessageType.Response;

   // 代码
   public final static int CODE = ENetMessageGroup.LogicUpgrade + 0x0002;

   // 版本
   public final static int VERSION = 0x40E3C204;

   //============================================================
   // <T>版本信息定义。</T>
   //============================================================
   public final static class SVersionInfo
         implements
            INetObject
   {
      // 代码
      public final static String CODE = "";

      //============================================================
      // <T>构造版本信息定义。</T>
      //============================================================
      public SVersionInfo(){
      }

      //============================================================
      // <T>从配置节点中读取数据。</T>
      //
      // @param xconfig 配置节点
      //============================================================
      public void loadConfig(FXmlNode xconfig){
      }

      //============================================================
      // <T>保存数据到配置节点中。</T>
      //
      // @param xconfig 配置节点
      //============================================================
      public void saveConfig(FXmlNode xconfig){
      }

      //============================================================
      // <T>重置内容。</T>
      //============================================================
      public void reset(){
      }
   }

   // 结果类型
   protected String _resultCd;

   // 版本集合
   protected SVersionInfo _versions = new SVersionInfo();

   //============================================================
   // <T>构造消息的实例对象。</T>
   //
   // @return 实例对象
   //============================================================
   public FLguVersionQueryResponse(){
      _head.name = NAME;
      _head.type = TYPE;
      _head.code = CODE;
      _head.version = VERSION;
   }

   //============================================================
   // <T>构造消息的实例对象。</T>
   //
   // @param xconfig 配置节点
   // @return 实例对象
   //============================================================
   public FLguVersionQueryResponse(FXmlNode xconfig){
      this();
      loadConfig(xconfig);
   }

   //============================================================
   // <T>获得结果类型。</T>
   //
   // @return 结果类型
   //============================================================
   public String resultCd(){
      return _resultCd;
   }

   //============================================================
   // <T>设置结果类型。</T>
   //
   // @param resultCd 结果类型
   //============================================================
   public void setResultCd(String resultCd){
      _resultCd = resultCd;
   }

   //============================================================
   // <T>从配置节点中读取数据。</T>
   //
   // @param xconfig 配置节点
   //============================================================
   public void loadConfig(FXmlNode xconfig){
      _resultCd = xconfig.get("result_cd");
      FXmlNode xversions = xconfig.findNode(SVersionInfo.CODE);
      if(xversions != null){
         _versions.loadConfig(xversions);
      }
   }

   //============================================================
   // <T>保存数据到配置节点中。</T>
   //
   // @param xconfig 配置节点
   //============================================================
   public void saveConfig(FXmlNode xconfig){
      xconfig.set("result_cd", _resultCd);
      FXmlNode xversions = xconfig.syncNode(SVersionInfo.CODE);
      _versions.saveConfig(xversions);
   }

   //============================================================
   // <T>重置内容。</T>
   //============================================================
   @Override
   public void reset(){
      super.reset();
      _resultCd = null;
      _versions.reset();
   }
}