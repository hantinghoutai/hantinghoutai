package com.accp.biz.qtm;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qtm.IinvitationDao;
import com.accp.vo.qtm.Invitation;
import com.accp.vo.qtm.Tiaojian;

@Service
@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true)
public class InvitationBiz {
			@Autowired
			private IinvitationDao dao;
			
			public List<Invitation> select(){
				return dao.list();
			}
			
			public Invitation InvitationInfo(int postid) {
				return dao.info(postid);
			}
			@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true)
			public int update(Tiaojian t) {
				return dao.updates(t);
			}
			@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true)
			public int delete(String id) {
				return dao.deletes(id);
			}
			
			
}
