package com.nzc.common.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao <T,ID,V extends Serializable> {
   int  insertItem(T record);
   int  deleteById(ID id);
   int update(T record);
   int  deleteByExample(V example);
   List<T> getListByExample(V example);
   T getElementById(ID id);
   List<T> getListByMap(Map param);
}
