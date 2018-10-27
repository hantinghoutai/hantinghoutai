package com.accp.biz.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qtm.IRankDao;
import com.accp.vo.qtm.Rank;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RankBiz {
			
			@Autowired
			private IRankDao dao;
			public List<String> fenlei(){
				return dao.fenlei();
			}
			public List<Rank> list(){
				return dao.chaxun();
			}
			public Rank infos(int id) {
				return dao.info(id);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int updates(Rank rank) {
				return dao.update(rank);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int deletes(int id) {
				return dao.delete(id);
			}
			public List<Rank> fenleicha(int stid){
				return dao.fenleicha(stid);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int insert(Rank rank) {
				return dao.inserts(rank);
			}
		
}
