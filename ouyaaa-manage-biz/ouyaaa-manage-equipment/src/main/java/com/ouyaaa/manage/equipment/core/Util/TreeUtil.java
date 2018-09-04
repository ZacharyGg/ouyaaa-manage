package com.ouyaaa.manage.equipment.core.Util;/**
 * @Author Administrator
 * @Date 2018/8/31 11:10
 */

import com.ouyaaa.common.upms.dto.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-31  11:10
 * @Description：
 **/

public class TreeUtil {

    /**
     * 两层循环实现建树
     * @param treeNodes
     * @param root
     * @param <T>
     * @return
     */
    public static <T extends TreeNode> List<T> build(List<T> treeNodes, Object root){
        List<T> trees = new ArrayList<>();
        for (T node : treeNodes){
            if (root.equals(node.getParentId())){
                trees.add(node);
            }
            for (T it : treeNodes){
                if (it.getParentId() == node.getId()){
                    if (node.getChildren() == null){
                        node.setChildren(new ArrayList<TreeNode>());
                    }
                    node.add(it);
                }
            }
        }
        return trees;
    }


    /**
     * 递归建树和上面的两层循环一样
     * @param treeNodes
     * @param root
     * @param <T>
     * @return
     */
    public static <T extends TreeNode> List<T> buildByRecursive(List<T> treeNodes,Object root){
        List<T> trees = new ArrayList<>();
        for(T node : treeNodes){
            if (root.equals(node.getParentId())){
                trees.add(findChild(node,treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param node
     * @param treeNodes
     * @param <T>
     * @return
     */
    private static <T extends TreeNode> T findChild(T node, List<T> treeNodes) {
        for (T it : treeNodes){
            if (node.getId() == it.getParentId()){
                if (node.getChildren() == null){
                    node.setChildren(new ArrayList<TreeNode>());
                }
                node.add(it);
            }
        }
        return node;
    }
}
