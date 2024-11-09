package top.langxecho.web.sys_role.service.impl;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/9 19:29
 */


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.langxecho.web.sys_role.entity.SysRole;
import top.langxecho.web.sys_role.mapper.SysRoleMapper;
import top.langxecho.web.sys_role.service.SysRoleService;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {}

