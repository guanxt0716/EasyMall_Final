package com.easymall;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;
import java.util.ArrayList;

@SpringBootTest
public class MPGenerator {
        public static void main(String[] args) {

            AutoGenerator mpg = new AutoGenerator();
            //配置策略
            GlobalConfig gc = new GlobalConfig();
            String projectPath = System.getProperty("user.dir");
            gc.setOutputDir(projectPath+"/src/main/java");
            gc.setAuthor("guanxt and Lili");
            gc.setOpen(false);
            gc.setFileOverride(true);
            gc.setServiceName("%sservice");
            gc.setIdType(IdType.AUTO);
            gc.setDateType(DateType.ONLY_DATE);
            gc.setSwagger2(false);
            mpg.setGlobalConfig(gc);

            //设置数据源
            DataSourceConfig dsc = new DataSourceConfig();
            dsc.setUrl("jdbc:mysql://localhost:3306/easydb?useSSL=false&useUnicode=true&characterEncoding=utf-8");
            dsc.setDriverName("com.mysql.cj.jdbc.Driver");
            dsc.setUsername("root");
            dsc.setPassword("123456");
            dsc.setDbType(DbType.MYSQL);

            mpg.setDataSource(dsc);

            //包配置
            PackageConfig pc = new PackageConfig();
            //pc.setModuleName("easymall");
            pc.setParent("com.easymall");
            pc.setEntity("pojo");
            pc.setMapper("mapper");
            pc.setService("service");
            pc.setController("controller");
            mpg.setPackageInfo(pc);
            //配置策略

            StrategyConfig strategy = new StrategyConfig();
            strategy.setInclude("t_product");//设置要映射的表名
            strategy.setNaming(NamingStrategy.underline_to_camel);
            strategy.setColumnNaming(NamingStrategy.underline_to_camel);
            strategy.setEntityLombokModel(true);//自动lombok
            mpg.setStrategy(strategy);

            //自动填充配置
            TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
            TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
            ArrayList<TableFill> tabeleFills = new ArrayList<>();
            tabeleFills.add(gmtCreate);
            tabeleFills.add(gmtModified);
            strategy.setTableFillList(tabeleFills);


            mpg.execute();
        }

}
