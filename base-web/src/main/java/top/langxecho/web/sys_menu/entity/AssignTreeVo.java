package top.langxecho.web.sys_menu.entity;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/12 8:15
 */


import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class AssignTreeVo {
    private List<SysMenu> menuList = new ArrayList<>();
    private Object[] checkList;
}