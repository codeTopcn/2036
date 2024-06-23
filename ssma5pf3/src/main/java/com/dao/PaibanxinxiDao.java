package com.dao;

import com.entity.PaibanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaibanxinxiVO;
import com.entity.view.PaibanxinxiView;


/**
 * 排班信息
 * 
 * @author 
 * @email 
 * @date 2021-04-19 00:33:34
 */
public interface PaibanxinxiDao extends BaseMapper<PaibanxinxiEntity> {
	
	List<PaibanxinxiVO> selectListVO(@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);
	
	PaibanxinxiVO selectVO(@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);
	
	List<PaibanxinxiView> selectListView(@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);

	List<PaibanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);
	
	PaibanxinxiView selectView(@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);
	
}
