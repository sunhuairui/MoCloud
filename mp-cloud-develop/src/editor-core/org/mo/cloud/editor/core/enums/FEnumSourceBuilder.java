package org.mo.cloud.editor.core.enums;

import org.mo.com.io.FStringFile;
import org.mo.com.io.RFile;
import org.mo.com.xml.FXmlNode;
import org.mo.eng.template.ITemplateConsole;
import org.mo.eng.template.ITemplateParser;

//============================================================
// <T>代码生成器。</T>
//============================================================
public class FEnumSourceBuilder
{
   private final ITemplateConsole _templateConsole;

   public final static String CPP_HEAD_INCLUDE = "game/editor/enum/cpp-include";

   public final static String CPP_HEAD_TEMPLATE = "game/editor/enum/cpp-head";

   public final static String CPP_BODY_TEMPLATE = "game/editor/enum/cpp-body";

   public final static String AS_TEMPLATE = "game/editor/enum/as-source";

   public final static String JAVA_TEMPLATE = "game/editor/enum/java-source";

   public final static String JAVA_ANDROID_TEMPLATE = "game/editor/enum/java-android";

   public final static String AS_SET_TEMPLATE = "game/editor/enum/as-set";

   public final static String JAVA_SET_TEMPLATE = "game/editor/enum/java-set";

   public final static String IOS_TEMPLATE = "game/editor/enum/ios-source";

   public final static String CS_TEMPLATE = "game/editor/enum/cs-source";

   public final static String LUA_TEMPLATE = "game/editor/enum/lua-source";

   //============================================================
   public FEnumSourceBuilder(ITemplateConsole templateConsole){
      _templateConsole = templateConsole;
   }

   //============================================================
   public FStringFile makeAsSetSource(FXmlNode xentity){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(AS_SET_TEMPLATE);
      // Define
      parser.define("enum", xentity);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeAsSource(FXmlNode xgroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(AS_TEMPLATE);
      // Define
      parser.define("group", xgroup);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeCppBody(FXmlNode messageGroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(CPP_BODY_TEMPLATE);
      // Define
      parser.define("group", messageGroup);
      // Build
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeCppHead(FXmlNode messageGroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(CPP_HEAD_TEMPLATE);
      // Define
      parser.define("group", messageGroup);
      // Build
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeCppInclude(FXmlNode xsource){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(CPP_HEAD_INCLUDE);
      // Define
      parser.define("source", xsource);
      // Build
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makecSource(String source,
                                  String templatePath,
                                  String define){
      String filename = RFile.format(templatePath);
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(filename);
      // Define
      parser.define(define, source);
      // Build
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeCsSource(FXmlNode xenum){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(CS_TEMPLATE);
      // Define
      parser.define("enum", xenum);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeJavaSetSource(FXmlNode xentity){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(JAVA_SET_TEMPLATE);
      // Define
      parser.define("enum", xentity);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeJavaSource(FXmlNode xgroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(JAVA_TEMPLATE);
      // Define
      parser.define("enum", xgroup);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeJavaAndroidSource(FXmlNode xgroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(JAVA_ANDROID_TEMPLATE);
      // Define
      parser.define("enum", xgroup);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   // <T>建立IOS代码。</T>
   //
   // @param xgroup 配置节点
   // @return 文本文件
   //============================================================
   public FStringFile makeIosSource(FXmlNode xgroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(IOS_TEMPLATE);
      // Define
      parser.define("group", xgroup);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }

   //============================================================
   public FStringFile makeLuaSource(FXmlNode xgroup){
      // 导入模板
      ITemplateParser parser = _templateConsole.findParser(LUA_TEMPLATE);
      // Define
      parser.define("group", xgroup);
      // Build 
      FStringFile file = new FStringFile();
      file.append(parser.parse());
      return file;
   }
}
