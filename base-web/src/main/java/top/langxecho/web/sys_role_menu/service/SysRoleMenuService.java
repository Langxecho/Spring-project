package top.langxecho.web.sys_role_menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.langxecho.web.sys_role_menu.entity.SysRoleMenu;
import top.langxecho.web.sys_role_menu.entity.SaveMenuParm;

public interface SysRoleMenuService extends IService<SysRoleMenu> {
    void saveRoleMenu(SaveMenuParm parm);
}
