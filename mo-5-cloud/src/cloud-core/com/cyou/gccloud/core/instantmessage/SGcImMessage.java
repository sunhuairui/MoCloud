package com.cyou.gccloud.core.instantmessage;

//============================================================
// <T>消息参数。</T>
//============================================================
public class SGcImMessage
{
   // 来源用户编号
   protected long _sourceId;

   // 目标用户编号
   protected long _targetId;

   // 目标用户账号
   protected String _targetPassport;

   // 目标消息
   protected String _text;

   //============================================================
   // <T>构造消息参数。</T>
   //============================================================
   public SGcImMessage(){
   }

   //============================================================
   // <T>获得来源用户编号。</T>
   //
   // @return 来源用户编号
   //============================================================
   public long sourceId(){
      return _sourceId;
   }

   //============================================================
   // <T>设置来源用户编号。</T>
   //
   // @param sourceId 来源用户编号
   //============================================================
   public void setSourceId(long sourceId){
      _sourceId = sourceId;
   }

   //============================================================
   // <T>获得目标用户编号。</T>
   //
   // @return 目标用户编号
   //============================================================
   public long targetId(){
      return _targetId;
   }

   //============================================================
   // <T>设置目标用户编号。</T>
   //
   // @param targetId 目标用户编号
   //============================================================
   public void setTargetId(long targetId){
      _targetId = targetId;
   }

   //============================================================
   // <T>获得目标用户账号。</T>
   //
   // @return 目标用户账号
   //============================================================
   public String targetPassport(){
      return _targetPassport;
   }

   //============================================================
   // <T>设置目标用户账号。</T>
   //
   // @param targetPassport 目标用户账号
   //============================================================
   public void setTargetPassport(String targetPassport){
      _targetPassport = targetPassport;
   }

   //============================================================
   // <T>获得文本。</T>
   //
   // @return 文本
   //============================================================
   public String text(){
      return _text;
   }

   //============================================================
   // <T>设置文本。</T>
   //
   // @param text 文本
   //============================================================
   public void setText(String text){
      _text = text;
   }

   //============================================================
   // <T>生成打包内容。</T>
   //
   // @param text 文本
   //============================================================
   public String pack(){
      return _text;
   }

   //============================================================
   // <T>获得字符串。</T>
   //
   // @return 字符串
   //============================================================
   @Override
   public String toString(){
      return _targetPassport + ":" + _text;
   }
}