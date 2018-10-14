package com.ouyaaa.manage.basis.rest;


import com.ouyaaa.manage.basis.entity.Shift;
import com.ouyaaa.manage.basis.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zachary
 * @since 2018-09-04
 */
@RestController
public class ShiftController {

    @Autowired
    ShiftService shiftService;

    @RequestMapping(value = "/shift/{id}",method = RequestMethod.GET)
    public Shift getShiftInfo(@PathVariable String id){
        System.out.println("是否进行了调用");
        return shiftService.selectById( 1 );
    }

    @PostMapping("/shift")
    public Boolean insertShiftInfo(@RequestBody Shift shift){
       return shiftService.insert( shift );
    }

}

