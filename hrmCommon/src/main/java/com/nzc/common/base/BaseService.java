package com.nzc.common.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T,ID,V> {
    int  insert(T record)throws Exception;
    int  deleteById(ID id)throws Exception;
    int  deleteByExample(V example)throws Exception;
    int update(T record)throws Exception;
    List<T> getListByExample(V example)throws Exception;
    T getElementById(ID id)throws Exception;
    List<T> getListByMap(Map param)throws Exception;
}
