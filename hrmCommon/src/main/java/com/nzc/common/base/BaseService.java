package com.nzc.common.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T,ID,V> {
    int  insert(T record);
    int  deleteById(ID id);
    int  deleteByExample(V example);
    int update(T record);
    List<T> getListByExample(V example);
    T getElementById(ID id);
    List<T> getListByMap(Map param);
}
