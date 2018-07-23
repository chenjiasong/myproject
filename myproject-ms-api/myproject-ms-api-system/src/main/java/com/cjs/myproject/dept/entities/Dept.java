/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Dept
 * Author:   chenjs
 * Date:     2018/7/2 17:36
 * Description: 部门
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjs.myproject.dept.entities;


import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈部门〉
 *
 * @author chenjs
 * @create 2018/7/2
 * @since 1.0.0
 */
public class Dept implements Serializable {

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept() {
    }

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

    public Dept(Long deptno, String dname, String db_source) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
