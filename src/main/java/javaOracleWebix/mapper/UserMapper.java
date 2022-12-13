package javaOracleWebix.mapper;

import javaOracleWebix.entity.User;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	List<User> getAllUser();
}