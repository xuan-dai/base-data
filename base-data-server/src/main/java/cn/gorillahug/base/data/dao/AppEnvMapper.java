package cn.gorillahug.base.data.dao;

import java.util.List;
import java.util.Map;

/**
 * @author daixuan
 * @version 2019/9/8 0:42
 */
public interface AppEnvMapper {

    List<Object> listAll();

    List<String> listBySqlField(Map<String,Object> param);
}
