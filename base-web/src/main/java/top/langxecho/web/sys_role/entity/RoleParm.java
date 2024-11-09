package top.langxecho.web.sys_role.entity;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/9 19:27
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleParm {
    private Long currentPage;
    private Long pageSize;
    private String roleName;
}

