package com.cyou.gccloud.data.data;

import org.mo.com.collections.FDataset;
import org.mo.com.collections.FRow;
import org.mo.com.data.FSql;
import org.mo.com.data.RSql;
import org.mo.com.lang.EResult;
import org.mo.com.lang.FFatalError;
import org.mo.com.lang.FString;
import org.mo.com.lang.RString;
import org.mo.com.lang.RUuid;
import org.mo.com.lang.reflect.RClass;
import org.mo.com.lang.type.TDateTime;
import org.mo.core.aop.face.ASourceMachine;
import org.mo.data.logic.FLogicDataset;
import org.mo.data.logic.FLogicTable;
import org.mo.data.logic.FLogicUnit;
import org.mo.data.logic.ILogicContext;
import org.mo.data.logic.SLogicConnectionInfo;
import org.mo.data.logic.SLogicFieldInfo;
import org.mo.data.logic.SLogicTableInfo;

//============================================================
// <T>后台事件表逻辑。</T>
//============================================================
@ASourceMachine
public class FDataBatchEventLogic
      extends FLogicTable
{
   // 后台事件表的定义。
   public final static SLogicConnectionInfo CONNECTION = new SLogicConnectionInfo("data");

   // 后台事件表的定义。
   public final static SLogicTableInfo TABLE = new SLogicTableInfo("data.batch.event", "DT_BAT_EVENT");

   // 字段对象标识的定义。
   public final static SLogicFieldInfo OUID = new SLogicFieldInfo("OUID");

   // 字段有效性的定义。
   public final static SLogicFieldInfo OVLD = new SLogicFieldInfo("OVLD");

   // 字段对象唯一标识的定义。
   public final static SLogicFieldInfo GUID = new SLogicFieldInfo("GUID");

   // 字段事件类型的定义。
   public final static SLogicFieldInfo TYPE_CD = new SLogicFieldInfo("TYPE_CD");

   // 字段代码的定义。
   public final static SLogicFieldInfo CODE = new SLogicFieldInfo("CODE");

   // 字段用户编号的定义。
   public final static SLogicFieldInfo USER_ID = new SLogicFieldInfo("USER_ID");

   // 字段关联类型的定义。
   public final static SLogicFieldInfo LINK_CD = new SLogicFieldInfo("LINK_CD");

   // 字段关联编号的定义。
   public final static SLogicFieldInfo LINK_ID = new SLogicFieldInfo("LINK_ID");

   // 字段状态类型的定义。
   public final static SLogicFieldInfo STATUS_CD = new SLogicFieldInfo("STATUS_CD");

   // 字段输入参数集合的定义。
   public final static SLogicFieldInfo INPUT_PARAMETERS = new SLogicFieldInfo("INPUT_PARAMETERS");

   // 字段输出参数集合的定义。
   public final static SLogicFieldInfo OUTPUT_PARAMETERS = new SLogicFieldInfo("OUTPUT_PARAMETERS");

   // 字段开始时间的定义。
   public final static SLogicFieldInfo BEGIN_DATE = new SLogicFieldInfo("BEGIN_DATE");

   // 字段结束时间的定义。
   public final static SLogicFieldInfo END_DATE = new SLogicFieldInfo("END_DATE");

   // 字段结果类型的定义。
   public final static SLogicFieldInfo RESULT_CD = new SLogicFieldInfo("RESULT_CD");

   // 字段结果描述的定义。
   public final static SLogicFieldInfo RESULT_NOTE = new SLogicFieldInfo("RESULT_NOTE");

   // 字段描述的定义。
   public final static SLogicFieldInfo NOTE = new SLogicFieldInfo("NOTE");

   // 字段创建用户标识的定义。
   public final static SLogicFieldInfo CREATE_USER_ID = new SLogicFieldInfo("CREATE_USER_ID");

   // 字段创建日期的定义。
   public final static SLogicFieldInfo CREATE_DATE = new SLogicFieldInfo("CREATE_DATE");

   // 字段更新者标识的定义。
   public final static SLogicFieldInfo UPDATE_USER_ID = new SLogicFieldInfo("UPDATE_USER_ID");

   // 字段更新时间的定义。
   public final static SLogicFieldInfo UPDATE_DATE = new SLogicFieldInfo("UPDATE_DATE");

   // 字段集合的定义。
   public final static String FIELDS = "OUID,OVLD,GUID,TYPE_CD,CODE,USER_ID,LINK_CD,LINK_ID,STATUS_CD,INPUT_PARAMETERS,OUTPUT_PARAMETERS,BEGIN_DATE,END_DATE,RESULT_CD,RESULT_NOTE,NOTE,CREATE_USER_ID,CREATE_DATE,UPDATE_USER_ID,UPDATE_DATE";

   //============================================================
   // <T>构造后台事件表逻辑单元。</T>
   //============================================================
   public FDataBatchEventLogic(){
      _name = TABLE.name();
      _classUnit = FDataBatchEventUnit.class;
   }

   //============================================================
   // <T>构造后台事件表逻辑单元。</T>
   //
   // @param context 逻辑环境
   //============================================================
   public FDataBatchEventLogic(ILogicContext context){
      super(context);
      _name = TABLE.name();
      _classUnit = FDataBatchEventUnit.class;
   }

   //============================================================
   // <T>获得数据链接信息。</T>
   //
   // @return 数据链接
   //============================================================
   @Override
   public SLogicConnectionInfo connectionInfo(){
      return CONNECTION;
   }

   //============================================================
   // <T>获得数据集合信息。</T>
   //
   // @return 数据集合链接
   //============================================================
   @Override
   public SLogicTableInfo tableInfo(){
      return TABLE;
   }

   //============================================================
   // <T>根据编号生成查询字符串。</T>
   //
   // @param fields 选取字段
   // @param id 编号
   // @return 查询字符串
   //============================================================
   public String makeFindSql(CharSequence fields,
                             long id){
      FString sql = new FString("SELECT ");
      if(RString.isEmpty(fields)){
         sql.append(FIELDS);
      }else{
         sql.append(fields);
      }
      sql.append(" FROM ");
      sql.append(_name);
      sql.append(" WHERE OUID=");
      sql.append(id);
      return sql.toString();
   }

   //============================================================
   // <T>根据信息生成查询字符串。</T>
   //
   // @param fields 选取字段
   // @param whereSql 条件命令
   // @param groupSql 分组命令
   // @param orderSql 排序命令
   // @param position 位置
   // @param count 总数
   // @return 查询字符串
   //============================================================
   public String makeFetchSql(CharSequence fields,
                              CharSequence whereSql,
                              CharSequence groupSql,
                              CharSequence orderSql,
                              int position,
                              int count){
      // 生成选取
      FString sql = new FString("SELECT ");
      if(RString.isEmpty(fields)){
         sql.append(FIELDS);
      }else{
         sql.append(fields);
      }
      sql.append(" FROM ");
      sql.append(_name);
      // 生成条件
      if(!RString.isEmpty(whereSql)){
         sql.append(" WHERE ");
         sql.append(whereSql);
      }
      // 生成分组
      if(!RString.isEmpty(groupSql)){
         sql.append(" GROUP BY ");
         sql.append(groupSql);
      }
      // 生成排序
      if(!RString.isEmpty(orderSql)){
         sql.append(" ORDER BY ");
         sql.append(orderSql);
      }
      // 生成结果限制
      if(position > 0 || count > 0){
         sql.append(" LIMIT ");
         if(position > 0){
            sql.append(position);
            sql.append(',');
            sql.append(count);
         }else{
            sql.append(count);
         }
      }
      return sql.toString();
   }

   //============================================================
   // <T>根据编号获得一个数据单元。</T>
   //
   // @param unit 数据单元
   // @param clazz 类对象
   // @param recordId 记录编号
   // @return 是否获得
   //============================================================
   @Override
   @SuppressWarnings("unchecked")
   public <T extends FLogicUnit> T find(T unit,
                                        Class<T> clazz,
                                        long recordId){
      // 检查编号
      if(recordId <= 0){
         return null;
      }
      // 生成命令
      FSql cmd = new FSql("SELECT ");
      cmd.append(FIELDS);
      cmd.append(" FROM ");
      cmd.append(_name);
      cmd.append(" WHERE OUID=");
      cmd.append(recordId);
      String sql = cmd.toString();
      // 获得行记录
      FRow row = innerFindRow(recordId, sql);
      // 检查结果
      if(row == null){
         return null;
      }
      // 获得数据
      if(unit == null){
         if(clazz == null){
            unit = (T)(new FDataBatchEventUnit());
         }else{
            unit = RClass.newInstance(clazz);
         }
      }
      unit.linkLogicContext(_logicContext);
      unit.load(row);
      return unit;
   }

   //============================================================
   // <T>根据条件获得一个数据单元。</T>
   //
   // @param whereSql 条件
   // @return 数据单元
   //============================================================
   public FDataBatchEventUnit search(CharSequence whereSql){
      return search(null, FDataBatchEventUnit.class, whereSql);
   }

   //============================================================
   // <T>根据条件获得一个数据单元。</T>
   //
   // @param unit 数据单元
   // @param clazz 类对象
   // @param whereSql 条件
   // @return 是否获得
   //============================================================
   @Override
   public <T extends FLogicUnit> T search(T unit,
                                          Class<T> clazz,
                                          CharSequence whereSql){
      // 检查条件
      if(RString.isEmpty(whereSql)){
         return null;
      }
      // 生成命令
      FSql cmd = new FSql("SELECT ");
      cmd.append(FIELDS);
      cmd.append(" FROM ");
      cmd.append(_name);
      cmd.append(" WHERE ");
      cmd.append(whereSql);
      String sql = cmd.toString();
      // 获得数据
      return searchSql(unit, clazz, whereSql, sql);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetch(int pageSize,
                                                   int page){
      return fetchClass(null, null, null, null, null, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param whereSql 条件命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetch(CharSequence whereSql,
                                                   int pageSize,
                                                   int page){
      return fetchClass(null, null, whereSql, null, null, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param whereSql 条件命令
   // @param orderSql 排序命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetch(CharSequence whereSql,
                                                   CharSequence orderSql,
                                                   int pageSize,
                                                   int page){
      return fetchClass(null, null, whereSql, null, orderSql, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param fields 选取字段
   // @param whereSql 条件命令
   // @param orderSql 排序命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetch(CharSequence fields,
                                                   CharSequence whereSql,
                                                   CharSequence orderSql,
                                                   int pageSize,
                                                   int page){
      return fetchClass(null, fields, whereSql, null, orderSql, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param fields 选取字段
   // @param whereSql 条件命令
   // @param orderSql 排序命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetch(CharSequence fields,
                                                   CharSequence whereSql,
                                                   CharSequence groupSql,
                                                   CharSequence orderSql,
                                                   int pageSize,
                                                   int page){
      return fetchClass(null, fields, whereSql, groupSql, orderSql, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param clazz 单元类型
   // @param whereSql 条件命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public <T extends FLogicUnit> FLogicDataset<T> fetchClass(Class<T> clazz,
                                                             CharSequence whereSql,
                                                             int pageSize,
                                                             int page){
      // 生成命令
      String code = innerMemcacheKey(null, whereSql, null, null);
      String sql = makeFetchSql(null, whereSql, null, null, 0, 0);
      // 获得数据
      return fetchSql(clazz, code, sql, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param clazz 单元类型
   // @param whereSql 条件命令
   // @param orderSql 排序命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public <T extends FLogicUnit> FLogicDataset<T> fetchClass(Class<T> clazz,
                                                             CharSequence whereSql,
                                                             CharSequence orderSql,
                                                             int pageSize,
                                                             int page){
      // 生成命令
      String code = innerMemcacheKey(null, whereSql, null, orderSql);
      String sql = makeFetchSql(null, whereSql, null, orderSql, 0, 0);
      // 获得数据
      return fetchSql(clazz, code, sql, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param clazz 单元类型
   // @param fields 选取字段
   // @param whereSql 条件命令
   // @param orderSql 排序命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public <T extends FLogicUnit> FLogicDataset<T> fetchClass(Class<T> clazz,
                                                             CharSequence fields,
                                                             CharSequence whereSql,
                                                             CharSequence orderSql,
                                                             int pageSize,
                                                             int page){
      // 生成命令
      String code = innerMemcacheKey(fields, whereSql, null, orderSql);
      String sql = makeFetchSql(fields, whereSql, null, orderSql, 0, 0);
      // 获得数据
      return fetchSql(clazz, code, sql, pageSize, page);
   }

   //============================================================
   // <T>根据条件获得数据单元集合。</T>
   //
   // @param clazz 单元类型
   // @param fields 选取字段
   // @param whereSql 条件命令
   // @param groupSql 分组命令
   // @param orderSql 排序命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public <T extends FLogicUnit> FLogicDataset<T> fetchClass(Class<T> clazz,
                                                             CharSequence fields,
                                                             CharSequence whereSql,
                                                             CharSequence groupSql,
                                                             CharSequence orderSql,
                                                             int pageSize,
                                                             int page){
      // 生成命令
      String code = innerMemcacheKey(fields, whereSql, groupSql, orderSql);
      String sql = makeFetchSql(fields, whereSql, groupSql, orderSql, 0, 0);
      // 获得数据
      return fetchSql(clazz, code, sql, pageSize, page);
   }

   //============================================================
   // <T>根据查询命令获得数据单元集合。</T>
   //
   // @param code 代码
   // @param sql 查询命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetchSql(CharSequence code,
                                                      CharSequence sql,
                                                      int pageSize,
                                                      int page){
      return fetchSql(null, code, sql, pageSize, page);
   }

   //============================================================
   // <T>根据查询命令获得数据单元集合。</T>
   //
   // @param clazz 单元类型
   // @param code 代码
   // @param sql 查询命令
   // @param pageSize 分页大小
   // @param page 分页号码
   // @return 数据单元集合
   //============================================================
   @SuppressWarnings("unchecked")
   public <T extends FLogicUnit> FLogicDataset<T> fetchSql(Class<T> clazz,
                                                           CharSequence code,
                                                           CharSequence sql,
                                                           int pageSize,
                                                           int page){
      // 获得数据
      FDataset dataset = innerFindDataset(code, sql, pageSize, page);
      // 返回结果
      FLogicDataset<T> result = null;
      if(clazz == null){
         result = (FLogicDataset<T>)(new FLogicDataset<FDataBatchEventUnit>(FDataBatchEventUnit.class, _logicContext));
      }else{
         result = new FLogicDataset<T>(clazz, _logicContext);
      }
      result.loadDataset(dataset);
      return result;
   }

   //============================================================
   // <T>获得全部数据单元集合。</T>
   //
   // @return 数据单元集合
   //============================================================
   public FLogicDataset<FDataBatchEventUnit> fetchAll(){
      // 生成命令
      String code = "null|null|null";
      String sql = makeFetchSql(null, null, null, null, 0, 0);
      // 获得数据
      return fetchSql(null, code, sql, 0, 0);
   }

   //============================================================
   // <T>准备一个数据单元。</T>
   //
   // @return 数据单元
   //============================================================
   public FDataBatchEventUnit doPrepare(){
      FDataBatchEventUnit unit = new FDataBatchEventUnit();
      unit.linkLogicContext(_logicContext);
      doPrepare(unit);
      return unit;
   }

   //============================================================
   // <T>准备一个数据单元。</T>
   //
   // @param clazz 类型
   // @return 数据单元
   //============================================================
   public <T extends FLogicUnit> T doPrepare(Class<T> clazz){
      T unit = RClass.newInstance(clazz);
      unit.linkLogicContext(_logicContext);
      doPrepare(unit);
      return unit;
   }

   //============================================================
   // <T>准备一个数据单元。</T>
   //
   // @param logicUnit 数据单元
   // @return 处理结果
   //============================================================
   @Override
   public EResult doPrepare(FLogicUnit logicUnit){
      FDataBatchEventUnit unit = (FDataBatchEventUnit)logicUnit;
      unit.setOvld(true);
      unit.setGuid(RUuid.makeUniqueId());
      return EResult.Success;
   }

   //============================================================
   // <T>插入一个数据单元。</T>
   //
   // @param logicUnit 数据单元
   // @return 处理结果
   //============================================================
   @Override
   public EResult doInsert(FLogicUnit logicUnit){
      FDataBatchEventUnit unit = (FDataBatchEventUnit)logicUnit;
      // 设置操作用户
      if((unit.createUserId() == 0) || (unit.updateUserId() == 0)){
         long operatorId = currentOperatorId();
         if(unit.createUserId() == 0){
            unit.setCreateUserId(operatorId);
         }
         if(unit.updateUserId() == 0){
            unit.setUpdateUserId(operatorId);
         }
      }
      // 生成命令
      FSql cmd = new FSql("INSERT INTO ");
      cmd.append(_name);
      cmd.append("(");
      cmd.append("`OVLD`");
      cmd.append(",`GUID`");
      cmd.append(",`TYPE_CD`");
      cmd.append(",`CODE`");
      cmd.append(",`USER_ID`");
      cmd.append(",`LINK_CD`");
      cmd.append(",`LINK_ID`");
      cmd.append(",`STATUS_CD`");
      cmd.append(",`INPUT_PARAMETERS`");
      cmd.append(",`OUTPUT_PARAMETERS`");
      cmd.append(",`BEGIN_DATE`");
      cmd.append(",`END_DATE`");
      cmd.append(",`RESULT_CD`");
      cmd.append(",`RESULT_NOTE`");
      cmd.append(",`NOTE`");
      cmd.append(",`CREATE_USER_ID`");
      cmd.append(",`CREATE_DATE`");
      cmd.append(",`UPDATE_USER_ID`");
      cmd.append(",`UPDATE_DATE`");
      cmd.append(") VALUES(");
      cmd.append(unit.ovld());
      cmd.append(',');
      String guid = unit.guid();
      if(RString.isEmpty(guid)){
         guid = RUuid.makeUniqueId();
      }
      cmd.append('\'');
      cmd.append(guid);
      cmd.append('\'');
      cmd.append(',');
      cmd.append(unit.typeCd());
      cmd.append(',');
      String code = unit.code();
      if(RString.isEmpty(code)){
         cmd.append("NULL");
      }else{
         cmd.append('\'');
         cmd.append(RSql.formatValue(code));
         cmd.append('\'');
      }
      cmd.append(',');
      long userId = unit.userId();
      if(userId == 0){
         cmd.append("NULL");
      }else{
         cmd.append(userId);
      }
      cmd.append(',');
      cmd.append(unit.linkCd());
      cmd.append(',');
      long linkId = unit.linkId();
      if(linkId == 0){
         cmd.append("NULL");
      }else{
         cmd.append(linkId);
      }
      cmd.append(',');
      cmd.append(unit.statusCd());
      cmd.append(',');
      String inputParameters = unit.inputParameters();
      if(RString.isEmpty(inputParameters)){
         cmd.append("NULL");
      }else{
         cmd.append('\'');
         cmd.append(RSql.formatValue(inputParameters));
         cmd.append('\'');
      }
      cmd.append(',');
      String outputParameters = unit.outputParameters();
      if(RString.isEmpty(outputParameters)){
         cmd.append("NULL");
      }else{
         cmd.append('\'');
         cmd.append(RSql.formatValue(outputParameters));
         cmd.append('\'');
      }
      cmd.append(',');
      TDateTime beginDate = unit.beginDate();
      if(beginDate == null){
         cmd.append("NULL");
      }else if(beginDate.isEmpty()){
         cmd.append("NULL");
      }else{
         cmd.append("STR_TO_DATE('");
         cmd.append(beginDate.format());
         cmd.append("','%Y%m%d%H%i%s')");
      }
      cmd.append(',');
      TDateTime endDate = unit.endDate();
      if(endDate == null){
         cmd.append("NULL");
      }else if(endDate.isEmpty()){
         cmd.append("NULL");
      }else{
         cmd.append("STR_TO_DATE('");
         cmd.append(endDate.format());
         cmd.append("','%Y%m%d%H%i%s')");
      }
      cmd.append(',');
      cmd.append(unit.resultCd());
      cmd.append(',');
      String resultNote = unit.resultNote();
      if(RString.isEmpty(resultNote)){
         cmd.append("NULL");
      }else{
         cmd.append('\'');
         cmd.append(RSql.formatValue(resultNote));
         cmd.append('\'');
      }
      cmd.append(',');
      String note = unit.note();
      if(RString.isEmpty(note)){
         cmd.append("NULL");
      }else{
         cmd.append('\'');
         cmd.append(RSql.formatValue(note));
         cmd.append('\'');
      }
      // 设置更新信息
      cmd.append("," + unit.createUserId());
      if(unit.createDate().isEmpty()){
         cmd.append(",NOW()");
      }else{
         cmd.append(",STR_TO_DATE('");
         cmd.append(unit.createDate().format());
         cmd.append("','%Y%m%d%H%i%s')");
      }
      cmd.append("," + unit.updateUserId());
      if(unit.updateDate().isEmpty()){
         cmd.append(",NOW()");
      }else{
         cmd.append(",STR_TO_DATE('");
         cmd.append(unit.updateDate().format());
         cmd.append("','%Y%m%d%H%i%s')");
      }
      cmd.append(')');
      // 执行命令
      String sql = cmd.toString();
      long recordId = _connection.executeInsertSql(sql);
      unit.setOuid(recordId);
      // 删除缓冲
      innerDeleteRow(recordId);
      return EResult.Success;
   }

   //============================================================
   // <T>更新一个数据单元。</T>
   //
   // @param logicUnit 数据单元
   // @return 处理结果
   //============================================================
   @Override
   public EResult doUpdate(FLogicUnit logicUnit){
      FDataBatchEventUnit unit = (FDataBatchEventUnit)logicUnit;
      // 检查参数
      if(unit == null){
         throw new FFatalError("Logic unit is null.");
      }
      // 更新处理
      return doUpdate(unit, unit.ouid());
   }

   //============================================================
   // <T>更新一个数据单元。</T>
   //
   // @param logicUnit 数据单元
   // @param recordId 记录编号
   // @return 处理结果
   //============================================================
   @Override
   public EResult doUpdate(FLogicUnit logicUnit,
                           long recordId){
      FDataBatchEventUnit unit = (FDataBatchEventUnit)logicUnit;
      // 检查参数
      if(unit == null){
         throw new FFatalError("Logic unit is null.");
      }
      if(recordId <= 0){
         throw new FFatalError("Record id is empty. (record_id={1})", recordId);
      }
      // 删除缓冲
      innerDeleteRow(recordId);
      // 设置操作用户
      if(unit.updateUserId() == 0){
         long operatorId = currentOperatorId();
         unit.setUpdateUserId(operatorId);
      }
      // 生成命令
      FSql cmd = new FSql("UPDATE ");
      cmd.append(_name);
      cmd.append(" SET OVLD=");
      cmd.append(unit.ovld());
      if(unit.isTypeCdChanged()){
         cmd.append(",`TYPE_CD`=");
         cmd.append(unit.typeCd());
      }
      if(unit.isCodeChanged()){
         cmd.append(",`CODE`=");
         String code = unit.code();
         if(RString.isEmpty(code)){
            cmd.append("NULL");
         }else{
            cmd.append('\'');
            cmd.append(RSql.formatValue(code));
            cmd.append('\'');
         }
      }
      if(unit.isUserIdChanged()){
         cmd.append(",`USER_ID`=");
         long userId = unit.userId();
         if(userId == 0){
            cmd.append("NULL");
         }else{
            cmd.append(userId);
         }
      }
      if(unit.isLinkCdChanged()){
         cmd.append(",`LINK_CD`=");
         cmd.append(unit.linkCd());
      }
      if(unit.isLinkIdChanged()){
         cmd.append(",`LINK_ID`=");
         long linkId = unit.linkId();
         if(linkId == 0){
            cmd.append("NULL");
         }else{
            cmd.append(linkId);
         }
      }
      if(unit.isStatusCdChanged()){
         cmd.append(",`STATUS_CD`=");
         cmd.append(unit.statusCd());
      }
      if(unit.isInputParametersChanged()){
         cmd.append(",`INPUT_PARAMETERS`=");
         String inputParameters = unit.inputParameters();
         if(RString.isEmpty(inputParameters)){
            cmd.append("NULL");
         }else{
            cmd.append('\'');
            cmd.append(RSql.formatValue(inputParameters));
            cmd.append('\'');
         }
      }
      if(unit.isOutputParametersChanged()){
         cmd.append(",`OUTPUT_PARAMETERS`=");
         String outputParameters = unit.outputParameters();
         if(RString.isEmpty(outputParameters)){
            cmd.append("NULL");
         }else{
            cmd.append('\'');
            cmd.append(RSql.formatValue(outputParameters));
            cmd.append('\'');
         }
      }
      if(unit.isBeginDateChanged()){
         cmd.append(",`BEGIN_DATE`=");
         TDateTime beginDate = unit.beginDate();
         if(beginDate == null){
            cmd.append("NULL");
         }else if(beginDate.isEmpty()){
            cmd.append("NULL");
         }else{
            cmd.append("STR_TO_DATE('");
            cmd.append(beginDate.format());
            cmd.append("','%Y%m%d%H%i%s')");
         }
      }
      if(unit.isEndDateChanged()){
         cmd.append(",`END_DATE`=");
         TDateTime endDate = unit.endDate();
         if(endDate == null){
            cmd.append("NULL");
         }else if(endDate.isEmpty()){
            cmd.append("NULL");
         }else{
            cmd.append("STR_TO_DATE('");
            cmd.append(endDate.format());
            cmd.append("','%Y%m%d%H%i%s')");
         }
      }
      if(unit.isResultCdChanged()){
         cmd.append(",`RESULT_CD`=");
         cmd.append(unit.resultCd());
      }
      if(unit.isResultNoteChanged()){
         cmd.append(",`RESULT_NOTE`=");
         String resultNote = unit.resultNote();
         if(RString.isEmpty(resultNote)){
            cmd.append("NULL");
         }else{
            cmd.append('\'');
            cmd.append(RSql.formatValue(resultNote));
            cmd.append('\'');
         }
      }
      if(unit.isNoteChanged()){
         cmd.append(",`NOTE`=");
         String note = unit.note();
         if(RString.isEmpty(note)){
            cmd.append("NULL");
         }else{
            cmd.append('\'');
            cmd.append(RSql.formatValue(note));
            cmd.append('\'');
         }
      }
      cmd.append(",UPDATE_USER_ID=" + unit.updateUserId() + ",UPDATE_DATE=NOW()");
      cmd.append(" WHERE OUID=");
      cmd.append(recordId);
      // 执行命令
      String sql = cmd.toString();
      boolean result = _connection.executeSql(sql);
      if(result){
         return EResult.Success;
      }
      return EResult.Failure;
   }

   //============================================================
   // <T>删除一个数据单元。</T>
   //
   // @param logicUnit 数据单元
   // @return 处理结果
   //============================================================
   @Override
   public EResult doDelete(FLogicUnit logicUnit){
      FDataBatchEventUnit unit = (FDataBatchEventUnit)logicUnit;
      // 检查参数
      if(unit == null){
         throw new FFatalError("Logic unit is null.");
      }
      // 更新处理
      return doDelete(unit, unit.ouid());
   }

   //============================================================
   // <T>删除一个数据单元。</T>
   //
   // @param logicUnit 数据单元
   // @param recordId 记录编号
   // @return 处理结果
   //============================================================
   @Override
   public EResult doDelete(FLogicUnit logicUnit,
                           long recordId){
      // 检查记录编号
      if(recordId <= 0){
         throw new FFatalError("Record id is empty. (record_id={1})", recordId);
      }
      // 删除缓冲
      innerDeleteRow(recordId);
      // 生成命令
      FSql cmd = new FSql("DELETE FROM ");
      cmd.append(_name);
      cmd.append(" WHERE OUID=");
      cmd.append(recordId);
      // 执行命令
      String sql = cmd.toString();
      boolean result = _connection.executeSql(sql);
      if(result){
         return EResult.Success;
      }
      return EResult.Failure;
   }

   //============================================================
   // <T>清除所有数据单元。</T>
   //
   // @return 处理结果
   //============================================================
   @Override
   public EResult doClear(){
      String sql = "DELETE FROM " + _name;
      return executeSql(sql);
   }
}
