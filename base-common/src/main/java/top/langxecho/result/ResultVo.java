package top.langxecho.result;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/9 19:17
 */


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultVo<T> {
    private String msg;
    private int code;
    private T data;
}
