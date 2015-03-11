package org.mo.content.dbimport;

import org.mo.cloud.core.storage.EGcStorageCatalog;
import org.mo.cloud.core.storage.IGcStorageConsole;
import org.mo.com.logging.RLogger;
import org.mo.content.common.RRs3Configuration;
import org.mo.core.aop.RAop;

public class RDbMongoDrop
{
   //============================================================
   // <T>导入处理。</T>
   //============================================================
   public static void process() throws Exception{
      // 导入处理
      IGcStorageConsole console = RAop.find(IGcStorageConsole.class);
      console.drop(EGcStorageCatalog.Resource3dTextureBitmap);
      console.drop(EGcStorageCatalog.Resource3dTexture);
      console.drop(EGcStorageCatalog.Resource3dTextureCompress);
      console.drop(EGcStorageCatalog.Resource3dModel);
      console.drop(EGcStorageCatalog.Resource3dTemplate);
      console.drop(EGcStorageCatalog.Resource3dSceneTheme);
   }

   //============================================================
   // <T>主函数。</T>
   //============================================================
   public static void main(String[] args) throws Exception{
      String configPath = RRs3Configuration.RootPath + "/MoCloud";
      RAop.configConsole().defineCollection().attributes().set("application", configPath);
      RAop.initialize(configPath + "/mp-cloud-design/src/config/" + RRs3Configuration.Config);
      try{
         process();
      }catch(Exception e){
         RLogger.find(RDbMongoDrop.class).error(null, "main", e);
      }
      RAop.release();
   }
}
