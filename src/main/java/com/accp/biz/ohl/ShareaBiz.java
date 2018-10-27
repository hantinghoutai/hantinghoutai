package com.accp.biz.ohl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ohl.IShareaDao;
import com.accp.pojo.Sharea;

@Service("shareaBiz")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class ShareaBiz {
	
	@Autowired
	private IShareaDao dao;
	
	public List<Sharea> query(String pid, String level){
		return dao.query(pid, level);
	}
}
