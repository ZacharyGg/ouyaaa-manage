package com.ouyaaa.common.upms.dto;/**
 * @Author Administrator
 * @Date 2018/8/29 19:56
 */

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  19:56
 * @Description：
 **/

@Data
public class TreeNode {
    protected int id;
    protected int parentId;
    protected List<TreeNode> children = new ArrayList<>();
    public void add(TreeNode node){
        children.add(node);
    }
}
