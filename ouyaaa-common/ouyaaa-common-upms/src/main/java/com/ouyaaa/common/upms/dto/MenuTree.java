package com.ouyaaa.common.upms.dto;/**
 * @Author Administrator
 * @Date 2018/9/2 18:34
 */

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-09-02  18:34
 * @Description：
 **/

@Data
public class MenuTree extends TreeNode {
    /**
     *名称
     */
    private String name;
}
