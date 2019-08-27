package cn.gorillahug.base.data.api.model;

import lombok.Data;

/**
 * @author daixuan
 * @version 2019/8/27 23:05
 */
@Data
public class CustomAutoConfigBean {
    private long id;

    public CustomAutoConfigBean() {

    }

    public CustomAutoConfigBean(long id) {
        this.id = id;
    }
}
