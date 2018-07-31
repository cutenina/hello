package pojo;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: pojo
 * @Description:
 * @Date date: 2018/7/31
 */
public class Msg {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
