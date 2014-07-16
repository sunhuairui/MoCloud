//============================================================
// <T>种族类型。</T>
//
// @version 1.0.1
//============================================================
package com.cyou.gccloud.service.define.enums;

import org.mo.com.xml.*;

//============================================================
// <T>种族类型枚举定义。</T>
//
// @enum
//============================================================
public class TGmRaceSet
{
   // 数据内容
   protected int value;

   //============================================================
   // <T>获得未知标志位。</T>
   //============================================================
   public boolean unknown(){
      return 0 != (value & (1 << 0));
   }

   //============================================================
   // <T>设置未知标志位。</T>
   //============================================================
   public void setUnknown(boolean flag){
      int mask = (1 << 0);
      if(flag){
         value |= mask;
      }else{
         value &= ~mask;
      }
   }

   //============================================================
   // <T>获得凡人标志位。</T>
   //============================================================
   public boolean human(){
      return 0 != (value & (1 << 1));
   }

   //============================================================
   // <T>设置凡人标志位。</T>
   //============================================================
   public void setHuman(boolean flag){
      int mask = (1 << 1);
      if(flag){
         value |= mask;
      }else{
         value &= ~mask;
      }
   }

   //============================================================
   // <T>获得尊族标志位。</T>
   //============================================================
   public boolean fairy(){
      return 0 != (value & (1 << 2));
   }

   //============================================================
   // <T>设置尊族标志位。</T>
   //============================================================
   public void setFairy(boolean flag){
      int mask = (1 << 2);
      if(flag){
         value |= mask;
      }else{
         value &= ~mask;
      }
   }

   //============================================================
   // <T>获得魔族标志位。</T>
   //============================================================
   public boolean evil(){
      return 0 != (value & (1 << 3));
   }

   //============================================================
   // <T>设置魔族标志位。</T>
   //============================================================
   public void setEvil(boolean flag){
      int mask = (1 << 3);
      if(flag){
         value |= mask;
      }else{
         value &= ~mask;
      }
   }

   //============================================================
   // <T>获得仙族标志位。</T>
   //============================================================
   public boolean angel(){
      return 0 != (value & (1 << 4));
   }

   //============================================================
   // <T>设置仙族标志位。</T>
   //============================================================
   public void setAngel(boolean flag){
      int mask = (1 << 4);
      if(flag){
         value |= mask;
      }else{
         value &= ~mask;
      }
   }

   //============================================================
   // <T>获得无种族限制标志位。</T>
   //============================================================
   public boolean unlimit(){
      return 0 != (value & (1 << 5));
   }

   //============================================================
   // <T>设置无种族限制标志位。</T>
   //============================================================
   public void setUnlimit(boolean flag){
      int mask = (1 << 5);
      if(flag){
         value |= mask;
      }else{
         value &= ~mask;
      }
   }

   //============================================================
   // <T>接收对象内容。</T>
   //
   // @param object 对象
   //============================================================
   public void assign(TGmRaceSet set){
      value = set.value;
   }

  //============================================================
   // <T>序列化数据部分到输入流中。</T>
   //
   // @param output 输入流
   //============================================================
   public void saveConfig(FXmlNode xconfig){
      //output.writeUint32(value);
   }

   //============================================================
   // <T>从输出流中反序列化数据部分。</T>
   //
   // @param input 输出流
   //============================================================
   public void loadConfig(FXmlNode xconfig){
      //value = xconfig.get("Uint32");
   }

   //============================================================
   // <T>重置内容。</T>
   //============================================================
   public void reset(){
      value = 0;
   }
}