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


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈部门〉
 *
 * @author chenjs
 * @create 2018/7/2
 * @since 1.0.0
 */
@ApiModel(value="dept对象",description="dept对象")
public class Dept implements Serializable {

    @ApiModelProperty(value="主键",required=false)
    private Long 	deptno;
    @ApiModelProperty(value="部门名称",required=true)
    private String 	dname;
    @ApiModelProperty(value="数据库",required=false)
    private String 	db_source;

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
