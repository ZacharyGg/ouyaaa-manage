package com.ouyaaa.upms.rest;/**
 * @Author Administrator
 * @Date 2018/8/31 10:05
 */

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ouyaaa.common.upms.dto.MenuTree;
import com.ouyaaa.common.upms.entity.SysMenu;
import com.ouyaaa.upms.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-31  10:05
 * @Description：
 **/

@RestController
@RequestMapping("/menu")
public class MenuInfoRestController {


    @Autowired
    SysMenuService sysMenuService;

    @GetMapping("tree")
    public List<MenuTree> getMenuList(){
        SysMenu sysMenu = new SysMenu();
        sysMenu.setDelFlag("0");
        return sysMenuService.selectListTree(new EntityWrapper<>(sysMenu));
    }



    /**
     * 查询菜单信息，可全部查询或者根据用户名
     * @param username
     * @return
     */
    @GetMapping({"","/{username}"})
    public List<SysMenu> findMenu(@PathVariable(required = false) String username){
        return null;
    }


    /**
     * 插入菜单
     * @param sysMenu
     * @return
     */
    @PostMapping
    public List<SysMenu> insertMenu(@RequestBody SysMenu sysMenu){
        return null;
    }

    /**
     * 批量插入菜单（继承别的菜单树）
     * @param sysMenu
     * @return
     */
    @PostMapping("/all")
    public List<SysMenu> inheritMenu(@RequestBody Map<String, Object> sysMenu){
        return null;
    }

    /**
     * 删除菜单，若有子节点也一并删除，前台在有子节点的情况下做提示
     * @param
     * @return
     */
    @DeleteMapping
    public Boolean deleteMenu(@RequestBody SysMenu sysMenu){
        return null;
    }

    /**
     * 更新菜单
     * @param sysMenu
     * @return
     */
    @PutMapping
    public Boolean updateMenu(@RequestBody SysMenu sysMenu){
        return null;
    }

    /**
     * 分页查询菜单
     * @param params
     * @return
     */
    @GetMapping("/page")
    public Page pageMenu(@RequestParam Map<String, Object> params){
        Page page = new Page();
        return null;
    }
}
