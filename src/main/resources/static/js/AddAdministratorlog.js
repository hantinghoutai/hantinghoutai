
function AddAdministrator(adminID,remarks){
	$.ajax("/clm/api/addAddAdministratorinfo/"+adminID+"/"+remarks,{
		type:"post",
		dataType:"json"
	})
}