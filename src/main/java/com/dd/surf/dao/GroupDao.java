package com.dd.surf.dao;

import com.dd.surf.pojo.Group;
import com.dd.surf.pojo.User;

import java.util.List;

public interface GroupDao {
    List<Group> getGroupList(String userName,String password);
}
