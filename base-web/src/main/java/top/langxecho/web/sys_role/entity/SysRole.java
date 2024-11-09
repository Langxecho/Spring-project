package top.langxecho.web.sys_role.entity;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/9 19:26
 */


import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@TableName("sys_role")
@AllArgsConstructor
@NoArgsConstructor
public class SysRole {

    @TableId(type = IdType.AUTO)
    private Long roleId;

    private String roleName;

    private String remark;

    private String type;

    // 逻辑删除字段
    @TableLogic
    private Integer deleted;

    // 自动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 自动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}

