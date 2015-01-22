package com.cyou.gccloud.common;

import org.mo.com.xml.FXmlNode;

//============================================================
// <T>网络对象接口。</T>
//============================================================
public interface INetObject
{
   //============================================================
   // <T>存储信息到配置节点中。</T>
   //
   // @param xconfig 配置节点
   //============================================================
   void saveConfig(FXmlNode xconfig);

   //============================================================
   // <T>从配置节点中加载信息。</T>
   //
   // @param xconfig 输出流
   //============================================================
   void loadConfig(FXmlNode xconfig);

   //============================================================
   // <T>重置内容。</T>
   //============================================================
   void reset();
}
