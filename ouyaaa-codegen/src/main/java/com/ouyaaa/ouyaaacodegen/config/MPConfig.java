package com.ouyaaa.ouyaaacodegen.config;/**
 * @Author Administrator
 * @Date 2018/9/3 14:03
 */

import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-09-03  14:03
 * @Description：
 **/

/**
 * 根据数据库生产代码，若要定制需要写配置，分支测试
 */
public class MPConfig {

    public MPConfig(){
        AutoGenerator auto  = autoGenerator();
        auto.execute();
    }

    /**
     * 将以下配置进行整个
     */
    public AutoGenerator autoGenerator(){
        AutoGenerator autoGenerator=new AutoGenerator();
        autoGenerator.setGlobalConfig(setGlobalConfig())
                    .setDataSource(setDataSourceConfig())
                    .setStrategy(setStrategyConfig())
                    .setPackageInfo(setPackageConfig());
        return autoGenerator;
    }

    /**
     * 全局配置
     */
    public GlobalConfig setGlobalConfig(){
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setActiveRecord(true)  //是否支ar模式
                    .setAuthor("Zachary")
                    .setOutputDir("D:\\") //生成路径
                    .setFileOverride(true) //文件覆盖
                    .setIdType(IdType.AUTO)
                    .setServiceName("%sService") //设置生成的Service接口名称的首字母是否为I；
                    .setBaseResultMap(true)   //生成基本结果映射文件
                    .setBaseColumnList(true);  //生成基本sql片段
        return globalConfig;
    }

    /**
     * 数据源配置
     */
    public DataSourceConfig setDataSourceConfig(){
        DataSourceConfig sourceConfig = new DataSourceConfig();
        sourceConfig.setDbType(DbType.MYSQL)
                    .setDriverName("com.mysql.jdbc.Driver")
                    .setUrl("jdbc:mysql://127.0.0.1:3306/hlhmidb?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false")
                    .setUsername("root")
                    .setPassword("123456");
        return sourceConfig;
    }

    /**
     * 策略配置
     */
    public StrategyConfig setStrategyConfig(){
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)  //全局大写命名
                      .setDbColumnUnderline(true)  //指定表名、字段名是否使用下划线
                      .setNaming(NamingStrategy.underline_to_camel)  //驼峰命名
                      .setTablePrefix("")
                .setEntityLombokModel(true)
                .setRestControllerStyle(true)
                .setVersionFieldName("1.0")
                .setTablePrefix("hl_")
                      .setInclude("hl_save_hourdata"
                              );
        return strategyConfig;
    }

    /**
     * 包设置
     */
    public PackageConfig setPackageConfig(){
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.ouyaaa.site.terminal")
                        .setMapper("mapper")
                        .setController("rest")
                        .setService("service")
                        .setEntity("entity")
                        .setXml("mapper");
        return packageConfig;
    }
}
