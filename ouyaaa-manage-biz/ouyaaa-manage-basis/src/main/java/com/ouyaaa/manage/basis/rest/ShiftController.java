package com.ouyaaa.manage.basis.rest;


import com.ouyaaa.common.log.annotation.SysLog;
import com.ouyaaa.manage.basis.entity.Shift;
import com.ouyaaa.manage.basis.service.ShiftService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @SysLog(value = "调用班次信息")
    @RequestMapping(value = "/shift/{id}",method = RequestMethod.GET)
    @ApiOperation( value = "查询班次",notes = "根据ID查询班次")
    @ApiImplicitParam(name = "id",value = "班次ID",required = true,dataType = "int",paramType = "path",example = "100")
    public Shift getShiftInfo(@PathVariable String id){
        System.out.println("是否进行了调用");
        return shiftService.selectById( 1 );
    }

    @PostMapping("/shift")
    public Boolean insertShiftInfo(@RequestBody Shift shift){
       return shiftService.insert( shift );
    }


    /**
     * 通过Feign远程传输文件
     * @param file
     * @return
     */
    @PostMapping(value = "/shift/post",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String postString(@RequestPart("file") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        return null;
    }

}

